package pages;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

    private AppiumDriver driver;

    // Elementos da página de login
    private WebElement btnLogin;
    private WebElement inputEmail;
    private WebElement inputPassword;
    private WebElement btnLogin2;

    public LoginPage(AppiumDriver driver) {
        this.driver = driver;
    }

    // Localizadores
    private WebElement getBtnLogin() {
        return driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Login']"));
    }

    private WebElement getInputEmail() {
        return driver.findElement(AppiumBy.accessibilityId("input-email"));
    }

    private WebElement getInputPassword() {
        return driver.findElement(AppiumBy.accessibilityId("input-password"));
    }

    private WebElement getBtnLogin2() {
        return driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.view.ViewGroup\").instance(16)"));
    }

    // Ações na página
    public void clickLoginButton() {
        getBtnLogin().click();
    }

    public void fillCredentials(String email, String password) {
        getInputEmail().sendKeys(email);
        getInputPassword().sendKeys(password);
    }

    public void submitLogin() {
        getBtnLogin2().click();
    }
}
