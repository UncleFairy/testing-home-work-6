package tests;

import main.BaseClass;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.CreateAccountPage;
import pages.HomePage;
import pages.RegisterPage;

import java.io.IOException;
import java.util.HashMap;

public class RegistrationTest extends BaseClass {
    @BeforeTest
    public void setUp() throws IOException {
        initializeDriver();
    }

    @AfterTest
    public void tearDown() {
        driver.close();
    }


    @DataProvider(name = "data-provider")
    public Object[][] dataProviderMethod() {
        {
            HashMap<String, String> firstRegisterData = new HashMap<String, String>();
            firstRegisterData.put("firstName", "Dmitri");
            firstRegisterData.put("lastName", "Pislari");
            firstRegisterData.put("phone", "079418241");
            firstRegisterData.put("email", "dmitri@gmail.com");
            firstRegisterData.put("address1", "str. Stefan");
            firstRegisterData.put("address2", "1/1");
            firstRegisterData.put("city", "Chisinau");
            firstRegisterData.put("state", "Chisinau");
            firstRegisterData.put("postalCode", "606");
            firstRegisterData.put("userName", "DmitriPislari");
            firstRegisterData.put("password", "123321");
            firstRegisterData.put("confirmPassword", "123321");

            HashMap<String, String> secondRegisterData = new HashMap<String, String>();
            secondRegisterData.put("firstName", "Iaroslav");
            secondRegisterData.put("lastName", "Rudenco");
            secondRegisterData.put("phone", "0794654432");
            secondRegisterData.put("email", "iarick@gmail.com");
            secondRegisterData.put("address1", "str. Alba Iulia");
            secondRegisterData.put("address2", "2/1");
            secondRegisterData.put("city", "Chisinau");
            secondRegisterData.put("state", "Chisinau");
            secondRegisterData.put("postalCode", "607");
            secondRegisterData.put("userName", "YaroslavRudenco");
            secondRegisterData.put("password", "563452325");
            secondRegisterData.put("confirmPassword", "563452325");
            return new Object[][]{{firstRegisterData}, {secondRegisterData}};
        }
    }

    @Test(dataProvider = "data-provider")
    public void verifyRegistration(HashMap<String, String> testData) {
        driver.navigate().to(properties.getProperty("url"));

        HomePage homePage = new HomePage(driver);
        homePage.getRegisterButton().click();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.getFirstNameInput().sendKeys(testData.get("firstName"));
        registerPage.getLastNameInput().sendKeys(testData.get("lastName"));
        registerPage.getPhoneInput().sendKeys(testData.get("phone"));
        registerPage.getEmailInput().sendKeys(testData.get("email"));
        registerPage.getAddress1Input().sendKeys(testData.get("address1"));
        registerPage.getAddress2Input().sendKeys(testData.get("address2"));
        registerPage.getCityInput().sendKeys(testData.get("city"));
        registerPage.getStateInput().sendKeys(testData.get("state"));
        registerPage.getPostalCodeInput().sendKeys(testData.get("postalCode"));
        registerPage.getUserNameInput().sendKeys(testData.get("userName"));
        registerPage.getPasswordInput().sendKeys(testData.get("password"));
        registerPage.getConfirmPasswordInput().sendKeys(testData.get("confirmPassword"));

        registerPage.getRegisterSubmit().click();

        CreateAccountPage createAccountPage = new CreateAccountPage(driver);
        String actualText = createAccountPage.getSuccessfulText().getText();
        String expectedText = "Note: Your user name is " + testData.get("email")+ ".";

        Assert.assertEquals(actualText, expectedText);
    }
}
