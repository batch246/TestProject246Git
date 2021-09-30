package pack1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class NewTest1 {
  @Test
  public void f() {
	  
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\getni\\OneDrive\\Desktop\\Neelam drive\\chromedriver_win32 (4)\\chromedriver.exe");
		
	   WebDriver driver = new ChromeDriver();
	  
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	   
	   driver.get("https://ui.freecrm.com/");  
	  
	  String atitle = driver.getTitle();
	  String etitle = "cogmento CRM";
	 
	  
	  
  }
}
