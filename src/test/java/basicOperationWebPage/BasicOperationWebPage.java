package basicOperationWebPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasicOperationWebPage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.demoblaze.com/index.html");
		
		//Capture current url of the webpage
		System.out.println("Current Url is "+driver.getCurrentUrl());
		
		//Capture current title
		System.out.println("Title is "+driver.getTitle());
		
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
		
		//wait 5 seconds
		Thread.sleep(5000);
		
		//refresh page
		driver.navigate().refresh();
		
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.aftercareexplained.com/");
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.chhoto.link/");
		
		
		driver.close();
		driver.quit();

	}

}
