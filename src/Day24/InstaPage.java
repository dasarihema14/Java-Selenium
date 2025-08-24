package Day24;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class InstaPage {
	public static void main(String[] args) throws IOException, InterruptedException {
		Properties props = new Properties();
		 FileInputStream fis = new FileInputStream("login.properties");
		 props.load(fis);
		 String instaUser = props.getProperty("instagram.user");
	     String instaPass = props.getProperty("instagram.password");
	  
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(90));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));


		
		 driver.get("https://www.instagram.com/accounts/login/");
	     Thread.sleep(3000);
	     driver.findElement(By.name("username")).sendKeys(instaUser);
	     driver.findElement(By.name("password")).sendKeys(instaPass);
	     driver.findElement(By.cssSelector("button[type='submit']")).click();
	     wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//nav")));
	     WebElement profileIcon = wait.until(ExpectedConditions.elementToBeClickable(
	             By.xpath("//span[@data-testid='user-avatar']")
	         ));
	         profileIcon.click();
	}

}
