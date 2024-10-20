import PageObj.MainPage;
import io.qameta.allure.Description;
import io.qameta.allure.junit4.DisplayName;
import org.junit.Rule;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertTrue;

public class LoginWithDataTest {
    private WebDriver driver;
    private MainPage mainPage;
    @Rule
    public DriverRule factory = new DriverRule();

    @DisplayName("Getting a next page after authorized user")
    @Description("Getting a next page  with valid user data ")
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
