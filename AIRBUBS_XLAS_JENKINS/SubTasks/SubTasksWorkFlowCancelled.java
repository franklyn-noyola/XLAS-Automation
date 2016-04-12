package SubTasks;

import org.junit.Test;
import org.openqa.selenium.By;

public class SubTasksWorkFlowCancelled extends SessionCatalog.SessionCatalogTemplate{
		
@Test
public void SubtasksWorkflowExecutionInit() throws Exception{
		SessionChoice = "SubtaskWorkflow";
		SessionCatalog.SessionCatalogCompleted.SessionCatalogCompletedExecution();
		Thread.sleep(1000);
		SubTasksCreation.SubtasksCreation();
		Thread.sleep(1000);
		SubtasksWorkflowExecution();
}

	public static void SubtasksWorkflowExecution() throws Exception{
		Thread.sleep(2000);
		driver.findElement(By.linkText("Catering Order")).click();
		Workflow = "Workflow1";
		Thread.sleep(1000);
		SubTaskWorkflow();
		Thread.sleep(2000);
		driver.findElement(By.id("parent_issue_summary")).click();
		Thread.sleep(3000);
	driver.findElement(By.linkText("Communication")).click();
		Workflow = "Workflow2";
		Thread.sleep(1000);
		SubTaskWorkflow();
		Thread.sleep(1000);
		driver.findElement(By.id("parent_issue_summary")).click();
		Thread.sleep(3000);
	driver.findElement(By.linkText("Custom Subtask")).click();
		Workflow = "Workflow2";
		Thread.sleep(1000);		
		SubTaskWorkflow();
		Thread.sleep(1000);
		driver.findElement(By.id("parent_issue_summary")).click();
		Thread.sleep(3000);
	driver.findElement(By.linkText("Course Material")).click();
		Workflow = "Workflow1";
		Thread.sleep(1000);
		SubTaskWorkflow();
		Thread.sleep(1000);
		driver.findElement(By.id("parent_issue_summary")).click();
		Thread.sleep(3000);
	driver.findElement(By.linkText("Instructor Booking")).click();
		Workflow = "Workflow1";
		Thread.sleep(1000);
		SubTaskWorkflow();
		Thread.sleep(1000);
		driver.findElement(By.id("parent_issue_summary")).click();
		Thread.sleep(3000);
	driver.findElement(By.linkText("Joining Instructions")).click();
		Workflow = "Workflow2";
		Thread.sleep(1000);
		SubTaskWorkflow();
		Thread.sleep(1000);
		driver.findElement(By.id("parent_issue_summary")).click();
		Thread.sleep(3000);
	driver.findElement(By.partialLinkText("Attendance Sheet and Evaluation Forms Delivery")).click();
		Workflow = "Workflow2";
		Thread.sleep(1000);
		SubTaskWorkflow();
		Thread.sleep(1000);
		driver.findElement(By.id("parent_issue_summary")).click();
		Thread.sleep(3000);
	driver.findElement(By.linkText("Vendor Management")).click();
		Workflow = "Workflow1";
		Thread.sleep(1000);		
		SubTaskWorkflow();
		Thread.sleep(1000);
		driver.findElement(By.id("parent_issue_summary")).click();
		Thread.sleep(3000);
	driver.findElement(By.linkText("Registration Monitoring")).click();		
		Thread.sleep(2000);	
		Workflow = "Workflow2";
		SubTaskWorkflow();
		Thread.sleep(3000);
	driver.findElement(By.id("parent_issue_summary")).click();
		Thread.sleep(3000);	
	driver.findElement(By.linkText("Venue Booking")).click();
		Workflow = "Workflow1";
		Thread.sleep(1000);
		SubTaskWorkflow();
		Thread.sleep(3000);
		driver.findElement(By.id("parent_issue_summary")).click();
		Thread.sleep(3000);			
	driver.findElement(By.linkText("AG Session Overview Form")).click();
		Workflow = "Workflow3";
		Thread.sleep(1000);		
		SubTaskWorkflow();
		Thread.sleep(3000);
	driver.findElement(By.id("parent_issue_summary")).click();
		Thread.sleep(3000);
	driver.findElement(By.linkText("Xerox Session Overview Form")).click();
		Workflow = "Workflow3";
		Thread.sleep(1000);		
		SubTaskWorkflow();
		Thread.sleep(3000);
	driver.findElement(By.id("parent_issue_summary")).click();
		Thread.sleep(3000);	
	SessionCatalog.SessionCatalogTemplate.SessionWCancellation();
	Thread.sleep(2000);
	System.out.println(SessionId+" was Cancelled with all Subtasks cancelled");
	driver.quit();
}
	
  public static void SubTaskWorkflow() throws Exception{
	  Thread.sleep(3000);
		Assignee = driver.findElement(By.id("assignee-val")).getText();	 					
		if (!Assignee.equals("TEST USER: XLAS Full Access")){
			driver.findElement(By.id("assign-to-me")).click();
			Thread.sleep(4000);
		}
		if (Workflow.equals("Workflow1")){
			driver.findElement(By.id("action_id_21")).click();
			Thread.sleep(1000);			
			driver.findElement(By.id("customfield_10196")).sendKeys("This SubTask has been cancelled");
			driver.findElement(By.id("issue-workflow-transition-submit")).click();
			Thread.sleep(3000);
			return;
		}
		if (Workflow.equals("Workflow2")){
			driver.findElement(By.id("action_id_51")).click();
			Thread.sleep(1000);			
			driver.findElement(By.id("customfield_10196")).sendKeys("This SubTask has been cancelled");
			driver.findElement(By.id("issue-workflow-transition-submit")).click();
			Thread.sleep(3000);
			return;
		}
		if (Workflow.equals("Workflow3")){
			driver.findElement(By.id("action_id_131")).click();
			Thread.sleep(1000);			
			driver.findElement(By.id("customfield_10196")).sendKeys("This SubTask has been cancelled");
			driver.findElement(By.id("issue-workflow-transition-submit")).click();
			Thread.sleep(3000);
			return;
		}
		
			}

	
  
}