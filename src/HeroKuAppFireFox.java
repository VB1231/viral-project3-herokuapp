import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class HeroKuAppFireFox {
    public static void main(String[] args) {
        String baseUrl="http://the-internet.herokuapp.com/login";
        System.setProperty("webdriver.gheko.driver","driver/geckodriver.exe");
        WebDriver driver=new FirefoxDriver();
        driver.get(baseUrl);
        // maximise the screen
        driver.manage().window().maximize();
        //time delay set
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        //get page source
        System.out.println(driver.getPageSource());
        //get title
        System.out.println(driver.getTitle());
        //get current url
        System.out.println(driver.getCurrentUrl());
        //set uer name
        WebElement userField = driver.findElement(By.name("username"));
        userField.sendKeys("tomsmith");
        //set password
        WebElement passwordField = driver.findElement(By.name("password"));
        passwordField.sendKeys("SuperSecretPassword!");
        //close browser
        driver.quit();
    }
}
