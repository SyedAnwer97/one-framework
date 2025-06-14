package com.framework.webtest;

import com.framework.pages.LoginPage;
import com.google.common.util.concurrent.Uninterruptibles;
import org.testng.annotations.Test;

import java.time.Duration;

public class WebDemoTest extends WebBase {

    @Test
    public void loginTest() {
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(3));
        new LoginPage().userLogin("Admin", "admin123")
                .NavigateToAddUsersPage()
                .getAddUserComponent();
    }
}
