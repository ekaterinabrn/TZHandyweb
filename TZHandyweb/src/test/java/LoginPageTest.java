import PageObj.MainPage;
import org.junit.Rule;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertTrue;

public class LoginPageTest {
    private WebDriver driver;
    private MainPage mainPage;
    @Rule
    public DriverRule factory = new DriverRule();

    @Test
    public void emailFieldIsDisplayedTest() {
        WebDriver driver = factory.getDriver();
        mainPage = new MainPage(driver);
        mainPage.open();
        assertTrue(mainPage.emailFieldIsDisplayed());
    }

    @Test
    public void passwordFieldIsDisplayedTest() {
        WebDriver driver = factory.getDriver();
        mainPage = new MainPage(driver);
        mainPage.open();
        assertTrue(mainPage.passwordFieldIsDisplayed());
    }
}
