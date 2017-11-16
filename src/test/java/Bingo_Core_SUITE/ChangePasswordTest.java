package Bingo_Core_SUITE;

import java.io.IOException;
import java.util.Hashtable;

import org.apache.commons.configuration.ConfigurationException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Base.TestBase;
import TestUtil.Constant;
import TestUtil.TestDataProvider;
import TestUtil.Utility;

public class ChangePasswordTest extends TestBase {

	@BeforeTest
	public void initLogs() {
		initLogs(this.getClass());
	}

	@Test(enabled = false, dataProviderClass = TestDataProvider.class, dataProvider = "Bingo_Core_SUITEDataProvider")
	public void ChangePasswordtest(Hashtable<String, String> table)
			throws IOException, InterruptedException, ConfigurationException {
		validateRunmodes("ChangePasswordTest", Constant.First_Suite, table.get(Constant.RUNMODE_COL));
		/*
		 * Navigate to the website and then login with default username and
		 * password
		 */
		doDefaultLogin(table.get("Browser"));
		Thread.sleep(2000);
		/* move to Account Menu and click Change Password link */
		String Xpath_Menu = Constant.AccountMenu;
		String Xpath_SubMenu = Constant.ChangePassword;
		WebElement Menu = d.findElement(By.xpath(Xpath_Menu));
		WebElement Submenu = d.findElement(By.xpath(Xpath_SubMenu));
		Actions move = new Actions(d);
		move.moveToElement(Menu).build().perform();
		Thread.sleep(1000);
		Submenu.click();
		Thread.sleep(1000);
		input("changePassword_OldPassword_Selector", table.get(Constant.OLDPASSWORD_COL));
		String NewPassWord = table.get(Constant.NEWPASSWORD_COL).toString();
		if (NewPassWord.equals("{generator}")) {
			NewPassWord = generateRandomAlphaNumeric(20, "");
		}
		Thread.sleep(1000);
		input("changePassword_NewPassword_Selector", NewPassWord);
		if (table.get(Constant.CONFIRMPASSWORD_COL).equals("{generator}")) {
			input("changePassword_ConfPassword_Selector", NewPassWord);
			System.out.println(NewPassWord);
		} else {
			input("changePassword_ConfPassword_Selector", table.get(Constant.CONFIRMPASSWORD_COL));
		}
		click("changePassword_Submit_Selector");
		Thread.sleep(3000);
		if (table.get(Constant.EXPECTEDRESULT_COL).equals("SUCCESS")) {
			String titlePage = getText("titlePage_xpath");
			System.out.println(titlePage);
			Assert.assertEquals(titlePage, "YOUR PASSWORD HAS BEEN SUCCESSFULLY CHANGED");
			/* uUpdate the Defaultpassword on the Project.Properties */
			Utility.updateproperty("defaultPassword", NewPassWord);
			/*
			 * uUpdate the Oldpassword column on ChangePassword on the excel
			 * sheet
			 */
			Utility.writeXLSXFile(54, 3, NewPassWord);
			/* uUpdate the login password on the excel sheet */
			Utility.writeXLSXFile(5, 4, NewPassWord);
		} else
			Thread.sleep(3000);
		String Xpath_Menu1 = Constant.AccountMenu;
		String Xpath_SubMenu1 = Constant.Signout;
		WebElement Menu1 = d.findElement(By.xpath(Xpath_Menu1));
		WebElement Submenu1 = d.findElement(By.xpath(Xpath_SubMenu1));
		Actions move1 = new Actions(d);
		move1.moveToElement(Menu1).build().perform();
		Thread.sleep(2000);
		Submenu1.click();
		Thread.sleep(2000);
	}

	@AfterMethod
	public void close() {
		// if(extent!=null){
		// extent.endTest(test);
		// extent.flush();
		// }
		quit();
	}
}