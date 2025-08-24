package Day24;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xyz {

    public static void main(String[] args) throws IOException, InterruptedException {

        // Load properties file
        Properties props = new Properties();
        FileInputStream fis = new FileInputStream("C:\\Users\\new\\Downloads\\personal.properties");
        props.load(fis);

        String email = props.getProperty("naukri.email");
        String password = props.getProperty("naukri.password");
        String resumePath = props.getProperty("resume.path");
        String chromeDriverPath = props.getProperty("chromedriver.path");

        // Set ChromeDriver path from properties file
        System.setProperty("webdriver.chrome.driver", chromeDriverPath);

        // Launch Chrome
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // Open Naukri login page
        driver.get("https://www.naukri.com/nlogin/login");

        // Login
        driver.findElement(By.id("usernameField")).sendKeys(email);
        driver.findElement(By.id("passwordField")).sendKeys(password);
        driver.findElement(By.xpath("//button[text()='Login']")).click();

        // Wait for login
        Thread.sleep(5000);

        // Go to profile page
        driver.get("https://www.naukri.com/mnjuser/profile");
        Thread.sleep(5000);

        // Upload resume
        WebElement uploadInput = driver.findElement(By.className("fileUpload"));

        uploadInput.sendKeys(resumePath);

        System.out.println(" Resume uploaded successfully!");

        // Close browser
        Thread.sleep(3000);
        driver.quit();
    }
}
