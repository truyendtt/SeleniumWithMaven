package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;



public class Page {
	
			protected WebDriver driverWeb;
			public Page (WebDriver dr) {
				super();
				this.driverWeb = dr;
			}
		//select in dropdown box
			public void selectDropdownBox(By element, String textInput) {
				Select selectOption = new Select(driverWeb.findElement(element));
				selectOption.selectByVisibleText(textInput);
						
			}
}
