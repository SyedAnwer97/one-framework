package com.framework.webtest.users;

import com.framework.fixtures.addusers.entity.UserData;
import com.framework.pages.pagecomponent.addusers.AddUserComponent;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiPredicate;

public class AddUserPredicateFactory {

    private static final Map<String, BiPredicate<UserData, AddUserComponent>> MAP = new HashMap<>();

    private static final BiPredicate<UserData, AddUserComponent> justEmployeeNamePredicate = (userData, addUserComponent) ->
    {
        addUserComponent.setEmployeeName(userData.getEmployeeName());
        return addUserComponent.isErrorDisplayedForEmployeeName();
    };

    private static final BiPredicate<UserData, AddUserComponent> validPredicate = (userData, addUserComponent) ->
    {
        addUserComponent.setUserRoll(userData.getUserRole())
                .setEmployeeName(userData.getEmployeeName())
                .setStatus(userData.getRoleStatus())
                .setUserName(userData.getUserName())
                .setPassword(userData.getPassword())
                .setConfirmPassword(userData.getPassword())
                .clickSaveButton();
        return addUserComponent.isToastMessageDisplayed();
    };

    static {
        MAP.putIfAbsent("valid", validPredicate);
        MAP.put("justEmployeeName", justEmployeeNamePredicate);
    }

    public static BiPredicate<UserData, AddUserComponent> getPredicate(String scenarioTest) {
        return MAP.get(scenarioTest);
    }

}
