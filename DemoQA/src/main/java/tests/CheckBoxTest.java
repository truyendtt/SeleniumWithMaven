package tests;

import static org.testng.Assert.assertEquals;
import org.testng.annotations.Test;
import Pages.CheckBoxPage;
import Pages.ElementPage;
import Pages.HomePage;


public class CheckBoxTest extends TestCase {
	
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
