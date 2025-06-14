package com.framework.pages;

import org.openqa.selenium.By;

public class LoginPage extends SeleniumPageActions {

    private static final By USER_NAME_TEXTBOX = By.name("username");
    private static final By PASSWORD_TEXTBOX = By.name("password");
    private static final By LOGIN_BUTTON = By.xpath("//button[normalize-space()='Login']");

    private LoginPage setUserName(String userName) {
        waitAndSendKey(USER_NAME_TEXTBOX, userName);
        return this;
    }

    private LoginPage setPassword(String password) {
        waitAndSendKey(PASSWORD_TEXTBOX, password);
        return this;
    }

    private LoginPage clickLogin() {
        waitAndClick(LOGIN_BUTTON);
        return this;
    }

    public HomePage userLogin(String username, String password) {
        new LoginPage().setUserName(username).setPassword(password).clickLogin();
        return new HomePage();
    }
}