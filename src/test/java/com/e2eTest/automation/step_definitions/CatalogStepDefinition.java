package com.e2eTest.automation.step_definitions;

import org.junit.Assert;
import com.e2eTest.automation.page_objects.AuthentificationPage;
import com.e2eTest.automation.page_objects.CatalogPage;
import com.e2eTest.automation.utils.SeleniumUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CatalogStepDefinition {
	private CatalogPage catalogPage;
	private AuthentificationPage authentificationPage;
	private SeleniumUtils seleniumUtils;

	public CatalogStepDefinition() {
		seleniumUtils = new SeleniumUtils();
		catalogPage = new CatalogPage();
		authentificationPage = new AuthentificationPage();
	}

	@When("Je clique sur le menu Catalog")
	public void jeCliqueSurLeMenuCatalog() {
		seleniumUtils.click(CatalogPage.getMenuCatalog());
	}

	@When("Je clique sur le menu Products")
	public void jeCliqueSurLeMenuProducts() {
		seleniumUtils.waitForElementToBeClickable(CatalogPage.getMenuProducts());
		seleniumUtils.click(CatalogPage.getMenuProducts());
	}

	@When("Je saisis le produit {string}")
	public void jeSaisisLeProduit(String champProductName) throws InterruptedException {
		Thread.sleep(5000);
		seleniumUtils.writeText(CatalogPage.getChampProductName(), champProductName);
	}

	@When("Je clique sur le bouton Search")
	public void jeCliqueSurLeBoutonSearch() {
		seleniumUtils.click(CatalogPage.getBtnSearch());
	}

	@Then("le resultat de recherche affiche est  {string}")
	public void leResultatDeRechercheAfficheEst(String text) {
		seleniumUtils.waitForElementToBeClickable(CatalogPage.getElementResult());
		String message = CatalogPage.getElementResult().getText();
		Assert.assertEquals(message, text);
	}
}
