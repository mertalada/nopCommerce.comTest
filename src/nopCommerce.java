import Utility.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.util.ArrayList;
import java.util.List;


public class nopCommerce extends BaseDriver {

    @Test
    public void nopCommerceTest(){


    }

    @Test
    public void US04(){
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



        }

            


    }



