package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ButtonsPage extends Page {
	By btnDoubleClick= By.id("doubleClickBtn");
	By btnRightClick= By.id("rightClickBtn");
	By btnClick= By.id("SfKY1");
	public ButtonsPage(WebDriver dr) {
		super(dr);
		this.driverWeb= dr;
	}
	public void clickButtons() {
		Actions act= new Actions(driverWeb);
		WebElement element = driverWeb.findElement(btnDoubleClick);
		act.doubleClick(element).perform();
		WebElement element1 = driverWeb.findElement(btnRightClick);
		act.contextClick(element1).perform();
	}
}
