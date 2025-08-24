package Day25;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class Flipkart {
    public static void main(String[] args) throws InterruptedException, IOException {
      
        FileInputStream file = new FileInputStream("login.properties");
        Properties props = new Properties();
         props.load(file);        
         String flipkart = props.getProperty("phn");
         
         WebDriver driver = new ChromeDriver();
         driver.manage().window().maximize();
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));     
         driver.get("https://www.flipkart.com/");   
         driver.get("https://www.flipkart.com/account/login?ret=/");  
         driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div/div[2]/div/form/div[1]/input")).sendKeys(flipkart);
         driver.findElement(By.className("LSOAQH")).click();
         List<String> products = new ArrayList<>();
         products.add("laptop");
         products.add("headphones");
         products.add("wireless mouse");
         for (String product : products) {
             // Locate search bar (use name="q")
             WebElement searchBox = driver.findElement(By.name("q"));
             searchBox.clear();
             searchBox.sendKeys(product);

             // Click on search button
             driver.findElement(By.xpath("//button[@type='submit']")).click();

             Thread.sleep(3000);
             driver.findElement(By.className("KzDlHZ")).click();
             
            
         }
       
        
             }
}

