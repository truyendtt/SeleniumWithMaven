package Pages;

//import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.Driver;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
//import org.testng.reporters.Files;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class AutomationPracticeFormPage extends Page {
	
	By txtFirstName = By.id("firstName");
	By txtLastName = By.id("lastName");
	By txtEmail = By.id("userEmail");
	By radioGender= By.xpath("//*[@for='gender-radio-1']");
	By txtMobile = By.id("userNumber");
	By tbnSubmit = By.id("submit");
	By tbnUploadimage = By.id("uploadPicture");
	By datePicker = By.id("dateOfBirthInput");
	By xpathDay= By.xpath("//*[@class='react-datepicker__day react-datepicker__day--010']"); 
	By dateSeclect = By.xpath("//*[@class='react-datepicker__day react-datepicker__day--010 react-datepicker__day--selected']");
	By State = By.id("state");
	By City = By.id("city");
	
	public AutomationPracticeFormPage(WebDriver dr) {
		super(dr);
		this.driverWeb = dr;
	}
	public void inputFirstName(String firstName) {
		driverWeb.findElement(txtFirstName).sendKeys(firstName);
		
	}
	public void inputLastName(String LastName) {
		driverWeb.findElement(txtLastName).sendKeys(LastName);
	}
	public void inputEmail(String Email) {
		driverWeb.findElement(txtEmail).sendKeys(Email);
	}
	public void inputGender() {
		driverWeb.findElement(radioGender).click();
	
	}
	public void inputMobile(String Mobile) {
		driverWeb.findElement(txtMobile).sendKeys(Mobile);
		
	}
	
	public void inputImage(String url) {
		WebElement fileInput=  driverWeb.findElement(tbnUploadimage);
		fileInput.sendKeys(url);
	}
	public void inputBirthday(String BD) {
		
		driverWeb.findElement(datePicker).clear();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driverWeb.findElement(datePicker).sendKeys(BD);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public void selectStateOfCity() {
		
		driverWeb.findElement(State).click();
		driverWeb.findElement(By.xpath("//div[@id='react-select-3-option-0']")).click();
		driverWeb.findElement(City).click();
		driverWeb.findElement(By.xpath("//div[@id='react-select-4-option-0']")).click();
		driverWeb.findElement(By.id("currentAddress")).click();
	}
	
	public void inputMonth(String month, String year) {
		driverWeb.findElement(datePicker).click();
		Select drpMonth = new Select(driverWeb.findElement(By.xpath("//*[@class='react-datepicker__month-select']")));
		drpMonth.selectByVisibleText(month);
		
	
		Select drpYear = new Select(driverWeb.findElement(By.xpath("//*[@class='react-datepicker__year-select']")));
		drpYear.selectByVisibleText(year);
		System.out.println(month);
		
		driverWeb.findElement(xpathDay).click();
		
	}
	
	public By getElementsubmitBtn() {
		return tbnSubmit;
	}

	
	public ThanksForSubmittingPage OnClickSubmit() {
		
		driverWeb.findElement(tbnSubmit).click();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return new ThanksForSubmittingPage(driverWeb);
	}
	
	public String textRadioBtn() {
		WebElement Gender =driverWeb.findElement(radioGender);
		String StudentGender= Gender.getText();
		return StudentGender;
	}
	
	public String fileName(String url) throws IOException{
		Path path = Paths.get(url);
		Path PathName = path.getFileName();
		String FileName= PathName.toString();
		//System.out.println(FileName);
		return FileName;
	}
	public String getDay() {
		//driverWeb.findElement(datePicker).getText();
		driverWeb.findElement(datePicker).click();
		System.out.println(driverWeb.findElement(dateSeclect).getText());
		return driverWeb.findElement(dateSeclect).getText();
		
	}
	public String getState() {
		System.out.println("              ban da chon state :                       "+ driverWeb.findElement(State).getText());
		return driverWeb.findElement(State).getText();
	
	}
	public String getCity() {
		System.out.println("              ban da chon City:                        "+ driverWeb.findElement(City).getText());
		return driverWeb.findElement(City).getText();
	}
}
