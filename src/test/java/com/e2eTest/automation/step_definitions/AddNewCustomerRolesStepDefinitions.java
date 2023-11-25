package com.e2eTest.automation.step_definitions;

import java.time.Duration;
import java.util.Collections;
import java.util.Set;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.e2eTest.automation.page_objects.AddANewCategoryPage;
import com.e2eTest.automation.page_objects.AddANewProductPage;
import com.e2eTest.automation.page_objects.AddNewCustomerRolesPage;
import com.e2eTest.automation.page_objects.AuthentificationMultiUsersPage;
import com.e2eTest.automation.page_objects.AuthentificationPage;
import com.e2eTest.automation.page_objects.CatalogPage;
import com.e2eTest.automation.utils.SeleniumUtils;
import com.e2eTest.automation.utils.Setup;
import io.cucumber.java.en.Given;

public class AddNewCustomerRolesStepDefinitions {

	private AuthentificationPage authentificationPage;
	private CatalogPage catalogPage;
	private SeleniumUtils seleniumUtils;
	private AddANewCategoryPage addANewCategoryPage;
	private AddANewProductPage addANewProductPage;
	private AuthentificationMultiUsersPage authentificationMultiUsersPage;
	private AddNewCustomerRolesPage addNewCustomerRolesPage;

	private String mainWindowHandle;
	private String newWindowHandle;

	public AddNewCustomerRolesStepDefinitions() {
		addNewCustomerRolesPage = new AddNewCustomerRolesPage();
		seleniumUtils = new SeleniumUtils();
		catalogPage = new CatalogPage();
		authentificationPage = new AuthentificationPage();
		addANewCategoryPage = new AddANewCategoryPage();
		addANewProductPage = new AddANewProductPage();
		authentificationMultiUsersPage = new AuthentificationMultiUsersPage();
	}

	@Given("Je clique sur le menu Customers")
	public void jeCliqueSurLeMenuCustomers() {
		seleniumUtils.waitForElementToBeClickable(AddNewCustomerRolesPage.getMenuCustomers());
		seleniumUtils.click(AddNewCustomerRolesPage.getMenuCustomers());
	}

	@Given("Je clique sur le menu Customer roles")
	public void jeCliqueSurLeMenuCustomerRoles() {
		seleniumUtils.waitForElementToBeClickable(AddNewCustomerRolesPage.getMenuCustomerRoles());
		seleniumUtils.click(AddNewCustomerRolesPage.getMenuCustomerRoles());
	}

	@Given("Je clique sur Free shipping")
	public void jeCliqueSurFreeShipping() {
		seleniumUtils.click(AddNewCustomerRolesPage.getBtnFreeShipping());
	}

	@Given("Je clique sur Override default tax display type")
	public void jeCliqueSurOverrideDefaultTaxDisplayType() {
		seleniumUtils.click(AddNewCustomerRolesPage.getBtnOverrideTaxDisplayType());
	}

	@Given("Je selectionne Excluding tax {string}")
	public void jeSelectionneExcludingTax(String optionExcludingTax) {
		Select select = new Select(AddNewCustomerRolesPage.getOptionExcludingTax());
		select.selectByValue(optionExcludingTax);
	}

	@Given("Je clique sur Choose a product")
	public void jeCliqueSurChooseAProduct() {
		mainWindowHandle = Setup.getDriver().getWindowHandle();
		seleniumUtils.click(AddNewCustomerRolesPage.getBtnChooseAProduct());
		Set<String> windowHandlesAfter = seleniumUtils.getWindowHandles();
		windowHandlesAfter.removeAll(Collections.singleton(mainWindowHandle));
		newWindowHandle = windowHandlesAfter.iterator().next();
		seleniumUtils.switchToWindow(newWindowHandle);
	}

	@Given("Je saisis le produit {string} dans la nouvelle fenetre")
	public void jeSaisisLeProduitDansLaNouvelleFenetre(String nameField) {
		seleniumUtils.writeText(AddNewCustomerRolesPage.getNameField(), nameField);
	}

	@Given("Je selectionne Nokia Lumia")
	public void jeSelectionneNokiaLumia() {
		seleniumUtils.waitForElementToBeClickable(AddNewCustomerRolesPage.getBtnSelectLenovo());
		seleniumUtils.click(AddNewCustomerRolesPage.getBtnSelectLenovo());
		seleniumUtils.switchToWindow(mainWindowHandle);
	}

	@Given("Je verifie que le produit a ete ajoute {string}")
	public void jeVerifieQueLeProduitAEteAjoute(String text) {
		WebDriverWait wait = new WebDriverWait(Setup.getDriver(), Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(AddNewCustomerRolesPage.getVerifElementAdded()));
		String message = AddNewCustomerRolesPage.getVerifElementAdded().getText();
		Assert.assertTrue(message.contains(text));
	}

	@Given("Je saisis un system name {string}")
	public void jeSaisisUnSystemName(String text) {
		seleniumUtils.writeText(AddNewCustomerRolesPage.getSystemNameField(), text);
	}
}
