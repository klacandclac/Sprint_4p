package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public  class OrderPage extends BasePage {
    protected OrderPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public FAQPanel open() {
        return null;
    }

    // Локатор поля "Имя"
    protected static final By firstNameCustomer = By.xpath("//input[@placeholder ='* Имя']");

    // Локатор поля "Фамилия"
    protected static final By lastNameCustomer = By.xpath("//input[@placeholder ='* Фамилия']");

    // Локатор поля "Адрес"
    protected static final By adressCustomer = By.xpath("//input[@placeholder ='* Адрес: куда привезти заказ']");

    // Локатор поля "Телефон"
    protected static final By phoneCustomer = By.xpath("//input[@placeholder ='* Телефон: на него позвонит курьер']");

    // Локатор кнопка далее
    protected static final By nextButton = By.xpath("//button[text()= 'Далее']");



    //    Локатор поля даты
    protected static final By dateOrder = By.xpath("//*[contains(@placeholder, '* Когда привезти самокат')]");

    //   Локатор предыдущего месяца
    protected static final By previosMonth = By.xpath("//div[contains(@class, 'react-datepicker')]//button[contains(text(), 'Previous Month')]");

    //   Локатор следующего месяца
    protected static final By nextMonth = By.xpath("//div[contains(@class, 'react-datepicker')]//button[contains(text(), 'Next Month')]");

    //   Локатор срока аренды
    protected static final By periodDuration = By.xpath("//*[@class='Dropdown-placeholder']");

    //Локатор выбора цвета (черный)
    protected static final By blackColor = By.id("black");

    //Локатор выбора цвета (серый)
    protected static final By greyColor = By.id("grey");

    //Локатор комментарий для курьера
    protected static final By commentOrder = By.xpath("//input[@placeholder ='Комментарий для курьера']");

    //Локатор кнопка "Заказть"
    protected static final By orderButton = By.xpath("//div[contains(@class, 'Order_Buttons')]//button[contains(text(), 'Заказать')]");

    //Локатор кнопка "Да"
    protected static final By confirmButton = By.xpath("//div[contains(@class, 'Order_Buttons')]//button[contains(text(),'Да')]");

    //Локатор подтвержденного заказа
    protected static final By listOrder = By.xpath("//div[contains(@class, 'Order_ModalHeader')]");


}