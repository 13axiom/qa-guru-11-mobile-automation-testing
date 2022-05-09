package drivers;

public class MobileDriverSet {

    public static String getDeviceHost(String deviceHost) {
        if (deviceHost.equals("browserstack")) {
           return drivers.BrowserstackMobileDriver.class.getName();
        }
        if (deviceHost.equals("emulator")) {
            return drivers.EmulatorMobileDriver.class.getName();
        }
        throw new RuntimeException("Device wasn't selected");
    }
}



