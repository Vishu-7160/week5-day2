package week5.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.sukgu.Shadow;

public class HandleShadowdom {

	public static void main(String[] args) throws InterruptedException 
	{
		//1 Launch ServiceNow application
				WebDriverManager.chromedriver().setup();
				ChromeDriver driver= new ChromeDriver();
				driver.get("https://dev131967.service-now.com");
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				//2. Login with valid credentials username and password
				driver.findElement(By.xpath("//input[@id='user_name']")).sendKeys("admin");
				driver.findElement(By.xpath("//input[@id='user_password']")).sendKeys("Rdd4W-kP6P=s");
				driver.findElement(By.xpath("//button[text()='Log in']")).click();
				Shadow sh = new Shadow(driver);
				sh.setImplicitWait(30);
				sh.findElementByXPath("//div[text()='All']").click();
				sh.findElementByXPath("//span[text()='Service Catalog']").click();
				WebElement frame1 = sh.findElementByXPath("//iframe[@id='gsft_main']");
				driver.switchTo().frame(frame1);
				driver.findElement(By.xpath("//h2[text()[normalize-space()='Mobiles']]")).click();
				driver.switchTo().defaultContent();
				WebElement frame = sh.findElementByXPath("//iframe[@id='gsft_main']");
				driver.switchTo().frame(frame);
				driver.findElement(By.xpath("//strong[text()='Apple iPhone 13']")).click();
				driver.findElement(By.xpath("//label[text()='Yes']")).click();
				driver.findElement(By.xpath("(//span[text()='What was the original phone number?']/following::input)[2]")).sendKeys("1000000");
				WebElement dropmenu2 = driver.findElement(By.xpath("//select[@class='form-control cat_item_option ']"));
				Select d2 = new Select(dropmenu2);
				d2.selectByVisibleText("500MB");
				driver.findElement(By.xpath("//label[text()='Blue']")).click();
				sh.setImplicitWait(30);
				driver.findElement(By.xpath("//label[text()='512 GB']")).click();
				driver.switchTo().defaultContent();
				sh.setImplicitWait(30);
				WebElement orderframe = sh.findElementByXPath("//iframe[@id='gsft_main']");
				driver.switchTo().frame(orderframe);
				driver.findElement(By.xpath("//button[contains(text(),'Order Now')]")).click();
				driver.switchTo().defaultContent();
				WebElement reqframe = sh.findElementByXPath("//iframe[@id='gsft_main']");
				driver.switchTo().frame(reqframe);
				driver.switchTo().defaultContent();
				WebElement totalFrame = sh.findElementByXPath("//iframe[@id='gsft_main']");
				driver.switchTo().frame(totalFrame);
				String reqID = driver.findElement(By.xpath("//a[@class='linked requestItemUrl']//b[1]")).getText();
				System.out.println(reqID);
				
				

}
}