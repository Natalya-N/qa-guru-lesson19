package config;

import org.aeonbits.owner.Config;

//@WebConfig.Sources({
//        "classpath:local.properties",
//        "classpath:remote.properties"
//})
public interface WebConfig extends Config {

    @Key("baseUrl")
    @DefaultValue("https://samokat.ru")
    String getBaseUrl();

    @Key("browser")
    @DefaultValue("CHROME")
    String getBrowser();

    @Key("remoteUrl")
    String getRemoteURL();

    @Key("browserSize")
    @DefaultValue("1920x1080")
    String getBrowserSize();

    @Key("browserVersion")
    @DefaultValue("100")
    String getBrowserVersion();

    @Key("remote")
    @DefaultValue("false")
    boolean isRemote();

}
