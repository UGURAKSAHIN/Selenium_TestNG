package Test_NG;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.List;

public class LoginTest {
    public static WebDriver driver;
    public static WebDriverWait wait;

    @BeforeClass
    public static void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // Explicit Wait
    }

    @Test
    public void test_Login() {
        driver.get("https://www.saucedemo.com/");


        WebElement username = driver.findElement(By.id("user-name"));
        WebElement password = driver.findElement(By.id("password"));
        WebElement loginButton = driver.findElement(By.id("login-button"));

        username.sendKeys("standard_user");
        password.sendKeys("secret_sauce");
        loginButton.click();

        driver.get("https://www.saucedemo.com/Products");

        List<WebElement> addToCartButtons = driver.findElements(By.id("Checkout"));
        addToCartButtons.get(0).click();
        addToCartButtons.get(1).click();


        driver.findElement(By.id("checkout")).click();

        WebElement firstName = driver.findElement(By.id("first-name"));
        WebElement lastName = driver.findElement(By.id("last-name"));
        WebElement postalCode = driver.findElement(By.id("postal-code"));
        WebElement continueButton = driver.findElement(By.id("continue"));


        firstName.sendKeys("Uğur");
        lastName.sendKeys("Akşahin");
        postalCode.sendKeys("34104");
        continueButton.click();

        driver.findElement(By.id("finish")).click();
        }
        @AfterClass
        public static void tearDown() {
            if (driver != null) {
                driver.quit();
            }
        }
    }

