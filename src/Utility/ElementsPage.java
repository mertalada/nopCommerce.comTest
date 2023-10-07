package Utility;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ElementsPage{
    public ElementsPage() {
        PageFactory.initElements(BaseDriver.driver, this);
    }
    @FindBy(partialLinkText = "Gift")
    public WebElement giftCards;


    @FindBy(css = "[class='item-box']")
    public WebElement itemBox;

    @FindBy(css = "[class='recipient-name']")
    public WebElement receiptName;

    @FindBy(css = "[class='recipient-email']")
    public WebElement receiptEmail;

    @FindBy(css = "[class='sender-name']")
    public WebElement senderName;

    @FindBy(css = "[class='sender-email']")
    public WebElement senderEmail;

    @FindBy(css = "[class='message']")
    public WebElement message;

    @FindBy(css = "[class='button-2 product-box-add-to-cart-button']")
    public WebElement addToCart;

    @FindBy(css = "[id='add-to-cart-button-43']")
    public WebElement addToCart2;

    @FindBy(css = "[class='content']")
    public WebElement enterValid;

    @FindBy(css = "[class='bar-notification success']")
    public WebElement shoppingCart;


}

