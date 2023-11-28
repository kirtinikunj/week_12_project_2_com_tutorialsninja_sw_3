package laptops_and_notebooks;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.Utility;

/**
 * ● Create package laptopsandnotebooks
 * Create the class LaptopsAndNotebooksTest
 * Write the following test
 * 1. Test name verifyProductsPriceDisplayHighToLowSuccessfully()
 * 1.1 Mouse hover on Laptops & Notebooks Tab.and click
 * 1.2 Click on “Show All Laptops & Notebooks”
 * 1.3 Select Sort By "Price (High > Low)"
 * 1.4 Verify the Product price will arrange in High to Low order.
 * <p>
 * 2. Test name verifyThatUserPlaceOrderSuccessfully()
 * 2.1 Mouse hover on Laptops & Notebooks Tab and click
 * 2.2 Click on “Show All Laptops & Notebooks”
 * 2.3 Select Sort By "Price (High > Low)"
 * 2.4 Select Product “MacBook”
 * 2.5 Verify the text “MacBook”
 * 2.6 Click on ‘Add To Cart’ button
 * 2.7 Verify the message “Success: You have added MacBook to your shopping cart!”
 * 2.8 Click on link “shopping cart” display into success message
 * 2.9 Verify the text "Shopping Cart"
 * 2.10 Verify the Product name "MacBook"
 * 2.11 Change Quantity "2"
 * 2.12 Click on “Update” Tab
 * 2.13 Verify the message “Success: You have modified your shopping cart!”
 * 2.14 Verify the Total £737.45
 * 2.15 Click on “Checkout” button
 * 2.16 Verify the text “Checkout”
 * 2.17 Verify the Text “New Customer”
 * 2.18 Click on “Guest Checkout” radio button
 * 2.19 Click on “Continue” tab
 * 2.20 Fill the mandatory fields
 * 2.21 Click on “Continue” Button
 * 2.22 Add Comments About your order into text area
 * 2.23 Check the Terms & Conditions check box
 * 2.24 Click on “Continue” button
 * 2.25 Verify the message “Warning: Payment method required!”
 */
public class Laptops_And_Notebooks_Test extends Utility {

    String baseUrl = " http://tutorialsninja.com/demo/index.php?";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void verifyProductsPriceDisplayHighToLowSuccessfully() {

        //1.1 Mouse hover on Laptops & Notebooks Tab.and click
        mouseHoverToElement(By.xpath("//a[text()='Laptops & Notebooks']"));
        clickOnElement(By.xpath("//a[text()='Laptops & Notebooks']"));

        //* 1.2 Click on “Show All Laptops & Notebooks”
        clickOnElement(By.xpath("//a[text()='Show AllLaptops & Notebooks']"));

        //* 1.3 Select Sort By "Price (High > Low)"
        selectByVisibleFromDropDown(By.id("input-sort"), "Price (High > Low)");

        // * 1.4 Verify the Product price will arrange in High to Low order.
    }

    @Test
    public void verifyThatUserPlaceOrderSuccessfully() {

        //2.1 Mouse hover on Laptops & Notebooks Tab and click
        mouseHoverToElement(By.xpath("//a[text()='Laptops & Notebooks']"));
        clickOnElement(By.xpath("//a[text()='Laptops & Notebooks']"));

        //* 2.2 Click on “Show All Laptops & Notebooks”
        clickOnElement(By.xpath("//a[text()='Show AllLaptops & Notebooks']"));

        //* 2.3 Select Sort By "Price (High > Low)"
        selectByVisibleFromDropDown(By.id("input-sort"), "Price (High > Low)");

        //   * 2.4 Select Product “MacBook”
        clickOnElement(By.xpath("//a[text()='MacBook']"));

// * 2.5 Verify the text “MacBook”
        String exText="MacBook";
        String acText=getTextFromElement(By.xpath("//a[text()='MacBook']"));
        Assert.assertEquals(exText,acText);

// * 2.6 Click on ‘Add To Cart’ button
        clickOnElement(By.xpath("//body[1]/div[2]/div[1]/div[1]/div[4]/div[4]/div[1]/div[2]/div[2]/button[1]/span[1]"));

        //* 2.7 Verify the message “Success: You have added MacBook to your shopping cart!”
        String exMessage="Success: You have added MacBook to your shopping cart!";
        String acMessage=getTextFromElement(By.xpath("//div[@class='alert alert-success alert-dismissible']"));
        Assert.assertEquals(exMessage,acMessage);

        //* 2.8 Click on link “shopping cart” display into success message
        clickOnElement(By.xpath("//a[text()='shopping cart']"));

// * 2.9 Verify the text "Shopping Cart"
        String exText1="Shopping Cart";
        String acText1=getTextFromElement(By.xpath("//a[text()='Shopping Cart']"));
        Assert.assertEquals(exText1,acText1);

        //* 2.10 Verify the Product name "MacBook"
        String exProduct="MacBook";
        String acProduct=getTextFromElement(By.xpath("//body[1]/div[2]/div[1]/div[1]/form[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/a[1]"));
        Assert.assertEquals(exProduct,acProduct);

        //  * 2.11 Change Quantity "2"
        sendTextToElement(By.xpath("//input[@name='quantity[80061]']"),"2");

        // * 2.12 Click on “Update” Tab
        clickOnElement(By.xpath("//i[@class='fa fa-refresh']"));

        // * 2.13 Verify the message “Success: You have modified your shopping cart!”
        String exMessage1="Success: You have modified your shopping cart!";
        String acMessage1=getTextFromElement(By.xpath("//div[@class='alert alert-success alert-dismissible']"));
        Assert.assertEquals(exMessage1,acMessage1);

        //* 2.14 Verify the Total £737.45
        String exTotal="£737.45";
        String acTotal=getTextFromElement(By.xpath("//body[1]/div[2]/div[2]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[4]/td[2]"));
        Assert.assertEquals(exTotal,acTotal);

        //  * 2.15 Click on “Checkout” button
        clickOnElement(By.xpath("//a[text()='Checkout']"));

        // * 2.16 Verify the text “Checkout”
        String exText2="Checkout";
        String acText2=getTextFromElement(By.xpath("//h1[text()='Checkout']"));
        Assert.assertEquals(exText2,acText2);

        //* 2.17 Verify the Text “New Customer”
        String exText3="New Customer";
        String acText3=getTextFromElement(By.xpath("//h2[text()='New Customer']"));
        Assert.assertEquals(exText3,acText3);

        //* 2.18 Click on “Guest Checkout” radio button
        clickOnElement(By.xpath("//input[@value='guest']"));

        //* 2.19 Click on “Continue” tab
        clickOnElement(By.xpath("//input[@id='button-account']"));

        // * 2.20 Fill the mandatory fields
        sendTextToElement(By.id("input-payment-firstname"),"Nill");
        sendTextToElement(By.id("input-payment-lastname"),"Poddar");
        sendTextToElement(By.id("input-payment-email"),"nill123@gmail.com");
        sendTextToElement(By.id("input-payment-telephone"),"+44 7707654432");
        sendTextToElement(By.id("input-payment-password"),"nill1234");
        sendTextToElement(By.id("input-payment-confirm"),"nill1234");
        sendTextToElement(By.id("input-payment-address-1"),"21,oxford Street");
        sendTextToElement(By.id("input-payment-city"),"London");
        sendTextToElement(By.id("input-payment-postcode"),"LA1 1QL");
        selectByValueFromDropDown(By.id("input-payment-country"),"222");
        selectByValueFromDropDown(By.id("input-payment-zone"),"3581");

        //* 2.21 Click on “Continue” Button
        clickOnElement(By.xpath("//input[@name='agree']"));
        clickOnElement(By.id("button-register"));

        //* 2.22 Add Comments About your order into text area
        clickOnElement(By.id("button-payment-address"));
        sendTextToElement(By.xpath("//textarea"),"Hello, can i get discount??");

        //* 2.23 Check the Terms & Conditions check box
        clickOnElement(By.id("button-shipping-method"));
        clickOnElement(By.xpath("//input[@name='agree']"));

        // * 2.24 Click on “Continue” button
        clickOnElement(By.xpath("//input[@id='button-payment-method']"));

        // * 2.25 Verify the message “Warning: Payment method required!”
        String exMessage2="Warning: Payment method required!";
        String acMessage2=getTextFromElement(By.xpath("//h2[text()='New Customer']"));
        Assert.assertEquals(exMessage2,acMessage2);
    }

    @After
    public void tearDown() {
        closeBrowser();
    }
}
