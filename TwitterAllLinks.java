package scripts;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class TwitterAllLinks {

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
  public void twitterlinks() throws InterruptedException
  { 
	  driver.get("https://www.twitter.com");
	  List<WebElement> twitterLink=driver.findElements(By.xpath("//a"));
	  System.out.println("Total no. of Links"+twitterLink);
	  for(WebElement linktwit: twitterLink)
	  {
		  System.out.println(linktwit.getText()+ "  "+linktwit.getAttribute("href"));
	  }
		
  }

}
