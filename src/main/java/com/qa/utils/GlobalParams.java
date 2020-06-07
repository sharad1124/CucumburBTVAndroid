package com.qa.utils;

public class GlobalParams {

    protected static ThreadLocal <String> platformName = new ThreadLocal <String>();
    protected static ThreadLocal <String> udid = new ThreadLocal <String>();
    protected static ThreadLocal <String> deviceName = new ThreadLocal <String>();
    protected static ThreadLocal <String> systemPort = new ThreadLocal <String>();



    public String getDeviceName() {
        return deviceName.get();
    }
    public void setDeviceName(String deviceName2) {
        deviceName.set(deviceName2);
    }
    public String getPlatformName() {
        return platformName.get();
    }
    public void setPlatformName(String platformName1) {
        platformName.set(platformName1);
    }
    public String getSystemPort() {
        return systemPort.get();
    }
    public void setSystemPort(String udid1) {
        systemPort.set(udid1);
    }
    public String getUDID() {
        return udid.get();
    }
    public void setUDID(String systemPort1) {
        udid.set(systemPort1);
    }

    public void initializeGlobalParams() throws IllegalAccessException {

        GlobalParams params = new GlobalParams();
        params.setPlatformName(System.getProperty("platformName","Android"));
        params.setUDID(System.getProperty("udid","emulator-5554"));
        params.setDeviceName(System.getProperty("deviceName","Pixel 2"));

        switch(params.getPlatformName()){
            case"Android":
                params.setSystemPort(System.getProperty("systemPort","10000"));
                break;
            case"iOS":
                break;
            default:
                throw new IllegalAccessException("Invalid Platoform name !");
        }


    }




}
