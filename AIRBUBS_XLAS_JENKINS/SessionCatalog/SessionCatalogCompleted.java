package AIRBUBS_XLAS_JENKINS.SessionCatalog;




import org.junit.Test;



public class SessionCatalogCompleted extends SessionCatalogTemplate {
			
@Test
	public void ExecutionSession() throws Exception{
				SessionChoice = "Completed";
				SessionCatalogCompletedExecution();
}
	public static void SessionCatalogCompletedExecution() throws Exception{
				MainTask = "Course Catalog";
				TaskRequest = "Session";
				Thread.sleep(1000);				
				AIRBUBS_XLAS_JENKINS.CourseCatalog.StandardCourseCatalogCreation.CourseStandard();				
				Thread.sleep(2000);		  						  					  		
		    	SessionCatalogExecution();
		    	if (SessionChoice.equals("SubTaskCreation") || SessionChoice.equals("SubtaskWorkflow") || SessionChoice.equals("SMR")){
		    		return;
		    	}
		    	Thread.sleep(400);
		    	System.out.println(SessionId + " Session Catalog has been created and sent to Completed");
		    	driver.quit();		
	}	

}