package CourseCatalog;

import org.junit.Test;



public class UrgentDeliveryDataCourseCatalog extends CourseCatalogTemplate{
	

@Test
public void UrgentDeliveryData() throws Exception  {
			MainTask = "Course Catalog";
			CourseType = "UrgentAndDelivery";
			StandardCourseCatalogCreation.CourseStandard();
		    Thread.sleep(1500);
			System.out.println(RequesTask + " Urgent and Delivery Data Course Catalog has been created and sent to Pending Delivery Data");
			driver.quit();
			    			  					  		
		  }
	
			
		
}


