package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class BaseTest {
    public static WebDriver driver;
    public static Properties prop = new Properties();
    public static Properties loc = new Properties();
    public  static FileReader fr;
    public  static FileReader fr1;

    @BeforeMethod

    public void setUp() throws IOException {
        if(driver==null){
            FileReader fr = new FileReader("src/test/java/configfiles/config.properties");
            FileReader fr1 = new FileReader("src/test/java/configfiles/locators.properties");

            prop.load(fr);
            loc.load(fr1);
        }
        if (prop.getProperty("browser").equalsIgnoreCase("chrome")){
            driver= new ChromeDriver();
            driver.manage().window().maximize();

            driver.get(prop.getProperty("testurl")); //properties
        } else if (prop.getProperty("browser").equalsIgnoreCase("firefox")) {
            driver=new FirefoxDriver();
            driver.manage().window().maximize();
            driver.get(prop.getProperty("testurl")); //properties
        }
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
        System.out.println("Teardown Successfully");
    }
}
