package Day24;

/*import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.myntra.com");
        driver.manage().window().maximize();

        // Wait for page to load
        Thread.sleep(2000);

        // Locate the search box by class name and type something
        WebElement searchBox = driver.findElement(By.className("desktop-searchBar"));
        searchBox.sendKeys("shoes");

        // Locate search button by class and click
        WebElement searchButton = driver.findElement(By.className("desktop-submit"));
        searchButton.click();

        Thread.sleep(3000);
        driver.quit();
    }
}
*/

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // 1. Open Myntra homepage
        driver.get("https://www.myntra.com");
        Thread.sleep(2000); // wait for page to load

        //WebElement profileIcon = driver.findElement(By.id("desktop-profile"));
       // System.out.println("Found element by ID: " + profileIcon.getTagName());

        WebElement searchBar = driver.findElement(By.className("desktop-searchBar"));
        searchBar.sendKeys("shoes");
        System.out.println("Typed 'shoes' in search bar");

        WebElement searchButton = driver.findElement(By.cssSelector(".desktop-submit"));
        searchButton.click();
        System.out.println("Clicked search button");
        Thread.sleep(3000);

        //WebElement firstHeading = driver.findElement(By.tagName("h1"));
        //System.out.println("First heading text: " + firstHeading.getText());

        WebElement pincodeBox = driver.findElement(By.name("pincode"));
        pincodeBox.sendKeys("560001");
        System.out.println("Entered pincode");

        Thread.sleep(3000);
        driver.quit();
    }
}
