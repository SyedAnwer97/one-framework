package com.framework.pages;

import com.framework.pages.enums.homepage.Menu;
import com.framework.pages.enums.homepage.SubMenu;
import com.framework.pages.pagecomponent.homepage.MenuPage;
import com.framework.pages.pagecomponent.homepage.TopMenuComponent;
import com.framework.pages.validator.HomePageValidator;

public class HomePage extends SeleniumPageActions {

    private MenuPage menuPage;
    private TopMenuComponent topMenuComponent;

    public HomePage() {
        this.topMenuComponent = new TopMenuComponent();
        this.menuPage = new MenuPage();
    }

    public HomePage clickMenu(Menu menu) {
        menuPage.clickMenu(menu);
        return this;
    }

    public SystemUsersPage NavigateToAddUsersPage() {
        menuPage.clickMenu(Menu.ADMIN)
                .clickSubMenu(SubMenu.USER_MANAGEMENT)
                .clickSubMenu(SubMenu.USER);
        return new SystemUsersPage();
    }

    public HomePageValidator getHomePageValidator() {
        return HomePageValidator.builder()
                .isUpgradeDisplayed(topMenuComponent.isUpgradeButtonPresent())
                .logoSourceString(topMenuComponent.getLogoSourceString())
                .headerName(topMenuComponent.getHeaderName())
                .build();
    }
}
