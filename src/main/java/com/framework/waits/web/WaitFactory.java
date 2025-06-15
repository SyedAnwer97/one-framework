package com.framework.waits.web;

import com.framework.driver.managers.DriverManager;
import com.google.common.util.concurrent.Uninterruptibles;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.function.Consumer;

public class WaitFactory {

    public static WebElement wait(By by, WaitStrategy waitStrategy) {
        WebDriver driver = DriverManager.getDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        return switch (waitStrategy) {
            case VISIBLE -> wait.until(ExpectedConditions.visibilityOfElementLocated(by));
            case PRESENCE -> wait.until(ExpectedConditions.presenceOfElementLocated(by));
            case CLICKABLE -> wait.until(ExpectedConditions.elementToBeClickable(by));
            case NONE -> driver.findElement(by);
        };
    }

    public static void wait(Consumer<WebDriverWait> driverConsumer) {
        WebDriver driver = DriverManager.getDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driverConsumer.accept(wait);
    }

    public static void wait(Duration duration) {
        Uninterruptibles.sleepUninterruptibly(duration);
    }
}
