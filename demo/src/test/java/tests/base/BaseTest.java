package tests.base;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.TestInstance;

import pages.pagesObject.scooterYandex.Home;
import pages.pagesObject.scooterYandex.Order;

import tests.common.CommonActions;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;

import static common.Config.CLEAR_COOKIES_AND_STORAGE;
import static common.Config.HOLD_BROUSER_OPEN;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class BaseTest {

    protected WebDriver driver = CommonActions.cteateDriver();

    protected BasePage basePage = new BasePage(driver);
    protected Home home = new Home(driver);
    protected Order oreder = new Order(driver);

    @AfterEach
    public void clearCookiesAndLocalStorage() {
        if (CLEAR_COOKIES_AND_STORAGE) {
            JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
            driver.manage().deleteAllCookies();
            javascriptExecutor.executeScript("window.sessionStorage.clear()");

        }
    }

    @AfterAll //будет обязательно выполняться в конце
    public void close() {
        if (HOLD_BROUSER_OPEN) {
            driver.quit();
        }
    }
}
