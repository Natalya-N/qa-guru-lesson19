package config;

import com.codeborne.selenide.Configuration;
import org.aeonbits.owner.ConfigFactory;
import org.openqa.selenium.remote.DesiredCapabilities;

public class WebDriverConfig {

    /*private final ConfigData configData = ConfigFactory.create(ConfigData.class, System.getProperties());

    public void webConfig() {
        Configuration.baseUrl = configData.baseUrl();
        Configuration.browser = configData.browser().toString();
        Configuration.browserVersion = configData.browserVersion();
        Configuration.browserSize = configData.browserSize();
        if (configData.isRemote()) {
            Configuration.remote = configData.remoteUrl();
            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability("enableVNC", true);
            capabilities.setCapability("enableVideo", true);
            Configuration.browserCapabilities = capabilities;
        }
    }
*/

}
