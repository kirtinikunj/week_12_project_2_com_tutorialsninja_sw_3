package desktops;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.Utility;

/**
 * . Create class “DesktopsTest”
 * Write the following Test:
 * 1.Test name verifyProductArrangeInAlphaBaticalOrder()
 * 1.1 Mouse hover on Desktops Tab.and click
 * 1.2 Click on “Show All Desktops”
 * 1.3 Select Sort By position "Name: Z to A"
 * 1.4 Verify the Product will arrange in Descending order.
 * <p>
 * 2. Test name verifyProductAddedToShoppingCartSuccessFully()
 * 2.1 Mouse hover on Currency Dropdown and click
 * 2.2 Mouse hover on £Pound Sterling and click
 * 2.3 Mouse hover on Desktops Tab.
 * 2.4 Click on “Show All Desktops”
 * 2.5 Select Sort By position "Name: A to Z"
 * 2.6 Select product “HP LP3065”
 * 2.7 Verify the Text "HP LP3065"
 * 2.8 Select Delivery Date "2023-11-27"
 * 2.9.Enter Qty "1” using Select class.
 * 2.10 Click on “Add to Cart” button
 * 2.11 Verify the Message “Success: You have added HP LP3065 to your shopping cart!”
 * 2.12 Click on link “shopping cart” display into success message
 * 2.13 Verify the text "Shopping Cart"
 * 2.14 Verify the Product name "HP LP3065"
 * 2.15 Verify the Delivery Date "2023-11-27"
 * 2.16 Verify the Model "Product21"
 * 2.17 Verify the Todat "£74.73"
 */
public class Desktops_Test extends Utility {

    String baseUrl = " http://tutorialsninja.com/demo/index.php?";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void verifyProductArrangeInAlphaBaticalOrder() {

        // 1.1 Mouse hover on Desktops Tab.and click
        mouseHoverToElement(By.xpath("//a[text()='Desktops']"));
        clickOnElement(By.xpath("//a[text()='Desktops']"));

        // 1.2 Click on “Show All Desktops”
        clickOnElement(By.xpath("//a[text()='Show AllDesktops']"));

        // 1.3 Select Sort By position "Name: Z to A"
        clickOnElement(By.id("input-sort"));
        selectByVisibleFromDropDown(By.id("input-sort"), "Name (Z - A)");

        // 1.4 Verify the Product will arrange in Descending order.
    }

    @Test
    public void verifyProductAddedToShoppingCartSuccessFully() {

        //2.1 Mouse hover on Currency Dropdown and click
        mouseHoverToElement(By.xpath("//i[@class='fa fa-caret-down']"));
        clickOnElement(By.xpath("//i[@class='fa fa-caret-down']"));

        //2.2 Mouse hover on £Pound Sterling and click
        mouseHoverToElement(By.xpath("//button[text()='£Pound Sterling']"));
        clickOnElement(By.xpath("//button[text()='£Pound Sterling']"));

        //2.3 Mouse hover on Desktops Tab.
        mouseHoverToElement(By.xpath("//a[text()='Desktops']"));

        // 2.4 Click on “Show All Desktops”
        clickOnElement(By.xpath("//a[text()='Show AllDesktops']"));

        //2.5 Select Sort By position "Name: A to Z"
        selectByVisibleFromDropDown(By.id("input-sort"),"Name (A - Z)");

        //2.6 Select product “HP LP3065”
        clickOnElement(By.xpath("//a[text()='HP LP3065']"));

        //2.7 Verify the Text "HP LP3065"
        String exText="HP LP3065";
        String acText=getTextFromElement(By.xpath("//h1[text()='HP LP3065']"));
        Assert.assertEquals(exText,acText);

        //2.8 Select Delivery Date "2023-11-27"
        String year="2023";
        String month="11";
        String date="27";


        // 2.9.Enter Qty "1” using Select class.
        selectByValueFromDropDown(By.id("input-quantity"),"2");

        //2.10 Click on “Add to Cart”button
        clickOnElement(By.id("button-cart"));

        //2.11 Verify the Message “Success: You have added HP LP3065 to your shopping cart !”
        String exMessage="Success: You have added HP LP3065 to your shopping cart!";
        String acMessage=getTextFromElement(By.xpath("//div[@class='alert alert-success alert-dismissible']"));
        Assert.assertEquals(exMessage,acMessage);

        //2.12 Click on link “shopping cart”display into success message
        clickOnElement(By.xpath("//a[text()='shopping cart']"));

        //2.13 Verify the text "Shopping Cart"
        String exText1="Shopping Cart";
        String acText1=getTextFromElement(By.xpath("//a[text()='Shopping Cart']"));
        Assert.assertEquals(acText1,acText1);

        //2.14 Verify the Product name "HP LP3065"
        String exProduct="HP LP3065";
        String acProduct=getTextFromElement(By.xpath("//body[1]/div[2]/div[1]/div[1]/form[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/a[1]"));
        Assert.assertEquals(exProduct,acProduct);

        // 2.15 Verify the Delivery Date "2023-11-27"


        // 2.16 Verify the Model "Product21"
        //2.17 Verify the Todat "£74.73"
    }

    @After
    public void tearDown() {
        closeBrowser();
    }

}
