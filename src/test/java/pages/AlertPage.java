package pages;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;

public class AlertPage {

    private AppiumDriver driver;

    public AlertPage(AppiumDriver driver) {
        this.driver = driver;
    }

    public WebElement getAlertTitle() {
        return driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().resourceId(\"android:id/alertTitle\")"));
    }

    public WebElement getAlertMessage() {
        return driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().resourceId(\"android:id/message\")"));
    }

    public WebElement getOkButton() {
        return driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().resourceId(\"android:id/button1\")"));
    }
}
