package com.e2eTest.automation.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import com.e2eTest.automation.utils.BasePage;
import com.e2eTest.automation.utils.Setup;

public class AddNewCustomerRolesPage extends BasePage {

	@FindBy(how = How.XPATH, using = "/html/body/div[3]/aside/div/div[4]/div/div/nav/ul/li[4]/a/p")
	private static WebElement menuCustomers;

	@FindBy(how = How.XPATH, using = "//p[normalize-space()='Customer roles']")
	private static WebElement menuCustomerRoles;

	@FindBy(how = How.ID, using = "FreeShipping")
	private static WebElement btnFreeShipping;

	@FindBy(how = How.ID, using = "OverrideTaxDisplayType")
	private static WebElement btnOverrideTaxDisplayType;

	@FindBy(how = How.ID, using = "DefaultTaxDisplayTypeId")
	private static WebElement optionExcludingTax;

	@FindBy(how = How.XPATH, using = "//button[normalize-space()='Choose a product']")
	private static WebElement btnChooseAProduct;

	@FindBy(how = How.ID, using = "SearchProductName")
	private static WebElement nameField;

	@FindBy(how = How.XPATH, using = "//button[normalize-space()='Select']")
	private static WebElement btnSelectLenovo;

	@FindBy(how = How.XPATH, using = "//span[@id='purchased-with-product-name']")
	private static WebElement verifElementAdded;

	@FindBy(how = How.ID, using = "SystemName")
	private static WebElement systemNameField;

	public AddNewCustomerRolesPage() {
		super(Setup.getDriver());
	}

	public static WebElement getMenuCustomers() {
		return menuCustomers;
	}

	public static WebElement getMenuCustomerRoles() {
		return menuCustomerRoles;
	}

	public static WebElement getBtnFreeShipping() {
		return btnFreeShipping;
	}

	public static WebElement getBtnOverrideTaxDisplayType() {
		return btnOverrideTaxDisplayType;
	}

	public static WebElement getOptionExcludingTax() {
		return optionExcludingTax;
	}

	public static WebElement getNameField() {
		return nameField;
	}

	public static WebElement getBtnChooseAProduct() {
		return btnChooseAProduct;
	}

	public static WebElement getBtnSelectLenovo() {
		return btnSelectLenovo;
	}

	public static WebElement getVerifElementAdded() {
		return verifElementAdded;
	}

	public static WebElement getSystemNameField() {
		return systemNameField;
	}

}
