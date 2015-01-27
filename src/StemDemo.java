import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class StemDemo {
    private WebDriver webDriver;

    @Before
    public void setUp() throws Exception {
        webDriver = new FirefoxDriver();
    }

    @After
    public void tearDown() throws Exception {
        webDriver.quit();
    }

    @Test
    public void testOrderingAPizzaDelivery() throws Exception {
        // Open Firefox
        webDriver.get("http://pizzahut.com");

        // Click the Pizza button on nav
        webDriver.findElement(By.xpath("//li[@id='menu_pizza']/a")).click();

        WebDriverWait wait = new WebDriverWait(webDriver, 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//form[@id='searchForm']")));

        // Select delivery
        webDriver.findElement(By.xpath("//div[@id='my-occasion-delivery']/input")).click();

        // Fill out form
        webDriver.findElement(By.id("syo-street")).clear();
        webDriver.findElement(By.id("syo-street")).sendKeys("3157 Middlefield Road");
        webDriver.findElement(By.id("syo-city")).clear();
        webDriver.findElement(By.id("syo-city")).sendKeys("Redwood City");
        webDriver.findElement(By.id("statenames")).clear();
        webDriver.findElement(By.id("statenames")).sendKeys("CA");

        Thread.sleep(2000); // this gives a 2 second pause

        // Submit the address entered
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='submit_buttons']/div[1]")));
        webDriver.findElement(By.xpath("//div[@id='submit_buttons']/div[1]")).click();

        // Select the closest Pizza Hut
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='results-div']/div/div[3]/ul/li[11]/div")));
        webDriver.findElement(By.xpath("//div[@id='results-div']/div/div[3]/ul/li[11]/div")).click();

        // Click to add a Meat Lovers Pizza
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='tile-set']/div[4]/div/div/table/tbody/tr/td[2]/form/div[2]/div[1]")));
        webDriver.findElement(By.xpath("//div[@id='tile-set']/div[4]/div/div/table/tbody/tr/td[2]/form/div[2]/div[1]")).click();

        // Checkout
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='cartOverlayContainer']/table[2]/tbody/tr/td[2]/div")));
        webDriver.findElement(By.xpath("//div[@class='cartOverlayContainer']/table[2]/tbody/tr/td[2]/div")).click();
    }
}