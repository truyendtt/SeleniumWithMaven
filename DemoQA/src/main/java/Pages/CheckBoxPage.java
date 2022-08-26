package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckBoxPage extends Page {

	By textResult= By.id("result");
	public By labeHome = By.xpath("//label[@for='tree-node-home']");
	By iconArrow= By.xpath("//button[@aria-label='Toggle']");
	By checkBox_Checked= By.id("tree-node-home");
	public CheckBoxPage(WebDriver dr) {
		super(dr);
		this.driverWeb= dr;
	}
	public boolean clickCheckBoxSuccessfully() {
		driverWeb.findElement(labeHome).click();
		driverWeb.findElement(iconArrow).click();
		 boolean result = driverWeb.findElement(checkBox_Checked).isSelected();
		 return result;
		}
	public String resultClickCheckbox() {
		String a= driverWeb.findElement(textResult).getText();
		String textResult = a.replaceAll("\n", " ");
		return textResult;
	}
}
