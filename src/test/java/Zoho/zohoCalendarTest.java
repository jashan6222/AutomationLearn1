package Zoho;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public class zohoCalendarTest {
    WebDriver driver;

    @BeforeMethod
    public void setupBrowser(){
        System.setProperty("webdriver.chrome.driver", "/Users/jashan-9051/Downloads/chromedriver_mac_arm64/chromedriver");
        driver=new ChromeDriver();
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
        driver.get("https://www.google.com");

    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }

    @Test
    public void googleTitleTest() throws InterruptedException {

        String title=driver.getTitle();
        System.out.println(title);
    }

    @Test
    public void googleLogoTest(){
        if (driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/img")).isDisplayed()){
            System.out.println("Logo Displayed");
        }
        else {
            System.out.println("Logo Not displayed");
        }
    }


    public void openGoogleCalendar(){
        try {
            WebElement viewBox= driver.findElement(By.xpath("//*[@id=\"gbwa\"]/div/a/svg/path"));
            if(viewBox.isDisplayed())
            {
                System.out.println("Viewbox visible");
            }
            viewBox.click();
            Thread.sleep(3000);
            if(driver.findElement(By.className("MrEfLc")).isDisplayed()){
                System.out.println("Calendar option seen");
                driver.findElement(By.className("MrEfLc")).click();
            }
            Thread.sleep(8000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    public void searchJashan() throws InterruptedException {
        WebElement searchBox= driver.findElement(By.id("APjFqb"));
        searchBox.sendKeys("Jashan");
        searchBox.sendKeys(Keys.ENTER);

    }

}
