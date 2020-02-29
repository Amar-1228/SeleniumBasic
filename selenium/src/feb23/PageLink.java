package feb23;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageLink {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Chromedriver\\chromedriver.exe");
		WebDriver  driver=new ChromeDriver();
		
		driver.get("https://google.co.in");
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
	List<WebElement>alllinks=driver.findElements(By.tagName("a"));
	System.out.println(alllinks);
	for(WebElement link : alllinks){
	System.out.println(link.getText() + "----->" + link.getAttribute("href"));
		
	}
	
	
	}

}
