package BBD;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class QloappsSteps {
    private WebDriver driver;

    @Given("user is on the main page")
    public void openQloAppsPage() {
        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://qloapps.coderslab.pl/pl/");
    }

    @And("user goes to the authentication page")
    public void openAuthenticationPage() {
        driver.findElement(By.className("hide_xs")).click();
    }
    @When("user completes email box with (.*)")
    public void completeNewAccountWithEmail(String email) {
        driver.findElement(By.id("email_create")).sendKeys(email);
    }
    @And("user click on create an account button")
    public void clickOnCreateAccountButton() {
        driver.findElement(By.id("SubmitCreate")).click();
    }
    @When("user completes first name (.*), last name (.*), password (.*)")
    public void completePersonalInfo(String firstName, String lastName, String password) {
        // poczekaj az strona sie zaladuje
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.id("customer_firstname")).sendKeys(firstName);
        driver.findElement(By.id("customer_lastname")).sendKeys(lastName);
        driver.findElement(By.id("passwd")).sendKeys(password);
    }
    @And("user clicks on register button")
        public void clickOnRegisterButton() {
            driver.findElement(By.id("submitAccount")).click();
        }
        @Then("success message is displayed")
    public void messageIsDisplayed() {
            WebElement alert = driver.findElement(By.cssSelector(".alert.alert-success"));
            Assert.assertTrue(alert.isDisplayed());
            Assert.assertTrue(alert.getText().equals("Your account has been created."));
    }
    }

