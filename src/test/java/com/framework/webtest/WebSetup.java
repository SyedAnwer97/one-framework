package com.framework.webtest;

import br.com.six2six.fixturefactory.loader.FixtureFactoryLoader;
import com.framework.driver.managers.Driver;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

public class WebSetup {

    @BeforeAll
    public static void beforeAll() {
        FixtureFactoryLoader.loadTemplates("com.framework.fixtures.addusers");
    }

    @BeforeEach
    public void setUp() {
        Driver.initDriverForWeb();
    }

    @AfterEach
    public void tearDown() {
        Driver.quitDriver();
    }
}
