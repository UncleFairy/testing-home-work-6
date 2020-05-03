package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateAccountPage extends Page{

    @FindBy(css = "a b")
    private WebElement successfulText;

    public WebElement getSuccessfulText() {
        return successfulText;
    }

    public void setSuccessfulText(WebElement successfulText) {
        this.successfulText = successfulText;
    }

    public CreateAccountPage(WebDriver driver) {
        super(driver);
    }

}
