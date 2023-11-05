package com.e2eTest.automation.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * This class contains the declaration of the driver. and contains the
 * declaration of the logger.
 */
public class BasePage {

	protected WebDriver driver;

	/**
	 * Instanciation de base page.
	 * 
	 * @param driver
	 */
	public BasePage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

}
