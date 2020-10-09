import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import utils.WebDriverSupliter;

import static org.junit.Assert.assertTrue;

public class UpdatePersonalInformation {
    private WebDriver driver;
    LoginPage loginPage;
    MyAccountPage accountPage;
    YourPersonalInformationPage infoPage;

    @BeforeEach
    public void setUp() {
        driver = WebDriverSupliter.getChromeDriver();
        driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
        loginPage = PageFactory.initElements(driver, LoginPage.class);
        accountPage = PageFactory.initElements(driver, MyAccountPage.class);
        infoPage = PageFactory.initElements(driver, YourPersonalInformationPage.class);
    }

    @AfterEach
    public void tearDown() {
        WebDriverSupliter.quitDriver();
    }

    @Test
    public void updatePersonalInfo() {
        loginPage.login("fernandocotrena@gmail.com", "admin123456");
        accountPage.accesMyPersonalInfo();
        infoPage.updatePersonalInfo();
        /*Se valida el mensaje del sistema luego de guardar los cambios*/
        assertTrue(infoPage.verifyResults());
    }
}
