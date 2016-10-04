package com.WebConnector;


	import java.io.File;
import java.io.FileInputStream;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

	public class WebConnector {
		Properties OR = null;
		Properties CONFIG=null;
		static WebDriver driver =null;
		WebDriver mozilla=null;
		WebDriver chrome=null;
		WebDriver ie=null;
		static WebConnector w;
	public WebConnector(){
			
			if(OR==null){
				try{
					// initialize OR
					OR = new Properties();
					FileInputStream fs  = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\com\\Config\\OR.Properties");
					OR.load(fs);
					
					// initialize CONFIG to corresponding env
					CONFIG= new Properties();
					fs  = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\com\\Config\\Config.Properties");
					CONFIG.load(fs);                                 
					
					//System.out.println(OR.getProperty("loginusername"));
					//System.out.println(CONFIG.getProperty("loginURL"));
					
					
				}catch(Exception e){
					System.out.println("Error on intializing properties files");
				}
				
				
				
			}
			
		}
		
		/// ****************Application Independent functions************************ ///

		// opening the browser
		public void openBrowser(String browserType){
			//log("Opening browser "+browserType);
			if(browserType.equals("Mozilla") && mozilla==null){
				driver = new FirefoxDriver();
				mozilla=driver;
			}else if(browserType.equals("Mozilla") && mozilla!=null){
				driver=mozilla;
			}else if(browserType.equals("Chrome") && chrome==null){
				File file= new File("C:\\IEDriver\\chromedriver.exe");
				// File file= new File("C:\\Users\\solomon.adekunle\\OneDrive for Business\\workspace\\BetVernons\\chromedriver.exe");
					System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
					ChromeOptions options = new ChromeOptions();
					options.addArguments("no-sandbox");
				driver=new ChromeDriver(); 
				chrome=driver;
			}else if(browserType.equals("Chrome") && chrome==null){
				driver=chrome;
			}
			
			else if(browserType.equals("IE")){
				// set the IE server exe path and initialize
			}
			// max
			driver.manage().window().maximize();
			// implicit wait
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		}
		// navigates to a URL
		public void navigate(String URL){
			//log("Navigating to "+CONFIG.getProperty(URL));
			driver.get(CONFIG.getProperty(URL));
		}
		// clicking on any object
		public void click(String objectName){
			//log("Clicking on " + objectName);
			driver.findElement(By.xpath(OR.getProperty(objectName))).click();
		}
		
		public void type(String text, String objectName){
			//log("Typing in " + objectName);
			driver.findElement(By.xpath(OR.getProperty(objectName))).sendKeys(text);
		}
		
		public void select(String text, String objectName){
			//log("Selecting from "+ objectName);
			driver.findElement(By.xpath(OR.getProperty(objectName))).sendKeys(text);
		}
		public String getText(String objectName){
			String text="";
			 text=driver.findElement(By.xpath(OR.getProperty(objectName))).getText();
			 return text;
			
		}
		public boolean isElementPresent(String objectName){
			//log("Checking object presence "+ objectName);
			int count = driver.findElements(By.xpath(OR.getProperty(objectName))).size();
			if(count==0)
				return false;
			else
				return true;
		}
        public void Closebrowser(){
        driver.close();
       }
        public void navigateBack(){
        driver.navigate().back();
	}
		/// ****************Application dependent functions************************ ///
		
		public boolean isLoggedIn(){
			if(isElementPresent("Depositbutton"))
				return true;
			else
				return false;
		}
		
		public void doDefaultLogin(){
			navigate("siteName");
			type(CONFIG.getProperty("defaultUsername"), "Logusername");
			type(CONFIG.getProperty("defaultPassword"), "Logpassword");
			click("LoginButton");
		}
		
		public void logOut(String objectname){
			WebElement Accountmenu =driver.findElement(By.xpath("//ul[@class='account_menu']"));
			Actions act= new Actions(driver);
			act.moveToElement(Accountmenu).build().perform();
			WebElement signOut=driver.findElement(By.xpath("//a[@class='button logout']"));
			signOut.click();
			
		
			
		}
		
		/********Singleton**********/
		public static WebConnector getInstance(){
			if(w==null)
				w= new WebConnector();
			
			return w;
		}
		
		
		
		/**************Logging***************/
		
		
		public void switchframe(){
			driver.switchTo().frame("cashier-iframe").switchTo().frame(0);
			WebDriverWait wait= new WebDriverWait(driver,30);
		}
		
		public void switchToTab(){
			 Set <String> Windowids = driver.getWindowHandles();
				Iterator<String> it = Windowids.iterator();
				String MainWindowids = it.next();
				String tabbedWindowId = it.next();
				System.out.println(MainWindowids);
				System.out.println(tabbedWindowId);
				while(it.hasNext());
					//System.out.println(it.next());
					driver.switchTo().window(tabbedWindowId);
		}
		public void MoveToAccount(String objectname){
			WebElement Accountmenu =driver.findElement(By.xpath("//ul[@class='account_menu']"));
			Actions act= new Actions(driver);
			act.moveToElement(Accountmenu).build().perform();
		}
		
		
		
		
		
	}





