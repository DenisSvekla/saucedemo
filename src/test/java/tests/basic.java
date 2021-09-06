package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.ProductsPage;
import pages.loginPage;

public abstract class basic {
    public static final String USER = "standard_user";
    public static final String PASSWORD = "secret_sauce";
    WebDriver driver;
    loginPage loginPage;
    ProductsPage ProductPage;

    @BeforeMethod
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        loginPage = new loginPage(driver);
        ProductPage = new ProductsPage(driver);


    }

    @AfterMethod
    public void close() {
        driver.quit();
    }
}
