package testcase.blog.higo.id;

import base.BaseTest1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class TC0001HomePage extends BaseTest1 {
    @Test
    public static void HomePage() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement LogoHigo = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath(loc.getProperty("LogoHigo"))));
        LogoHigo.isDisplayed();
    }
}

