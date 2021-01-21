package dodatkowezadania;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.junit.*;
import java.util.Random;

public class mystore {
    private WebDriver driver;
    // Methods random and variable for random
    Random random = new Random();
    int randomInteger = random.nextInt(50);
    // Create an array for products
    String[] products = {"mug", "t-shirt", "notebook", "stickers"};

    @Before
    public void setUp() {
        // Open the Chrome browser
        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/drivers/chromedriver.exe");
        driver = new ChromeDriver();

        // Maximize browser
        driver.manage().window().maximize();

        // Go to website
        driver.get("https://prod-kurs.coderslab.pl/index.php");
    }
    @Test
    public void myStoreTest() {
        // Search element
        WebElement searchElement = driver.findElement(By.name("s"));
        // Clear element
        searchElement.clear();
        //Write name of the product to looking for
        searchElement.sendKeys(products[randomInteger % products.length]);
        //Submit
        searchElement.submit();
    }
}
