package constants;

import java.util.HashMap;
import java.util.Map;

public class Constant {

    public static class TimeoutVariable {
        public static final int IMPLICIT_WAIT = 4;
        public static final int EXPLICIT_WAIT = 10;

    }

    public static class URLs {
        public static final String AUTH_HOME_PAGE = "https://id-visary-test.k8s.npc.ba/";
        public static final String URL_MMK = "https://isup-test.mmk.ru/";

        public static final String URL_SCOOTER = "https://qa-scooter.praktikum-services.ru/";
    }

    public static class PATHS_FOR_API {
        /**
         * Заполнить для API
         */
        public static final String TAKE_TOKEN = "oidc/connect/token";
    }

    public static class Credentials {
        public static final String USER_NAME = "admin";
        public static final String PASSWORD = "!QAZ2wsx";


        /**
         * Для ММК
         */
        public static final String USER_NAME_FOR_API = "admin";
        public static final String PASSWORD_FOR_API = "1qaz@WSX";
        /**
         * Заполнить для API
         */
        public static final String CLIENT_SECRET = "rdDOeNIAUimiDyLsWj.s.dAvRvt2OVezSvnuLAa_ZuqbkVYgXY3Nnfvs,Mu4:32iW-2CsVm,phVi6TSD5uv,NbDBv,pArs._.175";
        /**
         * Заполнить для API
         */
        public static final String CLIENT_ID = "visary-ui";
    }

    public static class NewWorkflow {
        public static final String WORKFLOW_TITLE = "Test";
        public static final String DATE_FOR_OBJECT = "01.11.2024";
    }

    public static class PathsAndFiles {
        public static final String DOWNLOAD_FILE_PATH = "C:\\Users\\andre\\Downloads";
        public static final String FILE_NAME = "DemoObject";
        public static final String NAME_REPORT_FOR_EXPORT = "Demo Report";
    }

    public static class ResponseNumber {
        public static final Integer RESPONSE_NUMBER_200 = 200;
        public static final Integer RESPONSE_NUMBER_201 = 201;
        public static final Integer RESPONSE_NUMBER_202 = 202;
        public static final Integer RESPONSE_NUMBER_400 = 400;
        public static final Integer RESPONSE_NUMBER_401 = 401;
        public static final Integer RESPONSE_NUMBER_403 = 403;
        public static final Integer RESPONSE_NUMBER_404 = 404;
        public static final Integer RESPONSE_NUMBER_500 = 500;
        public static final Integer RESPONSE_NUMBER_503 = 503;
    }

    public static class projectForYandexScooter {
        public static final Map<String, String> QUESTIONS_ABOUT_IMPORTANT_THINGS = new HashMap<>();
        static {
            QUESTIONS_ABOUT_IMPORTANT_THINGS.put("Сколько это стоит? И как оплатить?", "Сутки — 400 рублей. Оплата курьеру — наличными или картой.");
            QUESTIONS_ABOUT_IMPORTANT_THINGS.put("Хочу сразу несколько самокатов! Так можно?", "Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.");
            QUESTIONS_ABOUT_IMPORTANT_THINGS.put("Как рассчитывается время аренды?", "Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.");
            QUESTIONS_ABOUT_IMPORTANT_THINGS.put("Можно ли заказать самокат прямо на сегодня?", "Только начиная с завтрашнего дня. Но скоро станем расторопнее.");
            QUESTIONS_ABOUT_IMPORTANT_THINGS.put("Можно ли продлить заказ или вернуть самокат раньше?", "Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.");
            QUESTIONS_ABOUT_IMPORTANT_THINGS.put("Вы привозите зарядку вместе с самокатом?", "Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.");
            QUESTIONS_ABOUT_IMPORTANT_THINGS.put("Можно ли отменить заказ?", "Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.");
            QUESTIONS_ABOUT_IMPORTANT_THINGS.put("Я жизу за МКАДом, привезёте?", "Да, обязательно. Всем самокатов! И Москве, и Московской области.");

        }

        public static final String NAME = "Антонг";
        public static final String LASTNAME = "Беляев";
        public static final String ADDRESS = "Москва";
        public static final String PHONE = "89919998899";

        public static final String ORDER_REPORT = "Заказ офомрлен";
    }
}
