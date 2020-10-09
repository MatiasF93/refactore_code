import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class YourPersonalInformationPage {
	
	private WebDriver driver;

	@FindBy(id = "firstname")
	private WebElement txtName;

	@FindBy(id = "lastname")
	private WebElement txtLastName;

	@FindBy(id = "old_passwd")
	private WebElement txtOldPassword;

	@FindBy(id = "passwd")
	private WebElement txtNewPassword;

	@FindBy(id = "confirmation")
	private WebElement txtConfirmPassword;

	@FindBy(id = "newsletter")
	private WebElement btnNewsLetter;
	
	@FindBy(css = ".button-medium:nth-child(1) > span")
	private WebElement btnSave;
	
	@FindBy(css = "columns-container")
	private WebElement btn1;
	
	@FindBy(css = ".alert")
	private WebElement alert;
	
	public YourPersonalInformationPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void updatePersonalInfo(){
	    /*Se actualizan los datos personales del usuario*/
		txtName.clear();
		txtName.sendKeys("Matias");
		txtLastName.clear();
		txtLastName.sendKeys("Figueroa");
		txtOldPassword.sendKeys("admin123456");
		txtNewPassword.sendKeys("admin123456");
		txtConfirmPassword.sendKeys("admin123456");
		btnNewsLetter.click();

	    /*Se actualizan los datos personales del usuario*/
	    driver.findElement(By.cssSelector(".button-medium:nth-child(1) > span")).click();
	    driver.findElement(By.cssSelector(".columns-container")).click();
	}
	
	public boolean verifyResults() {
		return ("Your personal information has been successfully updated.".equals(alert.getText()));
	}
	
}
