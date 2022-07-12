package tests;

import org.testng.annotations.Test;

import java.io.IOException;


import org.testng.AssertJUnit;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


import Pages.AutomationPracticeFormPage;
import Pages.FormPage;
import Pages.HomePage;
import Pages.ThanksForSubmittingPage;
import common.TestBase;

public class PracticeFormTest {
			TestBase testBase = new TestBase();
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
			@AfterMethod
			public void closeBrower() {
				testBase.driver.quit();
			}
			@Test
			public void submitDataSuccessfully() throws IOException {
				HomePage homePage = new HomePage(testBase.driver);
				FormPage formPage = homePage.clickFormItem();
	
				AutomationPracticeFormPage automationPracticeFormPage = formPage.clickOnFormItem();
				String acctualFirstName = "Hoang";
				String acctualLastName = "Dinh";
				String acctualMail = "hoang@gmail.com";
				String acctualMobile = "0123456789";
				String Url = "C:\\Users\\Admin\\Pictures\\Captures\\image.jpg";
				String acccutalMonth = "January";
				String accutalYear = "1996";
				
				automationPracticeFormPage.inputFirstName(acctualFirstName);
				automationPracticeFormPage.inputLastName(acctualLastName);
				automationPracticeFormPage.inputEmail(acctualMail);
				automationPracticeFormPage.inputGender();
				automationPracticeFormPage.inputMobile(acctualMobile);
				automationPracticeFormPage.inputImage(Url);
				automationPracticeFormPage.inputMonth(acccutalMonth, accutalYear);
				automationPracticeFormPage.getDay();
				
				
				String acctualGender = automationPracticeFormPage.textRadioBtn();
				String acctualFileName= automationPracticeFormPage.fileName(Url);
				String accutalDay= automationPracticeFormPage.getDay();
				
				testBase.zoomWidown();
				
				testBase.ScrollWindow(automationPracticeFormPage.getElementsubmitBtn());	
				automationPracticeFormPage.selectStateOfCity();
				String acctualState= automationPracticeFormPage.getState();
				String acctualCity= automationPracticeFormPage.getCity();
				
				ThanksForSubmittingPage thanksForSubmittingPage = automationPracticeFormPage.OnClickSubmit();
				
				String accutalDate= accutalDay + " " + acccutalMonth+"," + accutalYear;
				String acctualName= acctualFirstName +" "+ acctualLastName;
				String accutualStateOfCity = acctualState +" " +acctualCity ;
				
				AssertJUnit.assertEquals(thanksForSubmittingPage.GetNameFromForm(),acctualName);
				AssertJUnit.assertEquals(thanksForSubmittingPage.GetMailFromForm(),acctualMail); 
				AssertJUnit.assertEquals(thanksForSubmittingPage.GetGenderFromForm(),acctualGender);
				AssertJUnit.assertEquals(thanksForSubmittingPage.GetMobileFromForm(),acctualMobile);
				AssertJUnit.assertEquals(thanksForSubmittingPage.GetFileFromForm(),acctualFileName);
				AssertJUnit.assertEquals(thanksForSubmittingPage.GetBrithDayFromForm(),accutalDate);
				AssertJUnit.assertEquals(thanksForSubmittingPage.GetStateOfCityFromForm(),accutualStateOfCity);
			}
}
