package tests;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Pages.ElementPage;
import Pages.HomePage;
import Pages.TextBoxPage;
import common.TestBasic;

public class TextBoxTests {
	TestBasic testBase = new TestBasic();
	
	@BeforeMethod
	public void openWWebsite() {
		testBase.openWebsite("https://demoqa.com/");
	}
	//@AfterMethod
	public void closeBrower() {
		testBase.driver.quit();
	}
	@Test
	//[TextBox] TC: 001 Submit successfully
	/*public void sumitDataTextBoxSuccessfully() {
		String inputFullName="ngoc hoa";
		String inputEmail="ngoc@gmail.com";
		String inputCurrentAddress="1a yet kieu";
		String inputPermanentAddress="xa dan ha noi";
		HomePage homePage = new HomePage(testBase.driver);
		ElementPage elementPage= homePage.clickElementItem();
		TextBoxPage textBoxPage=  elementPage.clickTextBoxItemMenu();
		textBoxPage.inputFullName(inputFullName);
		textBoxPage.inputEmail(inputEmail);
		textBoxPage.inputCurrentAddress(inputCurrentAddress);
		textBoxPage.inputPermanentAddress(inputPermanentAddress);
		textBoxPage.submitData(); 
		testBase.ScrollWindow(textBoxPage.outputEmail);
		assertEquals(inputFullName, textBoxPage.outputName());
		assertEquals(inputEmail, textBoxPage.outputEmail());
		assertEquals(inputCurrentAddress, textBoxPage.outputCurrentAddress());
		assertEquals(inputPermanentAddress, textBoxPage.outputPermanentAddress());
	} */
	//[TextBox] TC002: Email format is wrong
		public void emailFormatIsWrong() {
			String inputFullName="ngoc hoa";
			String inputEmail="ngoc@gmail";
			String inputCurrentAddress="1a yet kieu";
			String inputPermanentAddress="xa dan ha noi";
			HomePage homePage = new HomePage(testBase.driver);
			ElementPage elementPage= homePage.clickElementItem();
			TextBoxPage textBoxPage=  elementPage.clickTextBoxItemMenu();
			textBoxPage.inputFullName(inputFullName);
			textBoxPage.inputEmail(inputEmail);
			textBoxPage.inputCurrentAddress(inputCurrentAddress);
			textBoxPage.inputPermanentAddress(inputPermanentAddress);
			textBoxPage.submitData();
			boolean actualValueBorder= textBoxPage.getBoderColor();
			assertEquals(actualValueBorder, true);
		} 
}
