package Day22;

/*import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFox {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver(); // Works if geckodriver is in PATH
        driver.get("https://www.google.com");
        System.out.println("Title: " + driver.getTitle());
        driver.quit();
    }
}*/

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class FireFox {
    public static void main(String[] args) {
        
        WebDriver driver = new FirefoxDriver();

        // Get capabilities
        Capabilities caps = ((RemoteWebDriver) driver).getCapabilities();

        String browserName = caps.getBrowserName();
        String browserVersion = caps.getBrowserVersion();

        System.out.println("Browser Name: " + browserName);
        System.out.println("Browser Version: " + browserVersion);

        driver.quit();
    }
}


