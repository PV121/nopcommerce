package loginpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.json.JsonOutput;

import java.time.Duration;

public class Chrome {
    public static void main(String[] args) {
        String baseUrl = "https://demo.nopcommerce.com/login?returnUrl=%2F";
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get(baseUrl);

        driver.manage().window().maximize();// to maximize window

        // to give implicit time to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        String title =driver.getTitle();// to get title of the page
        System.out.println("Title:  "+title);

        String currentUrl = driver.getCurrentUrl();//to get current url of the page
        System.out.println("Current URL: "+currentUrl);

        String pageSource =  driver.getPageSource();// to get page source
        System.out.println("Page Source: "+pageSource);

        // to find an id element
        WebElement emailfield= driver.findElement(By.id("Email"));

        // to send email to emailfireld element
        emailfield.sendKeys("pvaland@gmail.com");

        // to find name element
        WebElement passwordfield = driver.findElement(By.name("Password"));

        // to send password to password field
        passwordfield.sendKeys("12345678");

        //to close browser
        driver.close();

    }

}
