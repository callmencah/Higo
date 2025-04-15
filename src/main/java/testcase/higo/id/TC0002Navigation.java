package testcase.higo.id;

import base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.Set;

public class TC0002Navigation extends BaseTest {
    @Test
    public static void Navigation(){

        String originalWindow = driver.getWindowHandle();
        
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement LogoHigo = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath(loc.getProperty("LogoHigo"))));
        LogoHigo.isDisplayed();
        System.out.println("On Page: "+driver.getCurrentUrl());
        WebElement NavTentangHigo = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath(loc.getProperty("TentangHIGO"))));
        NavTentangHigo.click();
        wait.until(ExpectedConditions.urlContains("about-us"));

        String currentUrl = driver.getCurrentUrl();
        System.out.println("Navigated to: " + currentUrl);
        Assert.assertTrue(currentUrl.contains("about-us"), "URL tidak sesuai untuk Tentang HIGO");
        driver.navigate().back();
        String backUrl = driver.getCurrentUrl();
        System.out.println("Back to: " + backUrl);

        WebElement NavLayananHIGO = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath(loc.getProperty("LayananHIGO"))));
        NavLayananHIGO.click();
        WebElement NavWiFiAdvertising = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath(loc.getProperty("WiFiAdvertising"))));
        NavWiFiAdvertising.click();
        wait.until(ExpectedConditions.urlContains("wifi-advertising"));

        String currentUrl1 = driver.getCurrentUrl();
        System.out.println("Navigated to: " + currentUrl1);
        Assert.assertTrue(currentUrl1.contains("wifi-advertising"), "URL tidak sesuai untuk WiFi Advertising");
        driver.navigate().back();
        String backUrl1 = driver.getCurrentUrl();
        System.out.println("Back to: " + backUrl1);

        WebElement NavHigoSpot = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath(loc.getProperty("HigoSpot"))));
        NavHigoSpot.click();
        wait.until(ExpectedConditions.urlContains("higospot"));

        String currentUrl2 = driver.getCurrentUrl();
        System.out.println("Navigated to: " + currentUrl2);
        Assert.assertTrue(currentUrl2.contains("higospot"), "URL tidak sesuai untuk Higo Spot");
        driver.navigate().back();
        String backUrl2 = driver.getCurrentUrl();
        System.out.println("Back to: " + backUrl2);

        WebElement NavIntegratedDigitalAgency = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath(loc.getProperty("IntegratedDigitalAgency"))));
        NavIntegratedDigitalAgency.click();
        wait.until(ExpectedConditions.urlContains("integrated-digital-agency"));

        String currentUrl3 = driver.getCurrentUrl();
        System.out.println("Navigated to: " + currentUrl3);
        Assert.assertTrue(currentUrl3.contains("integrated-digital-agency"), "URL tidak sesuai untuk Integrated Digital Agency");
        driver.navigate().back();
        String backUrl3 = driver.getCurrentUrl();
        System.out.println("Back to: " + backUrl3);

        WebElement NavStudiKasus = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath(loc.getProperty("StudiKasus"))));
        NavStudiKasus.click();
        wait.until(ExpectedConditions.urlContains("case-study"));

        String currentUrl4 = driver.getCurrentUrl();
        System.out.println("Navigated to: " + currentUrl4);
        Assert.assertTrue(currentUrl4.contains("case-study"), "URL tidak sesuai untuk StudiKasus");
        driver.navigate().back();
        String backUrl4 = driver.getCurrentUrl();
        System.out.println("Back to: " + backUrl4);

        WebElement NavBlog = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath(loc.getProperty("Blog"))));
        NavBlog.click();

        // Tunggu sampai tab baru muncul
        Set<String> allWindows = driver.getWindowHandles();
        while (allWindows.size() == 1) {
            allWindows = driver.getWindowHandles();
        }

        // Pindah ke tab baru
        for (String windowHandle : allWindows) {
            if (!windowHandle.equals(originalWindow)) {
                driver.switchTo().window(windowHandle);
                break;
            }
        }
        wait.until(ExpectedConditions.urlContains("https://blog.higo.id/"));

        String currentUrl5 = driver.getCurrentUrl();
        System.out.println("Navigated to: " + currentUrl5);
        Assert.assertTrue(currentUrl5.contains("https://blog.higo.id/"), "URL tidak sesuai untuk Blog");
        driver.get("https://higo.id");
        String OnPage = driver.getCurrentUrl();
        System.out.println("On Page: " + OnPage);

        WebElement NavDigitalReports = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath(loc.getProperty("DigitalReports"))));
        NavDigitalReports.click();
        wait.until(ExpectedConditions.urlContains("digital-reports"));

        String currentUrl6 = driver.getCurrentUrl();
        System.out.println("Navigated to: " + currentUrl6);
        Assert.assertTrue(currentUrl6.contains("digital-reports"), "URL tidak sesuai untuk Digital Reports");
        driver.navigate().back();
        String backUrl6 = driver.getCurrentUrl();
        System.out.println("Back to: " + backUrl6);

        WebElement NavHubungiHIGO = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath(loc.getProperty("HubungiHIGO"))));
        NavHubungiHIGO.click();
        wait.until(ExpectedConditions.urlContains("contact-us"));

        String currentUrl7 = driver.getCurrentUrl();
        System.out.println("Navigated to: " + currentUrl7);
        Assert.assertTrue(currentUrl7.contains("contact-us"), "URL tidak sesuai untuk Hubungi HIGO");
        driver.navigate().back();
        String backUrl7 = driver.getCurrentUrl();
        System.out.println("Back to: " + backUrl7);
    }
}
