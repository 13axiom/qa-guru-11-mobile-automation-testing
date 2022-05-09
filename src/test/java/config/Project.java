package config;


import org.aeonbits.owner.ConfigFactory;

public class Project {
    public static BrowserstackConfig browserstackConfig = ConfigFactory.create(BrowserstackConfig.class, System.getProperties());
    public static AuthConfig authConfig = ConfigFactory.create(AuthConfig.class, System.getProperties());
    public  static EmulatorConfig emulatorConfig = ConfigFactory.create(EmulatorConfig.class, System.getProperties());
}
