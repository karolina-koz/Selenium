package przyklad1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.junit.*;
import java.util.Random;

public class zadaniedodatkowe {
    private WebDriver driver;
    // Stworzenie zmiennej random
    Random random = new Random();
    int randomInteger = random.nextInt(50);
    // Stworzenie tablicy products
    String[] products = { "mug", "shirt", "stickers", "notebook"};


    @Before
    public void setUp() {
        // Uruchomienie przeglądarki Chrome
        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/drivers/chromedriver.exe");
        driver = new ChromeDriver();

        // Zmaksymalizowanie okna przeglądarki
        driver.manage().window().maximize();

        // Przejdź na strone
        driver.get("https://prod-kurs.coderslab.pl/index.php");
    }
    @Test
    public void testBingSearch() {
        // Znajdź element wprowadzania tekstu na podstawie jego nazwy
        WebElement element = driver.findElement(By.name("s"));
        // Wyczyść teskst zapisany w elemencie
        element.clear();

        // Wpisz informacje do wyszukania
        // By wylosowalo losowy element z tablicy dodajemy importa z random
        // mozna po tym uzyc komendy randomInteger
        element.sendKeys(products[randomInteger%products.length]);

        // Prześlij formularz
        element.submit();
    }
    @After
    public void tearDown() throws Exception {
        // Zamknij przeglądarkę
        driver.quit();
    }
}
