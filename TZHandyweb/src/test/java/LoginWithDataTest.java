import PageObj.MainPage;
import org.junit.Rule;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertTrue;

public class LoginWithDataTest {
    private WebDriver driver;
    private MainPage mainPage;
    @Rule
    public DriverRule factory = new DriverRule();

    @Test
    public void emailFieldIsDisplayedTest() {
        WebDriver driver = factory.getDriver();
        mainPage = new MainPage(driver);
        mainPage.open();
        mainPage.setEmail("demo@example.com");
        mainPage.setPassword("123321");
        mainPage.clickButton();
        assertTrue(mainPage.nextPageDisplayed());


    }
}
