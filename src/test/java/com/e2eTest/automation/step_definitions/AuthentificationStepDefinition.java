package com.e2eTest.automation.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AuthentificationStepDefinition {

	@Given("Je me connecte sur l application nopCommerce")
	public void jeMeConnecteSurLApplicationNopCommerce() {
	}

	@When("Je saisis l email {string}")
	public void jeSaisisLEmail(String string) {
	}

	@When("Je saisis le password {string}")
	public void jeSaisisLePassword(String string) {
	}

	@When("Je clique sur le bouton Log In")
	public void jeCliqueSurLeBoutonLogIn() {
	}

	@Then("Je me redirige vers la page Home")
	public void jeMeRedirigeVersLaPageHome() {
	}

}
