package pages.pagesObject.scooterYandex;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.w3c.dom.ls.LSException;
import pages.base.BasePage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static constants.Constant.projectForYandexScooter.QUESTIONS_ABOUT_IMPORTANT_THINGS;


public class Home extends BasePage {
    public Home(WebDriver driver) {
        super(driver);
    }


    private final By update = By.xpath("//img[@alt='Scooter']"); //обновить
    private final By topButtonOrder = By.xpath("//button[@class='Button_Button__ra12g']"); //заказать сверху
    private final By bottomButtonOrder = By.xpath("//button[@class='Button_Button__ra12g Button_UltraBig__UU3Lp']"); //заказать снизу
    private final By requests = By.xpath("//div[@data-accordion-component='AccordionItemButton']"); //вопросы о жаном (все)
    private final By response = By.xpath("//div[@data-accordion-component='AccordionItemButton']/parent::div/parent::div/div[2]"); //ответы на вопросы (все), через возврат к родитеям

    private final By cookie = By.xpath("//button[@class='App_CookieButton__3cvqF']");

    //логика проверки выпадающего текста в вопроосах о важном
    public Home checkHowMuchDoesItCost() {
        List<WebElement> elementsRequests = driver.findElements(requests);
        List<WebElement> elementsResponses = driver.findElements(response);

        for (int i = 0; i < elementsRequests.size(); i++) {
            WebElement elementRequestKeyMap = elementsRequests.get(i);
            waitElementIsVisible(elementRequestKeyMap);
            moveAroundThePage(elementRequestKeyMap);
            String textRequest = elementRequestKeyMap.getText();

            if (QUESTIONS_ABOUT_IMPORTANT_THINGS.containsKey(textRequest)) {
                System.out.println("Текст вопроса соответствует");
                elementRequestKeyMap.click();

                WebElement elementResponseValueMap = elementsResponses.get(i);
                waitElementIsVisible(elementResponseValueMap);


                Assertions.assertEquals(QUESTIONS_ABOUT_IMPORTANT_THINGS.get(textRequest), elementsResponses.get(i).getText()); //сравнение valuemap и текста элемента
                System.out.println("Текст ответа соответствует");
            } else {
                System.out.println("Вопрос отсутствует, проверьте верность данных в Constant");
            }
        }
        return this;
    }

    //переход на страницу ордер для регистрации
    public Home clickOrderTop (){
        WebElement element = driver.findElement(topButtonOrder);
        waitElementIsVisible(element);
        element.click();
        return this;
    }

    //переход на страницу ордер для регистрации внизу
    public Home clickOrderBottom (){
        WebElement element = driver.findElement(bottomButtonOrder);
        waitElementIsVisible(element);
        moveAroundThePage(element);
        element.click();
        return this;
    }

    public Home clickCookie (){
        WebElement element = driver.findElement(cookie);
        waitElementIsVisible(element);
        element.click();
        return this;
    }
}
