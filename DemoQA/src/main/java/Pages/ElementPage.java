package Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ElementPage extends Page {
	By webTableFormMenu= By.xpath("//*[text()='Web Tables']");
	By buttonsFormMenu= By.xpath("//*[text()='Buttons']");
	By CheckBoxFormMenu= By.xpath("//*[text()='Check Box']");
	By TextBoxFormMenu= By.xpath("//*[text()='Text Box']");
	public ElementPage(WebDriver dr) {
		super(dr);
		this.driverWeb= dr;
	}
	public WebTablesPage clickWebTableItem() {
		driverWeb.findElement(webTableFormMenu).click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
		
			e.printStackTrace();
		}
		return new WebTablesPage (driverWeb);
		}
	public ButtonsPage clickButtonsItem() {
		driverWeb.findElement(buttonsFormMenu).click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
		
			e.printStackTrace();
		}
		return new ButtonsPage(driverWeb);
		}
	public CheckBoxPage clickCheckboxItemMenu() {
		driverWeb.findElement(CheckBoxFormMenu).click();
		driverWeb.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		return new CheckBoxPage(driverWeb);
	}
	public TextBoxPage clickTextBoxItemMenu() {
		driverWeb.findElement(TextBoxFormMenu).click();
		driverWeb.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		return new TextBoxPage(driverWeb);
	}
}
