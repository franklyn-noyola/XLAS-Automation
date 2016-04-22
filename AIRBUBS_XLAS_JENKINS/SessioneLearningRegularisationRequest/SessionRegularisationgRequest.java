package SessioneLearningRegularisationRequest;



import org.junit.Test;
import org.openqa.selenium.*;


public class SessionRegularisationgRequest extends CourseCatalog.CourseCatalogTemplate{

@Test
 public void SessioneRegularisationCreation() throws Exception  {
					MainTask = "Session Requests";
					RequestType = "Session Regularisation Request";
					Login();
					Thread.sleep(2000);
					driver.findElement(By.id("summary")).sendKeys("Session Regularisation created via Automation Script");
					driver.findElement(By.id("customfield_12000")).sendKeys("Additional Information");
					driver.findElement(By.id("attachment_box")).click();
					Thread.sleep(1000);
					Runtime.getRuntime().exec("C:\\Program Files\\Jenkins\\workspace\\eLearningandRegularissation.exe");
					Thread.sleep(2000);
					driver.findElement(By.id("customfield_10086-3")).click();
					driver.findElement(By.id(CreateButton)).click();
					Thread.sleep(2000);					
					RequesTask = driver.findElement(By.id("key-val")).getText();
					RegularisationWorkflow();
					System.out.println(RequesTask + " Session Regularisation Request has been created and sent to Completed");
			    	driver.quit();			  					  		
		  }
	
public static void RegularisationWorkflow() throws Exception{
					Thread.sleep(1000);
					  Stat = driver.findElement(By.id("status-val")).getText();
					  Assignee = driver.findElement(By.id("assignee-val")).getText();
						if (!Assignee.equals("TEST AUTOMATION USER: XLAS Full Access")){
							driver.findElement(By.id("assign-to-me")).click();
								Thread.sleep(5000);
								}
						
					switch (Stat){
						case "DATA ENTRY"										:	driver.findElement(By.id("action_id_11")).click();
																					Thread.sleep(3000);
								
						case "PENDING QUALITY CHECK"							:	Assignee = driver.findElement(By.id("assignee-val")).getText();
																						if (!Assignee.equals("TEST USER: XLAS Full Access")){
																							driver.findElement(By.id("assign-to-me")).click();
																							Thread.sleep(5000);
																						}	
																						driver.findElement(By.id("action_id_21")).click();
																						Thread.sleep(3000);
															
						case "QUALITY CHECK IN PROGRESS"						:	driver.findElement(By.id("action_id_31")).click();
																					Thread.sleep(3000);
																					
						case "WAITING FOR MULTI-SESSION CREATION IN LMS"		:	driver.findElement(By.id("action_id_41")).click();
																					Thread.sleep(3000);
																					
						case "MULTI-SESSION CREATION IN LMS IN PROGRESS"		:	driver.findElement(By.id("action_id_91")).click();
																					Thread.sleep(3000);
																					break;															
					
					}
					  
				  }
	
	
}




