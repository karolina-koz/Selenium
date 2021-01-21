package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddressPage {
    private WebDriver driver;

    @FindBy(xpath = "//a[@data-link-action='add-address']")
    WebElement addAddress;

    public AddressPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public void clickAddAddressButton() {
        addAddress.click();
    }
}
