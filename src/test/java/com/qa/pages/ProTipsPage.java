package com.qa.pages;

import com.qa.utils.TestUtils;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class ProTipsPage extends BasePage{
    TestUtils utils = new TestUtils();
    @AndroidFindBy(id = "com.earningvideo:id/rotate_pro_tip_text_view") private MobileElement rotate_pro_tip_text_view;
    @AndroidFindBy(id = "com.earningvideo:id/back_arrow_button") private MobileElement back_arrow_button;
    @AndroidFindBy(id = "com.earningvideo:id/toolbar_title") private MobileElement toolbar_title;
    @AndroidFindBy(id = "com.earningvideo:id/lighting_text_view") private MobileElement lighting_text_view;
    @AndroidFindBy(id = "com.earningvideo:id/professional_text_view") private MobileElement professional_text_view;



    public boolean getProTipText() {
        utils.log().info("Pro Tip button is enabled----->" + rotate_pro_tip_text_view.isDisplayed());
        return rotate_pro_tip_text_view.isDisplayed();
    }

    public boolean getProTipHeadingText() {
        utils.log().info("Pro Tip button is enabled----->" + toolbar_title.isDisplayed());
        return toolbar_title.isDisplayed();
    }

    public ProTipsPage protip() {
        utils.log().info("Pro Tip Button Clicked");
        click(rotate_pro_tip_text_view);
        return this;
    }

    public ProTipsPage backButton() {
        utils.log().info("Pro Tip back button clicked");
        click(back_arrow_button);
        return this;
    }
    public String getTextRotateScreen() {
        return getText(rotate_pro_tip_text_view,"Rotate screen text -->>");
    }

    public String getPROTipTitle() {
        return getText(toolbar_title, "Pro Tip page title is - ");
    }

    public String getTextLighting() {
        return getText(lighting_text_view,"Pro Tip page Lighting text is - ");
    }

    public String getTextProfessional() {
        return getText(professional_text_view,"Pro Tip page Professional text");
    }
}
