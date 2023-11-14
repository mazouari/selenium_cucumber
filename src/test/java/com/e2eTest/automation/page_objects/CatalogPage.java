package com.e2eTest.automation.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.e2eTest.automation.utils.BasePage;
import com.e2eTest.automation.utils.Setup;

public class CatalogPage extends BasePage {

	@FindBy(how = How.XPATH, using = "//p[normalize-space()='Catalog']")
	private static WebElement menuCatalog;

	@FindBy(how = How.XPATH, using = "//p[normalize-space()='Products']")
	private static WebElement menuProducts;

	@FindBy(how = How.XPATH, using = "//input[@id='SearchProductName']")
	private static WebElement champProductName;

	@FindBy(how = How.XPATH, using = "//button[@id='search-products']")
	private static WebElement btnSearch;

	@FindBy(how = How.XPATH, using = "//td[normalize-space()='Lenovo IdeaCentre 600 All-in-One PC']")
	private static WebElement elementResult;

	public CatalogPage() {
		super(Setup.getDriver());
	}

	public static WebElement getMenuCatalog() {
		return menuCatalog;
	}

	public static WebElement getMenuProducts() {
		return menuProducts;
	}

	public static WebElement getChampProductName() {
		return champProductName;
	}

	public static WebElement getBtnSearch() {
		return btnSearch;
	}

	public static WebElement getElementResult() {
		return elementResult;
	}

}
