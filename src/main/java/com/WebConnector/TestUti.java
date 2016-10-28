package com.WebConnector;

import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestUti extends WebConnector {
	/**
	 * 
	 * Navigate to the Promotion page and clicking on each promotion banner
	 * verifying that each promo banner name is the same as each promotion page.
	 */
	public static void PromoBanner() throws InterruptedException {
		WebElement promo = driver.findElement(By.cssSelector("div.view-promotions .view-content"));
		List<WebElement> Promlist = promo.findElements(By.cssSelector("div.promo-wrapper"));
		for (int i = 0; i < Promlist.size(); i++) {
			System.out.println(Promlist.size());

			// Repolulate the list of all the Elements on all the banner.
			promo = driver.findElement(By.cssSelector("div.view-promotions .view-content"));
			Promlist = promo.findElements(By.cssSelector("div.promo-wrapper"));
			WebElement promotion = Promlist.get(i);
			System.out.println(i);
			String promotionTitle = promotion.findElement(By.cssSelector(".promotion-title a")).getText();
			System.out.println(promotionTitle);

			// navigate
			WebElement InfoButton = promotion.findElement(By.cssSelector("a.promo-more-info"));
			InfoButton.click();

			// title
			String pageTiltle = driver.findElement(By.cssSelector("h1.title")).getText();

			// String pagetitle = driver.findElement(By.cssSelector("h1.title"))
			System.out.println(pageTiltle);
			Thread.sleep(200);
			// String promotionTitle
			if (pageTiltle.equalsIgnoreCase(promotionTitle)) {
				System.out.println(true);
				driver.navigate().back();
				Thread.sleep(1000);
			} else {
				System.out.println(false);
				return;

			}

		}

	}

	/**
	 * Clicking on NetplayTV game on casino tab
	 * 
	 */
	public static void gameLunchTest() throws InterruptedException {
		List<WebElement> gameBox = driver.findElements(By.cssSelector("div.netplay-games"));
		System.out.println(gameBox.size());
		WebElement RouletteExpressPremiumPlayForReal = gameBox.get(1);
		RouletteExpressPremiumPlayForReal.click();

	}

	/**
	 * Clicking on playtech game on Vegas tab
	 */
	public static void PlaytechVegas() {
		List<WebElement> Games = driver.findElements(By.cssSelector("div.playtech-games"));
		System.out.println(Games.size());
		WebElement SecondGame = Games.get(3);
		SecondGame.click();
	}

	/**
	 * Clicking on each presenter link on presenter page and navigating to each
	 * of their page to check if the each presenter page is equal to each of
	 * their title page.
	 */
	public static void Presenter() throws InterruptedException {
		List<WebElement> Presenterlist = driver.findElements(By.cssSelector("div.view-tv-profiles .views-field-title"));
		for (int i = 0; i < Presenterlist.size(); i++) {
			WebElement PresenterName = Presenterlist.get(i);
			System.out.println(Presenterlist.size());

			// Repolulate the list of all the Elements on all the banner.
			Presenterlist = driver.findElements(By.cssSelector("div.view-tv-profiles .views-field-title"));
			PresenterName = Presenterlist.get(i);
			String presenterTitle = PresenterName.findElement(By.cssSelector("a span[itemprop='name']")).getText();
			System.out.println(presenterTitle);

			WebElement moreInfo = PresenterName.findElement(By.cssSelector("a span[itemprop='name']"));
			moreInfo.click();

			// title
			String pageTiltle = driver.findElement(By.cssSelector("h1.title")).getText();
			System.out.println(pageTiltle);
			Thread.sleep(200);
			// String promotionTitle
			if (pageTiltle.equalsIgnoreCase(presenterTitle)) {
				System.out.println(true);
				driver.navigate().back();
				Thread.sleep(1000);
			} else {
				System.out.println(false);
				return;

			}

		}

	}

}
