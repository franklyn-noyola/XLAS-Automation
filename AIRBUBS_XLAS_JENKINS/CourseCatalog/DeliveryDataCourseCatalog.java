package CourseCatalog;





import org.junit.Test;



public class DeliveryDataCourseCatalog extends CourseCatalogTemplate{
	

@Test
public void DeliveryDataInit() throws Exception  {
		CourseType = "DeliveryDataOnly";
		MainTask = "Course Catalog";
		DeliveryData();
}
public static void DeliveryData() throws Exception  {
				StandardCourseCatalogCreation.CourseStandard();
		    	Thread.sleep(1500);
		    	CourseExecution();
		    	if (CRM.equals("Course Modification Request")){
		    			return;
		    	}else{
		    		System.out.println(RequesTask + " Delivery Data Course Catalog has been created and sent to Pending Delivery Data");
		    		driver.quit();
		    	}			  					  		
		  }
	
			
		
}


