package day29;
import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
//import org.testng.annotations.AfterMethod;
//import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class Datepicker {
	WebDriver driver;
	WebDriverWait wait;

	@BeforeMethod
	public void LaunchBrowser() {
		driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));  
		
		driver.get("https://www.dummyticket.com/dummy-ticket-for-visa-application/");
		driver.manage().window().maximize();
	}
	@Test
	public void DatePickerTest() {
		driver.findElement(By.xpath("//input[@id='dob']")).click(); 

		Select month = new Select(driver.findElement(By.xpath("//select[@class='ui-datepicker-month']")));
		month.selectByVisibleText("Nov");
		
		Select year = new Select(driver.findElement(By.xpath("//select[@class='ui-datepicker-year']")));
		year.selectByVisibleText("2002");
 
		String date = "11";		

		List<WebElement> alldates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//td//a"));

		for(WebElement ele: alldates) 
		{
			String dt = ele.getText();
			
			if(dt.equals(date)) {
				ele.click();
				break;
			}
		}
	}
	/*
	@AfterMethod
	public void tearDown() {
		if(driver != null)
			driver.quit();
	}
	*/


}
