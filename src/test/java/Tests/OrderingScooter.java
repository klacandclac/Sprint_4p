package Tests;

import PageObject.MainPage;
import PageObject.OrderStepOne;
import PageObject.OrderStepTwo;
import com.tngtech.java.junit.dataprovider.DataProvider;
import com.tngtech.java.junit.dataprovider.DataProviderRunner;
import com.tngtech.java.junit.dataprovider.UseDataProvider;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertTrue;

@RunWith(DataProviderRunner.class)
public class OrderingScooter extends Tests.BaseUITest {
    MainPage mainPage = new MainPage(driver);


    @DataProvider
    public static Object[][] getCredentials() {
        return new Object[][]{
                {"Гендальф", "Серый", "г.Ривендел, Эльфова 5, кв 300", "Сокольники", "+75005550001", "12.09.2021", "трое суток", "Маг не опаздывает", true},
                {"Джон", "Сноу", "г.Винтерфел, Старкова 1, кв 002", "Лубянка", "+76003330002", "04.10.2022", "двое суток", "зима близко", true},
                {"Андор", "Кассеан", "г.Корусант, Сенаторская 7, кв 512", "Университет", "+77000030003", "23.11.2022", "семеро суток", "да прибудет с вами сила", true},
        };
    }

    @Test
    @UseDataProvider("getCredentials")
    public void checkRentOneOrder(String name, String lastname, String adress, String metroaStation, String phone, String duration, String orderDuration, String comment, boolean result){

        mainPage.open();
        mainPage.makeOrderOne();
        OrderStepOne orderStepOne = new OrderStepOne(driver);
        orderStepOne.inputCustomerName(name);
        orderStepOne.inputCustomerLastName(lastname);
        orderStepOne.inputCustomerAdress(adress);
        orderStepOne.selectCustomerMetroStation(metroaStation);
        orderStepOne.inputCustomerPhone(phone);
        orderStepOne.clickNextButton();

        OrderStepTwo orderStepTwo = new OrderStepTwo(driver);
        orderStepTwo.inputDateOrder(duration);
        orderStepTwo.inputOrderDuration(orderDuration);
        orderStepTwo.inputColorOrederGrey();
        orderStepTwo.inputComment(comment);
        orderStepTwo.clickOrderButton();
        orderStepTwo.clickConfirmOrder();
        assertTrue(orderStepTwo.OrderConfirm().contains("Заказ оформлен"));
    }


    @Test
    @UseDataProvider("getCredentials")
    public void checkRentTwoOrder(String name, String lastname, String adress, String metroaStation, String phone, String duration, String orderDuration, String comment, boolean result) {
        mainPage.open();
        mainPage.makeOrderTwo();
        OrderStepOne orderStepOne = new OrderStepOne(driver);
        orderStepOne.inputCustomerName(name);
        orderStepOne.inputCustomerLastName(lastname);
        orderStepOne.inputCustomerAdress(adress);
        orderStepOne.selectCustomerMetroStation(metroaStation);
        orderStepOne.inputCustomerPhone(phone);
        orderStepOne.clickNextButton();

        OrderStepTwo orderStepTwo = new OrderStepTwo(driver);
        orderStepTwo.inputDateOrder(duration);
        orderStepTwo.inputOrderDuration(orderDuration);
        orderStepTwo.inputColorOrederBlack();
        orderStepTwo.inputComment(comment);
        orderStepTwo.clickOrderButton();
        orderStepTwo.clickConfirmOrder();
        assertTrue(orderStepTwo.OrderConfirm().contains("Заказ оформлен"));
    }
}