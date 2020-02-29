package Feb22;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		System.setProperty("webdriver.chrome.driver", "C:\\Chromedriver\\chromedriver.exe");
		WebDriver  driver=new ChromeDriver();
		
		driver.get("http://newtours.demoaut.com/mercuryregister.php");
		driver.manage().window().maximize();
		driver.get("http://newtours.demoaut.com/mercuryregister.php");
		String title=driver.getTitle();
		System.out.println(title);

		WebElement name=driver.findElement(By.name("firstName"));
		name.sendKeys("AMAR");
		WebElement lastname=driver.findElement(By.id("lastName"));
		lastname.sendKeys("nimbalkar");
		WebElement phone=driver.findElement(By.name("phone"));
		phone.sendKeys("9999999999");
		WebElement email=driver.findElement(By.name("userName"));
		email.sendKeys("amar.nimalkar@gmail.com");
		
		WebElement address=driver.findElement(By.name("address1"));
		address.sendKeys("baramati");
		WebElement city=driver.findElement(By.name("city"));
		city.sendKeys("pune");
		WebElement state=driver.findElement(By.name("state"));
		city.sendKeys("pune");
		WebElement postalcode=driver.findElement(By.name("postalCode"));
		city.sendKeys("413116");
		driver.findElement(By.name("register")).click();
	}

}
