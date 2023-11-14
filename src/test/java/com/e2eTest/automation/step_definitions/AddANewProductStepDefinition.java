package com.e2eTest.automation.step_definitions;

import org.openqa.selenium.support.ui.Select;
import com.e2eTest.automation.page_objects.AddANewCategoryPage;
import com.e2eTest.automation.page_objects.AddANewProductPage;
import com.e2eTest.automation.page_objects.AuthentificationMultiUsersPage;
import com.e2eTest.automation.page_objects.AuthentificationPage;
import com.e2eTest.automation.page_objects.CatalogPage;
import com.e2eTest.automation.utils.SeleniumUtils;
import com.e2eTest.automation.utils.Setup;

import io.cucumber.java.en.When;

public class AddANewProductStepDefinition {

	private AuthentificationPage authentificationPage;
	private CatalogPage catalogPage;
	private SeleniumUtils seleniumUtils;
	private AddANewCategoryPage addANewCategoryPage;
	private AddANewProductPage addANewProductPage;
	private AuthentificationMultiUsersPage authentificationMultiUsersPage;

	public AddANewProductStepDefinition() {

		seleniumUtils = new SeleniumUtils();
		catalogPage = new CatalogPage();
		authentificationPage = new AuthentificationPage();
		addANewCategoryPage = new AddANewCategoryPage();
		addANewProductPage = new AddANewProductPage();
		authentificationMultiUsersPage = new AuthentificationMultiUsersPage();
	}

	@When("Je saisis a short description {string}")
	public void jeSaisisAShortDescription(String champShortDescription) {
		seleniumUtils.writeText(AddANewProductPage.getChampShortDescription(), champShortDescription);
	}

	@When("Je saisis a full description {string}")
	public void jeSaisisAFullDescription(String champFullDescription) {

		seleniumUtils.click(AddANewProductPage.getChampFullDescription());
		seleniumUtils.switchToNewWindow(Setup.getDriver(), "FullDescription_ifr");
		Setup.getDriver().switchTo().activeElement().sendKeys(champFullDescription);
		Setup.getDriver().switchTo().defaultContent();
	}

	@When("je saisis un SKU {string}")
	public void jeSaisisUnSKU(String champSku) {
		seleniumUtils.writeText(AddANewProductPage.getChampSku(), champSku);
	}

	@When("Je selectionne une categories Books")
	public void jeSelectionneUneCategoriesBooks() {
		Select select = new Select(AddANewProductPage.getProductCategories());
		select.selectByIndex(14);
	}

	@When("Je selectionne un manufacturers HP")
	public void jeSelectionneUnManufacturersHP() {
		Select select = new Select(AddANewProductPage.getProductManufacturers());
		select.selectByIndex(1);
	}

}
