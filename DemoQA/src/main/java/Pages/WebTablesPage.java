package Pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WebTablesPage extends Page{
	By searchBox= By.id("searchBox");
	public WebTablesPage(WebDriver dr) {
		super(dr);
		this.driverWeb= dr;
	}
	public void searchCustomer(String firstName) {
		driverWeb.findElement(searchBox).sendKeys(firstName);
	}

	//firtName
	  public ArrayList<String> getFirstNameList(){
	   ArrayList<String> firstNames = new ArrayList();
	   
	   List<WebElement> firstNameElements =  driverWeb.findElements(By.xpath("//*[@role='row']/div[1]"));
	   
	   for (WebElement e : firstNameElements){//for each => chỉ áp dụng cho danh sách
	    String firstName = e.getText();
	    firstNames.add(firstName);
	   }
	   return firstNames;
	    
	  }
	  public boolean compareSearchTextInList(ArrayList<String> columnValuesList, String searchText){
		   boolean result = false;
		   int count = 0;
		   for (String columnValue : columnValuesList){
			   if (columnValue.contains(searchText)){
				   count = count + 1;
			   }
		   }
		   if (count == columnValuesList.size()){
		    result =true;
		   }
		   return result;
		  }
}
