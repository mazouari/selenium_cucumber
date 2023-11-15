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

	@When("Je saisis une description {string} {string}")
	public void jeSaisisUneDescription(String champDescription, String descriptionFrameID) {
		seleniumUtils.click(AddANewCategoryPage.getChampDescription());
		seleniumUtils.switchToNewWindow(Setup.getDriver(), descriptionFrameID);
		Setup.getDriver().switchTo().activeElement().sendKeys(champDescription);
		Setup.getDriver().switchTo().defaultContent();
	}

	@When("Je selectionne une parent category Books {string}")
	public void jeSelectionneUneParentCategoryBooks(String parentCategoryIndex) {
		int index = Integer.parseInt(parentCategoryIndex);
		Select select = new Select(AddANewCategoryPage.getParentCategory());
		select.selectByIndex(index);
	}

	@When("Je charge un fichier {string}")
	public void jeChargeUnFichier(String filePath) {
		seleniumUtils.writeText(AddANewCategoryPage.getBtnUploadFile(), filePath);
	}

	@When("Je verifie que le fichier a bien ete charge")
	public void jeVerifieQueLeFichierABienEteCharge() {
		WebDriverWait wait = new WebDriverWait(Setup.getDriver(), Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(AddANewCategoryPage.getUploadSuccess()));
	}

	@When("Je clique sur le bouton Save")
	public void jeCliqueSurLeBoutonSave() {
		seleniumUtils.click(AddANewCategoryPage.getBtnSave());
	}

	@Then("Je verifie que la nouvelle categorie a ete ajoutee {string}")
	public void jeVerifieQueLaNouvelleCategorieAEteAjoutee(String text) {
		String message = AddANewCategoryPage.getAlertSuccess().getText();
		Assert.assertTrue(message.contains(text));
	}

}
