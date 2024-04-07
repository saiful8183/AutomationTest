package webElements;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropdownHandling {

	public static void main(String[] args) {


		


		WebDriverManager.edgedriver().setup();

		// Creat a webdriver instance of edgedriver
		WebDriver driver = new EdgeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://testpages.herokuapp.com/styled/basic-html-form-test.html"); 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
		
	
		
		WebElement dropdown=driver.findElement(By.xpath("//select[@name='dropdown']"));
		
		
		dropdown.isDisplayed();
		
		dropdown.isEnabled();
		
		
		
		//creat a reference vereiavle of select class of 
		Select dropdownSelect=new Select(dropdown);
		
		//select by visible text
		//dropdownSelect.selectByVisibleText("Drop Down Item 2");
		// select by value
		//dropdownSelect.selectByValue("dd6");
		
		
		//selece by index
		
		dropdownSelect.selectByIndex(0);
		
		//Capturing how many options are available under a dropdown
		
		
		List<WebElement> dropdownoptions=dropdownSelect.getOptions();
		
		int totaloptions=dropdownoptions.size();
		
		
		System.out.println("The available options are:"+totaloptions);
		
		for(WebElement opt:dropdownoptions) {
			
			System.out.println(opt.getText());
			
		}
		
		
		
		driver.close();		
		


	}

}
