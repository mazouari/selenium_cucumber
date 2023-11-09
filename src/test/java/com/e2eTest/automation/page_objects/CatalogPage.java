package com.e2eTest.automation.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.e2eTest.automation.utils.BasePage;
import com.e2eTest.automation.utils.Setup;

public class CatalogPage extends BasePage {


	/* Retrieve web elements */


	@FindBy(how = How.XPATH, using = "//p[normalize-space()='Catalog']")
	private static WebElement menucatalog;
	
	@FindBy(how = How.XPATH, using = "//p[normalize-space()='Products']")
	private static WebElement menuproducts;
	
	@FindBy(how = How.XPATH, using = "//input[@id='SearchProductName']")
	private static WebElement champproductname;
	
	@FindBy(how = How.XPATH, using = "//button[@id='search-products']")
	private static WebElement btnsearch;
	

	public CatalogPage() {
		super(Setup.getDriver());
	}

	public static WebElement getmenucatalog() {
		return menucatalog;
	}

	public static WebElement getmenuproducts() {
		return menuproducts;
	}

	public static WebElement getchampproductname() {
		return champproductname;
	}
	
	public static WebElement getbtnsearch() {
		return btnsearch;
	}

}
