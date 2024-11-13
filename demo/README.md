### Пример для прокрутки окна до нужного элемента

WebElement element = driver.findElement(By.id("root"));
((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);



### Как получить куки
Для примера посмотрим куки в сервисе Mesto. Сначала нужно открыть главную страницу:

WebDriver driver = new ChromeDriver();
driver.get("https://qa-mesto.praktikum-services.ru/");
Со страницы можно получить все куки — например, чтобы посмотреть, какие вообще есть. Поможет метод getCookies():

Set<Cookie> cookies = driver.manage().getCookies();  

ИЛИ
Можно получить куки по её имени. Например, если надо проверить, что значение выставлено верно. Понадобится метод getCookieNamed():

String cookieName = "_yasc";
Cookie cookie = driver.manage().getCookieNamed(cookieName); 




### Удалить куки поможет метод deleteCookie():

driver.manage().deleteCookie(newCookie);   
Ещё удалить куки можно просто по его имени:

driver.manage().deleteCookieNamed("my_own_cookie");  
А можно вообще удалить всё сразу:

driver.manage().deleteAllCookies();

Добавить новую куку. Нужно создать объект и передать в него имя и значение, а потом вызвать метод addCookie(). Как аргументы передай имя и значение:

Cookie newCookie = new Cookie("my_own_cookie","my name");
driver.manage().addCookie(newCookie);   

### Шпаргалка  
https://praktikum.notion.site/281ab41d454246a2b62ad383f2631817