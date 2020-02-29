package feb23;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "C:\\Chromedriver\\chromedriver.exe");
		WebDriver  driver=new ChromeDriver();
		
		driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
		driver.manage().window().maximize();
	   WebElement dd= driver.findElement(By.id("select-demo"));
	     Select obj=new Select(dd);
	     obj.selectByValue("Friday");
	
	Select  sel= new Select( driver.findElement(By.name("States")));
	sel.selectByIndex(1);
	sel.selectByValue("California");
	//sel.deselectAll();
	Thread.sleep(2000);
	driver.close();
	}

}
