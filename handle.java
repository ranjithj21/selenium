package webdrive;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class handle {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\win10\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.bus.irctc.co.in/home");
		
		WebElement u1 = driver.findElement(By.xpath("/html/body/app-root/ng-component/div[3]/div[1]/ul/li[4]/a/div"));
		Thread.sleep(3000);
		u1.click();
		Thread.sleep(3000);
		
		for(String u2 : driver.getWindowHandles()) {
			driver.switchTo().window(u2);
		}
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebElement u3 = driver.findElement(By.xpath("//*[@id=\"headingOne\"]/h2/button"));
		u3.click();
		driver.switchTo().defaultContent();
		//driver.close();
	}

}
//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
// IMPLICIT WAIT

//doubt
//get 