package pages;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebElement;

public class FormPage {

    private AppiumDriver driver;

    private WebElement inputField;
    private WebElement typedField;
    private WebElement switchBtn;
    private WebElement dropdown;
    private WebElement activeBtn;
    private WebElement inactiveBtn;


    public FormPage(AppiumDriver driver) {
        this.driver = driver;
    }

    // Localizadores
    private WebElement getFormButon() {
        return driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"Forms\")"));
    }

    private WebElement getInputField() {
        return driver.findElement(AppiumBy.accessibilityId("text-input"));
    }

    public WebElement getField() {
        return driver.findElement(AppiumBy.accessibilityId("input-text-result"));
    }

    private WebElement getSwitchBtn() {
        return driver.findElement(AppiumBy.accessibilityId("switch"));
    }

    private WebElement getDropdown() {
        return driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().resourceId(\"text_input\")"));
    }

    private WebElement getDropdownOption() {
        return driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"Appium is awesome\")"));
    }

    private WebElement getActiveBtn() {
        return driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"Active\")"));
    }

    private WebElement getInactiveBtn() {
        return driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"Inactive\")"));
    }

    // Ações na página

    public void goToFormPage() {
        getFormButon().click();
    }
    public void typeToInputField() {
        getInputField().sendKeys("Teste");
    }

    public void clickOnSwitch() {
        getSwitchBtn().click();
        getSwitchBtn().click();

    }

    public void selectAnItem() {
        getDropdown().click();
        getDropdownOption().click();

    }

    public void clickOnActiveBtn() {
        getActiveBtn().click();
    }


}

