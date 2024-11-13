package tests.pagesObjectTest.scooterTestForYandex;

import org.junit.jupiter.api.Test;
import tests.base.BaseTest;

import static constants.Constant.URLs.URL_SCOOTER;

public class QuestionsAboutImportantThingsTest extends BaseTest {

    @Test
    public void checkTextForQuestions (){
        basePage.open(URL_SCOOTER);
        home.clickCookie().checkHowMuchDoesItCost();
    }
}
