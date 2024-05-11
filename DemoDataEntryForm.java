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
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;

public class DemoDataEntryForm {

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
  public void DataEntryForm() throws InterruptedException 
  { 
	  driver.get("https://demoqa.com/automation-practice-form");
	  Thread.sleep(4000);
	  WebElement user= driver.findElement(By.cssSelector("[id=firstName]"));
	  user.sendKeys("Aarti");
	  String Firstnm=user.getAttribute("type");
	  System.out.println("First Name input :"+Firstnm);
	  Thread.sleep(5000);
	  user=driver.findElement(By.cssSelector("[id=lastName]"));
	  user.sendKeys("Saindane");
	  System.out.println("Lastname Input:"+user.getAttribute("type"));
	  Thread.sleep(4000);
	  user=driver.findElement(By.cssSelector("[id=userEmail]"));
	  user.sendKeys("aarti.saindane@gmail.com");
	  Thread.sleep(4000);
	  driver.findElement(By.xpath("//input[@id='gender-radio-2']")).click();
	   /*Actions act= new Actions(driver);
	   act.moveToElement(user).click().build().perform(); */
	   Thread.sleep(2000);
	   user=driver.findElement(By.xpath("//input[@id='userNumber']"));
	   user.sendKeys("7276577746");
	   Thread.sleep(3000);
	   /*driver.findElement(By.xpath("//input[@id='dateOfBirthInput']")).clear();
	   //user.sendKeys("19 Oct 1993");
	   Thread.sleep(6000);*/
	   user=driver.findElement(By.xpath("//div[@id='subjectsContainer']"));
	   user.sendKeys("Math");
	   Thread.sleep(2000);
	 
	   
	  
	  
	  
  }
  

}
