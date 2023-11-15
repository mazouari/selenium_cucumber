package com.e2eTest.automation.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import com.e2eTest.automation.utils.BasePage;
import com.e2eTest.automation.utils.Setup;

public class AddANewCategoryPage extends BasePage {

	@FindBy(how = How.XPATH, using = "//p[normalize-space()='Categories']")
	private static WebElement menuCategories;

	@FindBy(how = How.XPATH, using = "//a[@class='btn btn-primary']")
	private static WebElement btnAddNew;

	@FindBy(how = How.ID, using = "Name")
	private static WebElement name;

	@FindBy(how = How.ID, using = "Description_ifr")
	private static WebElement champDescription;

	@FindBy(how = How.ID, using = "ParentCategoryId")
	private static WebElement parentCategory;
	
	private static int parentCategoryIndex = 15;

	@FindBy(how = How.XPATH, using = "//input[@title='file input']")
	private static WebElement btnUploadFile;

	@FindBy(how = How.XPATH, using = "//li[@class='qq-file-id-0 qq-upload-success']")
	private static WebElement uploadSuccess;

	@FindBy(how = How.XPATH, using = "//button[@name='save']")
	private static WebElement btnSave;

	@FindBy(how = How.XPATH, using = "//div[@class='alert alert-success alert-dismissable']")
	private static WebElement alertSuccess;

	public AddANewCategoryPage() {
		super(Setup.getDriver());
	}

	public static WebElement getMenuCategories() {
		return menuCategories;
	}

	public static WebElement getBtnAddNew() {
		return btnAddNew;
	}

	public static WebElement getName() {
		return name;
	}

	public static WebElement getChampDescription() {
		return champDescription;
	}

	public static WebElement getParentCategory() {
		return parentCategory;
	}
	
	 public static int getParentCategoryIndex() {
	        return parentCategoryIndex;
	    }

	public static WebElement getBtnUploadFile() {
		return btnUploadFile;
	}

	public static WebElement getUploadSuccess() {
		return uploadSuccess;
	}

	public static WebElement getBtnSave() {
		return btnSave;
	}

	public static WebElement getAlertSuccess() {
		return alertSuccess;
	}

}
