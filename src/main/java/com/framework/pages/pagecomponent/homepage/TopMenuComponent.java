package com.framework.pages.pagecomponent.homepage;

import com.framework.pages.SeleniumPageActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TopMenuComponent extends SeleniumPageActions {

    private static final By LOGO_IMAGE = By.xpath("//img[@alt='client brand banner']");
    private static final By PAGE_HEADER_TEXT = By.xpath("//span[@class='oxd-topbar-header-breadcrumb']//h6");
    private static final By UPGRADE_BUTTON = By.xpath("//button[normalize-space()='Upgrade']");

    public String getLogoSourceString() {
        return getAttribute(LOGO_IMAGE, e -> e.getDomAttribute("src"));
    }

    public boolean isUpgradeButtonPresent() {
        return isElementDisplayed(UPGRADE_BUTTON, WebElement::isDisplayed);
    }

    public String getHeaderName() {
        return getAttribute(PAGE_HEADER_TEXT, WebElement::getText);
    }
}
