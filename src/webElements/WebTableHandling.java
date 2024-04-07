package webElements;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTableHandling {

	public static void main(String[] args) {
	
		

		WebDriverManager.edgedriver().setup();

		// Creat a webdriver instance of edgedriver
		WebDriver driver = new EdgeDriver();// here no weDriver because ,i already declare it 
		   //globally in class level
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));//Global wait
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
		driver.get("https://www.w3schools.com/html/html_tables.asp"); //user name is admin 
		
		
		
		WebElement customertable=driver.findElement(By.xpath("//table[@id='customers']/child::tbody"));	
       //Capturing all the rows of the table
		List<WebElement>rows=customertable.findElements(By.tagName("tr"));
		
		
		
		for(WebElement row:rows) {
			
			List<WebElement>cells=row.findElements(By.tagName("th"));	
			
			for(WebElement saiful:cells) {
				
				System.out.print(saiful.getText()+ "\t");	
				
				
			}
			
			
			System.out.println();
			
		}
		
		
		
		
		
		
		
		//capture all the cells of a table
		
		//List<WebElement> cells=mortgageCals.findElements(By.tagName("th"));
		
		//System.out.println(cells.size());
		
		



	}

}
