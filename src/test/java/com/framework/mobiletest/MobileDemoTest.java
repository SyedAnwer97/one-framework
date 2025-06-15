package com.framework.mobiletest;

import com.google.common.util.concurrent.Uninterruptibles;
import org.testng.annotations.Test;

import java.time.Duration;

public class MobileDemoTest extends MobileBase {

    @Test
    public void loginTest() {
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(3));
    }
}
