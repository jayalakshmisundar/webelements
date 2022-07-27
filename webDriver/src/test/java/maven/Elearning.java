package maven;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Elearning {
	
	WebDriver driver;
	
	@BeforeTest
	
	public void beforeTest()
	{
WebDriverManager.chromedriver().setup();
		
		driver=new ChromeDriver();
		//driver.get("https://opensource-demo.orangehrmlive.com");
		driver.get("http://elearningm1.upskills.in");

	}			


	@Test

	public void f() throws InterruptedException
	{
			driver.findElement(By.xpath("//*[@placeholder='Username']")).sendKeys("jaya");
			driver.findElement(By.xpath("//*[@name='password']")).sendKeys("jaya123");
			driver.findElement(By.xpath("//*[@name='submitAuth']")).click();
			driver.findElement(By.linkText("Compose")).click();
			driver.findElement(By.xpath("//*[@class='select2-search__field']")).click();
			driver.findElement(By.xpath("//*[@class='select2-search__field']")).sendKeys("pavisundhar@gmail.com");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@class='select2-search__field']")).sendKeys(Keys.ENTER);
			
			driver.findElement(By.xpath("//*[@name='title']")).sendKeys("Hi");
		
			//driver.findElement(By.xpath("//*[@class='select2-search__field']")).click();
			//Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id='file-descrtiption']")).sendKeys("pavi");
			driver.findElement(By.xpath("//*[@name='compose']")).click();
			
			driver.findElement(By.xpath("//*[@id='logout_button']")).click();
			driver.close();
			
			
}
	@AfterTest
	public void afterTest()
	{
//	driver.close();
	}

	}
