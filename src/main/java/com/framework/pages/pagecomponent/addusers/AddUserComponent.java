package com.framework.pages.pagecomponent.addusers;

import com.framework.fixtures.addusers.entity.UserData;
import com.framework.pages.SeleniumPageActions;
import org.openqa.selenium.By;

import java.util.function.BiPredicate;

public class AddUserComponent extends SeleniumPageActions {

    private static final String LIST_DROPDOWN = "//div[@role='listbox']//div[.='%s']";

    private static final By ADD_BUTTON = By.xpath("//button[normalize-space()='Add']");
    private static final By SAVE_BUTTON = By.xpath("//button[normalize-space()='Save']");

    private static final By EMPLOYEE_NAME_TEXTBOX = By.xpath("//input[@placeholder='Type for hints...']");
    private static final By USERNAME_TEXTBOX = By.xpath("//*[normalize-space()='Username']//ancestor::*[contains(@class,'oxd-input-group')]//input");
    private static final By PASSWORD_TEXTBOX = By.xpath("(//*[text()='Password'])//..//..//input");
    private static final By CONFIRM_PASSWORD_TEXTBOX = By.xpath("(//*[text()='Confirm Password'])//..//..//input");

    private static final By USER_ROLE_DROPDOWN = By.xpath("//label[normalize-space()='User Role']//following::i[1]");
    private static final By STATUS_DROPDOWN = By.xpath("//label[normalize-space()='Status']//following::i[1]");

    private static final By TOAST_POPUP = By.id("oxd-toaster_1");
    private static final By ERROR_MESSAGE = By.xpath("//span[contains(@class, 'oxd-input-field-error-message')]");

    public AddUserComponent clickAddButton() {
        waitAndClick(ADD_BUTTON);
        return this;
    }

    public AddUserComponent setUserRoll(String userRoll) {
        waitAndClick(USER_ROLE_DROPDOWN);
        waitAndClick(By.xpath(String.format(LIST_DROPDOWN, userRoll)));
        return this;
    }

    public AddUserComponent setEmployeeName(String employeeName) {
        waitAndSendKey(EMPLOYEE_NAME_TEXTBOX, employeeName);
        try {
            waitAndClick(By.xpath(String.format(LIST_DROPDOWN, employeeName)));
        } catch (Exception e) {
            waitAndClick(STATUS_DROPDOWN);
        }
        return this;
    }

    public AddUserComponent setStatus(String status) {
        waitAndClick(STATUS_DROPDOWN);
        waitAndClick(By.xpath(String.format(LIST_DROPDOWN, status)));
        return this;
    }

    public AddUserComponent setUserName(String userName) {
        waitAndSendKey(USERNAME_TEXTBOX, userName);
        return this;
    }

    public AddUserComponent setPassword(String password) {
        waitAndSendKey(PASSWORD_TEXTBOX, password);
        return this;
    }

    public AddUserComponent setConfirmPassword(String password) {
        waitAndSendKey(CONFIRM_PASSWORD_TEXTBOX, password);
        return this;
    }

    public AddUserComponent clickSaveButton() {
        waitAndClick(SAVE_BUTTON);
        return this;
    }

    public boolean isErrorDisplayedForEmployeeName() {
        boolean invalid = isElementDisplayed(ERROR_MESSAGE, e -> e.isDisplayed());
        return invalid;
    }

    public boolean isToastMessageDisplayed() {
        return isElementDisplayed(TOAST_POPUP, e -> e.isDisplayed());
    }

    public boolean fillUserDetail(UserData userData, BiPredicate<UserData, AddUserComponent> biPredicate) {
        return biPredicate.test(userData, this);
    }

}
