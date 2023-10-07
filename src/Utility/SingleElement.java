package Utility;
import Utility.BaseDriver;
import Utility.MyFunction;
import Utility.Parent;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SingleElement {
    public SingleElement() {
        PageFactory.initElements(BaseDriver.driver,this);
    }
    String randomNumberString=String.valueOf((MyFunction.RandomNumber(2)+2));
    @FindBy(xpath = "(//a[text()='Computers '])[1]")
    public WebElement computersMenu;
    @FindBy(xpath = "(//a[text()='Desktops '])[1]")
    public WebElement desktops;
    @FindBy(linkText = "Build your own computer")
    public WebElement buildYourOwnComputer;
    @FindBy(css = "select[data-attr='2']")
    public WebElement ramBox;
    @FindBy(css = "button[id='add-to-cart-button-1']")
    public WebElement addToCart;
    @FindBy(linkText = "shopping cart")
    public WebElement shoppingCart;
    @FindBy(xpath = "(//*[@name='product_attribute_3'])[1]")
    public WebElement HDD320;
    @FindBy(css = "input[id='small-searchterms']")
    public WebElement search;
    @FindBy(xpath = "//h2/a")
    public WebElement adobeSearchResult;

}
