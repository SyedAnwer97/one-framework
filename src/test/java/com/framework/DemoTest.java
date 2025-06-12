package com.framework;

import com.google.common.util.concurrent.Uninterruptibles;
import org.testng.annotations.Test;

public class DemoTest extends WebBase {


    @Test
    public void loginTest() {
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(3));
    }
}
