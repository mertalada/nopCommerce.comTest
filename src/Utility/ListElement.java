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

}
