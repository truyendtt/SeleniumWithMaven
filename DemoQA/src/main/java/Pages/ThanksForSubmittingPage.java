package Pages;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ThanksForSubmittingPage extends Page{
	By txtStudent= By.xpath("//tbody//tr[1]//td[2]");
	By txtStudentMail = By.xpath("//tbody//tr[2]//td[2]");
	By txtGender= By.xpath("//tbody//tr[3]//td[2]");
	By txtMobile= By.xpath("//tbody//tr[4]//td[2]");
	By txtDateOfBirth = By.xpath("//tbody//tr[5]//td[2]");
	By txtPictureName = By.xpath("//tbody//tr[8]//td[2]");
	By txtStateOfCity = By.xpath("//tbody//tr[10]//td[2]");
	
	WebElement table = driverWeb.findElement(By.xpath("//*[@class='table table-dark table-striped table-bordered table-hover']"));
	public ThanksForSubmittingPage(WebDriver dr) {
		super(dr);
		this.driverWeb = dr;
	}
	public String GetNameFromForm() {
		
		WebElement name= table.findElement(txtStudent);
		String StudentName= name.getText();
		return StudentName;
	}
	public String GetMailFromForm() {
		
		WebElement mail= table.findElement(txtStudentMail);
		String StudentMail= mail.getText();
		return StudentMail;
	}
	public String GetGenderFromForm() {
		
		WebElement gender= table.findElement(txtGender);
		String StudentGender= gender.getText();
		return StudentGender;
	}
	public String GetMobileFromForm() {
		
		WebElement Mobile= table.findElement(txtMobile);
		String StudentMobile= Mobile.getText();
		return StudentMobile;
	}
	public String GetBirthDayFromForm() {
		String BirthDay= table.findElement(txtDateOfBirth).getText();
		return BirthDay;
	}
	
	public String GetPictureName() {
		String PictureName= table.findElement(txtPictureName).getText();	
		return PictureName;
	}
	public String GetStateOfCityFromForm() {
		String StateOfCity= table.findElement(txtStateOfCity).getText();
		return StateOfCity;
	}
}
