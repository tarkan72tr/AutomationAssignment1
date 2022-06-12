import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.time.Duration;

public class FirstAutomation_SignUp {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDocuments\\BrowserDriver\\chromedriver.exe");
        WebDriver driver =  new ChromeDriver();

        driver.get("http://qa-duotify.us-east-2.elasticbeanstalk.com/register.php");


        String title = driver.getTitle();
        String expectedTitle = "Welcome to Duotify!";
        Assert.assertEquals(title, expectedTitle);

        driver.manage().window().maximize();

        driver.findElement(By.id("hideLogin")).click();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));

        driver.findElement(By.id("username")).sendKeys("Hasan.Ata");
        driver.findElement(By.id("firstName")).sendKeys("Hasan");
        driver.findElement(By.id("lastName")).sendKeys("Atacan");
        driver.findElement(By.id("email")).sendKeys("hasatacan52@yahoo.com");
        driver.findElement(By.id("email2")).sendKeys("hasatacan52@yahoo.com");
        driver.findElement(By.id("password")).sendKeys("13795Aa");
        driver.findElement(By.id("password2")).sendKeys("13795Aa");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));

        driver.findElement(By.name("registerButton")).click();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));

    }
}
