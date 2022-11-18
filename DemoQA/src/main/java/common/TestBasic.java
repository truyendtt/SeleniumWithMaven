package common;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBasic {
	public WebDriver driver;
	public  static final String FILE_CONFIG="\\config\\ProjectConfiguration.properties";
	public void openWebsite(String browser) {
		if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", readConfigValueByKey("gecko_driver"));
			driver = new FirefoxDriver();
			System.out.println("ffdriver    " + driver);
		} else if(browser.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver", readConfigValueByKey("chrome_dirver"));
				driver = new ChromeDriver();
				System.out.println("cdriver    " + driver);
		}

		driver.get(readConfigValueByKey("url"));
		driver.manage().window().maximize();
	}
	public String readConfigValueByKey(String key) {
		String resultValue = "";

		Properties properties = new Properties();
		InputStream inputStream = null;
		String currentDir = System.getProperty("user.dir");
		System.out.println("curentdir:   " + currentDir);
		try {
			inputStream = new FileInputStream(currentDir + FILE_CONFIG);
			properties.load(inputStream);
			System.out.println("fileConfig:   " + currentDir + FILE_CONFIG);
			resultValue = properties.getProperty(key);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return resultValue;
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
	public ArrayList<String> getColumnValuesList(By columnLocator){
		   ArrayList<String> columnValuesList = new ArrayList();
		   
		   List<WebElement> columnElements =  driver.findElements(columnLocator);
		   
		   for (WebElement e : columnElements){//for each => chỉ áp dụng cho danh sách
		    String columnValue = e.getText();
		    columnValuesList.add(columnValue);
		   }
		   return columnValuesList;
		    
	}

}
