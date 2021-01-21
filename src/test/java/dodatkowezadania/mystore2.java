package dodatkowezadania;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.junit.*;
import java.util.Random;

public class mystore2 {
    private WebDriver driver;
    // Methods random and variable for random
    Random random = new Random();
    int randomInteger = random.nextInt(100);
    //Create an array's
    String[] firstName = {"John", "Luna", "Michael", "Lisa"};
    String[] lastName = {"Doe", "Smith", "Shepard", "Merigold"};
    String email = firstName + Integer.toString(randomInteger) + "@mail.com";
    String[] password = {"Pas123", "pas123,", "Pas456", "pas456"};
    String[] birthDate = {"12/12/2012", "07/04/1960", "05/10/2000", "13/01/1990"};

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
    public void registrationTest() {
        // Find sign in on website
        WebElement signIn = driver.findElement(By.xpath("/html/body/main/header/nav/div/div/div[1]/div[2]/div[2]/div/a/span"));
        // Click Sign in
        signIn.click();
        // Find Create account
        WebElement createAccount = driver.findElement(By.xpath("/html/body/main/section/div/div/section/section/div/a"));
        // Click create account
        createAccount.click();

        // Find element social title
        WebElement socialTitle = driver.findElement(By.xpath("/html/body/main/section/div/div/section/section/section/form/section/div[1]/div[1]/label[1]/span/input"));
        socialTitle.click();

        // Find element First Name
        WebElement firtsName = driver.findElement(By.name("firstname"));
        firtsName.clear();
        firtsName.sendKeys(firstName[randomInteger % firstName.length]);

        //Find element Last Name
        WebElement lasName = driver.findElement(By.name("lastname"));
        lasName.clear();
        lasName.sendKeys(lastName[randomInteger % lastName.length]);

        // Find element Email
        WebElement mail = driver.findElement(By.name("email"));
        mail.clear();
        mail.sendKeys(email);

        //Find element password
        WebElement pass = driver.findElement(By.name("password"));
        pass.clear();
        pass.sendKeys(password[randomInteger % password.length]);

        //Find element Birthdate
        WebElement bdate = driver.findElement(By.name("birthday"));
        bdate.clear();
        bdate.sendKeys(birthDate[randomInteger % birthDate.length]);

        // Find button SAVE
        WebElement saveButton = driver.findElement(By.name("submitCreate"));
        saveButton.submit();
    }
}
