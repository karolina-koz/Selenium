package zadaniazaliczeniowe;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.junit.*;

public class zadanie1 {

    private WebDriver driver;

    @Given("^Open browser with https://prod-kurs\\.coderslab\\.pl/$")
    public void openBrowserWithHttpsProdKursCoderslabPl() {
        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://prod-kurs.coderslab.pl/");
    }

    @And("^User goes to the authentication page in store$")
    public void userGoesToTheAuthenticationPageInStore() {
        driver.findElement(By.xpath("//div[2]/div[2]/div/a/span")).click();
    }

    @When("^User completes emailbox with cilomad(\\d+)@izzum\\.com, password with ciri(\\d+)$")
    public void userCompletesEmailboxWithCilomadIzzumComPasswordWithCiri(String emailbox, String password) {
        driver.findElement(By.name("email")).sendKeys(emailbox);
        driver.findElement(By.name("password")).sendKeys(password);
    }

    @And("^Click on sign in button$")
    public void clickOnSignInButton() {
        driver.findElement(By.id("submit-login")).click();
    }

    @When("^User is on his account page and click Addresses$")
    public void userIsOnHisAccountPageAndClickAddresses() {
        driver.findElement(By.xpath("//a[2]/span/i")).click();
    }

    @When("^User is on his addresses page, click on Create new address button$")
    public void userIsOnHisAddressesPageClickOnCreateNewAddressButton() {
        driver.findElement(By.xpath("//div[4]/a/span")).click();
    }

    @When("^User completes Alias None , Address Westminister, Zip SW(\\d+)A (\\d+)AA, City London, Phone (\\d+)$")
    public void userCompletesAliasNoneAddressWestministerZipSWAAACityLondonPhone(String Alias, String Address, String City, String Zip, String Phone) {
        driver.findElement(By.name("alias")).sendKeys(Alias);
        driver.findElement(By.name("address1")).sendKeys(Address);
        driver.findElement(By.name("city")).sendKeys(City);
        driver.findElement(By.name("postcode")).sendKeys(Zip);
        driver.findElement(By.name("phone")).sendKeys(Phone);
    }

    @And("^User clicks on the SAVE button$")
    public void userClicksOnTheSAVEButton() {
        driver.findElement(By.xpath("//footer/button")).click();
    }

    @Then("^User see communicate Address successfully added!$")
    public void userSeeCommunicateAddressSuccessfullyAdded() {
        WebElement message = driver.findElement(By.cssSelector(".alert.alert-success"));
        Assert.assertTrue(message.isDisplayed());
        Assert.assertTrue(message.getText().equals("Address successfully added!"));
    }

}

