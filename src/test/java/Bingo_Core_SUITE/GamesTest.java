package Bingo_Core_SUITE;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import Base.TestBase;
import TestUtil.TestDataProvider;

public class GamesTest  extends TestBase{
	
	
	
	
	@BeforeTest
	public void initLogs() throws FileNotFoundException{
		//initLogs(this.getClass());
		//init();
	}
	
	@Test//(enabled=false)
	public void Headertest() throws IOException, InterruptedException{
		//openBrowser(table.get(Constant.BROWSER_COL));
		test=extent.startTest("GamesTest");
		 openBrowser(prop.getProperty("browserType")); // lunch the browser
		//navigate("testsiteURL"); // go to the website
		Thread.sleep(2000);
		doDefaultLogin(prop.getProperty("defaultUsername"));
		Thread.sleep(2000);
		// Click on Game Vertical
		click("hp_GamesVerticalTab_xpath");
		Thread.sleep(2000);
		// Click on the Second Game Info button within the Games
		List<WebElement> Games = d.findElements(By.cssSelector("div.playtech-games .game_overlay .more_info"));
		System.out.println(Games.size());
		WebElement SecondGame = Games.get(2);
		SecondGame.click();
		// Verify if user Can Launch a game from Game Info Page page.
		WebElement PlayForReal=d.findElement(By.cssSelector("div.game_launch_buttons a.play-for-real"));
		WebDriverWait wait= new WebDriverWait(d,20);
		// Wait for this Play For Real Button to be displayed on the Game Info Game
		wait.until(ExpectedConditions.visibilityOf(PlayForReal));
		// Verify if Play For Real Button is displayed
		Assert.assertTrue(PlayForReal.isDisplayed());
		click("GameInfo_PlayForReal_Selector");
		Thread.sleep(200l);
		// Switch to the Game Game Launched Page
		Set<String> Windowids = d.getWindowHandles();
		Iterator<String> it = Windowids.iterator();
		String MainWindowids = it.next();
		String tabbedWindowId = it.next();
		System.out.println(MainWindowids);
		System.out.println(tabbedWindowId);
		while (it.hasNext());
		if (Windowids.size() > 1)
			System.out.println(true);
		else
			System.out.println(false);
		Assert.assertNotSame(MainWindowids, tabbedWindowId);
		//return d.switchTo().window(tabbedWindowId);
		Thread.sleep(200l);

		
		
		
		
		
		
		

}
	@AfterMethod// (enabled=false)
	public void close(){
//		if(extent!=null){
//			extent.endTest(test);
//			extent.flush();
//		}
		//quit();
	
		
}
}