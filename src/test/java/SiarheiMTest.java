import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SiarheiMTest {

    //    TC_1_1  - Тест кейс:
    //    //1. Открыть страницу https://openweathermap.org/
    //    //2. Набрать в строке поиска город Paris
    //    //3. Нажать пункт меню Search
    //    //4. Из выпадающего списка выбрать Paris, FR
    //    //5. Подтвердить, что заголовок изменился на "Paris, FR"


    @Test
    public void testH2Text_WhenSearchingCityCountry() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Applications/chromedriver");
        WebDriver driver = new ChromeDriver();

        String url = "https://openweathermap.org/";
        String cityName = "Paris";
        String expectedResult = "Paris, FR";

        driver.get(url);
        Thread.sleep(5000);
        WebElement searchCityField = driver.findElement(
                By.xpath("//div[@id = 'weather-widget']//input[@placeholder = 'Search city']")
        );

        searchCityField.click();
        searchCityField.sendKeys(cityName);
        Thread.sleep(5000);

        WebElement searchButton = driver.findElement(
                By.xpath("//div[@id = 'weather-widget']//button[@type = 'submit']")
        );
        searchButton.click();
        Thread.sleep(1000);

        WebElement parisFRChoiceInDropdownMenu = driver.findElement(
                By.xpath("//ul[@class = 'search-dropdown-menu']/li/span[text() = 'Paris, FR ']")
        );
        parisFRChoiceInDropdownMenu.click();

        WebElement h2CityCountryHeader = driver.findElement(
                By.xpath("//div[@id = 'weather-widget']//h2")
        );
        Thread.sleep(2000);
        String actualResult = h2CityCountryHeader.getText();

        Assert.assertEquals(actualResult, expectedResult);

        driver.quit();
    }

    //    TC_11_1  - Тест кейс:
    // 1.  Открыть базовую ссылку
    //2.  Нажать на пункт меню Guide
    //3.  Подтвердить, что вы перешли на страницу со ссылкой
    // https://openweathermap.org/guide и что title этой страницы
    // OpenWeatherMap API guide - OpenWeatherMap

//    @Test
//    public void testH2Text_WhenSearchingGuide() throws InterruptedException {
//
//        System.setProperty("webdriver.chrome.driver", "/Applications/chromedriver");
//        WebDriver driver = new ChromeDriver();
//
//        String url = "https://openweathermap.org/";
//        String menuGuide = "Guide";
//        String expectedResult = "https://openweathermap.org/guide";
//
//        driver.get(url);
//        Thread.sleep(5000);
//        WebElement searchMenuGuide = driver.findElement(
//                By.xpath('')
//        )

    //    }
    @Test
    public void testH2Text_WhenSearchingCityCountry1() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Applications/chromedriver");
        WebDriver driver = new ChromeDriver();
    }
}
