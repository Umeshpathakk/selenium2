package shano;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class postproperty 
{
public static void main(String[] args)
{
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.magicbricks.com/forum");
	driver.manage().window().maximize();
    driver.findElement(By.id("searchInput")).click();
    driver.findElement(By.id("searchInput")).sendKeys("Ankur Project");
		/*
		 * try { Thread.sleep(2000); } catch (InterruptedException e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); }
		 */
    //driver.findElement(By.id("searchInput")).sendKeys(Keys.);
    //driver.findElement(By.id("searchInput")).sendKeys(Keys.ARROW_DOWN);
    
    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
    driver.findElement(By.linkText("Ankur Project, Andaman & Nicobar")).click();
    //driver.findElement(By.id("searchInput")).sendKeys(Keys.ARROW_UP);
  //  driver.findElement(By.id("searchInput")).sendKeys(Keys.ARROW_DOWN);
  //driver.findElement(By.id("ui-id-68")).click();
  //  driver.findElement(By.id("searchInput")).sendKeys(Keys.RETURN);
   // driver.findElement(By.id("searchInput")).sendKeys(Keys.RETURN);
    
    driver.findElement(By.xpath("(//a[contains(text(),'Start a Discussion')])[2]")).click();
    driver.findElement(By.id("post-title")).click();
    driver.findElement(By.id("post-title")).clear();
    driver.findElement(By.id("post-title")).sendKeys("this is a sample post test post");
    driver.findElement(By.id("submit_step1_create_topic")).click();
}
}
