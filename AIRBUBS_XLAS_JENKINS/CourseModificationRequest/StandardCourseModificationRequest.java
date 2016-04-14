package CourseModificationRequest;





import org.junit.Test;




public class StandardCourseModificationRequest extends CourseModificationRequestTemplate {
	
@Test		
	public  void CourseModificationRequest() throws Exception{
				MainTask = "Course Catalog";
				CRM = "Course Modification Request";				
				CourseCatalog.StandardCourseCatalogCreation.CourseStandard();											    	
		    	Thread.sleep(3000);		    	
		    	CourseModificationRequestExecution();
		    	Thread.sleep(1500);
		    	System.out.println(RequesTask + " Course Modification Request has been created and sent to Completed, Pending for Synchronization");
		    	driver.quit();		
	}	



}