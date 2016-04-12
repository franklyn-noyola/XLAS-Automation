package CourseModificationRequest;





import org.junit.Test;




public class ValidationCourseModificationRequest extends CourseModificationRequestTemplate {
	
@Test		
	public  void ValidateCourseModificationRequest() throws Exception{
				MainTask = "Course Catalog";
				ValidationData = "ValidationOnly";
				CRM = "Course Modification Request";
				CourseCatalog.StandardCourseCatalogCreation.CourseStandard();	
				Thread.sleep(3000);
		    	CourseCatalog.CourseCatalogTemplate.CourseExecution();
		    	Thread.sleep(3000);
		    	CourseModificationRequestExecution();
		    	Thread.sleep(1500);
		    	System.out.println(RequesTask + " Course Modification Request has been created and sent to Completed, Pending for Synchronization");
		    	driver.quit();		
	}	



}