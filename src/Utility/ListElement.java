package Utility;

import Utility.Parent;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import javax.xml.bind.Element;
import java.util.List;

public class ListElement extends Parent {
    @FindBy(xpath = "//*[@class='top-menu notmobile']/li")
    public List<WebElement> topMenu;
    @FindBy(css = "input[name='product_attribute_3']")
    public List<WebElement> HDDCheckBox;
    @FindBy(xpath = "//a[@class='ico-register']")
    public WebElement register;

    @FindBy(xpath = "//span[@class='male']/input")
    public WebElement genderRadio;

    @FindBy(xpath = "//input[@id='FirstName']")
    public WebElement firstNameInput;

    @FindBy(xpath = "//input[@id='LastName']")
    public WebElement lastNameInput;

    @FindBy(xpath = "//select[@name='DateOfBirthDay']")
    public WebElement birthDay;

    @FindBy(xpath = "//select[@name='DateOfBirthMonth']")
    public WebElement birthMonth;

    @FindBy(xpath = "//select[@name='DateOfBirthYear']")
    public WebElement birthYear;

    @FindBy(xpath = "//input[@id='Email']")
    public WebElement emailInput;

    @FindBy(xpath = "//input[@id='Password']")
    public WebElement passwordInput;

    @FindBy(xpath = "//input[@id='ConfirmPassword']")
    public WebElement conPassInput;

    @FindBy(xpath = "//button[@id='register-button']")
    public WebElement registerButton;

    @FindBy(xpath = "//div[@class='result']")
    public WebElement registerApplied;

    @FindBy(linkText = "Log in")
    public WebElement loginButton;

    @FindBy(id = "Email")
    public WebElement logInMail;

    @FindBy(id = "Password")
    public WebElement logInPassword;

    @FindBy(xpath = "//button[@class='button-1 login-button']")
    public WebElement getLogIn;

    @FindBy(xpath = "//a[@class='ico-account']")
    public WebElement myAccount;

    @FindBy(xpath = "(//a[text()='Gift Cards '])[1]")
    public WebElement gift;

    @FindBy(xpath = "//a[@href='/50-physical-gift-card']")
    public WebElement card;

    @FindBy(id = "giftcard_44_RecipientName")
    public WebElement reName;

    @FindBy(id = "giftcard_44_SenderName")
    public WebElement name;

    @FindBy(xpath = "//textarea[@id='giftcard_44_Message']")
    public WebElement message;

    @FindBy(id = "add-to-cart-button-44")
    public WebElement giftAdd;

    @FindBy(xpath = "//p[@class='content']/a")
    public WebElement giftVerify;

    @FindBy(xpath = "//a[@href='/computers']")
    public WebElement computers;

    @FindBy(xpath = "//a[@href='/desktops']")
    public WebElement desktops;

    @FindBy(xpath = "//h2[@class='product-title']/a[text()='Build your own computer']")
    public WebElement build;

    @FindBy(id = "product_attribute_2")
    public WebElement ram;

    @FindBy(xpath = "//input[@id='product_attribute_3_7']")
    public WebElement hDD;

    @FindBy(xpath = "//input[@id='product_attribute_4_9']")
    public WebElement radioOS;

    @FindBy(xpath = "//input[@id='product_attribute_5_11']")
    public WebElement software1;

    @FindBy(xpath = "//input[@id='product_attribute_5_12']")
    public WebElement software2;

    @FindBy(css = "[id='add-to-cart-button-1']")
    public WebElement computerAdd;

    @FindBy(xpath = "//p[@class='content']/a")
    public WebElement verifyComputer;
    @FindBy(css = "ul.top-menu.notmobile > li:nth-child(1) > a")
    public WebElement Computer;
    @FindBy(css = "ul.top-menu.notmobile > li:nth-child(1) > ul > li:nth-child(1) > a")
    public WebElement Desk;
    @FindBy(css = "ul.top-menu.notmobile > li:nth-child(1) > ul > li:nth-child(2) > a")
    public WebElement NoteBook;
    @FindBy(css = "ul.top-menu.notmobile > li:nth-child(1) > ul > li:nth-child(3) > a")
    public WebElement Soft;
    @FindBy(css = "ul.top-menu.notmobile > li:nth-child(2) > a")
    public WebElement Electronics;
    @FindBy(css = "ul.top-menu.notmobile > li:nth-child(2) > ul > li:nth-child(1) > a")
    public WebElement Camera;
    @FindBy(css = "ul.top-menu.notmobile > li:nth-child(2) > ul > li:nth-child(2) > a")
    public WebElement phone;
    @FindBy(css = "ul.top-menu.notmobile > li:nth-child(2) > ul > li:nth-child(3) > a")
    public WebElement others;
    @FindBy(css = "ul.top-menu.notmobile > li:nth-child(3) > a")
    public WebElement App;
    @FindBy(css = "ul.top-menu.notmobile > li:nth-child(3) > ul > li:nth-child(1) > a")
    public WebElement Shoes;
    @FindBy(css = "ul.top-menu.notmobile > li:nth-child(3) > ul > li:nth-child(2) > a")
    public WebElement Clot;
    @FindBy(css = "ul.top-menu.notmobile > li:nth-child(3) > ul > li:nth-child(3) > a")
    public WebElement Acces;
    @FindBy(css = "ul.top-menu.notmobile > li:nth-child(4) > a")
    public WebElement Digital;
    @FindBy(css = "ul.top-menu.notmobile > li:nth-child(5) > a")
    public  WebElement book;
    @FindBy(css = "ul.top-menu.notmobile > li:nth-child(6) > a")
    public WebElement jewe;
    @FindBy(css = "ul.top-menu.notmobile > li:nth-child(7) > a")
    public WebElement giftcard;
    @FindBy(css = "div > div.page-title > h1")
    public WebElement dogrulama;
    @FindBy(xpath = "//input[@id='small-searchterms']")
    public WebElement searchStore;
    @FindBy(xpath = "(//a[@href='/adobe-photoshop-cs4'])[2]")
    public WebElement adobeVerify;
    @FindBy(css = "[id='small-search-box-form'] button")
    public WebElement searchButton;

    @FindBy(css = "[class='message-error validation-summary-errors'] ul li")
    public WebElement unSucLogIn;
}

