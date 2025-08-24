package Day25;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation {
    public static void main(String[] args) throws InterruptedException {
        
        
        WebDriver driver = new ChromeDriver();

       
        driver.get("https://www.google.com");
        System.out.println("Opened Google");
        Thread.sleep(2000); 

        
        driver.navigate().to("https://www.selenium.dev/");
        System.out.println("Opened Selenium.dev");
        Thread.sleep(2000);

       
        driver.navigate().back();
        System.out.println("Navigated Back to Google");
        Thread.sleep(2000);

       
        driver.navigate().forward();
        System.out.println("Navigated Forward to Selenium.dev");
        Thread.sleep(2000);

     
        driver.navigate().refresh();
        System.out.println("Page Refreshed");
        Thread.sleep(2000);

        driver.quit();
    }
}
