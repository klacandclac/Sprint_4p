package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrderStepOne extends OrderPage {

    public OrderStepOne(WebDriver driver) {
        super(driver);
    }

    public void inputCustomerName(String name) {
        driver.findElement(OrderPage.firstNameCustomer).sendKeys(name);
    }

    public void inputCustomerLastName(String lastName) {
        driver.findElement(lastNameCustomer).sendKeys(lastName);
    }

    public void inputCustomerAdress(String adress) {
        driver.findElement(adressCustomer).sendKeys(adress);
    }

    public void selectCustomerMetroStation(String metroStation) {
        // Локатор поля "Станция метро"
        By metroStationCustomer = By.xpath("//input[@placeholder ='* Станция метро']");
        By station = By.xpath("//div[@class='select-search__select']//*[text()='" + metroStation + "']");
        driver.findElement(metroStationCustomer).click();
        driver.findElement(station).click();
    }

    public void inputCustomerPhone(String phone) {
        driver.findElement(phoneCustomer).sendKeys(phone);
    }

    public void clickNextButton() {
        driver.findElement(nextButton).click();
    }


}