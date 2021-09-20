package webElementExecutionTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebElement_Execution_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.nexchar.com/signup");
		WebElement customerName,emailAddress,password, checkBox, createNewAcc;
		customerName=driver.findElement(By.id("Name"));
		customerName.sendKeys("Sabbir Rahman");
		
		Select businessType=new Select(driver.findElement(By.id("CategoryId")));
		businessType.selectByVisibleText("Fashion and clothing retail");
		
		emailAddress=driver.findElement(By.id("Email"));
		emailAddress.sendKeys("recehi2200@u461.com");
		
		password=driver.findElement(By.id("Password"));
		password.sendKeys("3485943758375");

		checkBox=driver.findElement(By.id("NotReceiveNewsLetter"));
		checkBox.click();
		
		createNewAcc=driver.findElement(By.xpath("//button[contains(text(),'Create new account')]"));
		createNewAcc.click();
		
		
		
		
	}

}
