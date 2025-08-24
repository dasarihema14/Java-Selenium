package Day24;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login{

	public static void main(String[] args)
			throws IOException, InterruptedException
	{
		Properties props = new Properties();
        FileInputStream fis = new FileInputStream("C:\\Users\\new\\eclipse-workspace\\Testing\\login.properties");
        props.load(fis);

        String gmailEmail = props.getProperty("gmail.email");
       String gmailPass = props.getProperty("gmail.password");

       String instaUser = props.getProperty("instagram.user");
        String instaPass = props.getProperty("instagram.password");

       String yahooEmail = props.getProperty("yahoo.email");
        String yahooPass = props.getProperty("yahoo.password");

        String amazonEmail = props.getProperty("amazon.email");
        String amazonPass = props.getProperty("amazon.password");

        String chromeDriverPath = props.getProperty("chromedriver.path");
        //System.setProperty("webdriver.chrome.driver", chromeDriverPath);

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        /*driver.get("https://accounts.google.com/signin/v2/identifier?service=mail");
        driver.findElement(By.id("identifierId")).sendKeys(gmailEmail);
        driver.findElement(By.id("identifierNext")).click();
        Thread.sleep(2000);
        driver.findElement(By.name("Passwd")).sendKeys(gmailPass);
        driver.findElement(By.id("passwordNext")).click();
        Thread.sleep(3000);*/

        driver.get("https://www.instagram.com/accounts/login/");
        Thread.sleep(3000);
        driver.findElement(By.name("username")).sendKeys(instaUser);
        driver.findElement(By.name("password")).sendKeys(instaPass);
        driver.findElement(By.cssSelector("button[type='submit']")).click();
        Thread.sleep(30000);

        //4. Yahoo Login
        driver.switchTo().newWindow(WindowType.TAB); 
        driver.get("https://login.yahoo.com/");
        driver.findElement(By.id("login-username")).sendKeys(yahooEmail);
        driver.findElement(By.id("login-signin")).click();
        Thread.sleep(20000);
        driver.findElement(By.id("login-passwd")).sendKeys(yahooPass);
        driver.findElement(By.id("login-signin")).click();
        Thread.sleep(30000);

        // 5. Amazon Login
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://na.account.amazon.com/ap/signin?_encoding=UTF8&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.pape.max_auth_age=0&ie=UTF8&openid.ns.pape=http%3A%2F%2Fspecs.openid.net%2Fextensions%2Fpape%2F1.0&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&pageId=lwa&openid.assoc_handle=amzn_lwa_na&marketPlaceId=ATVPDKIKX0DER&arb=972b966a-80ce-4129-8c44-61305b36b987&language=en_US&openid.return_to=https%3A%2F%2Fna.account.amazon.com%2Fap%2Foa%3FmarketPlaceId%3DATVPDKIKX0DER%26arb%3D972b966a-80ce-4129-8c44-61305b36b987%26language%3Den_US&enableGlobalAccountCreation=1&metricIdentifier=amzn1.application.e3b40bcf8dae40e6bf8b197b9b3dec8d&signedMetricIdentifier=b1rnnUP4iinb%2B%2BwjCOWA1f5Y%2B6DlINB%2BDQCz1Q54AtU%3D");
        driver.findElement(By.id("ap_email")).sendKeys(amazonEmail);
        driver.findElement(By.id("continue")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("ap_password")).sendKeys(amazonPass);
        driver.findElement(By.id("signInSubmit")).click();
        Thread.sleep(3000);

        driver.quit();

	}

}
