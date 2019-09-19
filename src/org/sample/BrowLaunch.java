package org.sample;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowLaunch {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DELL\\eclipse-workspace\\091819\\BrowersLaunch\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.snapdeal.com");
		WebElement search = driver.findElement(By.id("inputValEnter"));
		search.sendKeys("slipper");
		Robot a = new Robot();
		a.keyPress(KeyEvent.VK_ENTER);
		a.keyRelease(KeyEvent.VK_ENTER);
		driver.findElement(By.xpath("//img[@title='Do Bhai White Slide Flip flop']")).click();
		String par = driver.getWindowHandle();
		System.out.println(par);
		Set<String> allwind = driver.getWindowHandles();
		for (String v : allwind) {
			if(!v.equals(par)) {
				driver.switchTo().window(v);
				
			}
		}
			Thread.sleep(4000);
			
			driver.findElement(By.xpath("//span[text()='add to cart']")).click();
			driver.findElement(By.xpath("//div[text()='View Cart']")).click();
			driver.findElement(By.xpath("//body[@data-pagename='cartWithBundle']")).click();
			Thread.sleep(2000);
			a.keyPress(KeyEvent.VK_DOWN);
			a.keyRelease(KeyEvent.VK_DOWN);
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			//driver.findElement(By.id("btn marR5")).click();
		
				
	
		/*WebElement nam = driver.findElement(By.id("username"));
		nam.sendKeys("kanmaninambi95@gmail.com");
		driver.findElement(By.xpath("(//button[text()='CONTINUE'])[1]")).click();
		
		WebElement pas = driver.findElement(By.id("w_password"));
		pas.sendKeys("kanmani@12");
		WebElement bt = driver.findElement(By.id("login-done"));
		bt.click();
		driver.findElement(By.id("zip")).sendKeys("641023");
		driver.findElement(By.id("fullName")).sendKeys("vishnu priya");
		driver.findElement(By.className("inputbox2 col-xs-7 text-area valid")).sendKeys("114 nmg street, mettur, podhanur, cbe");
		driver.findElement(By.id("nearestLandmark")).sendKeys("SM. clinic");
		driver.findElement(By.className("inputbox2 col-xs-21 valid")).sendKeys("9976855823");
		driver.findElement(By.id("alternateMobile")).sendKeys("8248483370");
		driver.findElement(By.id("delivery-modes-continue")).click();
		driver.findElement(By.xpath("(//span[@class='circle'])[1]")).click();
		
				driver.findElement(By.xpath("//button[text()='PROCEED TO PAYMENT']")).click();
		driver.findElement(By.id("styledSelect sd-icon-expand-arrow customized")).clear();
		a.keyPress(KeyEvent.VK_UP);
		a.keyRelease(KeyEvent.VK_UP);
		a.keyPress(KeyEvent.VK_ENTER);
		a.keyRelease(KeyEvent.VK_ENTER);*/
		
		
		}
	
		}
