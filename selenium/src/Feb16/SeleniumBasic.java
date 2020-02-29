
package Feb16;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumBasic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "C:\\Chromedriver\\chromedriver.exe");
		WebDriver  driver=new ChromeDriver();
		
		driver.get("https://www.seleniumeasy.com/test/input-form-demo.html");
		driver.manage().window().maximize();
		
		driver.get("https://www.seleniumeasy.com");
		driver.findElement(By.linkText("Appium")).click();

		WebElement name=driver.findElement(By.name("first_name"));
		name.sendKeys("AMAR");
		WebElement lastname=driver.findElement(By.name("last_name"));
		lastname.sendKeys("nimalkar");
		WebElement email=driver.findElement(By.name("email"));
		email.sendKeys("amar.nimalkar@gmail.com");
		WebElement phone=driver.findElement(By.name("phone"));
		phone.sendKeys("9999999999");
		WebElement address=driver.findElement(By.name("address"));
		address.sendKeys("baramati");
		WebElement city=driver.findElement(By.name("city"));
		city.sendKeys("pune");
		
		
		
		
		
	
		
	}

}
