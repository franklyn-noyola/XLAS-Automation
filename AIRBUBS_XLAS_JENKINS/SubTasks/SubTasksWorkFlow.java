package SubTasks;

import org.junit.Test;
import org.openqa.selenium.By;

public class SubTasksWorkFlow extends SessionCatalog.SessionCatalogTemplate{
		
@Test
public void SubtasksWorkflowExecutionInit() throws Exception{
		SessionChoice = "SubtaskWorkflow";
		SessionCatalog.SessionCatalogCompleted.SessionCatalogCompletedExecution();
		Thread.sleep(3000);
		SubTasksCreation.SubtasksCreation();
		Thread.sleep(3000);
		SubtasksWorkflowExecution();
}

	public static void SubtasksWorkflowExecution() throws Exception{
		Thread.sleep(2000);
		driver.findElement(By.linkText("Catering Order")).click();
		Workflow = "Workflow1";
		Thread.sleep(1000);
		SubTaskWorkflow();
		Thread.sleep(3000);
		driver.findElement(By.id("parent_issue_summary")).click();
		Thread.sleep(4000);
	driver.findElement(By.linkText("Communication")).click();
		Workflow = "Workflow2";
		Thread.sleep(1000);
		SubTaskWorkflow();
		Thread.sleep(3000);
		driver.findElement(By.id("parent_issue_summary")).click();
		Thread.sleep(4000);
	driver.findElement(By.linkText("Custom Subtask")).click();
		Workflow = "Workflow2";
		Thread.sleep(1000);		
		SubTaskWorkflow();
		Thread.sleep(3000);
		driver.findElement(By.id("parent_issue_summary")).click();
		Thread.sleep(4000);
	driver.findElement(By.linkText("Course Material")).click();
		Workflow = "Workflow1";
		Thread.sleep(1000);
		SubTaskWorkflow();
		Thread.sleep(3000);
		driver.findElement(By.id("parent_issue_summary")).click();
		Thread.sleep(4000);
	driver.findElement(By.linkText("Instructor Booking")).click();
		Workflow = "Workflow1";
		Thread.sleep(1000);
		SubTaskWorkflow();
		Thread.sleep(3000);
		driver.findElement(By.id("parent_issue_summary")).click();
		Thread.sleep(4000);
	driver.findElement(By.linkText("Joining Instructions")).click();
		Workflow = "Workflow2";
		Thread.sleep(1000);
		SubTaskWorkflow();
		Thread.sleep(3000);
		driver.findElement(By.id("parent_issue_summary")).click();
		Thread.sleep(4000);
	driver.findElement(By.linkText("Attendance Sheet and Evaluation Forms Delivery")).click();
		Workflow = "Workflow2";
		Thread.sleep(1000);
		SubTaskWorkflow();
		Thread.sleep(3000);
		driver.findElement(By.id("parent_issue_summary")).click();
		Thread.sleep(4000);
	driver.findElement(By.linkText("Vendor Management")).click();
		Workflow = "VendorManagement";
		Thread.sleep(1000);		
		VendorManagement();
		Thread.sleep(3000);
		driver.findElement(By.id("parent_issue_summary")).click();
		Thread.sleep(4000);
	driver.findElement(By.linkText("Registration Monitoring")).click();		
		Thread.sleep(2000);	
		Workflow = "Workflow2";
		SubTaskWorkflow();
		Thread.sleep(3000);
	driver.findElement(By.id("parent_issue_summary")).click();
		Thread.sleep(4000);	
	driver.findElement(By.linkText("Venue Booking")).click();
		Workflow = "Workflow1";
		Thread.sleep(1000);
		SubTaskWorkflow();
		Thread.sleep(3000);
		driver.findElement(By.id("parent_issue_summary")).click();
		Thread.sleep(4000);			
	driver.findElement(By.linkText("AG Session Overview Form")).click();
		Workflow = "AGOver";
		Thread.sleep(1000);		
		SessionOverviewFormW();
		Thread.sleep(3000);
	driver.findElement(By.id("parent_issue_summary")).click();
		Thread.sleep(3000);
	driver.findElement(By.linkText("Xerox Session Overview Form")).click();
		Workflow = "XeroxOver";
		Thread.sleep(3000);		
		SessionOverviewFormW();
		Thread.sleep(4000);
	driver.findElement(By.id("parent_issue_summary")).click();
		Thread.sleep(3000);	
	SessionCatalog.SessionCatalogTemplate.SessionWCompleted();
	Thread.sleep(2000);
	System.out.println(SessionId+" sent to Complete with all Subtasks created");
	driver.quit();
}
	
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
											if (Workflow.equals("Workflow1")){
												driver.findElement(By.id("action_id_51")).click();
											}
											if (Workflow.equals("Workflow2")){
												driver.findElement(By.id("action_id_71")).click();
												return;
											}
		case "BOOKED":			 			Thread.sleep(2500);
											driver.findElement(By.id("action_id_61")).click();											
											break;
		}

	}
  
  public static void VendorManagement() throws Exception{
	  Thread.sleep(3000);
		Assignee = driver.findElement(By.id("assignee-val")).getText();	 					
		if (!Assignee.equals("TEST USER: XLAS Full Access")){
			driver.findElement(By.id("assign-to-me")).click();
			Thread.sleep(4000);
		}
		Thread.sleep(3000);
	  		Status = driver.findElement(By.id("status-val")).getText();	  		  		
			switch (Status){
			case "OPEN / UPDATE":			driver.findElement(By.id("action_id_11")).click();
											Thread.sleep(3000);
			case "VENDOR SOURCING":			Thread.sleep(3000);
											driver.findElement(By.id("action_id_51")).click();
			case "PO REQUEST SUBMITTED":	Thread.sleep(3000);
											driver.findElement(By.id("action_id_111")).click();								
			case "PENDING CONFIRMATION":	Thread.sleep(3000);
											driver.findElement(By.id("action_id_121")).click();
			case "CONFIRMED":				Thread.sleep(3000);
											driver.findElement(By.id("action_id_61")).click();
											break;
			}

	}
  
  public static void SessionOverviewFormW() throws Exception{
	  Thread.sleep(3000);
		Assignee = driver.findElement(By.id("assignee-val")).getText();	 					
		if (!Assignee.equals("TEST USER: XLAS Full Access")){
			driver.findElement(By.id("assign-to-me")).click();
			Thread.sleep(4000);
		}
		driver.findElement(By.id("action_id_61")).click();
		driver.findElement(By.id("customfield_12531-10")).click();
		driver.findElement(By.id(CancelBoxButton)).click();										
		Thread.sleep(3500);
		driver.findElement(By.id("action_id_71")).click();		
		Thread.sleep(4000);
	  		Status = driver.findElement(By.id("status-val")).getText();	  		  		
			switch (Status){
			case "DATA ENTRY":						Thread.sleep(3000);
													if (Workflow.equals("XeroxOver")){
														driver.findElement(By.id("action_id_11")).click();
													}
													if (Workflow.equals("AGOver")){
														driver.findElement(By.id("action_id_41")).click();
														return;
													}
			case "PENDING ON-SITE CHECKS":			Thread.sleep(2000);
													driver.findElement(By.id("action_id_21")).click();
			case "ON-SITE CHECKS IN PROGRESS":		Thread.sleep(3000);			
													if (driver.getPageSource().contains("Check 1: Room")){
														driver.findElement(By.id("action_id_81")).click();
														Thread.sleep(2000);
													}
													if (driver.getPageSource().contains("Check 2: Materials")){
														driver.findElement(By.id("action_id_91")).click();
														Thread.sleep(2000);
													}
													if (driver.getPageSource().contains("Check 3: IT")){	
														driver.findElement(By.id("action_id_101")).click();
														Thread.sleep(2000);
													}
													if (driver.getPageSource().contains("Check 4: Catering")){
														driver.findElement(By.id("action_id_111")).click();
														Thread.sleep(2000);
													}
													if (driver.getPageSource().contains("Check 5: Site Access")){
														driver.findElement(By.id("action_id_121")).click();
														Thread.sleep(2000);
													}	
													driver.findElement(By.id("action_id_31")).click();
													Thread.sleep(2000);
													break;	
			}

	}
  
}