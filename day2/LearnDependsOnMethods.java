package week5.day2;

import org.testng.annotations.Test;

public class LearnDependsOnMethods
{
	@Test
	public void CreateLead()
	{
		System.out.println("CreateLead");
		throw new RuntimeException();
	}
	@Test(timeOut = 3000)
	public void EditLead() throws InterruptedException
	{
		Thread.sleep(2000);
		System.out.println("DeleteLead");
	}
	@Test(dependsOnMethods = {"CreateLead"},alwaysRun = true)
	public void DeleteLead()
	{
		System.out.println("DeleteLead");
}
}