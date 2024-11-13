package tests.pagesObjectTest.scooterTestForYandex;

import org.junit.jupiter.api.Test;
import tests.base.BaseTest;

import static constants.Constant.URLs.URL_SCOOTER;

public class ChecRegistrationTest extends BaseTest {

    @Test
    public void checkRegistrationForTopReg() {
        basePage.open(URL_SCOOTER);
        home.clickCookie()
                .clickOrderTop();
        oreder.fillingInName()
                .fillingInLastname()
                .fillingInAddress()
                .fillingInPhone()
                .selectMetro()
                .clickFurther()
                .fillingCalendar()
                .choiceRent()
                .clickButtonForCompleteRegistration()
                .confirmation()
                .checkingOrderConfirmation();
    }

    @Test
    public void checkRegistrationForBottomReg() {
        basePage.open(URL_SCOOTER);
        home.clickCookie()
                .clickOrderBottom();
        oreder.fillingInName()
                .fillingInLastname()
                .fillingInAddress()
                .fillingInPhone()
                .selectMetro()
                .clickFurther()
                .fillingCalendar()
                .choiceRent()
                .clickButtonForCompleteRegistration()
                .confirmation()
                .checkingOrderConfirmation();
    }
}
