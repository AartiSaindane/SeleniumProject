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

public class Wikipedia {

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
  public void Wikipedia() throws InterruptedException
  { 
	  driver.get("https://www.wikipedia.org/");
	  WebElement wiki= driver.findElement(By.xpath("//a[@id='js-link-box-en']"));
	  wiki.click();
	  Thread.sleep(3000);
	  wiki=driver.findElement(By.xpath("//input[@type='search']"));
	  wiki.sendKeys("Selenium");
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//*[@id=\"searchform\"]/div/button")).click();
	  Thread.sleep(4000);
	  String PageTitle=driver.getTitle();
	  System.out.println("Page Title :"+PageTitle);
	  
	  if(PageTitle == "Selenium")
	  {
		  System.out.println("Page Title is Selenium");
	  }
	  else
	  {
		  System.out.println("Page Title is not Selenium");
		  
	  }
	  
	  
  }
  

}
