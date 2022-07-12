package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FormPage extends Page {
	By practiveFormMenu = By.xpath("//*[text()='Practice Form']");
	public FormPage(WebDriver dr) {
		super(dr);
		this.driverWeb= dr;
	}
	
	public AutomationPracticeFormPage clickOnFormItem() {
		driverWeb.findElement(practiveFormMenu).click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
		
			e.printStackTrace();
		}
		return new AutomationPracticeFormPage(driverWeb);
	}
}
