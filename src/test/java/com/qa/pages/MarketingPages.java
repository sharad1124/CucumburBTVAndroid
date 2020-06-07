package com.qa.pages;

import com.qa.utils.TestUtils;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

    public class MarketingPages extends BasePage{
        TestUtils  utils = new TestUtils();
        @AndroidFindBy(id = "com.earningvideo:id/record_button") private MobileElement startRecording;
        @AndroidFindBy(id = "com.earningvideo:id/close_camera") private MobileElement closeRecordingScreen;
        @AndroidFindBy(id = "com.earningvideo:id/captureVideo") private MobileElement startVideo;
        @AndroidFindBy(id = "com.earningvideo:id/stopVideo") private MobileElement stopVideo;
        @AndroidFindBy(id = "com.earningvideo:id/welcome_text_label") private MobileElement markettext;


        public String getWelcomeText() {
            return getAttribute(markettext,"text");
        }

        public boolean recordingButtonTap() {
            return startRecording.isDisplayed();
        }

        public com.qa.pages.MarketingPages recordingButton() {
            click(startRecording);
            return this;
        }

        public String getBUTTONTxt() {
            return getAttribute(startRecording,"text");
        }

        public com.qa.pages.MarketingPages closeRecordingButton() {
            click(closeRecordingScreen);
            return this;
        }

        public com.qa.pages.MarketingPages startVideoButton(){
            click(startVideo);
            return this;
        }


        public LoginPage stopVideoButton() {

            click(stopVideo);
            return new LoginPage();
        }

        public LoginPage marketingScreens() {
            recordingButton();
            startVideoButton();
            return stopVideoButton();
        }


    }

