package CourseModificationRequest;





import org.junit.Test;




public class CourseModificationRequestDeliveryData extends CourseModificationRequestTemplate {
	
@Test		
	public  void CourseModificationRequest() throws Exception{
				MainTask = "Course Catalog";
				CRM = "Course Modification Request";
				ValidationData = "DeliveryData";
				CourseCatalog.DeliveryDataCourseCatalog.DeliveryData();									
		    	Thread.sleep(3000);		    			    	
		    	CourseModificationRequestExecution();
		    	Thread.sleep(1500);
		    	System.out.println(RequesTask + " Course Modification Request has been created and sent to Completed, Pending for Synchronization");
		    	driver.quit();		
	}	



}