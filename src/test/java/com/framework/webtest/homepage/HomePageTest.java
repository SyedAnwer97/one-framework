package com.framework.webtest.homepage;

import com.framework.pages.LoginPage;
import com.framework.pages.validator.HomePageValidator;
import com.framework.webtest.WebSetup;
import org.junit.jupiter.api.Test;

class HomePageTest extends WebSetup {

    private static final String LOGO_SOURCE_LINK = "/web/images/orangehrm-logo.png?v=1721393199309";
    private static final String HEADER_TEXT = "Dashboard";

    @Test
    public void homePageTopComponentTest() {
        HomePageValidator homePageValidator = new LoginPage()
                .userLogin("Admin", "admin123")
                .getHomePageValidator();

        HomePageAssert.assertThat(homePageValidator)
                .isMarketPlaceLinkPresent()
                .logoSourceStringContains(LOGO_SOURCE_LINK)
                .headerNameEquals(HEADER_TEXT)
                .assertAll();
    }

}
