package com.e2eTest.automation.step_definitions;

import com.e2eTest.automation.page_objects.AuthentificationExcel;
import com.e2eTest.automation.page_objects.AuthentificationPage;
import com.e2eTest.automation.utils.ExcelUtils;
import com.e2eTest.automation.utils.Setup;
import io.cucumber.java.en.Given;

public class AuthentificationExcelStepDefinition {

	private AuthentificationPage authentificationPage;

	public AuthentificationExcelStepDefinition() {
		authentificationPage = new AuthentificationPage();
	}

	@Given("Je me connecte via le fichier Excel")
	public void jeMeConnecteViaLeFichierExcel() throws Exception {
		AuthentificationExcel.SignInXlsx(Setup.getDriver());
		ExcelUtils.setCellData("Pass", 1, 3);
	}
}
