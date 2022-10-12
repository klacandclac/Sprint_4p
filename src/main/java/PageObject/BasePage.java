package PageObject;

import org.openqa.selenium.WebDriver;

public abstract class BasePage {
    public final WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    public abstract FAQPanel open();
}