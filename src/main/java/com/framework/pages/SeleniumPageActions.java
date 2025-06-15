package com.framework.pages;

import com.framework.driver.managers.DriverManager;
import com.framework.waits.web.WaitFactory;
import com.framework.waits.web.WaitStrategy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class SeleniumPageActions {

    private static WebDriver driver;

    public SeleniumPageActions() {
        this.driver = DriverManager.getDriver();
    }

    public static void waitAndClick(By by) {
        WaitFactory.wait(by, WaitStrategy.CLICKABLE).click();
    }

    public static void waitAndSendKey(By by, String value) {
        WaitFactory.wait(by, WaitStrategy.VISIBLE).sendKeys(value);
    }

    public static void waitAndSelect(By by, Consumer<Select> selectConsumer) {
        selectConsumer.accept(new Select(WaitFactory.wait(by, WaitStrategy.PRESENCE)));
    }

    public static WebElement waitAndGetElement(By by, Function<By, WebElement> elementFunction) {
        return elementFunction.apply(by);
    }

    public static boolean isElementDisplayed(By by, Predicate<WebElement> elementPredicate) {
        WaitFactory.wait(e -> e.until(ExpectedConditions.visibilityOfElementLocated(by)));
        return elementPredicate.test(driver.findElement(by));
    }

    public static String getAttribute(By by, Function<WebElement, String> attributeFunction) {
        WaitFactory.wait(e -> e.until(ExpectedConditions.or(ExpectedConditions.visibilityOfElementLocated(by),
                ExpectedConditions.presenceOfElementLocated(by))));
        return attributeFunction.apply(driver.findElement(by));
    }

}
