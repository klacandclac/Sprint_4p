package Tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.html5.WebStorage;

import java.util.concurrent.TimeUnit;

public abstract class BaseUITest {
    public static WebDriver driver;

    @BeforeClass
    public static void setup() {
//        WebDriverManager.firefoxdriver().setup();
        WebDriverManager.chromedriver().setup();
//        webDriver = new FirefoxDriver();
        driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @After
    public void clearData(){
        driver.manage().deleteAllCookies();
        ((WebStorage) driver).getSessionStorage().clear();
        ((WebStorage) driver).getLocalStorage().clear();

    }

    @AfterClass
    public static void tearDown(){
        driver.quit();
    }
}