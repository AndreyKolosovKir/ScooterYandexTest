package apiTest.api_test;

import apiTest.spec.Specification;
import org.junit.jupiter.api.Test;

import static constants.Constant.ResponseNumber.RESPONSE_NUMBER_200;
import static constants.Constant.URLs.URL_MMK;

public class VisaryApiTest {

    /** Api тесты будут для ММК, а не визари */
    String token;

    @Test
    public void getUserInfo (){
        Specification.installSpecification(Specification.requestSpecification(URL_MMK), Specification.responseNum(RESPONSE_NUMBER_200));

        //TODO продолжить писать когда будет рабоать сервер
    }

}
