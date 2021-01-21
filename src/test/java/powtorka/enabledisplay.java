package powtorka;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.junit.*;

import java.util.List;

public class enabledisplay {

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
        System.out.println(firstName.isDisplayed());
        System.out.println(firstName.isEnabled());

        // Znajdź element last name
            WebElement lastName = driver.findElement(By.id("last-name"));
            if(lastName.isEnabled() && lastName.isDisplayed()) {
                lastName.clear();
                lastName.sendKeys("Kowalski");
            }else 	{
                Assert.fail();
            }
        System.out.println(lastName.isDisplayed());
        System.out.println(lastName.isEnabled());

        // Znajdź element gender
            List <WebElement> gender = driver.findElements(By.className("radio-inline"));
            // Wpisz informacje do wyszukania
            gender.get(0).click();

            // Znajdź element data urodzenia
            WebElement dob = driver.findElement(By.id("dob"));
            if(dob.isEnabled() && dob.isDisplayed()) {
                dob.clear();
                dob.sendKeys("05/22/2010");
            }else 	{
                Assert.fail();
            }
        System.out.println(dob.isDisplayed());
        System.out.println(dob.isEnabled());

        //Znajdź element address
            WebElement address = driver.findElement(By.id("address"));
            if(address.isEnabled() && address.isDisplayed()) {
                address.clear();
                address.sendKeys("Prosta 51");
            }else 	{
                Assert.fail();
            }
        System.out.println(address.isDisplayed());
        System.out.println(address.isEnabled());

        //Znajdź element email
            WebElement email = driver.findElement(By.id("email"));
            if(email.isEnabled() && email.isDisplayed()) {
                email.clear();
                email.sendKeys("karol.kowalski@mailinator.com");
            }else {
                Assert.fail();
            }
        System.out.println(email.isDisplayed());
        System.out.println(email.isEnabled());

        //Znajdź element hasło
            WebElement password = driver.findElement(By.id("password"));
            if(password.isEnabled() && password.isDisplayed()) {
                password.clear();
                password.sendKeys("Pass123");
            }else {
                Assert.fail();
            }
        System.out.println(password.isDisplayed());
        System.out.println(password.isEnabled());

        //Znajdź element company
            WebElement company = driver.findElement(By.id("company"));
            if(company.isEnabled() && company.isDisplayed()) {
                company.clear();
                company.sendKeys("Coders Lab");
            }else {
                Assert.fail();
            }
        System.out.println(company.isDisplayed());
        System.out.println(company.isEnabled());

        // Znajdź element comment
            WebElement comment = driver.findElement(By.id("comment"));
            if(comment.isEnabled() && comment.isDisplayed()) {
                comment.clear();
                comment.sendKeys("To mój pierwszy automat testowy");
            }else {
                Assert.fail();
            }
        System.out.println(comment.isDisplayed());
        System.out.println(comment.isEnabled());

        // Znajdż element submit
            WebElement submit = driver.findElement(By.id("submit"));
            if(submit.isEnabled() && submit.isDisplayed()) {
                email.submit();
            }else {
                Assert.fail();
            }
        System.out.println(submit.isDisplayed());
        System.out.println(submit.isEnabled());
        }
   /* @After
    public void tearDown() throws Exception {
        // Zamknij przeglądarkę
        driver.quit();
    } */
    }

