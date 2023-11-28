package my_accounts;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.Utility;

/**
 * Create package myaccounts
 * 1. Create the class MyAccountsTest
 * 1.1 create method with name "selectMyAccountOptions" it has one parameter name
 * "option" of type string
 * 1.2 This method should click on the options whatever name is passed as parameter.
 * (Hint: Handle List of Element and Select options)
 * <p>
 * Write the following test
 * 1. Test name verifyUserShouldNavigateToRegisterPageSuccessfully()
 * 1.1 Clickr on My Account Link.
 * 1.2 Call the method “selectMyAccountOptions” method and pass the parameter
 * “Register”
 * 1.3 Verify the text “Register Account”.
 * <p>
 * <p>
 * 2. Test name verifyUserShouldNavigateToLoginPageSuccessfully()
 * 2.1 Clickr on My Account Link.
 * 2.2 Call the method “selectMyAccountOptions” method and pass the parameter
 * “Login”
 * 2.3 Verify the text “Returning Customer”.
 * <p>
 * <p>
 * 3. Test name verifyThatUserRegisterAccountSuccessfully()
 * 3.1 Clickr on My Account Link.
 * 3.2 Call the method “selectMyAccountOptions” method and pass the parameter
 * “Register”
 * 3.3 Enter First Name
 * 3.4 Enter Last Name
 * 3.5 Enter Email
 * 3.6 Enter Telephone
 * 3.7 Enter Password
 * 3.8 Enter Password Confirm
 * 3.9 Select Subscribe Yes radio button
 * 3.10 Click on Privacy Policy check box
 * 3.11 Click on Continue button
 * 3.12 Verify the message “Your Account Has Been Created!”
 * 3.13 Click on Continue button
 * 3.14 Clickr on My Account Link.
 * 3.15 Call the method “selectMyAccountOptions” method and pass the parameter
 * “Logout”
 * 3.16 Verify the text “Account Logout”
 * 3.17 Click on Continue button
 * <p>
 * <p>
 * 4. Test name verifyThatUserShouldLoginAndLogoutSuccessfully()
 * 4.1 Clickr on My Account Link.
 * 4.2 Call the method “selectMyAccountOptions” method and pass the parameter
 * “Login”
 * 4.3 Enter Email address
 * 4.4 Enter Last Name
 * 4.5 Enter Password
 * 4.6 Click on Login button
 * 4.7 Verify text “My Account”
 * 4.8 Clickr on My Account Link.
 * 4.9 Call the method “selectMyAccountOptions” method and pass the parameter
 * “Logout”
 * 4.10 Verify the text “Account Logout”
 * 4.11 Click on Continue button
 */
public class My_Accounts_Test extends Utility {

    String baseUrl = " http://tutorialsninja.com/demo/index.php?";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    public void selectMyAccountOptions(String name) {

        // This method should click on the options whatever name is passed as parameter.
        clickOnElement(By.xpath("//a[normalize-space()=" + name + "]"));
    }

    @Test
    public void verifyUserShouldNavigateToRegisterPageSuccessfully() {

        //1.1 Clickr on My Account Link.
        clickOnElement(By.xpath("//span[normalize-space()='My Account']"));

        //* 1.2 Call the method “selectMyAccountOptions” method and pass the parameter “Register”
        selectMyAccountOptions("Register");

        //1.3 Verify the text “Register Account”.
        String exText = "Register Account";
        String acText = getTextFromElement(By.xpath("//h1[text()='Register Account']"));
        Assert.assertEquals(exText, acText);
    }

    @Test
    public void verifyThatUserRegisterAccountSuccessfully() {

        //3.1 Clickr on My Account Link.
        clickOnElement(By.xpath("//span[normalize-space()='My Account']"));

        // * 3.2 Call the method “selectMyAccountOptions” method and pass the parameter “Register”
        clickOnElement(By.xpath("//a[normalize-space()='Register']"));

// * 3.3 Enter First Name
        sendTextToElement(By.id("input-firstname"), "Neel");

        // * 3.4 Enter Last Name
        sendTextToElement(By.id("input-lastname"), "Birla");

        // * 3.5 Enter Email
        sendTextToElement(By.id("input-email"), "neel123@gmail.com");

        //* 3.6 Enter Telephone
        sendTextToElement(By.id("input-telephone"), "+44 7707653428");

        //* 3.7 Enter Password
        sendTextToElement(By.id("input-password"), "Neel123");

        //* 3.8 Enter Password Confirm
        sendTextToElement(By.id("input-confirm"), "Neel123");

        // * 3.9 Select Subscribe Yes radio button
        clickOnElement(By.xpath("//input[@id='input-confirm']"));

        // * 3.10 Click on Privacy Policy check box
        clickOnElement(By.xpath("//input[@name='agree']"));

// * 3.11 Click on Continue button
        clickOnElement(By.xpath("//input[@value='Continue']"));

        //* 3.12 Verify the message “Your Account Has Been Created!”
        String exMessage = "Your Account Has Been Created!";
        String acMessage = getTextFromElement(By.xpath("//h1[text()='Your Account Has Been Created!']"));
        Assert.assertEquals(exMessage, acMessage);

        //* 3.13 Click on Continue button
        clickOnElement(By.xpath("//a[text()='Continue']"));

        //*3.14 Clickr on My Account Link.
        clickOnElement(By.xpath("//span[normalize-space()='My Account']"));

        //* 3.15 Call the method “selectMyAccountOptions” method and pass the parameter “Logout”
        clickOnElement(By.xpath("//ul[@class='dropdown-menu dropdown-menu-right']//li[5]/a"));

        // 3.16 Verify the text “Account Logout”
        String exText = "Account Logout";
        String acText = getTextFromElement(By.xpath("//h1[text()='Account Logout']"));
        Assert.assertEquals(exText, acText);

        //3.17 Click on Continue button
        clickOnElement(By.xpath("//a[normalize-space()='Continue']"));
    }

    @Test
    public void verifyThatUserShouldLoginAndLogoutSuccessfully() {

        //4.1 Clickr on My Account Link.
        clickOnElement(By.xpath("//span[normalize-space()='My Account']"));

        // * 4.2 Call the method “selectMyAccountOptions” method and pass the parameter “Login”
        clickOnElement(By.xpath("//a[text()='Login']"));

        // 4.3 Enter Email address
        sendTextToElement(By.id("input-email"),"Neel123@gmail.com");

        //* 4.4 Enter Last Name

        //* 4.5 Enter Password
        sendTextToElement(By.id("input-password"),"Neel123");

        //* 4.6 Click on Login button
        clickOnElement(By.xpath("//input[@value='Login']"));

        // * 4.7 Verify text “My Account”
        String exText = "My Account";
        String acText = getTextFromElement(By.xpath("//h2[text()='My Account']"));
        Assert.assertEquals(exText, acText);

        //* 4.8 Clickr on My Account Link.
        clickOnElement(By.xpath("//span[text()='My Account']"));

        //* 4.9 Call the method “selectMyAccountOptions” method and pass the parameter “Logout”
        clickOnElement(By.xpath("//ul[@class='dropdown-menu dropdown-menu-right']//a[normalize-space()='Logout']"));

        //* 4.10 Verify the text “Account Logout”
        String exText1 = "Account Logout";
        String acText1= getTextFromElement(By.xpath("//h1[text()='Account Logout']"));
        Assert.assertEquals(exText1, acText1);

        //* 4.11 Click on Continue button
        clickOnElement(By.xpath("//a[normalize-space()='Continue']"));
    }


    @After
    public void tearDown() {
        closeBrowser();
    }
}
