package config;

import org.aeonbits.owner.Config;

@org.aeonbits.owner.Config.Sources({"classpath:config/emulator.properties"})
public interface EmulatorConfig extends Config {
    @org.aeonbits.owner.Config.Key("PlatformName")
    String platformName();

    @org.aeonbits.owner.Config.Key("DeviceName")
    String deviceName();

    @org.aeonbits.owner.Config.Key("PlatformVersion")
    String platformVersion();

    @org.aeonbits.owner.Config.Key("Locale")
    String locale();

    @org.aeonbits.owner.Config.Key("Language")
    String language();

    @org.aeonbits.owner.Config.Key("AppPackage")
    String appPackage();

    @org.aeonbits.owner.Config.Key("AppActivity")
    String appActivity();
}
