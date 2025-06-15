package com.framework.pages.enums.homepage;

public enum SubMenu {

    USER_MANAGEMENT("User Management"),
    USER("Users");

    private final String name;

    public String getName() {
        return name;
    }

    SubMenu(String name) {
        this.name = name;
    }
    }
