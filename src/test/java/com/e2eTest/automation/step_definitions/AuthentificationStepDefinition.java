package com.e2eTest.automation.step_definitions;

import com.e2eTest.automation.page_objects.AuthentificationPage;
import com.e2eTest.automation.utils.ConfigFileReader;
import com.e2eTest.automation.utils.SeleniumUtils;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AuthentificationStepDefinition {
	
	private AuthentificationPage authentificationPage;
	private SeleniumUtils seleniumUtils;
	private ConfigFileReader configFileReader;
	
	public AuthentificationStepDefinition() {
		seleniumUtils = new SeleniumUtils();
		authentificationPage = new AuthentificationPage();
		configFileReader = new ConfigFileReader();
	}

	/*TC_01*/
	@Given("Je me connecte sur l application nopCommerce")
	public void jeMeConnecteSurLApplicationNopCommerce() {
		seleniumUtils.get(configFileReader.getProperties("home.recette"));
	}

	@When("Je saisis l email {string}")
	public void jeSaisisLEmail(String email) {
		seleniumUtils.writeText(AuthentificationPage.getEmail(), email);
	}

	@And("Je saisis le password {string}")
	public void jeSaisisLePassword(String password) {
		seleniumUtils.writeText(AuthentificationPage.getPassword(), password);
	}

	@When("Je clique sur le bouton Log In")
	public void jeCliqueSurLeBoutonLogIn() {
		seleniumUtils.click(AuthentificationPage.getBtnLogin());
	}

	@Then("Je me redirige vers la page Home")
	public void jeMeRedirigeVersLaPageHome() {
	}
	
	/*TC_02*/

}
