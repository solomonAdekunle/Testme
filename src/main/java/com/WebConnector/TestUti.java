package com.WebConnector;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TestUti extends  WebConnector {
	
	public static void PromoBanner() throws InterruptedException{
		//WebDriver driver=  Webdriver();
		WebElement promo=driver.findElement(By.cssSelector("div.view-promotions .view-content"));
		List <WebElement> Promlist=promo.findElements(By.cssSelector("div.promo-wrapper"));
		    for(int i=0; i<Promlist.size(); i++) {
		    	  System.out.println(Promlist.size());
			     
			   // Repolulate  the list of all the Elements on all the banner.
			    promo=driver.findElement(By.cssSelector("div.view-promotions .view-content"));
			    Promlist = promo.findElements(By.cssSelector("div.promo-wrapper"));
			   WebElement promotion = Promlist.get(i);
			   System.out.println(i);
			   //get promotion title
			   String promotionTitle = promotion.findElement(By.cssSelector(".promotion-title a")).getText();
			   System.out.println(promotionTitle);
//			   
//			   //navigate
		 WebElement InfoButton=promotion.findElement(By.cssSelector("a.promo-more-info"));
		 InfoButton.click();
		 
		 // title
		 String pageTiltle=driver.findElement(By.cssSelector("h1.title")).getText();
		
		// String pagetitle = driver.findElement(By.cssSelector("h1.title"))
			System.out.println(pageTiltle);
			Thread.sleep(200);
			//String promotionTitle  
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
	
	
	
	
	
	
		
	



	private static WebDriver Webdriver () {
		if(driver==null)
			driver =  Webdriver();
		return driver ;
		// TODO Auto-generated method stub
		
		
	}
}