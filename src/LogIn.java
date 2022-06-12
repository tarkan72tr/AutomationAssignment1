import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.testng.Assert;

import java.time.Duration;

public class LogIn {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDocuments\\BrowserDriver\\chromedriver.exe");
        WebDriver driver =  new ChromeDriver();

        driver.get("http://qa-duotify.us-east-2.elasticbeanstalk.com/register.php");


        String title = driver.getTitle();
        String expectedTitle = "Welcome to Duotify!";
        Assert.assertEquals(title, expectedTitle);

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));

        driver.findElement(By.id("loginUsername")).sendKeys("Hasan.Ata");
        driver.findElement(By.id("loginPassword")).sendKeys("13795Aa");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));

        driver.findElement(By.name("loginButton")).click();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));

        String expectedUrl = "http://qa-duotify.us-east-2.elasticbeanstalk.com/browse.php?";
        String currentUrl = driver.getCurrentUrl();
        Assert.assertEquals(currentUrl, expectedUrl);

        String expectedName = "Hasan " + "Atacan";
        String nameFirstAndLast = driver.findElement(By.id("nameFirstAndLast")).getText();
        Assert.assertEquals(nameFirstAndLast, expectedName);

        driver.findElement(By.id("nameFirstAndLast")).click();

        String NameAndLastSecondCheck = driver.findElement(By.className("userInfo")).getText();
        Assert.assertEquals(NameAndLastSecondCheck, expectedName);


        driver.findElement(By.id("rafael")).click();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));

        expectedUrl = "http://qa-duotify.us-east-2.elasticbeanstalk.com/register.php";
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));

        currentUrl = driver.getCurrentUrl();
        Assert.assertEquals(currentUrl, expectedUrl);

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));

        driver.findElement(By.id("loginUsername")).sendKeys("Hasan.Ata");
        driver.findElement(By.id("loginPassword")).sendKeys("13795Aa");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));

        driver.findElement(By.name("loginButton")).click();

        String pageSource = driver.getPageSource();
        String expectedText = "You Might Also Like";

        Assert.assertTrue(pageSource.contains(expectedText));

        System.out.println("Assignment Has Been Done Successfully!!!");





    }
}
