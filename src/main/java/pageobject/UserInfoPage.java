package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserInfoPage {
    private WebDriver driver;

    @FindBy(name = "password")
    WebElement passwordInput;

    @FindBy(name = "birthday")
    WebElement birthdayInput;

    @FindBy(name = "newsletter")
    WebElement newsletterCheckbox;

    @FindBy(css = "btn.btn-primary.form-control-submit")
    WebElement saveButton;

    @FindBy(id = "notifications")
    WebElement alert;


    public UserInfoPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public void setBirthday (String date) {
        birthdayInput.clear();
        birthdayInput.sendKeys(date);
    }
    public void signInForNewsletter() {
        if(!newsletterCheckbox.isSelected()) {
            newsletterCheckbox.click();
        }
    }
    public void submitChanges(String password) {
        passwordInput.sendKeys(password);
        saveButton.click();
    }
    public String getMessage() {
        return  alert.getText();
    }
}
