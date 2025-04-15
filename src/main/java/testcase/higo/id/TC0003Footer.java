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

public class TC0003Footer extends BaseTest {
    @Test
    public static void Footer(){

        String originalWindow = driver.getWindowHandle();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement LogoHigo = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath(loc.getProperty("LogoHigo"))));
        LogoHigo.isDisplayed();
        System.out.println("On Page: "+driver.getCurrentUrl());

        WebElement FooterWiFiAdvertising = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath(loc.getProperty("FooterWiFiAdvertising"))));
        FooterWiFiAdvertising.click();
        wait.until(ExpectedConditions.urlContains("wifi-advertising"));

        String currentUrl = driver.getCurrentUrl();
        System.out.println("Navigated to: " + currentUrl);
        Assert.assertTrue(currentUrl.contains("wifi-advertising"), "URL tidak sesuai untuk WiFi Advertising");
        driver.navigate().back();
        String backUrl = driver.getCurrentUrl();
        System.out.println("Back to: " + backUrl);

        WebElement FooterHIGOspot = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath(loc.getProperty("FooterHIGOspot"))));
        FooterHIGOspot.click();
        wait.until(ExpectedConditions.urlContains("higospot"));

        String currentUrl1 = driver.getCurrentUrl();
        System.out.println("Navigated to: " + currentUrl1);
        Assert.assertTrue(currentUrl1.contains("higospot"), "URL tidak sesuai untuk Higo Spot");
        driver.navigate().back();
        String backUrl1 = driver.getCurrentUrl();
        System.out.println("Back to: " + backUrl1);

        WebElement FooterIntegratedDigitalAgency = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath(loc.getProperty("FooterIntegratedDigitalAgency"))));
        FooterIntegratedDigitalAgency.click();
        wait.until(ExpectedConditions.urlContains("integrated-digital-agency"));

        String currentUrl2 = driver.getCurrentUrl();
        System.out.println("Navigated to: " + currentUrl2);
        Assert.assertTrue(currentUrl2.contains("integrated-digital-agency"), "URL tidak sesuai untuk Integrated Digital Agency");
        driver.navigate().back();
        String backUrl2 = driver.getCurrentUrl();
        System.out.println("Back to: " + backUrl2);

        WebElement FooterTentangHIGO = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath(loc.getProperty("FooterTentangHIGO"))));
        FooterTentangHIGO.click();
        wait.until(ExpectedConditions.urlContains("about-us"));

        String currentUrl3 = driver.getCurrentUrl();
        System.out.println("Navigated to: " + currentUrl3);
        Assert.assertTrue(currentUrl3.contains("about-us"), "URL tidak sesuai untuk Tentang HIGO");
        driver.navigate().back();
        String backUrl3 = driver.getCurrentUrl();
        System.out.println("Back to: " + backUrl3);

        WebElement FooterKarir = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath(loc.getProperty("FooterKarir"))));
        FooterKarir.click();
        wait.until(ExpectedConditions.urlContains("https://www.linkedin.com/company/pt-higo-fitur-indonesia"));

        String currentUrl4 = driver.getCurrentUrl();
        System.out.println("Navigated to: " + currentUrl4);
        Assert.assertTrue(currentUrl4.contains("https://www.linkedin.com/company/pt-higo-fitur-indonesia"), "URL tidak sesuai untuk Karir");
        driver.navigate().back();
        String backUrl4 = driver.getCurrentUrl();
        System.out.println("Back to: " + backUrl4);

        WebElement FooterBlog = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath(loc.getProperty("FooterBlog"))));
        FooterBlog.click();
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

        WebElement FooterSyaratAndKetentuan = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath(loc.getProperty("FooterSyaratAndKetentuan"))));
        FooterSyaratAndKetentuan.click();
        wait.until(ExpectedConditions.urlContains("terms-of-use-higospot"));

        String currentUrl6 = driver.getCurrentUrl();
        System.out.println("Navigated to: " + currentUrl6);
        Assert.assertTrue(currentUrl6.contains("terms-of-use-higospot"), "URL tidak sesuai Footer Syarat & Ketentuan");
        driver.navigate().back();
        String backUrl6 = driver.getCurrentUrl();
        System.out.println("Back to: " + backUrl6);

        WebElement FooterKebijakanPrivasi = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath(loc.getProperty("FooterKebijakanPrivasi"))));
        FooterKebijakanPrivasi.click();
        wait.until(ExpectedConditions.urlContains("privacy-policy-higospot"));

        String currentUrl7 = driver.getCurrentUrl();
        System.out.println("Navigated to: " + currentUrl7);
        Assert.assertTrue(currentUrl7.contains("privacy-policy-higospot"), "URL tidak sesuai Kebijakan Privasi");
        driver.navigate().back();
        String backUrl7 = driver.getCurrentUrl();
        System.out.println("Back to: " + backUrl7);
    }
}
