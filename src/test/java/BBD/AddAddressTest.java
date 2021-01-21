package BBD;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageobject.*;

public class AddAddressTest {

    private WebDriver driver;
private MyStoreMainPage myStoreMainPage;
private LoginPage loginpage;
private AccountPage accountpage;
private AddressPage addressPage;
private NewAddressPage newAddressPage;

String login = "johnd@mail.com";
String password = "qwerty";

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://prod-kurs.coderslab.pl/index.php");

        myStoreMainPage = new MyStoreMainPage(driver);
        loginpage = new LoginPage(driver);
        accountpage = new AccountPage(driver);
        addressPage = new AddressPage(driver);
        newAddressPage = new NewAddressPage(driver);
    }
    @Test
    public void addAddressTest() {
        myStoreMainPage.goToAthenticationPage();
        loginpage.loginAs(login, password);
        accountpage.goToAddresses();
        addressPage.clickAddAddressButton();
        newAddressPage.completeRequiredFields("abc street", "London", "12-312");
        newAddressPage.submit();
    }

    @After
    public void closeBrowser() {
        driver.quit();
    }
}
