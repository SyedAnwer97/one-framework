package com.framework;

import com.framework.driver.managers.Driver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class WebBase {

    @BeforeMethod
    public void setUp() {
        Driver.initDriverForWeb();
    }

    @AfterMethod
    public void tearDown() {
        Driver.quitDriver();
    }
}
