import Utility.*;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.util.ArrayList;
import java.util.List;


public class TestCase extends BaseDriver {
    String desktopURL="https://demo.nopcommerce.com/desktops";
    ListElement le=new ListElement();
    SingleElement element=new SingleElement();

    @Test
    public void Register(){
        driver.get("https://demo.nopcommerce.com/");
        WebElement register = driver.findElement(By.cssSelector("[class='ico-register']"));
        register.click();
        MyFunction.Wait(1);

        WebElement gender = driver.findElement(By.id("gender-male"));
        gender.click();
        MyFunction.Wait(1);

        WebElement firstName = driver.findElement(By.id("FirstName"));
        firstName.sendKeys("Team");
        MyFunction.Wait(1);

        WebElement lastName = driver.findElement(By.id("LastName"));
        lastName.sendKeys("Dört");
        MyFunction.Wait(1);

        WebElement webDay = driver.findElement(By.name("DateOfBirthDay"));
        WebElement webMonth = driver.findElement(By.name("DateOfBirthMonth"));
        WebElement webYear = driver.findElement(By.name("DateOfBirthYear"));

        Select day = new Select(webDay);
        Select month = new Select(webMonth);
        Select year = new Select(webYear);

        day.selectByVisibleText("04");
        month.selectByValue("05");
        year.selectByVisibleText("2000");
        MyFunction.Wait(1);


        WebElement email = driver.findElement(By.name("Email"));
        email.sendKeys("testingteam4@outlook.com");
        MyFunction.Wait(1);

        WebElement password = driver.findElement(By.id("Password"));
        password.sendKeys("Testing.123");
        MyFunction.Wait(1);

        WebElement confirmPassword = driver.findElement(By.id("ConfirmPassword"));
        confirmPassword.sendKeys("Testing.123");
        MyFunction.Wait(1);

        WebElement registerButton = driver.findElement(By.id("register-button"));
        registerButton.click();
        MyFunction.Wait(1);

        WebElement result = driver.findElement(By.cssSelector("[class='result']"));
        result.getText();
        Assert.assertTrue(result.getText().contains("Your"));

        WebElement continueSignout = driver.findElement(By.cssSelector("[class='button-1 register-continue-button']"));
        continueSignout.click();
        MyFunction.Wait(1);
    }
    @Test
    public void Login(){
        driver.get("https://demo.nopcommerce.com/");
        MyFunction.Wait(1);

        WebElement login = driver.findElement(By.cssSelector("[class='ico-login']"));
        login.click();
        MyFunction.Wait(1);

        WebElement loginEmail = driver.findElement(By.name("Email"));
        loginEmail.sendKeys("testingteam4@outlook.com");
        MyFunction.Wait(1);

        WebElement loginPassword = driver.findElement(By.name("Password"));
        loginPassword.sendKeys("Testing.123");
        MyFunction.Wait(1);

        WebElement loginButton = driver.findElement(By.cssSelector("[class='button-1 login-button']"));
        loginButton.click();
        MyFunction.Wait(1);

        WebElement myAcount = driver.findElement(By.cssSelector("[class='ico-account']"));
        myAcount.getText();
        Assert.assertTrue(myAcount.getText().contains("My"));

    }
    @Test
    public void Negative_And_Positive_Login_Combinations(){

    }
    @Test
    public void Tab_Menu_Control(){
       //anasayfa olduğumdan emin oldum.
        driver.get("https://demo.nopcommerce.com/");
        WebElement e = driver.findElement(By.xpath("//a[@class='ico-login']"));

        SoftAssert _softAssert=new SoftAssert();
         _softAssert.assertTrue(e.getText().toLowerCase().contains("log in"),"eşleşmiyor");

         //sayfa menüsünün bulunduğu ve listelendiğini doğrulama

        List<String> menuExpectedList= new ArrayList<>();
        menuExpectedList.add("Computers");
        menuExpectedList.add("Electronics");
        menuExpectedList.add("Apparel");
        menuExpectedList.add("Digital downloads");
        menuExpectedList.add("Books");
        menuExpectedList.add("Jewelry");
        menuExpectedList.add("Gift Cards");

        List<WebElement> menuActualList=driver.findElements(By.cssSelector("[class='top-menu notmobile']>li"));

        for (int i = 0; i < menuExpectedList.size(); i++) {
        _softAssert.assertEquals(menuActualList.get(i).getText(),
                    menuExpectedList.get(i),
                    "Menu beklendiği gibi değil");
        }
    }
    @Test
    public void Control_of_Products_in_Tab_Menu(){

    }
    @Test
    public void  Gift_Ordering_Process(){
        ElementsPage locatorList = new ElementsPage();
        SoftAssert _softAssert=new SoftAssert();

        String red = "Enter valid";
        String onay = "The product has been added to your shopping cart";

        locatorList.giftCards.click();
        locatorList.addToCart.click();
        locatorList.receiptName.sendKeys("Rocky");
        locatorList.receiptEmail.sendKeys("RockyBalboa@gmail.com");
        locatorList.senderName.sendKeys("Arnold");
        locatorList.senderEmail.sendKeys("ArnoldSchwarzenegger@gmail.com");
        locatorList.message.sendKeys("There is no tomorrow");
        MyFunction.Wait(1);
        locatorList.addToCart2.click();

        _softAssert.assertEquals(locatorList.enterValid.getText(), red,"Gerekli alanları doldurun");
        MyFunction.Wait(1);
        Assert.assertEquals(locatorList.shoppingCart.getText(),onay,"Onay mesajı alınamadı");
    }
    @Test
    public void Computer_Ordering_Process() {

    }
    @Test
    public void Parameter_Search_Process(){

    }
}

            






