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

public class GoogleLinksAll {

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
  public void loginToTorisum() throws InterruptedException
  { 
	  driver.get("https://www.google.com");
	  List<WebElement> AllGoogleLinks= driver.findElements(By.xpath("//a"));
	  System.out.println("Total no. of Links: "+AllGoogleLinks.size());
	  
	  for(WebElement oneele : AllGoogleLinks)
	  {
		  System.out.println(oneele.getText() + "- " +oneele.getAttribute("href"));
	  }
			  
		
  }

}
