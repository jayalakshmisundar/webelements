package maven;

import java.util.List;

import javax.swing.border.TitledBorder;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class workingwithelements 
{
	WebDriver driver;

	@BeforeTest
	
		public void beforeTest()
		{
		//Automatically downloads driver from the server and helps you to run the program//
		//whatever the version it automatically downloads the version and executes//
		WebDriverManager.chromedriver().setup();
		
		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com");
		//
		//driver.get("https://demo.guru99.com/test/newtours/");
		//getTitle is to fetch the title of the webpage store it in string variable called Title//
		//String Title = driver.getTitle();
		//String Url = driver.getCurrentUrl();
		//System.out.println(Title + "  "+Url);
		//Title is expected result orangehrm is actual result if not same test will fail//
		//Assert.assertEquals(Title, "OrangeHRM");
		//Assert.assertEquals(Url,"https://opensource-demo.orangehrmlive.com/");
		
		
		
		}
//	@Test
//public void f() throws InterruptedException
//{
//		driver.findElement(By.xpath("//*[@name='userName']")).sendKeys("jaya");
//		driver.findElement(By.xpath("//*[@name='password']")).sendKeys("jaya123");
//		driver.findElement(By.xpath("//*[@name='submit']")).click();
//		//once the login is done assert on login successfull//
//		
//				String hd=driver.findElement(By.xpath("//tbody/tr/td/h3")).getText();
//				Assert.assertEquals("Login Successfully", hd);
//				
//				//linktext is the locator//
//				driver.findElement(By.linkText("Flights")).click();
//				Thread.sleep(3000);
//				//partiallink text locator//
//			//	driver.findElement(By.partialLinkText("Car")).click();
//				driver.findElement(By.xpath("//*[@name='tripType' and @value='oneway']")).click();
//				WebElement dd = driver.findElement(By.name("passCount"));
//				Select sell = new Select(dd);
//				Thread.sleep(3000);
//				//This is basically select the first value in an element by using visible text//
//				sell.selectByVisibleText("1");
//				Thread.sleep(3000);
//				//This is based on index//it will select 4//
//				sell.selectByIndex(3);
//				Thread.sleep(3000);
//				sell.selectByValue("2");
//				WebElement dd1 = driver.findElement(By.name("fromPort"));
//				Select sel2 = new Select(dd1);
//				//Get all the values from the drop down//
//				//If the value is more then we use list of webelement//if i am storing only one value then it is webelement// 
//				List<WebElement>values= sel2.getOptions();
//				//i have to get the size of value//
//				System.out.println(values.size());
//				//if i to print the values//i have to use for loop//
//				for(int i=0;i<values.size();i++)
//				{
//					System.out.println(values.get(i).getText());
//				}
//				//it will select the value from dropdown//select by index is by number it select//
//				sel2.selectByIndex(2);
//				//selectByvalue i by value what we have give//
//				//sel2.selectByValue("London");
//				//Whatever i selected i have to get that value//and store it in variable//
//				//THis below lines are fetch the value from dropdown//
//				WebElement first = sel2.getFirstSelectedOption();
//				System.out.println(first.getAttribute("value"));
//}
	@Test
	public void testcase4() throws InterruptedException
	{
		driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(3000);
		//There is a test case how many visible links are present after login fetch there names and print it
     	//tagname called a this means a link 
		//am i looking for one link or multiple link
		//findElement = this will find one element
		//findelements= this will automatically find all the element
		//when u have 2 or more elements with same attribute we use findelements
		
		      
			
		List<WebElement> link= driver.findElements(By.tagName("a"));
	    //total number of links
		System.out.println("Total number of links are "+link.size());
	    //i want u guys to print all the visible link//using loop
//		for (int i=0;i<link.size();i++)
//		{
//			System.out.println(link.get(i).getText());
//		}
	//for enhanced loop
//		for(WebElement e:link)
//		{
//			String eachlink = e.getText();
//			System.out.println(eachlink);
//			}
	// i want u to logout //tell wt kind of 
//		driver.findElement(By.partialLinkText("welcome")).click();
//		Thread.sleep(3000);
//		driver.findElement(By.linkText("Logout")).click();	
		
		// i want u to click on pin link // write the code
		driver.findElement(By.linkText("PIM")).click();	
		//i want to go back to the previous page
		//there is method called navigate//contains back
		driver.navigate().back();
		//now i want to go forward
		driver.navigate().forward();
		//there is a situation //and that is i want to refresh my page
		driver.navigate().refresh();
		//now i want to navigate to a different URL
		driver.navigate().to("https://www.google.com");
		//driver.get//to get the URL
		//driver.navigate.to//this also will help us to fetch the url
		
}
	
	
@AfterTest
public void afterTest()
{
driver.close();
}

}