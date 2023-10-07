package Utility;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.logging.Level;
import java.util.logging.Logger;
public class BaseDriver {
    public static WebDriver driver; // SingletonDriver method
    public static WebDriverWait wait;
    public static JavascriptExecutor js;
    public static Actions aksiyonlar;



    static {
        Logger logger= Logger.getLogger("");
        logger.setLevel(Level.SEVERE);

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        driver.get("https://demo.nopcommerce.com/");
        MyFunction.Wait(2);
        js = (JavascriptExecutor) driver;
        aksiyonlar = new Actions(driver);
    }

    public static void BekleveKapat() {
        MyFunction.Wait(5);
        driver.quit();
    }
}