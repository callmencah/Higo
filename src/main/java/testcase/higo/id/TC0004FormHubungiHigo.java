package testcase.higo.id;

import base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.RandomUtil;

import java.time.Duration;

public class TC0004FormHubungiHigo extends BaseTest {
    @Test
    public static void FormContactUsLayananHIGOspot(){
        String randomName = RandomUtil.generateRandomName();
        String randomEmail = randomName + "@gmail.com";
        String randomPhone = RandomUtil.generateRandomPhoneNumber();
        String randomMessage = RandomUtil.generateRandomMessage();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement LogoHigo = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath(loc.getProperty("LogoHigo"))));
        LogoHigo.isDisplayed();

        WebElement NavHubungiHIGO = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath(loc.getProperty("HubungiHIGO"))));
        NavHubungiHIGO.click();
        wait.until(ExpectedConditions.urlContains("contact-us"));

        String currentUrl7 = driver.getCurrentUrl();
        System.out.println("Navigated to: " + currentUrl7);
        Assert.assertTrue(currentUrl7.contains("contact-us"), "URL tidak sesuai untuk Hubungi HIGO");

        WebElement FieldNamaLengkap = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.name(loc.getProperty("FieldNamaLengkap"))));
        FieldNamaLengkap.sendKeys(randomName);
        System.out.println("Input Nama Lengkap: " + randomName);

        WebElement FieldEmail = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath(loc.getProperty("FieldEmail"))));
        FieldEmail.sendKeys(randomEmail);
        System.out.println("Input Email: " + randomEmail);

        WebElement FieldNomorTelepon = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.name(loc.getProperty("FieldNomorTelepon"))));
        FieldNomorTelepon.sendKeys(randomPhone);
        System.out.println("Input Nomor Telepon: " + randomPhone);

        WebElement FieldNamaPerusahaan = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.name(loc.getProperty("FieldNamaPerusahaan"))));
        FieldNamaPerusahaan.sendKeys(randomName);
        System.out.println("Input Nama Perusahaan: " + randomName);

        WebElement FieldPesan = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath(loc.getProperty("FieldPesan"))));
        FieldPesan.sendKeys(randomMessage);
        System.out.println("Input Pesan: " + randomMessage);

        WebElement SubmitButton = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath(loc.getProperty("SubmitButton"))));
        SubmitButton.click();

        WebElement NotifyPesanAndaBerhasilTerkirim = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath(loc.getProperty("NotifyPesanAndaBerhasilTerkirim"))));
        NotifyPesanAndaBerhasilTerkirim.isDisplayed();
        Assert.assertTrue(NotifyPesanAndaBerhasilTerkirim.isDisplayed());

    }

    @Test
    public static void FormContactUsLayananIntegratedDigitalAgency(){
        String randomName = RandomUtil.generateRandomName();
        String randomEmail = randomName + "@gmail.com";
        String randomPhone = RandomUtil.generateRandomPhoneNumber();
        String randomMessage = RandomUtil.generateRandomMessage();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement LogoHigo = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath(loc.getProperty("LogoHigo"))));
        LogoHigo.isDisplayed();

        WebElement NavHubungiHIGO = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath(loc.getProperty("HubungiHIGO"))));
        NavHubungiHIGO.click();
        wait.until(ExpectedConditions.urlContains("contact-us"));

        String currentUrl7 = driver.getCurrentUrl();
        System.out.println("Navigated to: " + currentUrl7);
        Assert.assertTrue(currentUrl7.contains("contact-us"), "URL tidak sesuai untuk Hubungi HIGO");

        WebElement FieldNamaLengkap = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.name(loc.getProperty("FieldNamaLengkap"))));
        FieldNamaLengkap.sendKeys(randomName);
        System.out.println("Input Nama Lengkap: " + randomName);

        WebElement FieldEmail = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath(loc.getProperty("FieldEmail"))));
        FieldEmail.sendKeys(randomEmail);
        System.out.println("Input Email: " + randomEmail);

        WebElement FieldNomorTelepon = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.name(loc.getProperty("FieldNomorTelepon"))));
        FieldNomorTelepon.sendKeys(randomPhone);
        System.out.println("Input Nomor Telepon: " + randomPhone);

        WebElement FieldNamaPerusahaan = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.name(loc.getProperty("FieldNamaPerusahaan"))));
        FieldNamaPerusahaan.sendKeys(randomName);
        System.out.println("Input Nama Perusahaan: " + randomName);

        WebElement DropdownIntegratedDigitalAgency = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath(loc.getProperty("DropdownIntegratedDigitalAgency"))));
        DropdownIntegratedDigitalAgency.click();

        WebElement FieldPesan = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath(loc.getProperty("FieldPesan"))));
        FieldPesan.sendKeys(randomMessage);
        System.out.println("Input Pesan: " + randomMessage);

        WebElement SubmitButton = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath(loc.getProperty("SubmitButton"))));
        SubmitButton.click();

        WebElement NotifyPesanAndaBerhasilTerkirim = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath(loc.getProperty("NotifyPesanAndaBerhasilTerkirim"))));
        NotifyPesanAndaBerhasilTerkirim.isDisplayed();
        Assert.assertTrue(NotifyPesanAndaBerhasilTerkirim.isDisplayed());

    }

    @Test
    public static void FormContactUsLayananWiFiAdvertising(){
        String randomName = RandomUtil.generateRandomName();
        String randomEmail = randomName + "@gmail.com";
        String randomPhone = RandomUtil.generateRandomPhoneNumber();
        String randomMessage = RandomUtil.generateRandomMessage();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement LogoHigo = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath(loc.getProperty("LogoHigo"))));
        LogoHigo.isDisplayed();

        WebElement NavHubungiHIGO = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath(loc.getProperty("HubungiHIGO"))));
        NavHubungiHIGO.click();
        wait.until(ExpectedConditions.urlContains("contact-us"));

        String currentUrl7 = driver.getCurrentUrl();
        System.out.println("Navigated to: " + currentUrl7);
        Assert.assertTrue(currentUrl7.contains("contact-us"), "URL tidak sesuai untuk Hubungi HIGO");

        WebElement FieldNamaLengkap = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.name(loc.getProperty("FieldNamaLengkap"))));
        FieldNamaLengkap.sendKeys(randomName);
        System.out.println("Input Nama Lengkap: " + randomName);

        WebElement FieldEmail = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath(loc.getProperty("FieldEmail"))));
        FieldEmail.sendKeys(randomEmail);
        System.out.println("Input Email: " + randomEmail);

        WebElement FieldNomorTelepon = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.name(loc.getProperty("FieldNomorTelepon"))));
        FieldNomorTelepon.sendKeys(randomPhone);
        System.out.println("Input Nomor Telepon: " + randomPhone);

        WebElement FieldNamaPerusahaan = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.name(loc.getProperty("FieldNamaPerusahaan"))));
        FieldNamaPerusahaan.sendKeys(randomName);
        System.out.println("Input Nama Perusahaan: " + randomName);

        WebElement DropdownWiFiAdvertising = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath(loc.getProperty("DropdownWiFiAdvertising"))));
        DropdownWiFiAdvertising.click();

        WebElement FieldPesan = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath(loc.getProperty("FieldPesan"))));
        FieldPesan.sendKeys(randomMessage);
        System.out.println("Input Pesan: " + randomMessage);

        WebElement SubmitButton = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath(loc.getProperty("SubmitButton"))));
        SubmitButton.click();

        WebElement NotifyPesanAndaBerhasilTerkirim = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath(loc.getProperty("NotifyPesanAndaBerhasilTerkirim"))));
        NotifyPesanAndaBerhasilTerkirim.isDisplayed();
        Assert.assertTrue(NotifyPesanAndaBerhasilTerkirim.isDisplayed());

    }
}
