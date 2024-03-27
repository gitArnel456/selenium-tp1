package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        //entrer dans le goole
        driver.get("https://www.google.com");
        WebElement element = driver.findElement(By.name("q"));
        element.sendKeys("Inclusiv Academy");
        element.submit();
         try {
            Thread.sleep(2000);
         }catch (InterruptedException e){
            e.printStackTrace();
         }
         //cliquer sur le premier element
         WebElement resultOne = driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div/div/div/div/div[1]/div/span/a/h3"));
         resultOne.click();
         // driver.quit();
    }
}