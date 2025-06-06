package com.framework;

import lombok.SneakyThrows;
import org.testng.annotations.Test;

public class DemoTest extends WebBase{

    @SneakyThrows
    @Test
    public void loginTest() {
        Thread.sleep(3000);
    }
}
