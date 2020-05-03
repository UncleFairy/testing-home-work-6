package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends Page{

    @FindBy(css = "table td.mouseOut a[href^='mercuryregister.php']")
    private WebElement registerButton;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public WebElement getRegisterButton() {
        return registerButton;
    }

    public void setRegisterButton(WebElement registerButton) {
        this.registerButton = registerButton;
    }
}

