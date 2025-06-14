package com.framework.pages;

import com.framework.pages.enums.homepage.Menu;
import com.framework.pages.enums.homepage.SubMenu;
import com.framework.pages.pagecomponent.homepage.MenuPage;

public class HomePage extends SeleniumPageActions {

    private MenuPage menuPage;

    public HomePage() {
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
}
