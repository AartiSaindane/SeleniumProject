package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class MyFirstSeleniumPrgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		/*driver= new ChromeDriver();
		driver.get("https://nichethyself.com/tourism/home.html");*/
		driver= new EdgeDriver();
		driver.get("https://nichethyself.com/tourism/home.html");
		WebElement user= driver.findElement(By.name("username"));
		user.sendKeys("stc123");
		WebElement password=driver.findElement(By.name("password"));
		password.sendKeys("12345");
		password.submit();	
		String expectedTitleafterlogin="My account";
		String ActualTitlebeforelogin=driver.getTitle();
		if(expectedTitleafterlogin.equals(ActualTitlebeforelogin))
		{
			System.out.println("Login Successful");
			
		}
		else
		{
			System.out.println("Login Failed");
		}
         driver.quit();
	}

}
