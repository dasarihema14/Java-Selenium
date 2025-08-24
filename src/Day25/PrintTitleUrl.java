package Day25;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintTitleUrl {
    public static void main(String[] args) {
      
        WebDriver driver = new ChromeDriver();

            driver.get("https://amazon.in");
            driver.manage().window().maximize();

            String title = driver.getTitle();
            String url = driver.getCurrentUrl();
            driver.navigate().back();
            driver.navigate().forward();
            driver.navigate().refresh();

            System.out.println("Page Title: " + title);
            System.out.println("Page URL  : " + url);
            //driver.quit();
        } 
}

