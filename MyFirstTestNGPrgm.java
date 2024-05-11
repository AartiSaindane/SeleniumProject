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

public class MyFirstTestNGPrgm {

  WebDriver driver;
  
  @Test
  public void googleTest()
  {
	  driver.get("http://www.google.com");
	  driver.findElement(By.name("q")).sendKeys("Selenium Training");	
  }
 @BeforeMethod
  public void beforeMethod() 
  
  {
	    System.out.println("I am in before Method, I get executed before every test");
	    
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("I am in after method, i get excuted after every case");
  }

  @BeforeClass
  public void beforeClass() {
	   System.out.println("I am in before class, I get executed only once before first test");
	    driver= new ChromeDriver();
	    driver.manage().window().maximize();
		
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("I am in the after class, I excuted only once in after the last ");
	  driver.quit();
  }
  @Test
  public void loginToTorisum() throws InterruptedException
  { 
	  driver.get("https://nichethyself.com/tourism/home.html");
	  Thread.sleep(3000);
	  WebElement user= driver.findElement(By.name("username"));
		user.sendKeys("stc123");
		WebElement password=driver.findElement(By.name("password"));
		password.sendKeys("12345");
		password.submit();
		String expectedTitleafterlogin="My account";
		String ActualTitlebeforelogin=driver.getTitle();
		assertEquals(expectedTitleafterlogin,ActualTitlebeforelogin);
		
  }

}
