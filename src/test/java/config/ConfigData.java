package config;

import org.aeonbits.owner.Config;

import java.net.URL;

/*@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
        "system:properties",
        "classpath:${env}.properties"
})*/

@ConfigData.Sources({
        "classpath:remote.properties",
        "classpath:local.properties",

})
public interface ConfigData extends Config {

    @Key("baseUrl")
    @DefaultValue("https://samokat.ru")
    URL getBaseUrl();

    @Key("browser")
    @DefaultValue("chrome")
    String getBrowser();

    @Key("remoteUrl")
    String getRemoteURL();

    @Key("browserSize")
    @DefaultValue("1920x1080")
    String getBrowserSize();

    @Key("browserVersion")
    @DefaultValue("128")
    String getBrowserVersion();

    @Key("isRemote")
    Boolean getIsRemote();

}
