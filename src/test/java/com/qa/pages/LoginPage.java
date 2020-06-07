package com.qa.pages;

import com.qa.utils.TestUtils;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class LoginPage extends BasePage{
    TestUtils utils = new TestUtils();

    @AndroidFindBy(id = "com.earningvideo:id/email_edit_text_view") private MobileElement emailTextField;
    @AndroidFindBy(id = "com.earningvideo:id/password_text_view") private MobileElement passwordTextField;
    @AndroidFindBy(id = "com.earningvideo:id/login_text_view") private MobileElement loginButton;
    @AndroidFindBy(id = "com.earningvideo:id/header_text_view") private MobileElement loginheading;



    public String getPageTitle() {
        return getText(loginheading, "Login page title is - ");
    }

    public String getTitle() {
        return getAttribute(loginheading,"text");
    }


    public LoginPage enterEmailid(String email) {
        sendKeys(emailTextField, email, "enter email id is >>>" + email);
        return this;

    }

    public LoginPage enterPasswrod(String password) {
        sendKeys(passwordTextField, password,"enter Password is >>>" + password);
        return this;

    }
    public boolean loginButtonPresent() {
        return loginButton.isDisplayed();
    }


    public DashboardPage pressLoginButton() {
        click(loginButton, "Press login button");
        return new DashboardPage();

    }
    public DashboardPage login(String email, String password) {
        enterEmailid(email);
        enterPasswrod(password);
        return pressLoginButton();

    }

}
