package scripts;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class CookBook {

  WebDriver driver;
  
  @BeforeClass
  public void beforeClass() {
	  
	    driver= new ChromeDriver();
	    driver.manage().window().maximize();
		
  }

  @AfterClass
  public void afterClass() {
	 driver.quit();
  }
  @Test
  public void CookBook() throws InterruptedException
  { 
	  driver.get("https://www.cookbook.seleniumacademy.com/Config.html");
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//input[@name='fuel_type' and @value='Diesel']")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//input[@name='abs' and @value='ABS']")).click();
	  Thread.sleep(2000);
	  WebElement ckbk=driver.findElement(By.xpath("//input[@name='ledheadlamp' and @value='LEDHeadLamp']"));
	  System.out.println("Is Enabled: "+ckbk.isEnabled());
	  Thread.sleep(2000);
	  
  }
  

}
