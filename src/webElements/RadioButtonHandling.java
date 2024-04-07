package webElements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RadioButtonHandling {

	public static void main(String[] args) {


		

		WebDriverManager.edgedriver().setup();

		// Creat a webdriver instance of edgedriver
		WebDriver driver = new EdgeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://testpages.herokuapp.com/styled/basic-html-form-test.html"); 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
		
		
		WebElement radiobutton=driver.findElement(By.xpath("//input[@value='rd1']"));
		
		radiobutton.isDisplayed();
		radiobutton.isEnabled();
		
		//select status
		radiobutton.isSelected();
		
		//checking all three condition to click on the check box
		
		if(radiobutton.isDisplayed() && radiobutton.isEnabled() &&  radiobutton.isSelected()) {
			
			radiobutton.click();
		}
			System.out.println("radiobutton is selected:"+ radiobutton.isSelected());
			
			driver.close();


	}

}
