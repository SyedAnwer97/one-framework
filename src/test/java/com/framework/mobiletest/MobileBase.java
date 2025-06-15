package com.framework.mobiletest;

import com.framework.driver.managers.Driver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class MobileBase {

    @BeforeMethod
    public void setUp() {
        Driver.initDriverForMobile();
    }

    @AfterMethod
    public void tearDown() {
        Driver.quitDriver();
    }

}
