package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountPage {

    private WebDriver driver;

    @FindBy(className = "account")
    WebElement userName;

    @FindBy(id = "identity-link")
    WebElement infoButton;

    @FindBy(id = "addresses-link")
    WebElement addressButton;

    public AccountPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public String getLoggedUserName() {
        return userName.getText();
    }

    public void goToInformation() {
        infoButton.click();
    }

    public void goToAddresses() {
        addressButton.click();
    }
}
