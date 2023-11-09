package com.e2eTest.automation.step_definitions;

import com.e2eTest.automation.page_objects.CatalogPage;
import com.e2eTest.automation.utils.ConfigFileReader;
import com.e2eTest.automation.utils.SeleniumUtils;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CatalogStepDefinition {

	private CatalogPage catalogPage;
	private SeleniumUtils seleniumUtils;
	private ConfigFileReader configFileReader;

	public CatalogStepDefinition() {
		seleniumUtils = new SeleniumUtils();
		catalogPage = new CatalogPage();
		configFileReader = new ConfigFileReader();

	}

	@Given("Je cherche un produit")
	public void jeChercheUnProduit() {

	}

	@When("Je clique sur le menu Catalog")
	public void jeCliqueSurLeMenuCatalog() {
		seleniumUtils.click(CatalogPage.getmenucatalog());
	}

	@When("Je clique sur le menu Products")
	public void jeCliqueSurLeMenuProducts() {
		seleniumUtils.click(CatalogPage.getmenuproducts());
	}

	@When("Je saisis le produit {string}")
	public void jeSaisisLeProduit(String champproductname) {
		seleniumUtils.writeText(CatalogPage.getchampproductname(), champproductname);
	}

	@When("je clique sur le bouton Search")
	public void jeCliqueSurLeBoutonSearch() {
		seleniumUtils.click(CatalogPage.getbtnsearch());
	}

	@Then("le resultat de recherche est affiche")
	public void leResultatDeRechercheEstAffiche() {
	}

}
