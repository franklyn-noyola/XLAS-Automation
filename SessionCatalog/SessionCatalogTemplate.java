package SessionCatalog;

import java.util.Random;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;

public class SessionCatalogTemplate extends CourseCatalog.CourseCatalogTemplate{
		
		public static String ValidationData = "NoValidation";
		public static String StatR;
		public static String RequesSTask;
		public static String SessionChoice;

public static void SessionFields() throws Exception{
	Thread.sleep(1000);
	driver.findElement(By.id("customfield_10706")).click();
	Thread.sleep(1000);
	driver.findElement(By.name("customfield_10706")).sendKeys("1/Jan/2016");
	driver.findElement(By.id("customfield_10707")).click();
	Thread.sleep(1000);
	driver.findElement(By.name("customfield_10707")).sendKeys("31/Jan/2016");
	Thread.sleep(1000);
	driver.findElement(By.cssSelector("span.ui-icon.ui-icon-plus")).click();
	Thread.sleep(1000);
	new Select(driver.findElement(By.id("location"))).selectByVisibleText("Dominican Republic");
	driver.findElement(By.id("sData")).click();
	Thread.sleep(1000);
	driver.findElement(By.id("cData")).click();
	driver.findElement(By.cssSelector("#add_qecustomfield_10160_grid > div.ui-pg-div > span.ui-icon.ui-icon-plus")).click();
	Thread.sleep(1000);
	driver.findElement(By.id("SAP_ID")).sendKeys("12345678");
	Thread.sleep(1000);
	driver.findElement(By.id("Abbreviation")).sendKeys("ABR");
	driver.findElement(By.id("Name")).sendKeys("Franklyn Noyola");
	driver.findElement(By.id("sData")).click();
	Thread.sleep(1000);
	driver.findElement(By.id("cData")).click();
	Thread.sleep(1000);
	driver.findElement(By.cssSelector("#add_qecustomfield_11042_grid > div.ui-pg-div > span.ui-icon.ui-icon-plus")).click();
	Thread.sleep(1000);
	new Select (driver.findElement(By.id("Language"))).selectByIndex(1);
	Thread.sleep(1000);
	driver.findElement(By.id("sData")).click();
	Thread.sleep(1000);
	driver.findElement(By.id("cData")).click();
	Thread.sleep(1000);
	Thread.sleep(1000);
	new Select(driver.findElement(By.id("customfield_11043"))).selectByVisibleText("Yes");
	//Start Rooms Grid.
	driver.findElement(By.cssSelector("#add_qecustomfield_10162_grid > div.ui-pg-div > span.ui-icon.ui-icon-plus")).click();
	Thread.sleep(600);
	driver.findElement(By.id("SAP_ID")).sendKeys("12345678");
	Thread.sleep(1000);
	driver.findElement(By.id("Abbreviation")).sendKeys("ABR");
	driver.findElement(By.id("Name")).sendKeys("Franklyn Noyola");
	driver.findElement(By.id("RoomBuildingShortcode")).sendKeys("ABR1019191");
	driver.findElement(By.id("RoomBuildingDescription")).sendKeys("Room Bookin");
	Thread.sleep(1000);
	driver.findElement(By.id("sData")).click();
	Thread.sleep(1000);
	driver.findElement(By.id("cData")).click();

}
		
	public static void SessionCatalogExecution() throws Exception{
				Thread.sleep(3000);
				driver.findElement(By.cssSelector("span.icon.drop-menu")).click();
				driver.findElement(By.id("clone-issue-custom1-plus")).click();
				driver.findElement(By.id("issue-create-submit")).click();
				Thread.sleep(1000);
				driver.findElement(By.id("summary")).sendKeys("Session Catalog for Course Catalog");
				Thread.sleep(1000);
				driver.findElement(By.id("submit")).click();
				Thread.sleep(3000);
				driver.findElement(By.cssSelector("span.icon.jira-icon-edit")).click();
				Thread.sleep(1000);
				SessionFields();
				Thread.sleep(1000);
				driver.findElement(By.id("edit-issue-submit")).click();
				Thread.sleep(3500);				
				SubTasks.SubTasksCreation.SessionClosure();
				Thread.sleep(1000);
				if (SessionChoice.equals("Completed")){
					Thread.sleep(1000);
					driver.findElement(By.linkText("Session Closure")).click();
					Thread.sleep(2000);
					SubTasks.SubTasksWorkFlow.SubTaskWorkflow();
					Thread.sleep(2000);
					driver.findElement(By.id("parent_issue_summary")).click();
					Thread.sleep(3000);
				}
				if (SessionChoice.equals("Cancellation")){
					Thread.sleep(1000);
					driver.findElement(By.linkText("Session Closure")).click();
					Thread.sleep(1000);
					if (!Assignee.equals("TEST USER: XLAS Full Access")){
						driver.findElement(By.id("assign-to-me")).click();
						Thread.sleep(4000);
					}
					Thread.sleep(1000);
					driver.findElement(By.id("action_id_51")).click();
					Thread.sleep(1000);
					driver.findElement(By.id("customfield_10196")).clear();
					driver.findElement(By.id("customfield_10196")).sendKeys("It has been cancelled");
					driver.findElement(By.id("issue-workflow-transition-submit")).click();
					Thread.sleep(3000);
					driver.findElement(By.id("parent_issue_summary")).click();
					Thread.sleep(3000);
				}
				Thread.sleep(1000);
				RequesSTask = driver.findElement(By.id("key-val")).getText();
				Thread.sleep(2000);				
					StatR = driver.findElement(By.id("status-val")).getText();
					Thread.sleep(1000);	
				switch(StatR){		
				case "DATA ENTRY":									Thread.sleep(2000);
																	driver.findElement(By.id("action_id_11")).click();																	
				case "PENDING QUALITY CHECK":						Thread.sleep(3000);
																			Assignee = driver.findElement(By.id("assignee-val")).getText();	 					
																			if (!Assignee.equals("TEST USER: XLAS Full Access")){
																				driver.findElement(By.id("assign-to-me")).click();
																				Thread.sleep(4000);
																			}						
																			Thread.sleep(2000);
																	driver.findElement(By.id("action_id_21")).click();
				case "QUALITY CHECK IN PROGRESS":					Thread.sleep(4000);
																	driver.findElement(By.id("action_id_31")).click();
				case "WAITING FOR LMS ENTRY":						Thread.sleep(4000);
																	driver.findElement(By.id("action_id_41")).click();
																	Thread.sleep(2000);
																	driver.findElement(By.id("issue-workflow-transition-submit")).click();
				case "LMS ENTRY IN PROGRESS":						Thread.sleep(4000);																	
																	Random rand = new Random();
																	Thread.sleep(1000);
																	int SAP = rand.nextInt(60000000)+1;
																	SAPID = Integer.toString(SAP);																	
																	driver.findElement(By.id("action_id_91")).click();
																	Thread.sleep(3000);																		
																	driver.findElement(By.id("customfield_10001")).sendKeys(SAPID);																	
																	driver.findElement(By.id("issue-workflow-transition-submit")).click();
																	Thread.sleep (9000);
																	String Title = driver.getTitle();
																	Thread.sleep (2000);																			
																	if (!Title.contains("LMS Entry Success")){
																		if (SessionChoice.equals("Completed")){
																			SessionWCompleted();
																		}
																		if (SessionChoice.equals("Cancellation")){
																			SessionWCancellation();
																		}
																		return;
																	}
																	if (Title.contains("LMS Entry Success")){																	String ErrorSAP = driver.findElement(By.cssSelector("div.error")).getText();
																	if (ErrorSAP.equals("The provided 'Training Program SAP ID' already exists in the system.")){															
																		Random i = new Random();
																		do{ 
																			SAP = i.nextInt(60000000)+1;
																			SAPID = Integer.toString(SAP);
																			driver.findElement(By.id("customfield_10001")).clear();
																			driver.findElement(By.id("customfield_10001")).sendKeys(SAPID);
																			driver.findElement(By.id("issue-workflow-transition-submit")).click();															
																			Thread.sleep (3000);																	
																			Title = driver.getTitle(); 																	
																		}while (Title.contains("LMS Entry Success"));
				}
																	System.out.println(SessionChoice);
																			if (SessionChoice.equals("Completed")){
																				SessionWCompleted();
																			}
																			if (SessionChoice.equals("Cancellation")){
																				SessionWCancellation();
																			}
				}
																				break;
				}
				
	}		

	
	public static void SessionWCompleted() throws Exception{
				Thread.sleep(2000);
				StatR = driver.findElement(By.id("status-val")).getText();
				switch (StatR){
				case "ACTIVE":												Thread.sleep(2000);
																				Assignee = driver.findElement(By.id("assignee-val")).getText();	 					
																					if (!Assignee.equals("TEST USER: XLAS Full Access")){
																						driver.findElement(By.id("assign-to-me")).click();
																						Thread.sleep(4000);
																					}		
																				driver.findElement(By.id("action_id_501")).click();
																				Thread.sleep(4000);
																				
				case 	"CLOSURE - PROCESSING":									Thread.sleep(4000);
																				driver.findElement(By.id("action_id_531")).click();
																				
				case	"CLOSURE IN PROGRESS":									Thread.sleep(4000);
																				driver.findElement(By.id("action_id_141")).click();
																				break;
													
				}
	}
	
	public static void SessionWCancellation() throws Exception{
		Thread.sleep(3000);
		StatR = driver.findElement(By.id("status-val")).getText();		
		switch (StatR){
		case "ACTIVE":												Thread.sleep(2000);
																		Assignee = driver.findElement(By.id("assignee-val")).getText();	 					
																			if (!Assignee.equals("TEST USER: XLAS Full Access")){
																				driver.findElement(By.id("assign-to-me")).click();
																				Thread.sleep(4000);
																			}		
																		driver.findElement(By.id("action_id_101")).click();
																		Thread.sleep(2000);
																		new Select(driver.findElement(By.id("customfield_10100"))).selectByVisibleText("No budget");																		
																		driver.findElement(By.xpath("(//textarea[@id='comment'])[2]")).sendKeys("There is not budget for this Project");
																		driver.findElement(By.id("issue-workflow-transition-submit")).click();
																		Thread.sleep(3000);
																		
		case 	"CANCELLATION - PROCESSING":							Thread.sleep(1000);
																		driver.findElement(By.id("action_id_561")).click();
																		Thread.sleep(2000);
																		break;
																	
											
		}
}
	
}	