package loginpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class Firefox {
    public static void main(String[] args) {
        String baseUrl= "https://demo.nopcommerce.com/login?returnUrl=%2F";

        // to set the driver's property
       System.setProperty("webdriver.gecko.driver","drivers/geckodriver.exe");

        WebDriver firefox = new FirefoxDriver();
        //to launch baseUrl
        firefox.get(baseUrl);

        // to maximize window
        firefox.manage().window().maximize();

        // to give implicite time to driver
        firefox.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        // to print title
        String title= firefox.getTitle();
        System.out.println("Title: "+title);

        // to print current url
        String currentUrl= firefox.getCurrentUrl();
        System.out.println("Current URL: "+currentUrl);

        // to print page source
        String pagesource= firefox.getPageSource();
        System.out.println("Page source: "+pagesource);

        // to get id element
        WebElement emailfield = firefox.findElement(By.id("Email"));
        // sending email to emailfield
        emailfield.sendKeys("pvaland@gamil.com");

        // to get name element
        WebElement passwordfield = firefox.findElement(By.name("Password"));
        passwordfield.sendKeys("12345678");

        // to close browser
        firefox.close();

    }
}
