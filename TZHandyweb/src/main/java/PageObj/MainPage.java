package PageObj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MainPage {
    private WebDriver driver;
    private WebDriverWait wait;
    //селектор поля емейл
    private final By emailField = By.name("email") ;
    //селектор поля пароль
    private final By passwordField = By.name("password");
  //селектор кнопки войти
    private final By singINButton = By.xpath("//*[@id=\"root\"]/div[1]/div/div[2]/div/div/form/button");
    private final By nextPage = By.className ("_header_vfxpx_2");
    public MainPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(3));
    }
    //метод открытия страницы
    public MainPage open() {
        driver.get(Url.BASE_URL);
        return this;}
    //доступность поля емейл
    public  boolean emailFieldIsDisplayed() {
        return driver.findElement(emailField).isDisplayed();
    }
    //доступность поля пароль
    public  boolean passwordFieldIsDisplayed() {
        return driver.findElement(passwordField).isDisplayed();
    }
    //заполнение поля емейл
    public MainPage setEmail(String email) {
        WebElement setEmailField = wait.until(ExpectedConditions.visibilityOfElementLocated(emailField));
        setEmailField.sendKeys(email);
        return this;
    }
    //заполнение поля пароль
    public MainPage setPassword(String password) {
        WebElement setPasswordField = wait.until(ExpectedConditions.visibilityOfElementLocated(passwordField));
        setPasswordField.sendKeys(password);
        return this;
    }
    //нажать кнопку войти
    public MainPage clickButton() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        this.driver.findElement(this.singINButton).click();
        return this;
    }
    //доступность поля пароль
    public  boolean nextPageDisplayed() {
        return driver.findElement(nextPage).isDisplayed();
    }

}
