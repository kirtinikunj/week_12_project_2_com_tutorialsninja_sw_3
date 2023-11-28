package home_page;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.Utility;

/**
 * create class "TopMenuTest"
 * 1.1 create method with name "selectMenu" it has one parameter name "menu" of type
 * string
 * 1.2 This method should click on the menu whatever name is passed as parameter.
 * Write the following Test:
 * 1. verifyUserShouldNavigateToDesktopsPageSuccessfully()
 * 1.1 Mouse hover on “Desktops” Tab and click
 * 1.2 call selectMenu method and pass the menu = “Show All Desktops”
 * 1.3 Verify the text ‘Desktops’
 * <p>
 * 2. verifyUserShouldNavigateToLaptopsAndNotebooksPageSuccessfully()
 * 2.1 Mouse hover on “Laptops & Notebooks” Tab and click
 * 2.2 call selectMenu method and pass the menu = “Show All Laptops & Notebooks”
 * 2.3 Verify the text ‘Laptops & Notebooks’
 * <p>
 * 3. verifyUserShouldNavigateToComponentsPageSuccessfully()
 * 3.1 Mouse hover on “Components” Tab and click
 * 3.2 call selectMenu method and pass the menu = “Show All Components”
 * 3.3 Verify the text ‘Components’
 */
public class Top_Menu_Test extends Utility {

    String baseUrl = " http://tutorialsninja.com/demo/index.php?";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    public void selectMenu(String menu) {

        //This method should click on the menu whatever name is passed as parameter
        clickOnElement(By.xpath("//a[normalize-space()=" + menu + "]"));
    }

    @Test
    public void verifyUserShouldNavigateToDesktopsPageSuccessfully() {

        //1.1 Mouse hover on “Desktops” Tab and click
        mouseHoverToElement(By.xpath("//a[text()='Desktops']"));
        clickOnElement(By.xpath("//a[text()='Desktops']"));

        //1.2 call selectMenu method and pass the menu = “Show All Desktops”
        selectMenu("Show AllDesktops");

        //1.3 Verify the text ‘Desktops’
        String expText = "Desktops";
        String actText = getTextFromElement(By.xpath("//h2"));
        Assert.assertEquals(expText, actText);
    }

    @Test
    public void verifyUserShouldNavigateToLaptopsAndNotebooksPageSuccessfully() {
        //2.1 Mouse hover on “Laptops & Notebooks” Tab and click
        mouseHoverToElement(By.xpath("//a[text()='Laptops & Notebooks']"));
        clickOnElement(By.xpath("//a[text()='Laptops & Notebooks']"));

        // 2.2 call selectMenu method and pass the menu = “Show All Laptops & Notebooks”
        selectMenu("Show All Laptops & Notebooks");

        // 2.3 Verify the text ‘Laptops & Notebooks’
        String expText = "Laptops & Notebooks";
        String actText = getTextFromElement(By.xpath("//h2"));
        Assert.assertEquals(expText, actText);
    }

    @Test
    public void verifyUserShouldNavigateToComponentsPageSuccessfully() {

        // 3.1 Mouse hover on “Components” Tab and click
        mouseHoverToElement(By.xpath("//a[text()='Components']"));
        clickOnElement(By.xpath("//a[text()='Components']"));

        // 3.2 call selectMenu method and pass the menu = “Show All Components”
        selectMenu("Show All Components");

        // 3.3 Verify the text ‘Components’
        String expText = "Components";
        String actText = getTextFromElement(By.xpath("//h2"));
        Assert.assertEquals(expText, actText);
    }

    @After
    public void tearDown() {
        closeBrowser();
    }
}
