package config;

import org.aeonbits.owner.Config;

import static org.aeonbits.owner.Config.Sources;

@Sources({"classpath:config/real_device.properties"})
public interface RealDeviceConfig extends Config {
    @Key("platform.name")
    String platformName();

    @Key("device.name")
    String deviceName();

    @Key("platform.version")
    String platformVersion();

    @Key("locale")
    String locale();

    @Key("language")
    String language();

    @Key("app.package")
    String appPackage();

    @Key("app.activity")
    String appActivity();
}
