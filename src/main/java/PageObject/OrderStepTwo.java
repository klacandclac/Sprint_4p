package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class OrderStepTwo extends OrderPage {

    public OrderStepTwo(WebDriver driver) {
        super(driver);
    }

    public void inputDateOrder(String dateTime){
        driver.findElement(dateOrder).click();
        driver.findElement(dateOrder).sendKeys(dateTime);
        driver.findElement(dateOrder).sendKeys(Keys.ENTER);
    }

    public void inputOrderDuration(String Duration){
        driver.findElement(periodDuration).click();
        driver.findElement(By.xpath("//*[text()='"+Duration+"']")).click();
    }

    public void inputColorOrederBlack() {
        driver.findElement(blackColor).click();
    }

    public void inputColorOrederGrey() {
        driver.findElement(greyColor).click();
    }

    public void inputComment(String comment){
        driver.findElement(commentOrder).sendKeys(comment);
    }

    public void clickOrderButton(){
        driver.findElement(orderButton).click();
    }

    public void clickConfirmOrder(){
        driver.findElement(confirmButton).click();
    }

    public String OrderConfirm(){
        return driver.findElement(listOrder).getText();
    }
}