package samplepackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {
    public static void main(String[] args) {

        System.setProperty("Webdriver.chrome.driver","\"C:\\driver\\chromedriver.exe\"");

        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com/");
        System.out.println(driver.getTitle());
        driver.findElement(By.name("q")).sendKeys("Hello Brother");
        driver.findElement(By.name("btnK")).submit();
        driver.findElement(By.id("gsr")).click();
        WebElement playButton = driver.findElement(By.xpath("//*[@id='movie_player']/div[37]/div[2]/div[1]/button"));
        playButton.click();


    }


}

