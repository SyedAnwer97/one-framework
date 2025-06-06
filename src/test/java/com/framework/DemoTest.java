package com.framework;

import com.framework.config.ConfigFactory;
import lombok.SneakyThrows;
import org.testng.annotations.Test;

public class DemoTest {

    @SneakyThrows
    @Test
    public void loginTest() {
        System.out.println(ConfigFactory.getConfig().browser());

        /*WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.co.in/");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        driver.quit();*/
    }
}
