package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends Page {
	By formItem= By.xpath("//h5[text()='Forms']");
	
	public HomePage(WebDriver dr) {
		super(dr);
		this.driverWeb= dr;
	}
	public FormPage clickFormItem() {
		driverWeb.findElement(formItem).click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
		
			e.printStackTrace();
		}
		return new FormPage(driverWeb);
	}
}
