package Day22;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
    public static void main(String[] args) {
        // If chromedriver.exe is in project root or System PATH, no need to set the property
        // If not, uncomment and set the path:
        // System.setProperty("webdriver.chrome.driver", "C:\\path\\to\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();  // Launch Chrome
        driver.manage().window().maximize();   // Maximize window
        driver.get("https://www.google.com");  // Open Google

        System.out.println("Page title: " + driver.getTitle());

        driver.quit(); // Close browser
    }
}
