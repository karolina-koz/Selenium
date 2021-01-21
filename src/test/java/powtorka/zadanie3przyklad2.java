package powtorka;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.junit.*;
import java.util.List;

public class zadanie3przyklad2 {


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
        if(firstName.isEnabled() && firstName.isEnabled()) {
            firstName.clear();
            firstName.sendKeys("Karol");
        }else 	{
            Assert.fail();
        }
        System.out.println(driver.findElement(By.xpath("//label[@for='first-name']")).getText());


    }
}
