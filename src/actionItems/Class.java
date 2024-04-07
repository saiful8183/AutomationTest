package actionItems;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Class {

	public static void main(String[] args) {


		

		WebDriverManager.edgedriver().setup();

		// Creat a webdriver instance of edgedriver
		WebDriver driver = new EdgeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get("https://www.target.com/");

		String expectedTitle ="Target : Expect More. Pay Less.";

		
	
		// Capture actual title
		String actualtitle = driver.getTitle();
		
		System.out.println(actualtitle);

		if (expectedTitle.equalsIgnoreCase(actualtitle)) {

			System.out.println(" Title validation pass");

		} else {
			System.out.println(" Title validation Failed");
		}
          driver.close();

	}

}
