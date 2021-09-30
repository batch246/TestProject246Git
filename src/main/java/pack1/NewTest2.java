package pack1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class NewTest2 {
  @Test
  public void f() {
	  
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\getni\\OneDrive\\Desktop\\Neelam drive\\chromedriver_win32 (4)\\chromedriver.exe");
		
	  WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
	  Actions act = new Actions(driver);
	  WebElement rchere = driver.findElement(By.xpath("/html/body/div/section/div/div/div/p/span"));
	  act.contextClick(rchere).build().perform();
	  
	  
  }
}
