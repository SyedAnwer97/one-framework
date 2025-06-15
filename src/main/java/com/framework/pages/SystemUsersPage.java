package com.framework.pages;

import com.framework.pages.pagecomponent.addusers.AddUserComponent;
import com.framework.pages.pagecomponent.addusers.SearchComponent;

public class SystemUsersPage extends SeleniumPageActions {

    private final SearchComponent searchComponent;
    private final AddUserComponent addUserComponent;

    public SystemUsersPage() {
        this.addUserComponent = new AddUserComponent();
        this.searchComponent = new SearchComponent();
    }

    public AddUserComponent getAddUserComponent() {
        addUserComponent.clickAddButton();
        return new AddUserComponent();
    }
}
