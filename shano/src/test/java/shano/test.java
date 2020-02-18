package shano;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.apache.http.impl.conn.tsccm.WaitingThread;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.By;

import io.github.bonigarcia.wdm.WebDriverManager;

public class test {

	public static void main(String[] args)
	{
		
		WebDriver driver = webDriverSetup();
		mbLogin(driver);
	//	Forumsanity(driver);
		poster(driver);
 

	}

	private static WebDriver webDriverSetup() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		return driver;
	}

	private static void mbLogin(WebDriver driver)  {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		    driver.get("https://www.magicbricks.com/forum");
		
		    driver.manage().window().maximize();
		    driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[8]/a[1]")).click();
		    
		    driver.findElement(By.id("emailOrMobile")).click();
		    driver.findElement(By.id("emailOrMobile")).clear();
		    driver.findElement(By.id("emailOrMobile")).sendKeys("sneha.jaiswal1@magicbricks.com");
		    driver.findElement(By.xpath("//button[@type='button']")).click();
		    driver.findElement(By.id("passwordExistingUser")).click();
		    driver.findElement(By.id("passwordExistingUser")).clear();
		    driver.findElement(By.id("passwordExistingUser")).sendKeys("Times@123");
		    driver.findElement(By.xpath("(//button[@type='button'])[4]")).click();
	
	}

	private static void Forumsanity(WebDriver driver) {
		driver.get("https://www.magicbricks.com/forum");
	    	driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[13]/div[1]/div[1]/div[1]/section[1]/div[2]/div[1]/h3[1]/a[1]")).click();
	 	    	System.out.println(driver.getTitle());
	 	    	
	    driver.get("https://www.magicbricks.com/forum");
	    driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[13]/div[1]/div[1]/div[1]/section[2]/div[2]/div[1]/h3[1]/a[1]")).click();
	    System.out.println(driver.getTitle());
	    
	    
	    
	    driver.get("https://www.magicbricks.com/forum");
	    driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[13]/div[1]/div[1]/div[1]/div[7]/div[1]/h2[1]/a[1]")).click();
	    System.out.println(driver.getTitle());
	    
	    driver.get("https://www.magicbricks.com/forum");
	    driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[13]/div[1]/div[1]/div[1]/div[8]/div[1]/h2[1]/a[1]")).click();
	    System.out.println(driver.getTitle());
	    
	    driver.get("https://www.magicbricks.com/forum");
	    driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[13]/div[1]/div[1]/div[1]/div[9]/div[1]/h2[1]/a[1]")).click();
	    System.out.println(driver.getTitle());
	    
	    driver.get("https://www.magicbricks.com/forum");
	    driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[13]/div[1]/div[1]/div[1]/div[10]/div[1]/h2[1]/a[1]")).click();
	    System.out.println(driver.getTitle());
	    
	    driver.get("https://www.magicbricks.com/forum");
	    driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[13]/div[1]/div[1]/div[1]/div[11]/div[1]/h2[1]/a[1]")).click();
	    System.out.println(driver.getTitle());
	}
	
	private static void poster(WebDriver driver)  {
		driver.get("https://www.magicbricks.com/forum");
		driver.manage().window().maximize();
	    driver.findElement(By.id("searchInput")).click();
	   // driver.findElement(By.id("searchInput")).sendKeys("Ankur Project");
	    driver.findElement(By.id("searchInput")).sendKeys("Andaman project ");
	    
	    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
	    //driver.findElement(By.linkText("Ankur Project, Andaman & Nicobar")).click();
	    driver.findElement(By.linkText("Andaman project test, Port Blair")).click();
	   
	    driver.findElement(By.xpath("(//a[contains(text(),'Start a Discussion')])[2]")).click();
	    driver.findElement(By.id("post-title")).click();
	    driver.findElement(By.id("post-title")).clear();
	    driver.findElement(By.id("post-title")).sendKeys("this is a sample post test post");
	   // driver.findElement(By.xpath("/html[1]")).click();
	   // driver.findElement(By.xpath("/html[1]")).sendKeys("Arvind Kejriwal is an Indian politician and a former bureaucrat who is the current and 7th Chief Minister of Delhi since February 2015. He was also the Chief Minister of Delhi from December 2013 to February 2014, stepping down after 49 days of assuming power.");
	    driver.findElement(By.id("post-title")).sendKeys(Keys.TAB,"Rahat Fateh Ali Khan, is a Pakistani musician, primarily of Qawwali, a devotional music of the Muslim Sufis. He is the nephew of Nusrat Fateh Ali Khan and son of Farrukh Fateh Ali Khan and also the grandson of Qawwali singer Fateh Ali Khan. In addition to Qawwali, he also performs ghazals and other light music.");
	    		
	    
	    //  driver.findElement(By.id("mceu_7-body")).click();
	   // driver.findElement(By.id("mceu_7-body")).sendKeys("Arvind Kejriwal is an Indian politician and a former bureaucrat who is the current and 7th Chief Minister of Delhi since February 2015. He was also the Chief Minister of Delhi from December 2013 to February 2014, stepping down after 49 days of assuming power.");
	    
	    
	    driver.findElement(By.id("submit_step1_create_topic")).click();
	    driver.findElement(By.linkText("PROCEED")).click();
	}

}

/*
 * driver.get("https://accounts.magicbricks.com/userauth/login");
 * driver.findElement(By.xpath("//div[@id='firstLoginDiv']/div[2]/div/label")).
 * click(); driver.findElement(By.id("emailOrMobile")).clear();
 * driver.findElement(By.id("emailOrMobile")).sendKeys(
 * "sneha.jaiswal1@magicbricks.com");
 * driver.findElement(By.id("btnStep1")).click();
 * driver.findElement(By.xpath("//form[@id='loginForm']/div/div[2]/label")).
 * click(); driver.findElement(By.id("password")).clear();
 * driver.findElement(By.id("password")).sendKeys("Times@123");
 * driver.findElement(By.id("btnLogin")).click();
 */

/*
 * Wait wait = new FluentWait(driver) .withTimeout(Duration.ofSeconds(30))
 * .pollingEvery(Duration.ofSeconds(5)) .ignoring(Exception.class);
 * wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
 * "/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[8]/a[1]")));
 */
  //  driver.manage().timeouts().implicitlywait(15 TimeUnit.seconds)
   // driver.findElement(By.linkText("Login")).click();

//driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/label[1]")).sendKeys("sneha.jaiswal1@magicbricks.com");	
		//driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/label[1]")).click();
	//driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/label[1]")).sendKeys(Keys.RETURN);	
	//driver.findElement(By.id("password")).sendKeys("Times@123");
	//driver.findElement(By.id("password")).sendKeys(Keys.RETURN);
