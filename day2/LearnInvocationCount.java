package week5.day2;

import org.testng.annotations.Test;

public class LearnInvocationCount 
{
	@Test(invocationCount = 2,invocationTimeOut = 1000,threadPoolSize = 3)
	public void CreateLead() throws InterruptedException
	{
		Thread.sleep(2000);
		System.out.println("CreateLead");
	}
	@Test
	public void DeleteLead()
	{
		System.out.println("DeleteLead");
	}
}
