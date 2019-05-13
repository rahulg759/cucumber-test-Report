package rough;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "E:\\My_Workspace\\basic\\Cucumber-framework-testNG-1\\Cucumber_framework\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver = new FirefoxDriver();
		driver.manage().window().maximize();

		driver.get("https://www.carsguide.com.au/buy-a-car/new-and-used-car-search");
		
		WebElement e1=driver.findElement(By.xpath("//*[@id='makes']"));
		Select select=new Select(e1);
		select.selectByVisibleText("BMW");
		System.out.println("BMW selected");
		
		Thread.sleep(5000);
		WebElement e2=driver.findElement(By.xpath("//*[@id='models']"));
		Select select1=new Select(e2);
		select1.selectByValue("118D");

	}

}
