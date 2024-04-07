package webElements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckBoxHandling {

	public static void main(String[] args) {


		

		WebDriverManager.edgedriver().setup();

		// Creat a webdriver instance of edgedriver
		WebDriver driver = new EdgeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://testpages.herokuapp.com/styled/basic-html-form-test.html"); 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
		
		
		WebElement checkbox1=driver.findElement(By.xpath("//input[@value='cb1']"));
		
		checkbox1.isDisplayed();
		checkbox1.isEnabled();
		
		//select status
		checkbox1.isSelected();
		
		//checking all three condition to click on the check box
		
		if(checkbox1.isDisplayed() && checkbox1.isEnabled() &&  checkbox1.isSelected()) {
			
			checkbox1.click();
		}
			System.out.println("Checkbox is selected:"+ checkbox1.isSelected());
			
			driver.close();


	}

}
