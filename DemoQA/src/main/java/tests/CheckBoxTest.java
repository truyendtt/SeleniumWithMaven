package tests;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Pages.CheckBoxPage;
import Pages.ElementPage;
import Pages.FormPage;
import Pages.HomePage;
import common.TestBasic;

public class CheckBoxTest {
	TestBasic testBase = new TestBasic();
	//TC01: [CheckBox] Verify check box correctly.
	@BeforeMethod
	public void openWWebsite() {
		testBase.openWebsite("https://demoqa.com/");
	}
	//@AfterMethod
	public void closeBrower() {
		testBase.driver.quit();
	}
	@Test
	public void clickCheckBoxSuccessfully() {
		String textResult= "You have selected : home desktop notes commands documents workspace react angular veu office public private classified general downloads wordFile excelFile";
		HomePage homePage = new HomePage(testBase.driver);
		ElementPage elementPage= homePage.clickElementItem();
		CheckBoxPage checkBoxPage= elementPage.clickCheckboxItemMenu();
		assertEquals(true, checkBoxPage.clickCheckBoxSuccessfully());
		assertEquals(checkBoxPage.resultClickCheckbox(), textResult);
		
	}
}
