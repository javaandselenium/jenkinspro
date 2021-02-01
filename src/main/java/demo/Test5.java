package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test5 {
	@Test
	public void sample() {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ebay.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebElement ele = driver.findElement(By.linkText("Fashion"));
		Actions a=new Actions(driver);
		a.moveToElement(ele).perform();
		driver.findElement(By.linkText("Watches")).click();
		
		Reporter.log("Jai ganesha",true);
	}

}
