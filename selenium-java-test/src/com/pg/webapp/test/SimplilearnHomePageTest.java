package com.pg.webapp.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimplilearnHomePageTest {

	public static void main(String[] args) {

		// 1. formulate a test url.
		final String siteURL = "https://www.simplilearn.com/";

		// 2. locate a browser driver path.
		final String driverPath="/Users/Shared/Previously Relocated Items/Security/CalTech/Phase5/phase5-selenium-java-test-06-19-2021/driver/chromedriver";

		// 3. selenium system property.
		System.setProperty("webdriver.chrome.driver", driverPath);

		// 4. Instantiate selenium webdriver.
		WebDriver driver = new ChromeDriver();

		// 5. launch web browser.
		driver.get(siteURL);

		//6. test evaluation
		String expectedTitle = "World's #1 Online Bootcamp & Certification Course Provider | Simplilearn";
		if(expectedTitle.contentEquals(driver.getTitle())) {
			System.out.println("Test is passed !");
		} else {
			System.out.println("Test is failed !");
		}
		
		//7. close driver
		driver.close();
	}

}