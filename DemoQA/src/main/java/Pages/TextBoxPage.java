package Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TextBoxPage extends Page  {
	By txtFullName= By.id("userName");
	By txtEmail = By.id("userEmail");
	By txtCurrentAddress = By.id("currentAddress");
	By txtPermanentAddress= By.id("permanentAddress");
	By outputName= By.id("name");
	public By outputEmail= By.id("email");
	By outputCurrentAddress= By.xpath("//p[@id='currentAddress']");
	By outputPermanentAddress= By.xpath("//p[@id='permanentAddress']");
	public TextBoxPage(WebDriver dr) {
		super(dr);
		this.driverWeb= dr;
	}
	public void inputFullName(String inputFullName) {
		driverWeb.findElement(txtFullName).sendKeys(inputFullName);
	}
	public void inputEmail(String inputEmail) {
		driverWeb.findElement(txtEmail).sendKeys(inputEmail);
	}
	public void inputCurrentAddress(String inputCurrentAddress) {
		driverWeb.findElement(txtCurrentAddress).sendKeys(inputCurrentAddress);
	}
	public void inputPermanentAddress(String inputPermanentAddress) {
		
		driverWeb.findElement(txtPermanentAddress).sendKeys(inputPermanentAddress);
		
	}
	public void submitData() {
		driverWeb.findElement(By.id("submit")).click();
	}
	public String outputName() {
		return cutString(driverWeb.findElement(outputName).getText());
	}
	public String outputEmail() {
		return cutString(driverWeb.findElement(outputEmail).getText());
	}
	public String outputCurrentAddress() {
		return cutString(driverWeb.findElement(outputCurrentAddress).getText());
	}
	public String outputPermanentAddress() {
		return cutString(driverWeb.findElement(outputPermanentAddress).getText());
	}
	
	
	public Boolean getBoderColor() {
		boolean result= false;
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		String valueBorder = driverWeb.findElement(txtEmail).getCssValue("border");
		valueBorder=valueBorder.replaceAll(", ", ".");
		String resultBorder[] = valueBorder.split(" ");
		String colorCode= resultBorder[2];
		 colorCode= colorCode.replace("."," ");
		System.out.println(colorCode);
		if (colorCode.equalsIgnoreCase("rgb(255 0 0)")) {
			result= true;
		} else result= false;
		return result;
	}
}
