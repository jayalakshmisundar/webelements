package maven;

public class Testing {

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.Assert;
	import org.testng.annotations.AfterTest;
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Test;

	import io.github.bonigarcia.wdm.WebDriverManager;

	public class Testing {
		WebDriver driver;
		 @BeforeTest
		  public void beforeTest()
		 {
			 	WebDriverManager.chromedriver().setup();
			 	driver=new ChromeDriver();
				driver.get("https://opensource-demo.orangehrmlive.com/");
				driver.manage().window().maximize();
				//String Title=driver.getTitle();
				//String Url=driver.getCurrentUrl();
				//System.out.println(Title+"  "+Url);
				//Assert.assertEquals(Title,"OrangeHRM");
			//	Assert.assertEquals(Url,"https://opensource-demo.orangehrmlive.com/");
		  }
		@Test
	public void f() throws InterruptedException
	{
			//driver.manage().window().maximize();
			String Title=driver.getTitle();
			driver.findElement(By.id("txtUsername")).sendKeys("Admin");
			String username=driver.findElement(By.id("txtUsername")).getAttribute("value");
			System.out.println(username);
			Assert.assertEquals(username,"Admin");
			driver.findElement(By.id("txtPassword")).sendKeys("admin123");
			String password=driver.findElement(By.id("txtPassword")).getAttribute("value");
			System.out.println(password);
			Assert.assertEquals(password,"admin123");
			//Assert.assertEquals("admin123","admin123");
			String login=driver.findElement(By.id("btnLogin")).getAttribute("value");
			System.out.println(login);
			driver.findElement(By.id("btnLogin")).click();
			//Assert.assertEquals(login,"LOGIN");
			Thread.sleep(3000);
			String Title1=driver.getTitle();
			if (Title.equalsIgnoreCase(Title1)) {
				driver.findElement(By.id("welcome")).click();
				Thread.sleep(3000);
				driver.findElement(By.xpath("//*[@id='welcome-menu']/ul/li[3]/a")).click();
			}
			else {
				System.out.println("It is not same");
			}
			
	}
	 @AfterTest
	public void afterTest()
	{
		  driver.close();
	}

	}
	
	
	
	
	
}
