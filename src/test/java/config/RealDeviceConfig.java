package config;

import org.aeonbits.owner.Config;

@Config.Sources({"classpath:config/real_device.properties"})
public interface RealDeviceConfig extends Config {
    @Key("PlatformName")
    String platformName();

    @Key("DeviceName")
    String deviceName();

    @Key("PlatformVersion")
    String platformVersion();

    @Key("Locale")
    String locale();

    @Key("Language")
    String language();

    @Key("AppPackage")
    String appPackage();

    @Key("AppActivity")
    String appActivity();
}
