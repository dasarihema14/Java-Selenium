package Day24;


import java.io.File;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class FileUpload {

	public static void main(String[] args)
			throws InterruptedException 
	{
		 
	        WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();	        
	            driver.get("https://login.naukri.com/nLogin/Login.php");

	            driver.findElement(By.id("usernameField")).sendKeys("hemadasari1431@gmail.com");
	            driver.findElement(By.id("passwordField")).sendKeys("Hema@123");
	            driver.findElement(By.xpath("//button[@type='submit']")).click();	            
	            Thread.sleep(5000);
	            driver.get("https://www.naukri.com/mnjuser/profile");	                       
	            Thread.sleep(5000);	  
	            
	            File resumeFile = new File("C:\\Users\\new\\OneDrive\\Documents\\Dasari Hema Latha - Resume.pdf");   
	            //WebElement fileInput = driver.findElement(By.xpath("//*[@id=\"resume360\"]"));
	            WebElement fileInput = driver.findElement(By.id("attachCV")); 
	            
	            fileInput.sendKeys(resumeFile.getAbsolutePath());
	            Thread.sleep(5000);            
	  
	            driver.quit();
	        }
}

