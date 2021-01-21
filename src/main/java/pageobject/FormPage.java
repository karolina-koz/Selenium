package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FormPage {
    private static WebDriver driver;

    @FindBy(id = "first-name")
    WebElement firstNameInput;

    @FindBy(id = "last-name")
    WebElement lastNameInput;

    @FindBy(className = "radio-inline")
    WebElement genderInput;

    @FindBy(id = "dob")
    WebElement dateOfBirthInput;

    @FindBy(id = "address")
    WebElement addressInput;

    @FindBy(id = "email")
    WebElement emailInput;

    @FindBy(id = "password")
    WebElement passwordInput;

    @FindBy(id = "company")
    WebElement companyInput;

    @FindBy(id = "comment")
    WebElement commentInput;

    @FindBy(id = "submit")
    WebElement submitButtonInput;

    public FormPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void fillUpFirstName(String firstName) {
        firstNameInput.sendKeys(firstName);
    }
    public void fillUpLastName(String lastName) {
        lastNameInput.sendKeys(lastName);
    }
    public void fillUpGender() {
       genderInput.click();
    }
    public void fillUpDOB(String dateOfBirth) {
       dateOfBirthInput.sendKeys(dateOfBirth);
    }
    public void fillUpAddress(String address) {
        addressInput.sendKeys(address);
    }
    public void fillUpEmail(String email) {
        emailInput.sendKeys(email);
    }
    public void fillUpPassword(String password) {
        passwordInput.sendKeys(password);
    }
    public void fillUpCompany(String company) {
        companyInput.sendKeys(company);
    }
    public void fillUpComment(String comment) {
        commentInput.sendKeys(comment);
    }
    public void fillUpSubmit() {
        submitButtonInput.click();
    }
}
