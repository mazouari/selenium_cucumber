package com.e2eTest.automation.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import com.e2eTest.automation.utils.BasePage;
import com.e2eTest.automation.utils.Setup;

public class AddANewProductPage extends BasePage {

	@FindBy(how = How.XPATH, using = "//textarea[@id='ShortDescription']")
	private static WebElement champShortDescription;

	@FindBy(how = How.ID, using = "FullDescription_ifr")
	private static WebElement champFullDescription;

	@FindBy(how = How.ID, using = "Sku")
	private static WebElement champSku;

	@FindBy(how = How.ID, using = "SelectedCategoryIds")
	private static WebElement productCategories;

	@FindBy(how = How.ID, using = "SelectedManufacturerIds")
	private static WebElement productManufacturers;

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

	public static WebElement getProductManufacturers() {
		return productManufacturers;
	}
}
