package tests;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.AlertPage;
import pages.FormPage;
import pages.HomePage;
import pages.LoginPage;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class FormTest {

    private static AppiumDriverLocalService server;
    private AppiumDriver driver;
    private FormPage formPage;
    private LoginPage loginPage;
    private HomePage homePage;
    private AlertPage alertPage;

    @BeforeAll
    public static void setUpServer() {
        server = new AppiumServiceBuilder()
                .withIPAddress("127.0.0.1")
                .usingPort(4723)
                .build();
        server.start();
    }

    @AfterAll
    public static void tearDownServer() {
        if (server != null) server.stop();
        server = null;
    }

    @BeforeEach
    public void setUpDriver() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("appium:platformName", "Android");
        capabilities.setCapability("appium:automationName", "UiAutomator2");
        capabilities.setCapability("appium:deviceName", "emulator-5554");
        capabilities.setCapability("appium:appPackage", "com.wdiodemoapp");
        capabilities.setCapability("appium:appActivity", "com.wdiodemoapp.MainActivity");

        URL url = new URL("http://127.0.0.1:4723/");
        driver = new AppiumDriver(url, capabilities);

        // Inicializando as páginas
        formPage = new FormPage(driver);
        loginPage = new LoginPage(driver);
        homePage = new HomePage(driver);
        alertPage = new AlertPage(driver);
    }

    @AfterEach
    public void tearDownDriver() {
        if (driver != null) driver.quit();
        driver = null;
    }

    @Test
    public void formTest() {
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.TextView[@text='Login']")));
        formPage.goToFormPage();
        formPage.typeToInputField();
        Assertions.assertEquals("Teste", formPage.getField().getText());

        formPage.clickOnSwitch();
        formPage.selectAnItem();

}

}
