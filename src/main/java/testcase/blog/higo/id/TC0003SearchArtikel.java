package testcase.blog.higo.id;

import base.BaseTest1;
import net.bytebuddy.asm.Advice;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.security.Key;
import java.time.Duration;

public class TC0003SearchArtikel extends BaseTest1 {
    @Test
    public static void SearchArtikel() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement LogoHigo = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath(loc.getProperty("LogoHigo"))));
        LogoHigo.isDisplayed();

        WebElement FieldSearch = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath(loc.getProperty("FieldSearch"))));
        FieldSearch.sendKeys("Alasan");
        FieldSearch.sendKeys(Keys.ENTER);

        WebElement ArtikelPertamaAfterSearch = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath(loc.getProperty("ArtikelPertamaAfterSearch"))));
        System.out.println("Artikel Pertama After Search: " + ArtikelPertamaAfterSearch.getText());

        WebElement ArtikelKeduaAfterSearch = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath(loc.getProperty("ArtikelKeduaAfterSearch"))));
        System.out.println("Artikel Kedua After Search: " + ArtikelKeduaAfterSearch.getText());

        WebElement ArtikelKetigaAfterSearch = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath(loc.getProperty("ArtikelKetigaAfterSearch"))));
        System.out.println("Artikel Ketiga After Search: " + ArtikelKetigaAfterSearch.getText());
    }
}

