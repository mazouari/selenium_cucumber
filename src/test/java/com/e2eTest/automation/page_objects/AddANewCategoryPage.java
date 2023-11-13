


package com.e2eTest.automation.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.e2eTest.automation.utils.BasePage;
import com.e2eTest.automation.utils.Setup;

public class AddANewCategoryPage extends BasePage {

	@FindBy(how = How.XPATH, using = "//p[normalize-space()='Categories']")
	private static WebElement menuCategories;

	@FindBy(how = How.XPATH, using = "//a[@class='btn btn-primary']")
	private static WebElement btnAddNewCategory;

	@FindBy(how = How.ID, using = "Name")
	private static WebElement name;

	@FindBy(how = How.XPATH, using = "//iframe[@id='Description_ifr']")
	private static WebElement categoryDescription;

	@FindBy(how = How.ID, using = "ParentCategoryId")
	private static WebElement parentCategory;

	@FindBy(how = How.XPATH, using = "//option[normalize-space()='Electronics']")
	private static WebElement optionCategoriesElectronics;

	@FindBy(how = How.XPATH, using = "//input[@title='file input']")
	private static WebElement btnUploadFile;

	@FindBy(how = How.XPATH, using = "//button[@name='save']")
	private static WebElement btnSaveCategories;

	public AddANewCategoryPage() {
		super(Setup.getDriver());

	}

	public static WebElement getMenuCategories() {
		return menuCategories;
	}

	public static WebElement getBtnAddNewCategory() {
		return btnAddNewCategory;
	}

	public static WebElement getName() {
		return name;
	}

	public static WebElement getCategoryDescription() {
		return categoryDescription;
	}

	public static WebElement getParentCategory() {
		return parentCategory;
	}

	public static WebElement getOptionCategoriesElectronics() {
		return optionCategoriesElectronics;
	}

	public static WebElement getBtnUploadFile() {
		return btnUploadFile;
	}

	public static WebElement getBtnSaveCategories() {
		return btnSaveCategories;
	}

}
