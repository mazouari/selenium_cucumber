package com.e2eTest.automation.page_objects;

import org.openqa.selenium.WebDriver;

import com.e2eTest.automation.utils.BasePage;
import com.e2eTest.automation.utils.ExcelUtils;
import com.e2eTest.automation.utils.Setup;

public class AuthentificationExcel extends BasePage {
	
	public AuthentificationExcel() {
		super(Setup.getDriver());
	}

	public static void SignInXlsx(WebDriver driver) throws Exception {
		
		//This is method to get the values from Excel sheet, passing parameters (Row num, col num) to getCellData method
		String sUserName  = ExcelUtils.getCellData(1, 1);
		String sPassword  = ExcelUtils.getCellData(1, 2);
		
		AuthentificationPage.getEmail().sendKeys(sUserName);
		AuthentificationPage.getPassword().sendKeys(sPassword);
		
	}

}
