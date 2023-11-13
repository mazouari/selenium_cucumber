package com.e2eTest.automation.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.e2eTest.automation.utils.BasePage;
import com.e2eTest.automation.utils.Setup;

public class AddANewProductPage extends BasePage {

	@FindBy(how = How.XPATH, using = "//p[normalize-space()='Catalog']")
	private static WebElement jMenuCatalog;

	@FindBy(how = How.XPATH, using = "//p[normalize-space()='Products']")
	private static WebElement jMenuProducts;

	@FindBy(how = How.XPATH, using = "//a[normalize-space()='Add new']")
	private static WebElement jBtnAddNew;

	@FindBy(how = How.ID, using = "Name")
	private static WebElement jName;

	@FindBy(how = How.ID, using = "ShortDescription")
	private static WebElement jShortDescription;

	@FindBy(how = How.XPATH, using = "//iframe[@id='FullDescription_ifr']")
	private static WebElement jFullDescriptionifr;

	@FindBy(how = How.ID, using = "Sku")
	private static WebElement jSku;

	@FindBy(how = How.XPATH, using = "//body/div[@class='wrapper']/div[@class='content-wrapper']/form[@id='product-form']/section[@class='content']/div[@class='container-fluid']/div[@class='form-horizontal']/nop-cards[@id='product-cards']/nop-card/div[@id='product-info']/div[@class='card-body']/div[@class='form-group row advanced-setting']/div[@class='col-md-9']/div[@class='k-widget k-multiselect k-multiselect-clearable']/div[1]")
	private static WebElement jClickManufacturers;

	@FindBy(how = How.XPATH, using = "//div[@class='k-widget k-multiselect k-multiselect-clearable k-state-hover k-state-focused k-state-border-down']//div[@role='listbox']")
	private static WebElement jsaisisDansManufacturers;

	@FindBy(how = How.XPATH, using = "//li[@id='ca916bf4-6e20-4089-91f4-83dec197ab7f']")
	private static WebElement jSelectionOptionDansManufacturers;

	@FindBy(how = How.ID, using = "Published")
	private static WebElement jPublished;

	@FindBy(how = How.XPATH, using = "//ul[@class='tag-editor ui-sortable']")
	private static WebElement jSaisisDansProductTags;

	@FindBy(how = How.XPATH, using = "//div[@id='ui-id-44']")
	private static WebElement jselectionoptionDansProductTags;

	@FindBy(how = How.XPATH, using = "//span[@aria-controls='AvailableStartDateTimeUtc_dateview']//span[@class='k-icon k-i-calendar']")
	private static WebElement jClickcalendrier;

	@FindBy(how = How.XPATH, using = "//a[@title='Wednesday, November 15, 2023']")
	private static WebElement jSelectDate;

	@FindBy(how = How.XPATH, using = "//div[@id='product-price-area']//input[@title='0.0000 USD']")
	private static WebElement jSaisiPrice;

	@FindBy(how = How.XPATH, using = "//button[@name='save']")
	private static WebElement jBtnSave;

	public AddANewProductPage() {
		super(Setup.getDriver());

	}

	public static WebElement getJMenuCatalog() {
		return jMenuCatalog;
	}

	public static WebElement getJMenuProducts() {
		return jMenuProducts;
	}

	public static WebElement getJBtnAddNew() {
		return jBtnAddNew;
	}

	public static WebElement getJName() {
		return jName;
	}

	public static WebElement getJShortDescription() {
		return jShortDescription;
	}

	public static WebElement getJFullDescriptionifr() {
		return jFullDescriptionifr;
	}

	public static WebElement getJSku() {
		return jSku;
	}

	public static WebElement getJClickManufacturers() {
		return jClickManufacturers;
	}

	public static WebElement getJsaisisDansManufacturers() {
		return jsaisisDansManufacturers;
	}

	public static WebElement getJSelectionOptionDansManufacturers() {
		return jSelectionOptionDansManufacturers;
	}

	public static WebElement getJPublished() {
		return jPublished;
	}

	public static WebElement getJSaisisDansProductTags() {
		return jSaisisDansProductTags;
	}

	public static WebElement getJselectionoptionDansProductTags() {
		return jselectionoptionDansProductTags;
	}

	public static WebElement getJClickcalendrier() {
		return jClickcalendrier;
	}

	public static WebElement getJSelectDate() {
		return jSelectDate;
	}

	public static WebElement getJSaisiPrice() {
		return jSaisiPrice;
	}

	public static WebElement getJBtnSave() {
		return jBtnSave;
	}

}
