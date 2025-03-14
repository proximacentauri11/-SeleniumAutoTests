package school.redrover;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import static org.testng.Assert.*;
public class SwagLabsTest {

    @Test

    public void testSwagLabsBranchOne222() throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.saucedemo.com");

        String title = driver.getTitle();
        assertEquals(title, "Swag Labs");

        WebElement username = driver.findElement(By.id("user-name"));
        username.sendKeys("standard_user");

        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("secret_sauce");

        WebElement loginButton = driver.findElement(By.id("login-button"));
        loginButton.click();

        WebElement backpack = driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
        backpack.click();

        WebElement removeBackpack = driver.findElement
                (By.xpath("//button[@class='btn btn_secondary btn_small btn_inventory ']"));
        String getRemoveBackpackText = removeBackpack.getText();
        assertEquals(getRemoveBackpackText, "Remove");
        String color = removeBackpack.getCssValue("border");
        assertEquals(color, "1px solid rgb(226, 35, 26)");

        WebElement cart = driver.findElement(By.xpath("//span[@class='shopping_cart_badge']"));
        String cartSize = cart.getText();
        assertEquals(cartSize, "1");

        WebElement jacket = driver.findElement
                (By.xpath("//button[@id='add-to-cart-sauce-labs-fleece-jacket']"));
        jacket.click();

        assertEquals(cart.getText(), "2");

        cart.click();

        WebElement firstItem = driver.findElement(By.xpath("//a[@id='item_4_title_link']/div"));
        String firstItemText = firstItem.getText();
        assertEquals(firstItemText, "Sauce Labs Backpack");

        WebElement secondItem = driver.findElement(By.xpath("//a[@id='item_5_title_link']/div"));
        String secondItemText = secondItem.getText();
        assertEquals(secondItemText, "Sauce Labs Fleece Jacket");

        driver.findElement(By.xpath("//button[@id='checkout']")).click();

        driver.findElement(By.xpath("//input[@id='first-name']")).sendKeys("Poopa");
        driver.findElement(By.xpath("//input[@id='last-name']")).sendKeys("Loopa");
        driver.findElement(By.xpath("//input[@id='postal-code']")).sendKeys("322228");
        driver.findElement(By.xpath("//input[@id='continue']")).click();

        assertEquals(driver.findElement(By.xpath("//div[@data-test='shipping-info-value']"))
                .getText(), "Free Pony Express Delivery!");

        assertEquals(driver.findElement(By.xpath("//div[@data-test='total-label']")).
                getText(), "Total: $86.38");

        driver.findElement(By.xpath("//button[@id='finish']")).click();

        assertEquals(driver.findElement
                (By.xpath("//h2")).getText(), "Thank you for your order!");

        driver.findElement(By.xpath("//button[@id='back-to-products']")).click();

        assertEquals(driver.findElement
                (By.xpath("//div[@class='app_logo']")).getText(), "Swag Labs");


        System.out.println("Branch 222");

        Thread.sleep(5000);

        driver.quit();
    }
}
