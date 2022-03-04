package fi.selenium_task3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class App 
{
		WebDriver driver;
		public void launchBrowser() 
		{
			System.setProperty("webdriver.chrome.driver", 
					//"D:\\msedgedriver.exe");
			"D:\\chromedriver.exe");
			 driver = new ChromeDriver();
		}
		
		 public void navigate() throws InterruptedException {
			 	driver.navigate().to("http://www.flipkart.com");
			 	Thread.sleep(2000);
			 	System.out.println("This is the title of the website" + driver.getTitle());
			 	driver.findElement(By.xpath("//div[@class='_1XBjg- row']//form//input[@type='text']")).sendKeys("7021599272");
			 	driver.findElement(By.xpath("//div[@class='_1XBjg- row']//form//input[@type='password']")).sendKeys("Bhavesh@3105");
			 	driver.findElement(By.xpath("//div[@class='_1XBjg- row']//form//button[@type='submit']")).click();
			 	
			 	driver.close();
			 }


			 	public static void main(String[] args) throws InterruptedException {
			 	App ob = new App();
			 	ob.launchBrowser();
			 	ob.navigate();
			 }  }