package com.e2eTest.automation.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import com.e2eTest.automation.utils.BasePage;
import com.e2eTest.automation.utils.Setup;

public class AddANewProductPage extends BasePage {

	@FindBy(how = How.ID, using = "ShortDescription")
	private static WebElement champShortDescription;

	@FindBy(how = How.ID, using = "FullDescription_ifr")
	private static WebElement champFullDescription;

	@FindBy(how = How.ID, using = "Sku")
	private static WebElement champSku;

	@FindBy(how = How.XPATH, using = "//div[@class='form-group row']//input[@role='listbox']")
	private static WebElement productCategories;

	@FindBy(how = How.XPATH, using = "//li[normalize-space()='Computers']")
	private static WebElement productCategoriesClick;

	@FindBy(how = How.XPATH, using = "(//input[@role='listbox'])[2]")
	private static WebElement productManufacturers;

	@FindBy(how = How.XPATH, using = "//li[contains(text(),'HP')]")
	private static WebElement productManufacturersClick;

	@FindBy(how = How.ID, using = "SelectedManufacturerIds_label")
	private static WebElement manufacturersCaseName;

	@FindBy(how = How.XPATH, using = "//input[@id='Published']")
	private static WebElement publishedCase;

	@FindBy(how = How.XPATH, using = "//div[normalize-space()='Enter tags ...']")
	private static WebElement productTagsField;

	@FindBy(how = How.XPATH, using = "//input[@class='ui-autocomplete-input']")
	private static WebElement writeInproductTagsField;

	@FindBy(how = How.ID, using = "AllowCustomerReviews")
	private static WebElement allowCustomerReviews;

	@FindBy(how = How.ID, using = "AvailableStartDateTimeUtc")
	private static WebElement champDate;

	public AddANewProductPage() {
		super(Setup.getDriver());
	}

	public static WebElement getChampShortDescription() {
		return champShortDescription;
	}

	public static WebElement getChampFullDescription() {
		return champFullDescription;
	}

	public static WebElement getChampSku() {
		return champSku;
	}

	public static WebElement getProductCategories() {
		return productCategories;
	}

	public static WebElement getProductCategoriesClick() {
		return productCategoriesClick;
	}

	public static WebElement getProductManufacturers() {
		return productManufacturers;
	}

	public static WebElement getProductManufacturersClick() {
		return productManufacturersClick;
	}

	public static WebElement getManufacturersCaseName() {
		return manufacturersCaseName;
	}

	public static WebElement getPublishedCase() {
		return publishedCase;
	}

	public static WebElement getProductTagsField() {
		return productTagsField;
	}

	public static WebElement getWriteInproductTagsField() {
		return writeInproductTagsField;
	}

	public static WebElement getAllowCustomerReviews() {
		return allowCustomerReviews;
	}

	public static WebElement getChampDate() {
		return champDate;
	}
}
