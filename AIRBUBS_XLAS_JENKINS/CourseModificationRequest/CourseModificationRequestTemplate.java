package CourseModificationRequest;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;

public class CourseModificationRequestTemplate extends CourseCatalog.CourseCatalogTemplate{
		
		
		public static String StatR;
		
	public static void CourseModificationRequestExecution() throws Exception{
				Thread.sleep(3000);
				driver.findElement(By.cssSelector("span.icon.drop-menu")).click();
				driver.findElement(By.id("clone-issue-custom3-plus")).click();
				driver.findElement(By.id("issue-create-submit")).click();
				Thread.sleep(1000);
				driver.findElement(By.id("summary")).sendKeys("CMR created via Automation Script");
				Thread.sleep(1000);
				driver.findElement(By.id("submit")).click();
				Thread.sleep(3000);
				if (ValidationData.equals("DeliveryData")){
					driver.findElement(By.cssSelector("span.trigger-label")).click();
			    	Thread.sleep(2000);
			    	driver.findElement(By.xpath("//a[@href='#tab-8']")).click();
			    	Thread.sleep(1000);
			    	CourseCatalog.CourseCatalogTemplate.DeliveryDataTab();
			    	Thread.sleep(2000);
			    	driver.findElement(By.id("edit-issue-submit")).click();
					Thread.sleep(3000);
					
				}
					if (ValidationData.equals("ValidationOnly")){
					   	driver.findElement(By.cssSelector("span.trigger-label")).click();
				    	Thread.sleep(1000);
				    	driver.findElement(By.id("customfield_10004")).clear();
				    	driver.findElement(By.id("customfield_10004")).click();
						driver.findElement(By.name("customfield_10004")).sendKeys("31/Dec/2017");//Validity End Date
						new Select (driver.findElement(By.id("customfield_10832"))).selectByVisibleText("Classroom training");
						driver.findElement(By.id("edit-issue-submit")).click();
						Thread.sleep(3000);	
						RequesTask = driver.findElement(By.id("key-val")).getText();
						Thread.sleep(1500);
						driver.findElement(By.id("action_id_201")).click();
						Thread.sleep(4000);						
						Assignee = driver.findElement(By.id("assignee-val")).getText();	 					
						if (!Assignee.equals("TEST AUTOMATION USER: XLAS Full Access")){
							driver.findElement(By.id("assign-to-me")).click();
							Thread.sleep(4000);
						}						
						driver.findElement(By.id("action_id_221")).click();
						Thread.sleep(3000);												
					}				
						if (!ValidationData.equals("ValidationOnly")){
							RequesTask = driver.findElement(By.id("key-val")).getText();
							Thread.sleep(2000);
							driver.findElement(By.id("action_id_11")).click();
							Thread.sleep(4000);
					}
					Thread.sleep(4000);
					StatR = driver.findElement(By.id("status-val")).getText();
					
				switch(StatR){													
				case "PENDING QUALITY CHECK":						Thread.sleep(3000);
																			Assignee = driver.findElement(By.id("assignee-val")).getText();	 					
																			if (!Assignee.equals("TEST AUTOMATION USER: XLAS Full Access")){
																				driver.findElement(By.id("assign-to-me")).click();
																				Thread.sleep(4000);
																			}						
																			Thread.sleep(2000);
																	driver.findElement(By.id("action_id_21")).click();
				case "QUALITY CHECK IN PROGRESS":					Thread.sleep(4000);
																	driver.findElement(By.id("action_id_101")).click();
				case "WAITING FOR LMS UPDATE":						Thread.sleep(4000);
																	driver.findElement(By.id("action_id_81")).click();												
				case "LMS UPDATE IN PROGRESS":						Thread.sleep(4000);
																	driver.findElement(By.id("action_id_91")).click();
																	Thread.sleep(1000);																																	
				}
	}		
				
		}

