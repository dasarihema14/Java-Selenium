package Day22;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Edge {
    public static void main(String[] args) {
       
        //System.setProperty("webdriver.edge.driver", "C:\\Users\\new\\Downloads\\Selenium\\Selenium\\edgedriver_win64\\msedgedriver.exe");

        WebDriver driver = new EdgeDriver();   
        driver.manage().window().maximize();   
        driver.get("https://www.google.com");  

        System.out.println("Page title: " + driver.getTitle());

        driver.quit();
    }
}

