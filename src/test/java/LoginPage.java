import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	
	private WebDriver driver;
	
	@FindBy(id = "email")
	private WebElement txtEmail;

	@FindBy(id = "passwd")
	private WebElement txtPassword;
	
	@FindBy(css = "#SubmitLogin > span")
	private WebElement btnLogin;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void login(String email, String password) {
		/*Se inicia sesion en la aplicacion*/
	    txtEmail.sendKeys(email);
	    txtPassword.sendKeys(password);
	    btnLogin.click();
	}
}
