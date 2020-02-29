package Feb22;


import java.util.List;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Seleniumasic3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Chromedriver\\chromedriver.exe");
		WebDriver  driver=new ChromeDriver();
		
		driver.get("https://demoqa.com/automation-practice-form");
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/automation-practice-form");
		String title=driver.getTitle();
		System.out.println(title);

		WebElement name=driver.findElement(By.name("firstname"));
		name.sendKeys("AMAR");
		WebElement lastname=driver.findElement(By.id("lastname"));
		lastname.sendKeys("nimbalkar");
		List<WebElement>list=driver.findElements(By.name("sex"));
		System.out.println(list.size());
		System.out.println(list);
		list.get(1).click();
		
		List<WebElement>yearoffexp=driver.findElements(By.name("exp"));
		System.out.println(yearoffexp.size());
		yearoffexp.get(6).click();
		
		List<WebElement>profession=driver.findElements(By.name("profession"));
		System.out.println(profession.size());
		for(WebElement ele : profession){
			ele.click();
		}
		
		List<WebElement>tools=driver.findElements(By.name("tool"));
		
		for(WebElement tool : tools){
			if ((tool.getAttribute("value").contains("Selenium Webdriver")))
{
		
			tool.click();
}
				
	}

	}}
