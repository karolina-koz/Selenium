package powtorka;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.junit.*;
import java.util.Random;

public class dodatkowe {
    // Stworzenie zmiennej przeglądarki
    private WebDriver driver;
    // Stworzenie tablicy products
    String[] products = {"notebook", "t-shirt","mug", "stickers"};
    // Stworzenie metody i zmiennej random
    Random random = new Random();
    int randomInteger = random.nextInt(50);

    @Before
    public void startBrowser() {
        // Otwórz przegladarke
        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        // Zmaksymalizowanie przegladarki
        driver.manage().window().maximize();
        // Wejscie na strone www
        driver.get("https://prod-kurs.coderslab.pl");
    }
    @Test
    public void testBing () {
        // Znajdz okno wyszukiwania
        WebElement element = driver.findElement(By.name("s"));
        // Wyczyśc pole
        element.clear();
        // Wpisz korzystajac z tablicy losowy element z products
        element.sendKeys(products [randomInteger % products.length]);
        // Wyślij do przgladarki
        element.submit();
    }
    //@After
    //public void tearDown() throws Exception {
    //    driver.quit();
    //}
}
