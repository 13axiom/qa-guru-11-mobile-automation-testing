package drivers;

import com.codeborne.selenide.WebDriverProvider;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

import static config.Project.authConfig;
import static config.Project.browserstackConfig;

public class BrowserstackMobileDriver implements WebDriverProvider {

    public static URL getBrowserstackUrl() {
        try {
            return new URL(browserstackConfig.browserstackUrl());
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }


    @Override
    public WebDriver createDriver(Capabilities caps) {

        MutableCapabilities mutableCapabilities = new MutableCapabilities();
        mutableCapabilities.merge(caps);

        // Set your access credentials
        System.getProperty("properties", "browserstack");

        mutableCapabilities.setCapability("browserstack.user", authConfig.browserstackUser());
        mutableCapabilities.setCapability("browserstack.key", authConfig.browserstackKey());

        // Set URL of the application under test
        mutableCapabilities.setCapability("app", browserstackConfig.app());

        // Specify device and os_version for testing
        mutableCapabilities.setCapability("device", browserstackConfig.device());
        mutableCapabilities.setCapability("os.version", browserstackConfig.osVersion());

        // Set other BrowserStack capabilities
        mutableCapabilities.setCapability("project", browserstackConfig.project());
        mutableCapabilities.setCapability("build", browserstackConfig.build());
        mutableCapabilities.setCapability("name", browserstackConfig.name());


        return new RemoteWebDriver(getBrowserstackUrl(), mutableCapabilities);
    }
}
