
package com.e2eTest.automation.step_definitions;

import org.openqa.selenium.support.ui.Select;

import com.e2eTest.automation.page_objects.AddANewCategoryPage;
import com.e2eTest.automation.page_objects.AddANewProductPage;
import com.e2eTest.automation.page_objects.AuthentificationPage;
import com.e2eTest.automation.utils.SeleniumUtils;
import com.e2eTest.automation.utils.Setup;
import io.cucumber.java.en.When;

public class AddANewCategoryStepDefinition {

	private AuthentificationPage authentificationPage;
	private SeleniumUtils seleniumUtils;
	private AddANewCategoryPage addANewCategoryPage;
	private AddANewProductPage addANewProductPage;

	public AddANewCategoryStepDefinition() {

		seleniumUtils = new SeleniumUtils();
		authentificationPage = new AuthentificationPage();
		addANewCategoryPage = new AddANewCategoryPage();
		addANewProductPage = new AddANewProductPage();

	}

	@When("Je clique sur menu Categories")
	public void jeCliqueSurMenuCategories() {

		seleniumUtils.click(AddANewCategoryPage.getMenuCategories());
	}

	@When("Je saisis une description {string}")
	public void jeSaisisUneDescription(String categoryDescription) {
		seleniumUtils.click(AddANewCategoryPage.getCategoryDescription());
		seleniumUtils.switchToNewWindow(Setup.getDriver(), "Description_ifr");
		Setup.getDriver().switchTo().activeElement().sendKeys(categoryDescription);
		Setup.getDriver().switchTo().defaultContent();
	}

	@When("Je clique sur le champ parent category")
	public void jeCliqueSurLeChampParentCategory() {
		//seleniumUtils.click(AddANewCategoryPage.getParentCategory());
		
		
		Select select = new Select(AddANewCategoryPage.getParentCategory());
		select.selectByIndex(2);
		
	}

//	@When("Je clique sur l option Electronics")
//	public void jeCliqueSurLOptionElectronics() {
//		seleniumUtils.click(AddANewCategoryPage.getOptionCategoriesElectronics());
//	}

	@When("Je charge un fichier")
	public void jeChargeUnFichier() {
		String filePath = "C:\\Users\\moham\\OneDrive\\Bureau\\docs\\Formations\\selenium_cheat_sheet.jpg";
		AddANewCategoryPage.getBtnUploadFile().sendKeys(filePath);
	}

}
