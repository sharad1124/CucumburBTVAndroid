package com.qa.utils;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class DriverManager {
    private static ThreadLocal<AppiumDriver> driver = new ThreadLocal<>();
    TestUtils utils = new TestUtils();

public AppiumDriver getDriver(){

    return driver.get();
}

public void setDriver(AppiumDriver driver2){

    driver.set(driver2);
}

public void initializeDriver() throws Exception {
    AppiumDriver driver = null;
    GlobalParams params = new GlobalParams();
    PropertyManager props = new PropertyManager();
    if(driver == null){
        try {
            utils.log().info("initializing Appium driver");
            switch (params.getPlatformName()) {
                case "Android":
                    //URL url = new URL("http://127.0.0.1:4723/wd/hub");
                    //driver = new AndroidDriver(url, new CapabilitiesManager().getCaps());
                    driver = new AndroidDriver(new ServerManager().getServer().getUrl(), new CapabilitiesManager().getCaps());
                    break;
                case "iOS":
                    break;
            }
            if(driver == null){
                throw new Exception("Driver is null, abort");

            }
            utils.log().info("driver is initialize");
            this.driver.set(driver);
        }
        catch (Exception e) {
            e.printStackTrace();
            utils.log().fatal("Driver init. failure abort !!!");
            throw e;
        }

    }
}

}
