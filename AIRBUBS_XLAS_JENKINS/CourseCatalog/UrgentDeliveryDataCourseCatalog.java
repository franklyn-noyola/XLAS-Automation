package CourseCatalog;

import org.junit.Test;

import static org.junit.Assert.fail;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;


public class UrgentDeliveryDataCourseCatalog extends CourseCatalogTemplate{
	

@Test
public void UrgentDeliveryData() throws Exception  {
			MainTask = "Course Catalog";
			CourseType = "UrgentAndDelivery";

		    	Thread.sleep(1500);
		    	CourseExecution();
				System.out.println(RequesTask + " Urgent and Delivery Data Course Catalog has been created and sent to Pending Delivery Data");
			    driver.quit();
			    			  					  		
		  }
	
			
		
}


