package BBD;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageobject.AccountPage;
import pageobject.LoginPage;
import pageobject.MyStoreMainPage;

public class loginTest {
    private WebDriver driver;
    private MyStoreMainPage myStoreMainPage;
    private LoginPage loginpage;
    private AccountPage accountpage;

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
    }
    @Test
    public void testLoginWithProperCredentials() {
        myStoreMainPage.goToAthenticationPage();
        loginpage.loginAs("johnd@email.com", "qwerty");
        Assert.assertEquals("John Doe", accountpage.getLoggedUserName());
    }
}
