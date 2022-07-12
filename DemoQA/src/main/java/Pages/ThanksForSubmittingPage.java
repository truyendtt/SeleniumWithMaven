package Pages;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ThanksForSubmittingPage extends Page{
	WebElement table = driverWeb.findElement(By.xpath("//*[@class='table table-dark table-striped table-bordered table-hover']"));
	public ThanksForSubmittingPage(WebDriver dr) {
		super(dr);
		this.driverWeb = dr;
	}
	public String GetNameFromForm() {
		
		WebElement name= table.findElement(By.xpath("//tbody//tr[1]//td[2]"));
		String StudentName= name.getText();
		System.out.println(StudentName);
		return StudentName;
	}
	public String GetMailFromForm() {
		
		WebElement mail= table.findElement(By.xpath("//tbody//tr[2]//td[2]"));
		String StudentMail= mail.getText();
		System.out.println(StudentMail);
		return StudentMail;
	}
	public String GetGenderFromForm() {
		
		WebElement gender= table.findElement(By.xpath("//tbody//tr[3]//td[2]"));
		String StudentGender= gender.getText();
		System.out.println(StudentGender);
		return StudentGender;
	}
	public String GetMobileFromForm() {
		
		WebElement Mobile= table.findElement(By.xpath("//tbody//tr[4]//td[2]"));
		String StudentMobile= Mobile.getText();
		System.out.println(StudentMobile);
		return StudentMobile;
	}
	public String GetBrithDayFromForm() {
		
		WebElement BD= table.findElement(By.xpath("//tbody//tr[5]//td[2]"));
		String DatOfBrith= BD.getText();
		System.out.println(DatOfBrith);
		return DatOfBrith;
	}
	
	public String GetFileFromForm() {
		WebElement File= table.findElement(By.xpath("//tbody//tr[8]//td[2]"));
		String NameFile= File.getText();
		System.out.println(NameFile);
		return NameFile;
	}
	public String GetStateOfCityFromForm() {
		WebElement StateOfCity= table.findElement(By.xpath("//tbody//tr[10]//td[2]"));
	
		System.out.println(StateOfCity.getText());
		return StateOfCity.getText();
	}
}
