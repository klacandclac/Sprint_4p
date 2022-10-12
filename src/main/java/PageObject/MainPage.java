package PageObject;

import org.openqa.selenium.WebDriver;

import static PageObject.MainPageLocators.firstOrderButton;
import static PageObject.MainPageLocators.secondOrderButton;

public class MainPage extends BasePage {

    public FAQPanel open(){
        driver.get("https://qa-scooter.praktikum-services.ru/");
        return null;
    }

    public MainPage(WebDriver driver) {
        super(driver);
    }

    public void makeOrderOne(){
        driver.findElement(firstOrderButton).click();
    }

    public void makeOrderTwo(){
        driver.findElement(secondOrderButton).click();
    }




}