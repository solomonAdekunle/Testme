package Base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.log4j.FileAppender;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.logging.LogType;
import org.openqa.selenium.logging.LoggingPreferences;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.Assert;
import org.testng.SkipException;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import TestUtil.Constant;
import TestUtil.CustomListener;
import TestUtil.ExtentManager;
import TestUtil.Utility;
import TestUtil.Xls_Reader;

public class TestBase {
	public static Properties prop;
	public static Properties OR;
	public static WebDriver d;
	public static EventFiringWebDriver dr;
	public ExtentReports extent = ExtentManager.getInstance();
	public ExtentTest test;
	public static Logger APPLICATION_LOG = Logger.getLogger("devpinoyLogger");

	public  void initLogs(Class<?> class1) {

		FileAppender appender = new FileAppender();
		// configure the appender here, with file location, etc
		appender.setFile(System.getProperty("user.dir") + "//target//reports//" + CustomListener.resultFolderName + "//"
				+ class1.getName() + ".log");
		appender.setLayout(new PatternLayout("%d %-5p [%c{1}] %m%n"));
		appender.setAppend(false);
		appender.activateOptions();

		APPLICATION_LOG = Logger.getLogger(class1);
		APPLICATION_LOG.setLevel(Level.DEBUG);
		APPLICATION_LOG.addAppender(appender);
	}

	public static void init() throws FileNotFoundException {
			if (prop == null) {
			String path = System.getProperty("user.dir") + "\\src\\test\\resource\\project.properties";

			prop = new Properties();
			try {
				FileInputStream fs = new FileInputStream(path);
				prop.load(fs);
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println(prop.getProperty("xlsFileLocation"));
			OR = new Properties();

			FileInputStream fn = new FileInputStream(
					System.getProperty("user.dir") + "\\src\\test\\resource\\OR.properties");
			try {
				OR.load(fn);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}

	public void validateRunmodes(String testName, String suiteName, String dataRunmode) throws IOException {
		APPLICATION_LOG.debug("Validating runmode for " + testName + " in suite " + suiteName);
		init();
		// suite runmode
		boolean suiteRunmode = Utility.isSuiteRunnable(suiteName,
				new Xls_Reader(prop.getProperty("xlsFileLocation") + "Suite.xlsx"));
		boolean testRunmode = Utility.isTestCaseRunnable(testName,
				new Xls_Reader(prop.getProperty("xlsFileLocation") + suiteName + ".xlsx"));
		boolean dataSetRunmode = false;
		if (dataRunmode.equals(Constant.RUNMODE_YES))
			dataSetRunmode = true;

		if (!(suiteRunmode && testRunmode && dataSetRunmode)) {
			APPLICATION_LOG.debug("Skipping the test " + testName + " inside the suite " + suiteName);
			throw new SkipException("Skipping the test " + testName + " inside the suite " + suiteName);
		}

	}

	/**************** Generic functions *********************/
	public void openBrowser(String browserType) {
			if (browserType.equals("Chrome")) {
			File file = new File("lib\\chromedriver.exe");
			System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
			//System.setProperty("webdriver.chrome.driver","lib\\chromedriver.exe");
			ChromeOptions options = new ChromeOptions();
			options.addArguments("no-sandbox");
			options.addArguments("disable-infobars");
			// options.addExtensions(new File("lib\\chromedriver.exe"));
			d = new ChromeDriver();
		}
		if (browserType.equalsIgnoreCase("Mozilla")) {
			FirefoxProfile profile = new FirefoxProfile();
			ProfilesIni prof = new ProfilesIni();	
			FirefoxProfile ffProfile= prof.getProfile("ProfileSeleniumQA");
			 profile.setPreference("dom.max_chrome_script_run_time", 0);
		    profile.setPreference("dom.max_script_run_time", 0);
		    ffProfile.setAcceptUntrustedCertificates(true);
		    ffProfile.setAssumeUntrustedCertificateIssuer(false);
		    System.setProperty("webdriver.gecko.driver", "lib\\geckodriver.exe");
		    d=new FirefoxDriver(ffProfile);
		} else if (browserType.equals("IE")) {
			// File file= new File("C:\\QA\\Chrome\\IEDriverServer.exe");
			System.setProperty("webdriver.ie.driver", "lib\\IEDriverServer.exe");
			d = new InternetExplorerDriver();
		}

		/*
		 * try{ DesiredCapabilities cap = new DesiredCapabilities();
		 * if(browserType.equals("Mozilla")){ cap.setBrowserName("firefox");
		 * }else if(browserType.equals("Chrome")){ cap.setBrowserName("chrome");
		 * // iexplore } cap.setPlatform(Platform.ANY); try { driver = new
		 * RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),cap); } catch
		 * (MalformedURLException e) { // TODO Auto-generated catch block
		 * e.printStackTrace(); } driver.manage().window().maximize();
		 * driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 * }catch(Exception e){
		 * Assert.fail("Not able to open browser - "+e.getMessage()); }
		 */
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		EventFiringWebDriver dr = new EventFiringWebDriver(d);
		// test.log(LogStatus.INFO, "Opened browser successfully - "+
		// browserType);

	}

	public void reportFailure(String failureMessage) {
		test.log(LogStatus.FAIL, failureMessage);
		Utility.takeScreenshot(failureMessage);
		Assert.fail(failureMessage);
	}

	public void navigate(String URLKey) {
		d.get(prop.getProperty(URLKey));
		// Utility.takeScreenshot(URLKey);
	}

	public void click(String identifier) {
		try {
			if (identifier.endsWith("_xpath")) {
				d.findElement(By.xpath(OR.getProperty(identifier))).click();
				// System.out.println("In click after click");
			} else if (identifier.endsWith("_id"))
				d.findElement(By.id(OR.getProperty(identifier))).click();
			else if (identifier.endsWith("_name"))
				d.findElement(By.name(OR.getProperty(identifier))).click();
			else if ((identifier.endsWith("_Selector")))
				d.findElement(By.cssSelector(OR.getProperty(identifier))).click();
		} catch (NoSuchElementException e) {
			Utility.takeScreenshot(identifier);
			Assert.fail("Element not found - " + identifier);

		}
	}

	public void clickByXpath(String identifier) {
		try {
			d.findElement(By.xpath(identifier)).click();
		} catch (NoSuchElementException e) {
			Utility.takeScreenshot(identifier);
			Assert.fail("Element not found - " + identifier);
		}
	}

	public void clear(String identifier) {
		try {
			if (identifier.endsWith("_xpath"))
				d.findElement(By.xpath(OR.getProperty(identifier))).clear();
			else if (identifier.endsWith("_id"))
				d.findElement(By.id(OR.getProperty(identifier))).clear();
			else if (identifier.endsWith("_name"))
				d.findElement(By.name(OR.getProperty(identifier))).clear();
			else if ((identifier.endsWith("_Selector")))
				d.findElement(By.cssSelector(OR.getProperty(identifier))).clear();
		} catch (NoSuchElementException e) {
			Utility.takeScreenshot(identifier);// take screenshot
			Assert.fail("Element not found - " + identifier);

		}
	}

	public void input(String identifier, String data) {
		try {
			if (identifier.endsWith("_xpath"))
				d.findElement(By.xpath(OR.getProperty(identifier))).sendKeys(data);
			else if (identifier.endsWith("_id"))
				d.findElement(By.id(OR.getProperty(identifier))).sendKeys(data);
			else if (identifier.endsWith("_name"))
				d.findElement(By.name(OR.getProperty(identifier))).sendKeys(data);
			else if ((identifier.endsWith("_Selector")))
				d.findElement(By.cssSelector(OR.getProperty(identifier))).sendKeys(data);
		} catch (NoSuchElementException e) {
			Assert.fail("Element not found - " + identifier);
			Utility.takeScreenshot(identifier);
		}
	}

	public boolean verifyTitle(String expectedTitleKey) {
		String expectedTitle = OR.getProperty(expectedTitleKey);
		String actualTitle = d.getTitle();
		Utility.takeScreenshot(expectedTitleKey);
		if (expectedTitle.equals(actualTitle))
			return true;
		else
			return false;
	}

	public boolean isElementPresent(String identifier) {
		// System.out.println(d.getPageSource());
		int size = 0;
		if (identifier.endsWith("_xpath"))
			size = d.findElements(By.xpath(OR.getProperty(identifier))).size();
		else if (identifier.endsWith("_id"))
			size = d.findElements(By.id(OR.getProperty(identifier))).size();
		else if (identifier.endsWith("_name"))
			size = d.findElements(By.name(OR.getProperty(identifier))).size();
		else if ((identifier.endsWith("_Selector")))
			size = d.findElements(By.cssSelector(OR.getProperty(identifier))).size();
		else // not in prop file
			size = d.findElements(By.xpath(identifier)).size();
		Utility.takeScreenshot(identifier);
		if (size > 0)
			return true;
		else
			return false;
	}

	public String getText(String identifier) {
		String text = "";
		if (identifier.endsWith("_xpath"))
			text = d.findElement(By.xpath(OR.getProperty(identifier))).getText();
		else if (identifier.endsWith("_id"))
			text = d.findElement(By.id(OR.getProperty(identifier))).getText();
		else if (identifier.endsWith("_name"))
			text = d.findElement(By.name(OR.getProperty(identifier))).getText();
		else if ((identifier.endsWith("_Selector")))
			text = d.findElement(By.cssSelector(OR.getProperty(identifier))).getText();
		Utility.takeScreenshot(identifier);
		return text;

	}

	public void quit() {
		if (d != null) {
			d.quit();
			d = null;
		}
	}

	/***************** Application specific functions *******************/
	/* Creating a do login functiona */
	public void doLogin(String browser, String Username, String Password) {
		openBrowser(browser);
		// naivgate to the site
		navigate("testsiteURL");
		// input username
		input("hp_LoginUsername_xpath", Username);
		// input password
		input("hp_LoginPassword_xpath", Password);
		// click Login button
		click("hp_Login_xpath");
		// test.log(LogStatus.INFO, "Opened browser successfully - "+ browser);
	}
	/* Login with user default username and  password */
	public void doDefaultLogin(String browser) {
		doLogin(browser, prop.getProperty("defaultUsername"), prop.getProperty("defaultPassword"));
	}

	public static String formatIntegerToString(String str) {
		return String.valueOf((int) Double.parseDouble(str));
	}
	/* Creating a Dynamatic Data Generator */
	public String generateStringWithAllobedSplChars(int length, String allowdSplChrs) {
		String allowedChars = "abcdefghijklmnopqrstuvwxyz" + // alphabets
				"1234567890" + // numbers
				allowdSplChrs;
		return RandomStringUtils.random(length, allowedChars);
	}
	/* Creating a Dynamatic Data Generator */
	public String generateRandomAlphaNumeric(int lenght, String charcter) {
		String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!�$%^&*()";
		charcter = RandomStringUtils.random(lenght, characters);
		return charcter;
	}

	public static String getRelativeUrl(String absoluteURL) throws MalformedURLException {
		URL url = new URL(absoluteURL);
		return url.getPath();
	}

}
