package drivers;

import com.codeborne.selenide.WebDriverProvider;
import config.BrowserstackConfig;
import io.appium.java_client.android.AndroidDriver;
import org.aeonbits.owner.ConfigFactory;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import javax.annotation.Nonnull;
import java.net.MalformedURLException;
import java.net.URL;

import static config.BrowserstackProject.authConfig;
import static config.BrowserstackProject.browserstackConfig;

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
        mutableCapabilities.setCapability("os_version", browserstackConfig.osVersion());

        // Set other BrowserStack capabilities
        mutableCapabilities.setCapability("project", browserstackConfig.project());
        mutableCapabilities.setCapability("build", browserstackConfig.build());
        mutableCapabilities.setCapability("name", browserstackConfig.name());


        return new RemoteWebDriver(getBrowserstackUrl(), mutableCapabilities);
    }
}
