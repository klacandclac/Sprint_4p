package PageObject;

import org.openqa.selenium.By;

public final class MainPageLocators {

    //Кнопка "Заказть" вверху страницы
    public static final By firstOrderButton = By.xpath("//button[text() = 'Заказать']");
    //Кнопка "Закать" внизу страницы
    public static final By secondOrderButton = By.xpath("//button[1][text() = 'Заказать']");

}