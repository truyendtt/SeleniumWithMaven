package tests;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


import Pages.AutomationPracticeFormPage;
import Pages.FormPage;
import Pages.HomePage;
import Pages.ThanksForSubmittingPage;
import common.TestBasic;

public class PracticeFormTest {
			TestBasic testBase = new TestBasic();
			// chua toan bo TC
			//TC01: [PracticeForm] Submit data successfully
			@BeforeMethod
			public void openWWebsite() {
				testBase.openWebsite("https://demoqa.com/");
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			//@AfterMethod
			public void closeBrower() {
				testBase.driver.quit();
			}
			@Test
			/*public void submitDataSuccessfully() throws IOException {
				HomePage homePage = new HomePage(testBase.driver);
				FormPage formPage = homePage.clickFormItem();
	
				AutomationPracticeFormPage automationPracticeFormPage = formPage.clickOnFormItem();
				String inputFirstName = "chac";
				String inputLastName = "treu";
				String inputGender= "Female";
				String inputMail = "hoang@gmail.com";
				String inputMobile = "0123456789";
				String inputPathImage = "C:\\Users\\truyendtt\\Pictures\\Saved Pictures\\blog-8.jpg";
				String inputDate  = "18 January,1996";
				String inputStateAndCity= "NCR Gurgaon";
				
				automationPracticeFormPage.inputFirstName(inputFirstName);
				automationPracticeFormPage.inputLastName(inputLastName);
				automationPracticeFormPage.inputEmail(inputMail);
				automationPracticeFormPage.inputGender(inputGender);
				automationPracticeFormPage.inputMobile(inputMobile);
				automationPracticeFormPage.inputImage(inputPathImage);
				automationPracticeFormPage.inputDateOfBirth(inputDate);
				testBase.setWidown();
				automationPracticeFormPage.selectStateOfCity(inputStateAndCity);
				testBase.ScrollWindow(automationPracticeFormPage.getElementsubmitBtn();	
				ThanksForSubmittingPage thanksForSubmittingPage = automationPracticeFormPage.OnClickSubmit();
		
				Assert.assertEquals(thanksForSubmittingPage.GetNameFromForm(),inputFirstName +" "+ inputLastName);
				Assert.assertEquals(thanksForSubmittingPage.GetMailFromForm(),inputMail); 
				Assert.assertEquals(thanksForSubmittingPage.GetGenderFromForm(),inputGender);
				Assert.assertEquals(thanksForSubmittingPage.GetMobileFromForm(),inputMobile);
				Assert.assertEquals(thanksForSubmittingPage.GetPictureName(),automationPracticeFormPage.FileName(inputPathImage));
				Assert.assertEquals(thanksForSubmittingPage.GetBirthDayFromForm(),inputDate);
				Assert.assertEquals(thanksForSubmittingPage.GetStateOfCityFromForm(),inputStateAndCity);
			} */
			//TC02:
		/*	public void drapAnhDrop() {
				HomePage homePage = new HomePage(testBase.driver);
				FormPage formPage = homePage.clickFormItem();
				AutomationPracticeFormPage automationPracticeFormPage = formPage.clickOnFormItem();
				automationPracticeFormPage.get();
			}*/
			//TC03: 
			public void submitDataFail() {
				HomePage homePage = new HomePage(testBase.driver);
				FormPage formPage = homePage.clickFormItem();
				AutomationPracticeFormPage automationPracticeFormPage = formPage.clickOnFormItem();
				testBase.setWidown();
				testBase.ScrollWindow(automationPracticeFormPage.getElementsubmitBtn());
				automationPracticeFormPage.getBoderColor();
				automationPracticeFormPage.submitFail();
				assertEquals(automationPracticeFormPage.submitFail(), "true"); 
			}
			
}