package zadaniazaliczeniowe;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.junit.*;

public class zadanie2 {

    private WebDriver driver;

    @Before
    public void setUp() {
        // Open the Chrome browser
        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/drivers/chromedriver.exe");
        driver = new ChromeDriver();

        // Maximize browser
        driver.manage().window().maximize();

        // Go to website
        driver.get("https://prod-kurs.coderslab.pl/");

        // Find sign in on website
        WebElement signIn = driver.findElement(By.xpath("/html/body/main/header/nav/div/div/div[1]/div[2]/div[2]/div/a/span"));
        // Click Sign in
        signIn.click();
        // Find and sign email
        WebElement email = driver.findElement(By.name("email"));
        email.clear();
        email.sendKeys("cilomad271@izzum.com");
        // Find and sign password
        WebElement password = driver.findElement(By.name("password"));
        password.clear();
        password.sendKeys("ciri1234");
        // Find and click Sign in
        WebElement signInbtn = driver.findElement(By.id("submit-login"));
        signInbtn.submit();
    }
    @Test
    public void buyClothes() {
        // Go to shop
        WebElement pickClothes = driver.findElement(By.xpath("/html/body/main/header/div[2]/div/div[1]/div[2]/div[1]/ul/li[1]/a"));
        pickClothes.click();
        // Pick Humminbird Printed Sweater
        WebElement printedSweater = driver.findElement(By.xpath("/html/body/main/section/div/div[2]/section/section/div[3]/div/div[1]/article[2]/div/div[1]/h2/a"));
        printedSweater.click();

    }
}
