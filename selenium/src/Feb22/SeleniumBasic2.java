package Feb22;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumBasic2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Chromedriver\\chromedriver.exe");
		WebDriver  driver=new ChromeDriver();
		
		driver.get("https://www.toolsqa.com/automation-practice-form");
		driver.manage().window().maximize();
		driver.get("https://www.toolsqa.com/automation-practice-form");
		String title=driver.getTitle();
		System.out.println(title);

		WebElement name=driver.findElement(By.name("firstname"));
		name.sendKeys("AMAR");
		WebElement lastname=driver.findElement(By.id("lastname"));
		lastname.sendKeys("nimbalkar");
		driver.findElement(By.id("sex-0")).click();
		driver.findElement(By.id("exp-3")).click();
		
		
		
	
	}

}
