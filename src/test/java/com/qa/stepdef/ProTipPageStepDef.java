package com.qa.stepdef;

import com.qa.pages.MarketingPages;
import com.qa.pages.ProTipsPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class ProTipPageStepDef {
    @Given("^I'm on Pro tip screen$")
    public void iMOnProTipScreen() {
        new MarketingPages().recordingButton();

    }
    @Given("^I tap on the Pro Tips$")
    public void iTapOnTheProTips() {
        new ProTipsPage().protip();
    }
    @Then("^I should see Pro Tip page with title \"([^\"]*)\"$")
    public void iShouldSeeProTipPageWithTitle(String Protext) {
        Assert.assertEquals(new ProTipsPage().getPROTipTitle(), Protext);
        Assert.assertTrue(new ProTipsPage().getProTipHeadingText());
    }
    @Then("^I should see Pro Tip page with litghting \"([^\"]*)\"$")
    public void iShouldSeeProTipPageWithLitghting(String lighting_text_view) {
        Assert.assertEquals(new ProTipsPage().getTextLighting(), lighting_text_view);
    }
    @Then("^I should see Pro Tip page with professional \"([^\"]*)\"$")
    public void iShouldSeeProTipPageWithProfessional(String professional_text_view) {
        Assert.assertEquals(new ProTipsPage().getTextProfessional(), professional_text_view);
        new ProTipsPage().backButton();
    }

    @Then("^I should see Pro Tip page with rotaotetext \"([^\"]*)\"$")
    public void iShouldSeeProTipPageWithRotaotetext(String rotate_pro_tip_text_view) {
        Assert.assertEquals(new ProTipsPage().getTextRotateScreen(), rotate_pro_tip_text_view);
        Assert.assertTrue(new ProTipsPage().getProTipText());
    }
}
