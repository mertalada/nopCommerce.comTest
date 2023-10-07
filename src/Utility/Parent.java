package Utility;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class Parent {

    Actions actions=new Actions(BaseDriver.driver);
    WebDriverWait wait = new WebDriverWait(BaseDriver.driver, Duration.ofSeconds(20));
    public void myClick(WebElement element) {

        wait.until(ExpectedConditions.visibilityOf(element));
        myScrollToElement(element);
        element.click();

    }
    public void mySendKeys(WebElement element, String yazi) {
        wait.until(ExpectedConditions.visibilityOf(element));
        myScrollToElement(element);
        element.clear();
        element.sendKeys(yazi);
    }

    public void myScrollToElement(WebElement element) {

        JavascriptExecutor js = (JavascriptExecutor) BaseDriver.driver;
        js.executeScript("arguments[0].scrollIntoView(true);",element);

    }

    public void verifyContainsText(WebElement element,String value){
        wait.until(ExpectedConditions.textToBePresentInElement(element,value));
        Assert.assertTrue
                (element.getText().toLowerCase().contains(value.toLowerCase()));
    }
    public void myHover(WebElement element){
        wait.until(ExpectedConditions.visibilityOf(element));
        myScrollToElement(element);
        actions.moveToElement(element).build().perform();

    }
    public void mySelectbyIndex(WebElement element,int rndNumber){
        Select select=new Select(element);
        select.selectByIndex(MyFunction.RandomNumber(rndNumber));

    }
}

