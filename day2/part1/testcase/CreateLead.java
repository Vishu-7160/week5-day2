package week5.day2.part1.testcase;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead extends ProjectSpecificMethod{
	@Test(dataProvider = "createLead")
	public void runCreateLead(String cname,String fname,String lname,String phnm)
	{
	
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Hari");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("R");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("99");
		driver.findElement(By.name("submitButton")).click();
		
}
	@DataProvider(name = "createLead")
	public String[][] getData()
	{
		String[][] data = new String[2][4];
		data[0][0]= "TestLeaf";
		data[0][1]="Vishalini";
		data[0][2]= "V N ";
		data[0][3] = "99";
		data[1][0]= "Qspiders";
		data[1][1]="Ram";
		data[1][2]= "gopi ";
		data[1][3] = "98";
		return data;
	}
}







