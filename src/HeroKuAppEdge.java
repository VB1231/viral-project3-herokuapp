import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class HeroKuAppEdge {
    public static void main(String[] args) {
        String baseUrl="http://the-internet.herokuapp.com/login";
        System.setProperty("webdriver.edge.driver","driver/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.get(baseUrl);
        //maximise the window
        driver.manage().window().maximize();
        //time delay set
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        //get current url
        System.out.println(driver.getCurrentUrl());
        //get page source
        System.out.println(driver.getPageSource());
        //get title
        System.out.println(driver.getTitle());
        //set username
        WebElement userField = driver.findElement(By.name("username"));
        userField.sendKeys("tomsmith");
        //set password
        WebElement passwordField = driver.findElement(By.name("password"));
        passwordField.sendKeys("SuperSecretPassword!");
        //close the browser
        driver.quit();
    }
}
