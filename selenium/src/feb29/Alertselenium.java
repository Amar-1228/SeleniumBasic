package feb29;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertselenium {

	
		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub

			
			System.setProperty("webdriver.chrome.driver", "C:\\Chromedriver\\chromedriver.exe");
			WebDriver  driver=new ChromeDriver();
			
			driver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
			driver.manage().window().maximize();
			driver.findElement(By.xpath("//button[contains(text(),'Click me!')]")).click();
			
	          Alert Alt= driver.switchTo().alert();
	          Thread.sleep(3000);
	         Alt.accept();
	         driver.findElement(By.xpath("//button[contains(text(),'Click for Prompt Box')]")).click();
	        // Thread.sleep(3000);
	         Alt.sendKeys("Hello pune");
	         Thread.sleep(3000);
	         Alt.accept();
			
}
}