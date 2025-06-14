package com.framework.pages.pagecomponent.addusers;

import com.framework.pages.SeleniumPageActions;
import com.google.common.util.concurrent.Uninterruptibles;
import org.openqa.selenium.By;

import java.time.Duration;

public class AddUserComponent extends SeleniumPageActions {

    private static final By ADD_BUTTON = By.xpath("//button[normalize-space()='Add']");

    public AddUserComponent clickAddButton() {
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(1));
        waitAndClick(ADD_BUTTON);
        return this;
    }
}
