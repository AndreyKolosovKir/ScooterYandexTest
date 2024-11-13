package pages.pagesObject.scooterYandex;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.base.BasePage;

import java.util.List;

import static constants.Constant.projectForYandexScooter.*;

public class Order extends BasePage {
    public Order(WebDriver driver) {
        super(driver);
    }

    private final By returnHome = By.xpath("//img[@alt='Scooter']"); //вернуться на домешнюю
    private final By inputName = By.xpath("//input[@placeholder='* Имя' and @class='Input_Input__1iN_Z Input_Responsible__1jDKN']"); //ввести имя
    private final By inputLastName = By.xpath("//input[@placeholder='* Фамилия']"); //вести фамилию
    private final By inputAddress = By.xpath("//input[@placeholder='* Адрес: куда привезти заказ']"); //ввести адрес
    private final By inputMetroStation = By.xpath("//input[@placeholder='* Станция метро']"); //выбрать метро
    private final By inputPhoneNumber = By.xpath("//input[@placeholder='* Телефон: на него позвонит курьер']"); //ввести телефон
    private final By buttonFurther = By.xpath("//button[text()='Далее']"); //выполнить действие
    private final By topButtonOrder = By.xpath("//button[@class='Button_Button__ra12g']"); //кнопка заказа в шапке
    private final By buttonStatusOrder = By.xpath("//button[text()='Статус заказа']"); //кноопка статуса в шапке
    private final By calendar = By.xpath("//input[@placeholder='* Когда привезти самокат']"); //поле ввода календаря
    private final By today = By.xpath("//div[text()='" + returnToday() + "']"); //выбор текущего дня в календаре
    private final By rentalPeriod = By.xpath("//div[@class='Dropdown-root']"); //выбор периода аренды
    private final By rentalDays = By.xpath("//div[@class='Dropdown-option'][" + randomizerNumber(7) + "]"); //аренда на два дня
    private final By buttonCompleteRegistration = By.xpath("//button[text()='Заказать' and @class='Button_Button__ra12g Button_Middle__1CSJM'] "); //заказать, окончание регистрации
    private final By seyYesForConfirmation = By.xpath("//button[text()='Да']"); //подтвердить заказ
    private final By elementOrderConfirmed = By.xpath("//div[text()='Заказ оформлен']"); //текст окна подстверждающий заказ

    public Order fillingInName() {
        WebElement element = driver.findElement(inputName);
        waitElementIsVisible(element);
        element.click();
        element.sendKeys(NAME);
        Assertions.assertEquals(NAME, element.getAttribute("value"));
        return this;
    }

    public Order fillingInLastname() {
        WebElement element = driver.findElement(inputLastName);
        waitElementIsVisible(element);
        element.click();
        element.sendKeys(LASTNAME);
        Assertions.assertEquals(LASTNAME, element.getAttribute("value"));
        return this;
    }

    public Order fillingInAddress() {
        WebElement element = driver.findElement(inputAddress);
        waitElementIsVisible(element);
        element.click();
        element.sendKeys(ADDRESS);
        Assertions.assertEquals(ADDRESS, element.getAttribute("value"));
        return this;
    }

    public Order fillingInPhone() {
        WebElement element = driver.findElement(inputPhoneNumber);
        waitElementIsVisible(element);
        element.click();
        element.sendKeys(PHONE);
        Assertions.assertEquals(PHONE, element.getAttribute("value"));
        return this;
    }

    public Order selectMetro() {
        int maxValue = 250;
        WebElement element = driver.findElement(inputMetroStation);
        waitElementIsVisible(element);
        element.click();
        // Находим все элементы списка
        List<WebElement> listItems = driver.findElements(By.cssSelector(".select-search__row"));
        int x = randomizerNumber(maxValue);
        // Получаем случайный элемент
        WebElement randomElement =listItems.get(x);
        waitElementIsVisible(randomElement);
        // Используем Actions для прокрутки к элементу
        Actions actions = new Actions(driver);
        actions.moveToElement(randomElement).perform();
        randomElement.click();
        return this;
    }

    public Order clickFurther() {
        WebElement element = driver.findElement(buttonFurther);
        waitElementIsVisible(element);
        element.click();
        return this;
    }

    public Order fillingCalendar() {
        WebElement calendarElement = driver.findElement(calendar);
        waitElementIsVisible(calendarElement);
        calendarElement.click();
        WebElement day = driver.findElement(today);
        waitElementIsVisible(day);
        day.click();
        Assertions.assertEquals(returnToday(), Integer.parseInt((calendarElement.getAttribute("value")).substring(0,2)));
        return this;
    }

    public Order choiceRent() {
        WebElement rentalPeriodElement = driver.findElement(rentalPeriod);
        waitElementIsVisible(rentalPeriodElement);
        rentalPeriodElement.click();
        WebElement periodDay = driver.findElement(rentalDays);
        waitElementIsVisible(periodDay);
        periodDay.click();
        return this;
    }

    public Order clickButtonForCompleteRegistration() {
        WebElement completeRegistration = driver.findElement(buttonCompleteRegistration);
        waitElementIsVisible(completeRegistration);
        completeRegistration.click();
        return this;
    }

    public Order confirmation() {
        WebElement element = driver.findElement(seyYesForConfirmation);
        waitElementIsVisible(element);
        element.click();
        return this;
    }

    public Order checkingOrderConfirmation (){
        WebElement element =driver.findElement(elementOrderConfirmed);
        Assertions.assertEquals(ORDER_REPORT, element.getText()); //прооверяю дождусь ли этого элемента
        return this;
    }

    public Order baskHome (){
        WebElement element = driver.findElement(returnHome);
        waitElementIsVisible(element);
        element.click();
        return this;
    }
}
