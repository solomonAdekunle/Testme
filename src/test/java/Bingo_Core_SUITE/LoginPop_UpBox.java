package Bingo_Core_SUITE;

import java.io.FileNotFoundException;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import Base.TestBase;

public class LoginPop_UpBox extends TestBase {
	
	

	@BeforeTest
	public void initLogs() throws FileNotFoundException{
		init();
		this.initLogs(getClass());

}
	@Test//(enabled=false)
	public void LoginPop_upBoxtest() throws InterruptedException{
		test=extent.startTest("LoginPop_UpBox");
		openBrowser(prop.getProperty("browserType"));
		navigate("testsiteURL");
		Thread.sleep(2000);
		click("hp_Login_xpath");
		Thread.sleep(3000);
		 boolean Logo=isElementPresent("loginPop_UpBox_VernonsBingoLogo_xpath");
			System.out.println(Logo);
		 	input("loginPop_Up_UserName_Selector",prop.getProperty("defaultUsername"));// input username
			input("loginPop_Up_Password_xpath",prop.getProperty("defaultPassword"));
			Thread.sleep(1000);
			click("loginPop_UpBox_Login_Selector");
			Thread.sleep(2000);
			// Verify if UserName displayed is the same UserName used to login.
			String username=getText("UsernameInfo_xpath");
			if(getText("UsernameInfo_xpath").equalsIgnoreCase("BingoTest3"))
				//System.out.println(username);
				test.log(LogStatus.PASS,username );
			else
				//System.out.println("Wrong username displayed");
				test.log(LogStatus.FAIL, "Wrong username displayed");
			Assert.assertEquals(username, "BingoTest3");
	}
	@Test//(enabled=false)
	public void loginPop_UpBox_JoinNowtest() throws InterruptedException{
		openBrowser(prop.getProperty("browserType"));
			navigate("testsiteURL");
			Thread.sleep(2000);
			click("hp_Login_xpath");
			Thread.sleep(2000);
			// verify if clicking the Join Now Button in the Login Pop-up box will navigate to the Registration page
			click("loginPop_UpBox_JOINNOW_Selector");
			Thread.sleep(2000);
			if(d.getCurrentUrl().equalsIgnoreCase("https://bingo.qa.vernons.com/register"))
				test.log(LogStatus.PASS, d.getCurrentUrl());
			else
				test.log(LogStatus.FAIL, "Wrong Url address was displayed");
			Assert.assertEquals(d.getCurrentUrl(), "https://bingo.qa.vernons.com/register");
	
	}
	@AfterMethod
	public void close(){
		if(extent!=null){
			extent.endTest(test);
			extent.flush();
		}
          quit();
}

}