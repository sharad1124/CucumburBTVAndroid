package com.qa.utils;

import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServerHasNotBeenStartedLocallyException;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.service.local.flags.GeneralServerFlag;

import java.io.File;
import java.util.HashMap;

public class ServerManager {
    private static ThreadLocal<AppiumDriverLocalService> server = new ThreadLocal<>();
    TestUtils utils = new TestUtils();

    public AppiumDriverLocalService getServer(){

        return server.get();
    }

    public void startServer(){
        utils.log().info("STARTING APPIUM SEVER");
        AppiumDriverLocalService server = getAppiumService();
        server.start();

        if(server == null || !server.isRunning()){
            throw new AppiumServerHasNotBeenStartedLocallyException("Appium sever not started. ABORT!!!");

        }
        server.clearOutPutStreams();
        this.server.set(server);
        utils.log().info("APPIUM SEVER STARTED");
    }

    public AppiumDriverLocalService getAppiumServerDefault(){

        return AppiumDriverLocalService.buildDefaultService();
}


    public AppiumDriverLocalService getAppiumService() {

        GlobalParams params = new GlobalParams();
        HashMap<String, String> environment = new HashMap<String, String>();
        environment.put("PATH", "/Library/Java/JavaVirtualMachines/jdk-11.0.1.jdk/Contents/Home/bin:/Users/sharadgupta/Library/Android/sdk/tools:/Users/sharadgupta/Library/Android/sdk/platform-tools:/usr/local/bin:/usr/bin:/bin:/usr/sbin:/sbin" + System.getenv("PATH"));
        environment.put("ANDROID_HOME", "/Users/sharadgupta/Library/Android/sdk");
        environment.put("JAVA_HOME", "/Library/Java/JavaVirtualMachines/jdk-11.0.1.jdk/Contents/Home");
        return AppiumDriverLocalService.buildService(new AppiumServiceBuilder()
                .usingDriverExecutable(new File("/usr/local/bin/node"))
                .withAppiumJS(new File("/usr/local/lib/node_modules/appium/build/lib/main.js"))
                .usingAnyFreePort()
                .withArgument(GeneralServerFlag.SESSION_OVERRIDE)
                .withEnvironment(environment)
                .withLogFile(new File(params.getPlatformName() + "_"
                        + params.getDeviceName() + File.separator + "Server.log")));
    }
}
