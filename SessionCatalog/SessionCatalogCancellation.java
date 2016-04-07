package AIRBUBS_XLAS_JENKINS.SessionCatalog;



import org.junit.Test;


public class SessionCatalogCancellation extends SessionCatalogTemplate {
	
@Test		
	public  void SessionCatalogCancellationExecution() throws Exception{	
				Thread.sleep(500);
				MainTask = "Course Catalog";
				SessionChoice = "Cancellation";
				TaskRequest = "Session";
				Thread.sleep(1000);								
				AIRBUBS_XLAS_JENKINS.CourseCatalog.StandardCourseCatalogCreation.CourseStandard();				
				Thread.sleep(3000);		  						  					  		
		    	SessionCatalogExecution();	    	
		    	Thread.sleep(4000);
		    	System.out.println(SessionId + " Session Catalog has been created and has been Cancelled");
		    	driver.quit();		
	}	

}