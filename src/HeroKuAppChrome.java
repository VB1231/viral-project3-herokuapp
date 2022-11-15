import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class HeroKuAppChrome {
    public static void main(String[] args) {
        String baseUrl = "http://the-internet.herokuapp.com/login";
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(baseUrl);
        //maximise the screen
        driver.manage().window().maximize();
        //time delay for download
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        //get current url
        System.out.println(driver.getCurrentUrl());
        //get page source
        System.out.println(driver.getPageSource());
        //get page title
        System.out.println(driver.getTitle());
        //get user id
        WebElement userField = driver.findElement(By.id("username"));
        // WebElement userField = driver.findElement(By.className("row"));
        userField.sendKeys("tomsmith");
        WebElement passwordField = driver.findElement(By.name("password"));
        passwordField.sendKeys("SuperSecretPassword!");
        //submit to login
        WebElement submitField = driver.findElement(By.className("radius"));
        submitField.click();
        //log out
        WebElement logoutField = driver.findElement(By.linkText("Logout"));
        logoutField.click();
        //close Browser
        driver.quit();
    }
}
