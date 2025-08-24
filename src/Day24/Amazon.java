package Day24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.time.Duration;

public class Amazon {
    public static void main(String[] args) throws InterruptedException, IOException {
        // Load data from file
        FileInputStream file = new FileInputStream("login.properties");
        Properties prop = new Properties();
        prop.load(file);

        String email = prop.getProperty("amazon.email");
        String password = prop.getProperty("amazon.password");
        String searchItem = prop.getProperty("searchItem");
        

        // Setup ChromeDriver
      //  System.setProperty("webdriver.chrome.driver", "C:\\path\\to\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://www.amazon.in");

        driver.findElement(By.id("nav-link-accountList")).click();
        driver.findElement(By.id("ap_email_login")).sendKeys(email);
        driver.findElement(By.id("continue")).click();
        driver.findElement(By.id("ap_password")).sendKeys(password);
        driver.findElement(By.id("signInSubmit")).click();

        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
        searchBox.sendKeys(searchItem);
        driver.findElement(By.id("nav-search-submit-button")).click();

        driver.findElement(By.cssSelector("#a-autoid-3-announce")).click();
        driver.findElement(By.id("add-to-cart-button")).click();

        Thread.sleep(5000);
        driver.quit();
    }
}
