package com.qa.utils;

import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.io.File;
import java.io.IOException;
import java.util.Properties;

public class CapabilitiesManager {
    TestUtils utils = new TestUtils();
    public DesiredCapabilities getCaps() throws IOException {
        GlobalParams params = new GlobalParams();
        Properties props = new PropertyManager().getProps();
try{
    utils.log().info("getting capabilities");
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability(MobileCapabilityType.PLATFORM_NAME,params.getPlatformName());
        caps.setCapability(MobileCapabilityType.UDID,params.getUDID());
        caps.setCapability(MobileCapabilityType.DEVICE_NAME,params.getDeviceName());
        switch (System.getProperty("platformname","Android")){
            case "Android":
            caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, props.getProperty("androidAutomationName"));
                caps.setCapability("appPackage",props.getProperty("androidAppPackage"));
                caps.setCapability("appActivity", props.getProperty("androidAppActivity"));
                caps.setCapability("unicodeKeyboard", props.getProperty("androidunicodeKeyboard"));
                caps.setCapability("resetKeyboard", props.getProperty("androidresetKeyboard"));
                caps.setCapability(AndroidMobileCapabilityType.AUTO_GRANT_PERMISSIONS, "true");
                caps.setCapability("systemPort", params.getSystemPort());
           String androidAppUrl = System.getProperty("user.dir") + File.separator + "src" + File.separator + "test" + File.separator +
                   "resources" + File.separator + "app" + File.separator + "btv.apk";
                utils.log().info("appUrl is" + androidAppUrl);
                caps.setCapability("app", androidAppUrl);
                break;
            case "iOS":
                //desiredCapabilities.setCapability("systemPort", systemPort); Integer.parseInt(systemPort)
                //desiredCapabilities.setCapability("chromeDriverPort", chromeDriverPort)
                break;
        }
        return caps;
    } catch(Exception e){
        e.printStackTrace();
        utils.log().fatal("failed to load capabilities" + e.toString());
        throw e;

    }
}
}
