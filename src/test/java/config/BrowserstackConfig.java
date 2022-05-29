package config;

import org.aeonbits.owner.Config;

import static org.aeonbits.owner.Config.Sources;

@Sources({"classpath:config/browserstack.properties"})
public interface BrowserstackConfig extends Config {

    @Key("app")
    String app();

    @Key("device")
    String device();

    @Key("os.version")
    String osVersion();

    @Key("project")
    String project();

    @Key("build")
    String build();

    @Key("name")
    String name();

    @Key("browser.stack.url")
    String browserstackUrl();
}
