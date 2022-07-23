package common;



import java.sql.DriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBasic {
	public WebDriver driver;

	public void openWebsite(String url) {
		System.setProperty("webdriver.chrome.driver",
				"D:\\06_AutomationProject\\01Tools\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
	}

	public void closeBrowser() {
		driver.quit();// close toàn bộ cửa sổ
	}
	public void ScrollWindow(By element) {
		
//		JavascriptExecutor js= (JavascriptExecutor) driver;
		WebElement iframe= driver.findElement(element);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", iframe);

		
//		js.executeScript("arguments[0].scrollIntoView(true);", iframe);
	}
	public void setWidown () {
		Dimension dm= new Dimension(700,1000);
		driver.manage().window().setSize(dm);
	}

	public By getLocatorString(String locatorType, String locatorValue) {
		By result = null;

		return result;

	}
	
}
