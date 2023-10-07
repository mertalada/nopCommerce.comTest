import Utility.*;
import javafx.scene.Group;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.asserts.SoftAssert;

import java.util.ArrayList;
import java.util.List;


public class TestCase extends BaseDriver {
    Parent parent=new Parent();
    String desktopURL="https://demo.nopcommerce.com/desktops";
    ListElement le=new ListElement();
    SingleElement element=new SingleElement();

     @Test(groups = {"UserRegistiration", "Smoke"},priority = 1)
    public void Register(){


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

        day.selectByVisibleText("1");
        month.selectByValue("1");
        year.selectByVisibleText("2023");
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
    @Test(groups = {"LoginTest", "Smoke"},priority = 2)
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
    @Test(groups = {"Smoke Test", "LoginTest"},priority = 3,dataProvider = "Datas")
    public void Negative_And_Positive_Login_Combinations(String mail, String password){
        parent.myClick(le.loginButton);
        parent.mySendKeys(le.logInMail, mail);
        parent.mySendKeys(le.logInPassword, password);
        parent.myClick(le.getLogIn);

        List<WebElement> logIn = driver.findElements(By.cssSelector("[class='message-error validation-summary-errors'] ul li"));
        if (logIn.size()>0){
            parent.verifyContainsText(le.unSucLogIn, "No customer account found");
        } else {
            parent.verifyContainsText(le.myAccount, "My account");
        }

    }
      @Test(groups = {"UI Testing", "TAB Menu"},priority = 4)
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
    @Test(groups = {"UI Testing", "TAB Menu"},priority = 5)
    public void Control_of_Products_in_Tab_Menu(){

        aksiyonlar.moveToElement(le.Computer).build().perform();
        parent.myClick(le.Desk);
        wait.until(ExpectedConditions.visibilityOf(le.dogrulama));

        aksiyonlar.moveToElement(le.Computer).build().perform();
        parent.myClick(le.NoteBook);
        wait.until(ExpectedConditions.visibilityOf(le.dogrulama));

        aksiyonlar.moveToElement(le.Computer).build().perform();
        parent.myClick(le.Soft);
        wait.until(ExpectedConditions.visibilityOf(le.dogrulama));

        aksiyonlar.moveToElement(le.Electronics).build().perform();
        parent.myClick(le.Camera);
        wait.until(ExpectedConditions.visibilityOf(le.dogrulama));

        aksiyonlar.moveToElement(le.Electronics).build().perform();
        parent.myClick(le.phone);
        wait.until(ExpectedConditions.visibilityOf(le.dogrulama));

        aksiyonlar.moveToElement(le.Electronics).build().perform();
        parent.myClick(le.others);
        wait.until(ExpectedConditions.visibilityOf(le.dogrulama));

        aksiyonlar.moveToElement(le.App).build().perform();
        parent.myClick(le.Shoes);
        wait.until(ExpectedConditions.visibilityOf(le.dogrulama));

        aksiyonlar.moveToElement(le.App).build().perform();
        parent.myClick(le.Clot);
        wait.until(ExpectedConditions.visibilityOf(le.dogrulama));

        aksiyonlar.moveToElement(le.App).build().perform();
        parent.myClick(le.Acces);
        wait.until(ExpectedConditions.visibilityOf(le.dogrulama));

        le.Digital.click();
        wait.until(ExpectedConditions.visibilityOf(le.dogrulama));

        le.book.click();
        wait.until(ExpectedConditions.visibilityOf(le.dogrulama));

        le.jewe.click();
        wait.until(ExpectedConditions.visibilityOf(le.dogrulama));

        le.giftcard.click();
        wait.until(ExpectedConditions.visibilityOf(le.dogrulama));
    }
    @Test(groups = {"UI Testing", "TAB Menu", "Sipariş Testleri"},priority = 6)
    public void  Gift_Ordering_Process(){

        ElementsPage locatorList = new ElementsPage();
        SoftAssert _softAssert=new SoftAssert();

        String red = "Enter valid";
        String onay = "The product has been added to your shopping cart";

        locatorList.giftCards.click();
        locatorList.addToCart.click();
        locatorList.receiptName.sendKeys("Team");
        locatorList.receiptEmail.sendKeys("Testingtem4@outlook.com");
        locatorList.senderName.sendKeys("Dört");
        locatorList.senderEmail.sendKeys("Testingtem4@outlook.com");
        locatorList.message.sendKeys("There is no tomorrow");
        MyFunction.Wait(1);
        locatorList.addToCart2.click();

        _softAssert.assertEquals(locatorList.enterValid.getText(), red,"Gerekli alanları doldurun");
        MyFunction.Wait(1);
        Assert.assertEquals(locatorList.shoppingCart.getText(),onay,"Onay mesajı alınamadı");
    }
    @Test(groups = {"UI Testing", "TAB Menu", "Sipariş Testleri"},priority = 7)
    public void Computer_Ordering_Process() {

        parent.myHover(element.computersMenu);
        parent.myClick(element.desktops);
        Boolean desktopURLAyni=driver.getCurrentUrl().equals(desktopURL);
        Assert.assertTrue(desktopURLAyni,"Desktop sayfasına erişilemedi");
        parent.myClick(element.buildYourOwnComputer);
        parent.myScrollToElement(element.ramBox);
        parent.mySelectbyIndex(element.ramBox,3);
        parent.myClick(element.HDD320);
        parent.myClick(element.addToCart);
        parent.myScrollToElement(element.shoppingCart);
        parent.myClick(element.shoppingCart);
    }
    @Test(groups = {"UI Testing", "Search", "Smoke Test", "Regression"},priority = 8)
    @Parameters("searchText")
    public void Parameter_Search_Process(String searchWord){
        parent.mySendKeys(element.search,searchWord+ Keys.ENTER);
        Assert.assertTrue(element.adobeSearchResult.getAttribute("text")
                .trim().toLowerCase().contains("adobe"), "Aranan bulunamadı");
    }
    @DataProvider
    public Object[][] Datas() {

        Object[][] Data = {
                {"testingteam4@gmail.com", "Test123"},
                {"testingteam4@outlook.com", ""},
                {"testing@outlook.com", "Testing.123"},
                {"teesting4æ@outlook.com", ""},
                {"", ""},
                {"teestingteam@outlook.com", "Testing.123"},
                {"testingteam4@gmail.com", "Testing.123"}
        };
        return Data;
    }
}

            






