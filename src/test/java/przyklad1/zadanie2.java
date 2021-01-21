package przyklad1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.junit.*;

import java.util.List;

public class zadanie2 {
    private WebDriver driver;

    @Before
    public void setUp() {
        // Uruchomienie przeglądarki Chrome
        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/drivers/chromedriver.exe");
        driver = new ChromeDriver();

        // Zmaksymalizowanie okna przeglądarki
        driver.manage().window().maximize();

        // Przejdź na strone
        driver.get("https://katalon-test.s3.amazonaws.com/demo-aut/dist/html/form.html");
    }
    @Test
    public void testChrome() {
        // Znajdź element first name
        WebElement firstName = driver.findElement(By.id("first-name"));
        // Wyczyść teskst zapisany w elemencie
        firstName.clear();
        // Wpisz imie
        firstName.sendKeys("Karol");

        // Znajdź element last name
        WebElement lastName = driver.findElement(By.id("last-name"));
        // Wyczyść teskst zapisany w elemencie
        lastName.clear();
        // Wpisz nazwisko
        lastName.sendKeys("Kowalski");

        // Znajdź element gender
        List<WebElement> gender = driver.findElements(By.className("radio-inline"));
        // Wpisz informacje do wyszukania
        gender.get(0).click();

        // Znajdź element data urodzenia
        WebElement dob = driver.findElement(By.id("dob"));
        // Wyczyść teskst zapisany w elemencie
        dob.clear();
        // Wpisz datę urodzenia
        dob.sendKeys("05/22/2010");

        //Znajdź element address
        WebElement address = driver.findElement(By.id("address"));
        // Wyczyść teskst zapisany w elemencie
        address.clear();
        // Wpisz adres
        address.sendKeys("Prosta 51");

        //Znajdź element email
        WebElement email = driver.findElement(By.id("email"));
        // Wyczyść tekst zapisany w elemencie
        email.clear();
        // Wpisz email
        email.sendKeys("karol.kowalski@mailinator.com");

        //Znajdź element hasło
        WebElement password = driver.findElement(By.id("password"));
        // Wyczyść teskst zapisany w elemencie
        password.clear();
        // Wpisz hasło
        password.sendKeys("Pass123");

        //Znajdź element company
        WebElement company = driver.findElement(By.id("company"));
        // Wyczyść teskst zapisany w elemencie
        company.clear();
        // Wpisz firme
        company.sendKeys("Coders Lab");

        // Znajdź element comment
        WebElement comment = driver.findElement(By.id("comment"));
        // Wyczyść teskst zapisany w elemencie
        comment.clear();
        // Wpisz komentarz
        comment.sendKeys("To jest mój pierwszy automat testowy");

        // Znajdż element submit
        WebElement submit = driver.findElement(By.id("submit"));
        // Kliknij przycisk
        submit.click();
        //submit.submit();

    }
   /* @After
    public void tearDown() throws Exception {
        // Zamknij przeglądarkę
        driver.quit();
    } */
}
