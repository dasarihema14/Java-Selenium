package Day22;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class InternetExplorer{
    public static void main(String[] args) {
        WebDriver driver = new InternetExplorerDriver(); // Works if IEDriverServer is in PATH
        driver.get("https://www.google.com");
        System.out.println("Title: " + driver.getTitle());
        driver.quit();
    }
}

