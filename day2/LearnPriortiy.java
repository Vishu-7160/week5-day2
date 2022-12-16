package week5.day2;

import org.testng.annotations.Test;

public class LearnPriortiy 
{
	@Test
	public void CreateLead()
	{
		System.out.println("CreateLead");
	}
	@Test(priority = 1)
	public void DeleteLead()
	{
		System.out.println("DeleteLead");
	}
	@Test(enabled = true)
	public void EditLead()
	{
		System.out.println("Edit Lead");
	}
	@Test(priority =2)
	public void DuplicateLead()
	{
		System.out.println("Duplicate Lead");
	}
	@Test(enabled = false)
	public void MergeLead()
	{
		System.out.println("MergeLead");
	}
	
}
