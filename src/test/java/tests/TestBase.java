package tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import config.ConfigData;
import config.WebDriverConfig;
import helpers.Attach;
import io.qameta.allure.selenide.AllureSelenide;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.Map;

import static com.codeborne.selenide.Selenide.closeWebDriver;

public class TestBase {

    static ConfigData config = ConfigFactory.create(ConfigData.class, System.getProperties());

    /*@BeforeAll
    static void setUpBrowserConfiguration() {

        Configuration.baseUrl = config.getBaseUrl().toString();
        Configuration.browserSize = config.getBrowserSize();
        Configuration.browser = config.getBrowser();
        Configuration.browserVersion = config.getBrowserVersion();

        Configuration.pageLoadStrategy = "eager";
        Configuration.timeout = 10000;

        //if (config.getIsRemote()) {
            Configuration.remote = config.getRemoteURL();
            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability("selenoid:options", Map.<String, Object>of(
                    "enableVNC", true,
                    "enableVideo", true
            ));
            Configuration.browserCapabilities = capabilities;

        //}
    }*/


    //static ConfigData config = ConfigFactory.create(ConfigData.class, System.getProperties());

    @BeforeAll
    static void beforeAll() {

        Configuration.baseUrl = config.getBaseUrl().toString();
        Configuration.browserSize = config.getBrowserSize();
        //Configuration.browserSize = System.getProperty("browserSize", "1920x1080");
        Configuration.browser = config.getBrowser();
        //Configuration.browser = System.getProperty("browser", "chrome");
        //Configuration.browserVersion = System.getProperty("browserVersion", "128");
        Configuration.browserVersion = config.getBrowserVersion();
        Configuration.remote = "https://user1:1234@" + "selenoid.autotests.cloud/" + "wd/hub";
        Configuration.pageLoadStrategy = "eager";
        Configuration.timeout = 10000;

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("selenoid:options", Map.<String, Object>of(
                "enableVNC", true,
                "enableVideo", true
        ));
        Configuration.browserCapabilities = capabilities;
    }

    @BeforeEach
    void beforeEach() {
        SelenideLogger.addListener("allure", new AllureSelenide());
    }


    @AfterEach
    void addAttachment() {
        Attach.screenshotAs("Last screenshot");
        Attach.pageSource();
        Attach.browserConsoleLogs();
        Attach.addVideo();
        closeWebDriver();
    }
}




