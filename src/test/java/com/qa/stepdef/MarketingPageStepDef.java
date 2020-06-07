package com.qa.stepdef;

import com.qa.pages.LoginPage;
import com.qa.pages.MarketingPages;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class MarketingPageStepDef {
    @When("^I tap on the Recording Screen button$")
    public void iTapOnTheRecordingScreenButton() {
        new MarketingPages().recordingButton();

    }
    @When("^I tap on the start recording button$")
    public void iTapOnTheStartRecordingButton() {
        new MarketingPages().startVideoButton();

    }
    @When("^I tap on the Stop recording button$")
    public void iTapOnTheStopRecordingButton() {
        new MarketingPages().stopVideoButton();

    }
    @Then("^I should see Login page with title \"([^\"]*)\"$")
    public void iShouldSeeLoginPageWithTitle(String logintext) {
        Assert.assertEquals(new LoginPage().getPageTitle(), logintext);

    }
}
