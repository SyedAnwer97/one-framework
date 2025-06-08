package com.framework;

import com.framework.config.factory.BrowserStackConfigFactory;
import org.testng.annotations.Test;

public class DemoTest extends WebBase {


    @Test
    public void loginTest() {
        System.out.println(BrowserStackConfigFactory.getConfig().browserStackURL());
    }
}
