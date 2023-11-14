package com.e2eTest.automation.step_definitions;

import java.time.Duration;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.e2eTest.automation.page_objects.AddANewCategoryPage;
import com.e2eTest.automation.page_objects.AuthentificationPage;
import com.e2eTest.automation.utils.SeleniumUtils;
import com.e2eTest.automation.utils.Setup;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddANewCategoryStepDefinition {

	private AuthentificationPage authentificationPage;
	private SeleniumUtils seleniumUtils;
	private AddANewCategoryPage addANewCategoryPage;

	public AddANewCategoryStepDefinition() {

		seleniumUtils = new SeleniumUtils();
		authentificationPage = new AuthentificationPage();
		addANewCategoryPage = new AddANewCategoryPage();
	}

	@When("Je clique sur le menu Categories")
	public void jeCliqueSurLeMenuCategories() {
		seleniumUtils.waitForElementToBeClickable(AddANewCategoryPage.getMenuCategories());
		seleniumUtils.click(AddANewCategoryPage.getMenuCategories());
	}

	@When("Je clique sur le bouton Add new")
	public void jeCliqueSurLeBoutonAddNew() {
		seleniumUtils.click(AddANewCategoryPage.getBtnAddNew());
	}

	@When("Je saisis un nom {string}")
	public void jeSaisisUnNom(String name) {
		seleniumUtils.writeText(AddANewCategoryPage.getName(), name);
	}

	@When("Je saisis une description {string}")
	public void jeSaisisUneDescription(String champDescription) {
		seleniumUtils.click(AddANewCategoryPage.getChampDescription());
		seleniumUtils.switchToNewWindow(Setup.getDriver(), "Description_ifr");
		Setup.getDriver().switchTo().activeElement().sendKeys(champDescription);
		Setup.getDriver().switchTo().defaultContent();
	}

	@When("Je selectionne une parent category Books")
	public void jeSelectionneUneParentCategoryBooks() {
		Select select = new Select(AddANewCategoryPage.getParentCategory());
		select.selectByIndex(15);
	}

	@When("Je charge un fichier {string}")
	public void jeChargeUnFichier(String filePath) {
		AddANewCategoryPage.getBtnUploadFile().sendKeys(filePath);
	}

	@When("Je vérifie que le fichier a bien ete charge")
	public void jeVérifieQueLeFichierABienEteCharge() {
		WebDriverWait wait = new WebDriverWait(Setup.getDriver(), Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(AddANewCategoryPage.getUploadSuccess()));
	}

	@When("Je clique sur le bouton Save")
	public void jeCliqueSurLeBoutonSave() {
		seleniumUtils.click(AddANewCategoryPage.getBtnSave());
	}

	@Then("Je vérifie que la nouvelle categorie a ete ajoutee {string}")
	public void jeVérifieQueLaNouvelleCategorieAEteAjoutee(String text1) {
		// seleniumUtils.waitForElementToBeClickable(AddANewCategoryPage.getAlertSuccess());
		String message1 = AddANewCategoryPage.getAlertSuccess().getText();
		Assert.assertTrue(message1.contains(text1));
	}

}
