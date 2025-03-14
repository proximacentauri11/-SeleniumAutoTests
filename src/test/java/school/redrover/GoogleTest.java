package school.redrover;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class GoogleTest {

    @Test
    public void testGoogle() throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
        driver.get("https://www.google.com");

        WebElement textBox = driver.findElement(By.id("APjFqb"));
        textBox.sendKeys("selenium");

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.xpath("//center/input[@value='Поиск в Google']"));
        button.click();

        Thread.sleep(1000);

        WebElement site = driver.findElement(By.xpath("//cite[1]"));
        String siteText = site.getText();

        Assert.assertEquals(siteText, "https://www.selenium.dev");

        driver.quit();

    }
}
