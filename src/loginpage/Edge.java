package loginpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class Edge {
    public static void main(String[] args) {
        String baseUrl = "https://demo.nopcommerce.com/login?returnUrl=%2F";
        //edge browser setup
        System.setProperty("webdriver.edge.driver","drivers/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        // to launch the URL
        driver.get(baseUrl);
        //to maximize window
        driver.manage().window().maximize();
        // to give implicit timeout
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        //to print title of the page
        String title = driver.getTitle();
        System.out.println(title);
        //to get current URL
        String currentUrl = driver.getCurrentUrl();
        System.out.println(currentUrl);
        //to print page source
        String source = driver.getPageSource();
        System.out.println(source);
        //to find id element
        WebElement emailfield = driver.findElement(By.id("Email"));
        //sending email to emailfield
        emailfield.sendKeys("pvaland@gmail.com");
        // to find name element
        WebElement passwordfield = driver.findElement(By.name("Password"));
        //sending password to passwordfield
        passwordfield.sendKeys("123456789");

        driver.close();
    }
}
