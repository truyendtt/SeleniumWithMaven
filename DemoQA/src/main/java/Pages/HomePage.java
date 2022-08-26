package Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends Page {
	By formItem= By.xpath("//h5[text()='Forms']");
	By elementItem= By.xpath("//h5[text()='Elements']");
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
	public ElementPage clickElementItem() {
		driverWeb.findElement(elementItem).click();
		driverWeb.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		return new ElementPage(driverWeb);
	}
}
