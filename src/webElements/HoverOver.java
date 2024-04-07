package webElements;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HoverOver {

	public static void main(String[] args) {

		WebDriverManager.edgedriver().setup();

		// Creat a webdriver instance of edgedriver
		WebDriver driver = new EdgeDriver();// here no weDriver because ,i already declare it 
		   //globally in class level
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));//Global wait
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
		driver.get("https://www.mortgagecalculator.org/"); //user name is admin 
		WebElement mortgageCals=driver.findElement(By.xpath("//a[text()='ARM']"));	           
	
	Actions act=new Actions(driver);//create an object of an action class
	act.moveToElement(mortgageCals).perform();//do method chaining to perform certain action
	
	
	
	
	
	    //For screenshot//( Q) How do you capture screenshote in selenium webdriver
	
		
		 /* hoverOverTest.captureScreenshot(driver);
		  
		  }
		  
		  public static void captureScreenshot(WebDriver driver) {
		  
		  TakesScreenshot ts =(TakesScreenshot)driver;
		 
		  try {
		 File src=ts.getScreenshotAs(OutputType.FILE);
		  
		  File file=new File(System.getProperty("user.dir")+"//Screenshots/image.png");
		  
		  FileHandler.copy(src, file);
		  System.out.println("screenshot is captured inside the folder");
		  
		  }catch(Exception e) {
		  
		  System.out.println("Sorry,could not captured screenshort !!");
		  
		  e.printStackTrace();
		  
		  }*/


	}

}
