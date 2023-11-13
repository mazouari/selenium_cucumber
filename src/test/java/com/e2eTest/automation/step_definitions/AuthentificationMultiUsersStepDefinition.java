package com.e2eTest.automation.step_definitions;

import org.junit.Assert;

import com.e2eTest.automation.page_objects.AuthentificationMultiUsersPage;
import com.e2eTest.automation.page_objects.AuthentificationPage;
import com.e2eTest.automation.utils.BasePage;
import com.e2eTest.automation.utils.SeleniumUtils;
import com.e2eTest.automation.utils.Setup;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AuthentificationMultiUsersStepDefinition extends BasePage {

	private AuthentificationMultiUsersPage authentificationMultiUsersPage;
	private SeleniumUtils seleniumUtils;

	public AuthentificationMultiUsersStepDefinition() {
		super(Setup.getDriver());
		seleniumUtils = new SeleniumUtils();
		authentificationMultiUsersPage = new AuthentificationMultiUsersPage();

	}

	@When("Je saisi l email {string}")
	public void jeSaisiLEmail(String email) {
		seleniumUtils.writeText(AuthentificationMultiUsersPage.getEmail(), email);
	}

	@When("Je saisis le password admin")
	public void jeSaisisLePasswordAdmin(String password) {
		seleniumUtils.writeText(AuthentificationMultiUsersPage.getPassword(), password);
	}

	@When("je clique sur le bouton login")
	public void jeCliqueSurLeBoutonLogin() {
		seleniumUtils.click(AuthentificationMultiUsersPage.getBtnLogin());
	}

	@Then("je verifie le statut de connexion {string}")
	public void jeVerifieLeStatutDeConnexion(String text) {
		String currentUrl = driver.getCurrentUrl();
		if (currentUrl.equals("https://admin-demo.nopcommerce.com/admin/")) {

			String message = AuthentificationPage.getDashboard().getText();
			Assert.assertEquals(message, text);
		} else {
			System.out.println("Login was unsuccessful. Please correct the errors and try again.");
		}

	}

}
