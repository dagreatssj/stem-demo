import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

public class StemDemo {
    public static void main(String[] args) throws Exception {
        WebDriver webDriver = new FirefoxDriver();

        webDriver.get("http://pizzahut.com");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        webDriver.quit();
        /*webDriver.findElement(By.id("LuckyAnchor_1422247212900_6")).click();
        webDriver.findElement(By.id("LuckyAnchor_1422247238783_65")).click();
        webDriver.findElement(By.id("syo-city")).clear();
        webDriver.findElement(By.id("syo-city")).sendKeys("Redwood City");
        webDriver.findElement(By.id("statenames")).clear();
        webDriver.findElement(By.id("statenames")).sendKeys("CA");
        webDriver.findElement(By.id("LuckyAnchor_1422247238783_161")).click();
        webDriver.findElement(By.id("LuckyAnchor_1422247264367_177")).click();
        webDriver.findElement(By.id("LuckyAnchor_1422247405573_23")).click();
        webDriver.findElement(By.id("reg-firstname")).click();
        webDriver.findElement(By.id("reg-firstname")).clear();
        webDriver.findElement(By.id("reg-firstname")).sendKeys("Darrell");
        webDriver.findElement(By.id("reg-lastname")).clear();
        webDriver.findElement(By.id("reg-lastname")).sendKeys("Calderon");
        webDriver.findElement(By.id("reg-email")).clear();
        webDriver.findElement(By.id("reg-email")).sendKeys("darrellcalderon@yahoo.com");
        webDriver.findElement(By.id("reg-re-email")).clear();
        webDriver.findElement(By.id("reg-re-email")).sendKeys("darrellcaleron@yahoo.com");*/
    }
}