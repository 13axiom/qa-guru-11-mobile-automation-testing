package tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import helpers.Attach;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.logevents.SelenideLogger.addListener;
import static helpers.Attach.getSessionId;
import static io.qameta.allure.Allure.step;

public class TestBase {

    private static String deviceHost = System.getProperty("deviceHost");
    @BeforeAll
    public static void setup() {
        addListener("AllureSelenide", new AllureSelenide());

            Configuration.browser = drivers.MobileDriverSet.getDeviceHost(deviceHost);
//        Configuration.startMaximized = false;
            Configuration.browserSize = null;

    }

    @BeforeEach
    public void startDriver() {
        open();
    }

    @AfterEach
    public void afterEach() {

        Attach.screenshotAs("Last screenshot");
        Attach.pageSource();

        step("Close driver", Selenide::closeWebDriver);

        if (deviceHost.equals("browserstack")) {
            String sessionId = getSessionId();
            Attach.video(sessionId);
        }
    }
}
