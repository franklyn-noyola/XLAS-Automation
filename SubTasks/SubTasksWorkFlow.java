package AIRBUBS_XLAS_JENKINS.SubTasks;

import org.openqa.selenium.By;

public class SubTasksWorkFlow extends AIRBUBS_XLAS_JENKINS.CourseCatalog.CourseCatalogTemplate{
	public static String Status = "customfield_10118";
	public static String Comments = "customfield_10113";
	public static String Subpath = "issuetype-field";
	public static String TimeDays = "customfield_10117";
	
  public static void SubTaskWorkflow() throws Exception{
	  Thread.sleep(3000);
		Assignee = driver.findElement(By.id("assignee-val")).getText();	 					
		if (!Assignee.equals("TEST USER: XLAS Full Access")){
			driver.findElement(By.id("assign-to-me")).click();
			Thread.sleep(4000);
		}
		Thread.sleep(3000);
	  		Status = driver.findElement(By.id("status-val")).getText();	  		
		switch (Status){									
		case "OPEN / UPDATE":				driver.findElement(By.id("action_id_11")).click();
		case "REQUEST SUBMITTED": 			Thread.sleep(2500);
											driver.findElement(By.id("action_id_71")).click();											
											break;
		}

	}
  
}