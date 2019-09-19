package org.sample;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowLaunch {
	public static void main(String[] args) throws AWTException, InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DELL\\eclipse-workspace\\091819\\BrowersLaunch\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.snapdeal.com");
		WebElement search = driver.findElement(By.id("inputValEnter"));
		search.sendKeys("slipper");
		TakesScreenshot tk = (TakesScreenshot)driver;
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
			//driver.findElement(By.className("undefined sel")).click();
			driver.findElement(By.xpath("//input[@type='button']")).click();
		File src = tk.getScreenshotAs(OutputType.FILE);
		System.out.println(src);
		File dest = new File("C:\\Users\\DELL\\Desktop\\screenshot\\vish.png");
		FileUtils.copyFile(src, dest);
		System.out.println("done");
	}
}
		
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			