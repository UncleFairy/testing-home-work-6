package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class RegisterPage extends Page {

    @FindBy(css = "input[name='firstName']")
    private WebElement firstNameInput;
    @FindBy(css = "input[name='lastName']")
    private WebElement lastNameInput;
    @FindBy(css = "input[name='phone']")
    private WebElement phoneInput;
    @FindBy(css = "input[name='userName']")
    private WebElement userNameInput;
    @FindBy(css = "input[name='address1']")
    private WebElement address1Input;
    @FindBy(css = "input[name='address2']")
    private WebElement address2Input;
    @FindBy(css = "input[name='city']")
    private WebElement cityInput;
    @FindBy(css = "input[name='state']")
    private WebElement stateInput;
    @FindBy(css = "input[name='postalCode']")
    private WebElement postalCodeInput;
    @FindBy(css = "input[name='email']")
    private WebElement emailInput;
    @FindBy(css = "input[name='password']")
    private WebElement passwordInput;
    @FindBy(css = "input[name='confirmPassword']")
    private WebElement confirmPasswordInput;
    @FindBy(css = "input[name='register']")
    private WebElement registerSubmit;


    public RegisterPage(WebDriver driver) {
        super(driver);
    }


    public WebElement getFirstNameInput() {
        return firstNameInput;
    }

    public void setFirstNameInput(WebElement firstNameInput) {
        this.firstNameInput = firstNameInput;
    }

    public WebElement getLastNameInput() {
        return lastNameInput;
    }

    public void setLastNameInput(WebElement lastNameInput) {
        this.lastNameInput = lastNameInput;
    }

    public WebElement getPhoneInput() {
        return phoneInput;
    }

    public void setPhoneInput(WebElement phoneInput) {
        this.phoneInput = phoneInput;
    }

    public WebElement getUserNameInput() {
        return userNameInput;
    }

    public void setUserNameInput(WebElement userNameInput) {
        this.userNameInput = userNameInput;
    }

    public WebElement getAddress1Input() {
        return address1Input;
    }

    public void setAddress1Input(WebElement address1Input) {
        this.address1Input = address1Input;
    }

    public WebElement getAddress2Input() {
        return address2Input;
    }

    public void setAddress2Input(WebElement address2Input) {
        this.address2Input = address2Input;
    }

    public WebElement getCityInput() {
        return cityInput;
    }

    public void setCityInput(WebElement cityInput) {
        this.cityInput = cityInput;
    }

    public WebElement getStateInput() {
        return stateInput;
    }

    public void setStateInput(WebElement stateInput) {
        this.stateInput = stateInput;
    }

    public WebElement getPostalCodeInput() {
        return postalCodeInput;
    }

    public void setPostalCodeInput(WebElement postalCodeInput) {
        this.postalCodeInput = postalCodeInput;
    }

    public WebElement getEmailInput() {
        return emailInput;
    }

    public void setEmailInput(WebElement emailInput) {
        this.emailInput = emailInput;
    }

    public WebElement getPasswordInput() {
        return passwordInput;
    }

    public void setPasswordInput(WebElement passwordInput) {
        this.passwordInput = passwordInput;
    }

    public WebElement getConfirmPasswordInput() {
        return confirmPasswordInput;
    }

    public void setConfirmPasswordInput(WebElement confirmPasswordInput) {
        this.confirmPasswordInput = confirmPasswordInput;
    }

    public WebElement getRegisterSubmit() {
        return registerSubmit;
    }

    public void setRegisterSubmit(WebElement registerSubmit) {
        this.registerSubmit = registerSubmit;
    }
}
