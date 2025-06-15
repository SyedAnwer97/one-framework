package com.framework.webtest.users;

import com.framework.pages.LoginPage;
import com.framework.webtest.WebSetup;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

public class AddUserTest extends WebSetup {

    @ParameterizedTest
    @EnumSource(value = AddUserScenarioTest.class)
    public void AddUserTest(AddUserScenarioTest scenarioTest) {
        Boolean isAssertionDisplayed = new LoginPage().userLogin("Admin", "admin123")
                .NavigateToAddUsersPage()
                .getAddUserComponent()
                .fillUserDetail(scenarioTest.getUserData(), scenarioTest.getPredicate());

        Assertions.assertThat(isAssertionDisplayed)
                .withFailMessage(() -> scenarioTest.getUserData().getMessage())
                .isTrue();
    }

}
