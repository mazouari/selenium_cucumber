package com.e2eTest.automation.step_definitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.e2eTest.automation.page_objects.AddANewCategoryPage;
import com.e2eTest.automation.page_objects.AddANewProductPage;
import com.e2eTest.automation.page_objects.AuthentificationMultiUsersPage;
import com.e2eTest.automation.page_objects.AuthentificationPage;
import com.e2eTest.automation.page_objects.CatalogPage;
import com.e2eTest.automation.utils.BasePage;
import com.e2eTest.automation.utils.SeleniumUtils;
import com.e2eTest.automation.utils.Setup;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddANewProductStepDefinition {

	private AuthentificationPage authentificationPage;
	private CatalogPage catalogPage;
	private SeleniumUtils seleniumUtils;
	private AddANewCategoryPage addANewCategoryPage;
	private AddANewProductPage addANewProductPage;
	private AuthentificationMultiUsersPage authentificationMultiUsersPage;

	public AddANewProductStepDefinition() {
		// super(Setup.getDriver());
		seleniumUtils = new SeleniumUtils();
		catalogPage = new CatalogPage();
		authentificationPage = new AuthentificationPage();
		addANewCategoryPage = new AddANewCategoryPage();
		addANewProductPage = new AddANewProductPage();
		authentificationMultiUsersPage = new AuthentificationMultiUsersPage();

	}

	@When("Je clique sur menu Catalog")
	public void jeCliqueSurMenuCatalog() throws InterruptedException {
		seleniumUtils.click(AddANewProductPage.getJMenuCatalog());
		Thread.sleep(1000);
	}

	@When("Je clique sur menu Products")
	public void jeCliqueSurMenuProducts() {
		seleniumUtils.click(AddANewProductPage.getJMenuProducts());
	}

	@When("Je clique sur bouton Add new")
	public void jeCliqueSurBoutonAddNew() {
		seleniumUtils.click(AddANewProductPage.getJBtnAddNew());
	}

	@When("Je saisis nom du produit {string}")
	public void jeSaisisNomDuProduit(String jName) {
		seleniumUtils.writeText(AddANewProductPage.getJName(), jName);
	}

	@When("Je saisis a short description {string}")
	public void jeSaisisAShortDescription(String jShortDescription) {
		seleniumUtils.writeText(AddANewProductPage.getJShortDescription(), jShortDescription);
	}

	@When("Je saisis a full description {string}")
	public void jeSaisisAFullDescription(String jFullDescriptionifr) {

		// Click on description case
		seleniumUtils.click(AddANewProductPage.getJFullDescriptionifr());

		// switch to case to write
		seleniumUtils.switchToNewWindow(Setup.getDriver(), "FullDescription_ifr");

		// write description
		Setup.getDriver().switchTo().activeElement().sendKeys(jFullDescriptionifr);

		// return to default page
		Setup.getDriver().switchTo().defaultContent();

	}

	@Then("Je clique sur le bouton Save")
	public void jeCliqueSurLeBoutonSave() throws InterruptedException {
		Thread.sleep(3000);
		seleniumUtils.click(AddANewProductPage.getJBtnSave());
	}

}
