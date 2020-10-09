import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage {
	
	private WebDriver driver;
	
	@FindBy(css = "li:nth-child(4) span:nth-child(2)")
	private WebElement btnMyInfo;
	
	public MyAccountPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void accesMyPersonalInfo() {
		btnMyInfo.click();
	}
}
