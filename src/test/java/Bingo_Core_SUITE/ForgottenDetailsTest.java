package Bingo_Core_SUITE;

import java.io.IOException;
import java.util.Hashtable;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import Base.TestBase;
import TestUtil.Constant;
import TestUtil.TestDataProvider;

public class ForgottenDetailsTest extends TestBase {

	@BeforeTest
	public void initLogs() {
		initLogs(this.getClass());
	}

	@Test(dataProviderClass = TestDataProvider.class, dataProvider = "Bingo_Core_SUITEDataProvider")
	public void ForgottenDetailstest(Hashtable<String, String> table) throws IOException, InterruptedException {
		test = extent.startTest("ForgottenDetailsTest");
		validateRunmodes("ForgottenDetailsTest", Constant.First_Suite, table.get(Constant.RUNMODE_COL));
		openBrowser(table.get(Constant.BROWSER_COL));
		navigate("testsiteURL");
		Thread.sleep(2000);
		click("hp-forgottenPassword_xpath");
		Thread.sleep(2000);
		input("forgottenDetails_PopUpBox_Username_xpath", table.get(Constant.USERNAME_COL));
		input("forgottenDetils_PopUpBox_Email_xpath", table.get(Constant.EMAIL_COL));
		Thread.sleep(4000);
		WebElement DayDob=d.findElement(By.xpath(OR.getProperty("forgottenDetails_PopUpBox_DOB_Day_xpath")));
		Actions act= new Actions(d);
		act.moveToElement(DayDob);
		act.click();
		act.sendKeys(table.get(Constant.DAY_COL));
		System.out.println(table.get(Constant.DAY_COL));
		act.build().perform();
		Thread.sleep(2000);

		// day
//		String Xpath_Menu = OR.getProperty("FD_select_xpath");
//		//int day = (int) Double.parseDouble(table.get(Constant.DAY_COL));
//		Xpath_Menu = Xpath_Menu.replace("{0}", table.get(Constant.DAY_COL));
//		 System.out.println(table.get(Constant.DAY_COL));
//		WebElement DayDob=d.findElement(By.xpath(Xpath_Menu));
		 WebDriverWait wat= new WebDriverWait(d,15);
//		 wat.until(ExpectedConditions.presenceOfElementLocated(By.xpath(Xpath_Menu)));
//		 Actions move = new Actions(d);
//		 move.moveToElement(DayDob).build().perform();
//		clickByXpath(Xpath_Menu);
//		Thread.sleep(1000);
		// month
		click("forgottenDetails_PopUpBox_DOB_Month_xpath");
		Thread.sleep(1000);
		String Xpath_Menu2 = OR.getProperty("forgottenDetails_PopUpBox_DOB_MonthSelect_xpath");
		//int Month = (int) Double.parseDouble(table.get(Constant.MONTH_COL));
		Xpath_Menu2 = Xpath_Menu2.replace("{0}", table.get(Constant.MONTH_COL));
		System.out.println(table.get(Constant.MONTH_COL));
		clickByXpath(Xpath_Menu2);
		Thread.sleep(1000);
		// year
		click("forgottenDetails_PopUpBox_Year_xpath");
		Thread.sleep(1000);
		String Xpath_Menu3 = OR.getProperty("forgottenDetails_PopUpBox_YearSelect_xpath");
		//int Year = (int) Double.parseDouble(table.get(Constant.YEAR_COL));
		Xpath_Menu3 = Xpath_Menu3.replace("{0}", table.get(Constant.YEAR_COL));
		Thread.sleep(500);
		System.out.println(table.get(Constant.YEAR_COL));
		 wat.until(ExpectedConditions.presenceOfElementLocated(By.xpath(Xpath_Menu3)));
		clickByXpath(Xpath_Menu3);
		Thread.sleep(2000);
		click("forgottenDetails_PopUpBox_SUBMIT_xpath");
		Thread.sleep(1000);
		System.out.println("Before Condition" + table.get(Constant.Result));
		if (table.get(Constant.Result).equals("Correct")) {
			System.out.println("After Condition" + table.get(Constant.Result));
			Thread.sleep(2000);
			input("forgottenDetails_ResetPassword_NewPassword_xpath", table.get(Constant.NEWPASSWORD_COL));
			input("forgottenDetails_ResetPassword_ConfirmPassword_xpath", table.get(Constant.CONFIRMPASSWORDr_COL));
			click("forgottenDetails_ResetPassword_SUBMIT_xpath");
			Thread.sleep(1000);
			/* verify if user has successfully updated his or her details */
			String ResetMessage = getText("forgottenDetails_ResetPassword_Title_xpath");// contact
																						// information
																						// text
			if (isElementPresent("forgottenDetails_ResetPassword_Title_xpath")) {
				//System.out.println(true);
				 test.log(LogStatus.PASS,ResetMessage);
			} else
				//System.out.println(ResetMessage);
			test.log(LogStatus.FAIL,"User failed to reset his/her password");
		}
	}

	@AfterMethod
	public void close() {
		 if(extent!=null){
		 extent.endTest(test);
		 extent.flush();
		 }
		quit();
	}
}