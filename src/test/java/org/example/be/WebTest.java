package org.example.be;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebTest {
    private WebDriver webDriver;

    @BeforeEach
    void setup() {

        WebDriverManager.chromedriver().setup();
        webDriver = new ChromeDriver();
    }

    @Test
    void testSteps() throws InterruptedException {

        webDriver.get("https://anupdamoda.github.io/AceOnlineShoePortal/index.html");
        webDriver.findElement(By.xpath("//*[@id=\"menuToggle\"]/input")).click();
        Thread.sleep(2000);

        webDriver.findElement(By.xpath("//*[@id=\"menu\"]/a[2]/li")).click();

        webDriver.findElement(By.xpath("//*[@id=\"usr\"]")).sendKeys("sa");
        webDriver.findElement(By.xpath("//*[@id=\"pwd\"]")).sendKeys("sa");
        webDriver.findElement(By.xpath("//*[@id=\"second_form\"]/input")).click();

        WebElement element = webDriver.findElement(By.xpath("//*[@id=\"ShoeType\"]"));
        Assertions.assertEquals("Formal Shoes", element.getText());

        webDriver.quit();
    }
}