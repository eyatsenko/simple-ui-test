package pages;

import Driver.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage {

    public LoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    public static final String loginPageURL = "https://cp-inst266-client.phonexa.xyz/auth/login/";

    @FindBy(id = "loginform-email")
    private WebElement loginField;

    @FindBy(id = "loginform-password")
    private WebElement passwordField;

    public WebElement getLoginField(){
        return this.loginField;
    }

    public WebElement getPasswordField(){
        return this.passwordField;
    }

    public static LoginPage open() {
        Driver.getDriver().get(loginPageURL);
        return new LoginPage();
    }
}
