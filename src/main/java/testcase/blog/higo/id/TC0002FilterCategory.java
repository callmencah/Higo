package testcase.blog.higo.id;

import base.BaseTest1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class TC0002FilterCategory extends BaseTest1 {
    @Test
    public static void FilterCategoryHIGOesUpdate() throws InterruptedException {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement LogoHigo = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath(loc.getProperty("LogoHigo"))));
        LogoHigo.isDisplayed();

        WebElement CategoryHIGOesUpdate = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath(loc.getProperty("CategoryHIGOesUpdate"))));
        CategoryHIGOesUpdate.click();
        Thread.sleep(3000);

        WebElement CategoryPertama = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath(loc.getProperty("CategoryPertama"))));
        System.out.println("Category Pertama: " + CategoryPertama.getText());

        WebElement ArtikelPertama = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath(loc.getProperty("ArtikelPertama"))));
        System.out.println("Artikel Pertama: " + ArtikelPertama.getText());

        WebElement CategoryKedua = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath(loc.getProperty("CategoryKedua"))));
        System.out.println("Category Kedua  : " + CategoryKedua.getText());

        WebElement ArtikelKedua = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath(loc.getProperty("ArtikelKedua"))));
        System.out.println("Artikel Kedua: " + ArtikelKedua.getText());

        WebElement ArtikelKetiga = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath(loc.getProperty("ArtikelKetiga"))));
        System.out.println("Artikel Ketiga: " + ArtikelKetiga.getText());

        WebElement CategoryKetiga = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath(loc.getProperty("CategoryKetiga"))));
        System.out.println("Category Ketiga : " + CategoryKetiga.getText());

    }

    @Test
    public static void FilterCategoryHangout() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement LogoHigo = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath(loc.getProperty("LogoHigo"))));
        LogoHigo.isDisplayed();

        WebElement CategoryHangout = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath(loc.getProperty("CategoryHangout"))));
        CategoryHangout.click();
        Thread.sleep(3000);
        WebElement ArtikelPertama = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath(loc.getProperty("ArtikelPertama"))));
        System.out.println("Artikel Pertama : " + ArtikelPertama.getText());

        WebElement CategoryPertama = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath(loc.getProperty("CategoryPertama"))));
        System.out.println("Category Pertama : " + CategoryPertama.getText());

        WebElement ArtikelKedua = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath(loc.getProperty("ArtikelKedua"))));
        System.out.println("Artikel Kedua : " + ArtikelKedua.getText());

        WebElement CategoryKedua = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath(loc.getProperty("CategoryKedua"))));
        System.out.println("Category Kedua : " + CategoryKedua.getText());

        WebElement ArtikelKetiga = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath(loc.getProperty("ArtikelKetiga"))));
        System.out.println("Artikel Ketiga : " + ArtikelKetiga.getText());

        WebElement CategoryKetiga = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath(loc.getProperty("CategoryKetiga"))));
        System.out.println("Category Ketiga : " + CategoryKetiga.getText());

    }

    @Test
    public static void FilterCategoryLifestyle() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement CategoryLifestyle = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath(loc.getProperty("CategoryLifestyle"))));
        CategoryLifestyle.click();
        Thread.sleep(3000);


        WebElement ArtikelPertama = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath(loc.getProperty("ArtikelPertama"))));
        System.out.println("Artikel Pertama : " + ArtikelPertama.getText());

        WebElement CategoryPertama = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath(loc.getProperty("CategoryPertama"))));
        System.out.println("Category Pertama : " + CategoryPertama.getText());

        WebElement ArtikelKedua = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath(loc.getProperty("ArtikelKedua"))));
        System.out.println("Artikel Kedua : " + ArtikelKedua.getText());

        WebElement CategoryKedua = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath(loc.getProperty("CategoryKedua"))));
        System.out.println("Category Kedua : " + CategoryKedua.getText());

        WebElement ArtikelKetiga = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath(loc.getProperty("ArtikelKetiga"))));
        System.out.println("Artikel Ketiga : " + ArtikelKetiga.getText());

        WebElement CategoryKetiga = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath(loc.getProperty("CategoryKetiga"))));
        System.out.println("Category Ketiga : " + CategoryKetiga.getText());

    }

    @Test
    public static void FilterCategoryTechAndSocial() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement CategoryTechAndSocial = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath(loc.getProperty("CategoryTechAndSocial"))));
        CategoryTechAndSocial.click();
        Thread.sleep(3000);

        WebElement ArtikelPertama = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath(loc.getProperty("ArtikelPertama"))));
        System.out.println("Artikel Pertama : " + ArtikelPertama.getText());

        WebElement CategoryPertama = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath(loc.getProperty("CategoryPertama"))));
        System.out.println("Category Pertama : " + CategoryPertama.getText());

        WebElement ArtikelKedua = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath(loc.getProperty("ArtikelKedua"))));
        System.out.println("Artikel Kedua : " + ArtikelKedua.getText());

        WebElement CategoryKedua = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath(loc.getProperty("CategoryKedua"))));
        System.out.println("Category Kedua : " + CategoryKedua.getText());

        WebElement ArtikelKetiga = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath(loc.getProperty("ArtikelKetiga"))));
        System.out.println("Artikel Ketiga : " + ArtikelKetiga.getText());

        WebElement CategoryKetiga = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath(loc.getProperty("CategoryKetiga"))));
        System.out.println("Category Ketiga : " + CategoryKetiga.getText());

    }

    @Test
    public static void FilterCategoryBusinessTip() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement CategoryBusinessTip = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath(loc.getProperty("CategoryBusinessTip"))));
        CategoryBusinessTip.click();
        Thread.sleep(3000);

        WebElement ArtikelPertama = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath(loc.getProperty("ArtikelPertama"))));
        System.out.println("Artikel Pertama : " + ArtikelPertama.getText());

        WebElement CategoryPertama = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath(loc.getProperty("CategoryPertama"))));
        System.out.println("Category Pertama : " + CategoryPertama.getText());

        WebElement ArtikelKedua = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath(loc.getProperty("ArtikelKedua"))));
        System.out.println("Artikel Kedua : " + ArtikelKedua.getText());

        WebElement CategoryKedua = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath(loc.getProperty("CategoryKedua"))));
        System.out.println("Category Kedua : " + CategoryKedua.getText());

        WebElement ArtikelKetiga = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath(loc.getProperty("ArtikelKetiga"))));
        System.out.println("Artikel Ketiga : " + ArtikelKetiga.getText());

        WebElement CategoryKetiga = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath(loc.getProperty("CategoryKetiga"))));
        System.out.println("Category Ketiga : " + CategoryKetiga.getText());
    }

    @Test
    public static void FilterCategoryAll() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement CategoryAll = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath(loc.getProperty("CategoryAll"))));
        CategoryAll.click();
        Thread.sleep(3000);

        WebElement ArtikelPertama = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath(loc.getProperty("ArtikelPertama"))));
        System.out.println("Artikel Pertama : " + ArtikelPertama.getText());

        WebElement CategoryPertama = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath(loc.getProperty("CategoryPertama"))));
        System.out.println("Category Pertama : " + CategoryPertama.getText());

        WebElement ArtikelKedua = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath(loc.getProperty("ArtikelKedua"))));
        System.out.println("Artikel Kedua : " + ArtikelKedua.getText());

        WebElement CategoryKedua = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath(loc.getProperty("CategoryKedua"))));
        System.out.println("Category Kedua : " + CategoryKedua.getText());

        WebElement ArtikelKetiga = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath(loc.getProperty("ArtikelKetiga"))));
        System.out.println("Artikel Ketiga : " + ArtikelKetiga.getText());

        WebElement CategoryKetiga = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath(loc.getProperty("CategoryKetiga"))));
        System.out.println("Category Ketiga : " + CategoryKetiga.getText());
    }
}
