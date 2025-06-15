package com.framework.pages.pagecomponent.homepage;

import com.framework.pages.SeleniumPageActions;
import com.framework.pages.enums.homepage.Menu;
import com.framework.pages.enums.homepage.SubMenu;
import org.openqa.selenium.By;

public class MenuPage extends SeleniumPageActions {

    private static final String MENU = "//*[text()='%s']/parent::a";
    private static final String SUBMENU = "//*[normalize-space()='%s']/parent::li";

    public MenuPage clickMenu(Menu menu) {
        waitAndClick(By.xpath(String.format(MENU, menu.getName())));
        return this;
    }

    public MenuPage clickSubMenu(SubMenu subMenu) {
        waitAndClick(By.xpath(String.format(SUBMENU, subMenu.getName())));
        return this;
    }
}
