package com.framework.webtest.homepage;

import com.framework.pages.validator.HomePageValidator;
import org.assertj.core.api.AbstractAssert;
import org.assertj.core.api.SoftAssertions;

public class HomePageAssert extends AbstractAssert<HomePageAssert, HomePageValidator> {

    private final SoftAssertions softAssertions;

    private HomePageAssert(HomePageValidator homePageValidator) {
        super(homePageValidator, HomePageAssert.class);
        softAssertions = new SoftAssertions();
    }

    public static HomePageAssert assertThat(HomePageValidator homePageValidator) {
        return new HomePageAssert(homePageValidator);
    }

    public HomePageAssert headerNameEquals(String expectedHeaderName) {
        String actualHeaderName = actual.getHeaderName();
        softAssertions.assertThat(actualHeaderName)
                .isEqualTo(expectedHeaderName);
        return this;
    }

    public HomePageAssert logoSourceStringContains(String expectedLogoSourceString) {
        String actualLogoSourceText = actual.getLogoSourceString();
        softAssertions.assertThat(actualLogoSourceText)
                .contains(expectedLogoSourceString);
        return this;
    }

    public HomePageAssert isMarketPlaceLinkPresent() {
        softAssertions.assertThat(actual.getIsUpgradeDisplayed())
                .withFailMessage(() -> "Marketplace link not present")
                .isTrue();
        return this;
    }

    public void assertAll() {
        softAssertions.assertAll();
    }

}
