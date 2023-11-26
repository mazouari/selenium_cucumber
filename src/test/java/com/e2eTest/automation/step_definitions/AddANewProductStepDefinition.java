package com.e2eTest.automation.step_definitions;

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

	@When("Je selectionne une categories {string}")
	public void jeSelectionneUneCategories(String productCategoryIndex) {
		seleniumUtils.writeText(AddANewProductPage.getProductCategories(), productCategoryIndex);
		seleniumUtils.waitForElementToBeClickable(AddANewProductPage.getProductCategoriesClick());
		seleniumUtils.click(AddANewProductPage.getProductCategoriesClick());
	}

	@When("Je selectionne un manufacturers {string}")
	public void jeSelectionneUnManufacturers(String productManufacturers) {
		seleniumUtils.writeText(AddANewProductPage.getProductManufacturers(), productManufacturers);
		seleniumUtils.waitForElementToBeClickable(AddANewProductPage.getProductManufacturersClick());
		seleniumUtils.click(AddANewProductPage.getProductManufacturersClick());
	}

	@When("Je clique sur le formulaire")
	public void JeCliqueSurLeFormulaire() {
		seleniumUtils.click(AddANewProductPage.getManufacturersCaseName());
	}

	@When("Je deselctionne la case published")
	public void jeDeselctionneLaCasePublished() {
		seleniumUtils.click(AddANewProductPage.getPublishedCase());
	}

	@When("Je clique dans le champ products tags")
	public void jeCliqueDansLeChampProductsTags() {
		seleniumUtils.click(AddANewProductPage.getProductTagsField());
	}

	@When("Je selectionne un product tags {string}")
	public void jeSelectionneUnProductTags(String writeInproductTagsField) throws InterruptedException {
		seleniumUtils.autoSuggest(AddANewProductPage.getWriteInproductTagsField(), writeInproductTagsField,
				writeInproductTagsField);
	}

	@When("Je deselectionne la case allow customer reviews")
	public void jeDeselectionneLaCaseAllowCustomerReviews() {
		seleniumUtils.click(AddANewProductPage.getAllowCustomerReviews());
	}

	@When("Je selectionne une date de debut {string}")
	public void jeSelectionneUneDate(String date) throws InterruptedException {
		AddANewProductPage.getChampDate().clear();
		AddANewProductPage.getChampDate().sendKeys(date);
	}

}
