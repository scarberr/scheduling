package schedulingTool;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class schedulingTest {

	//JUnit Testing for getDay, getTimeOfDay
	
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}
	
	@Test
	public void test() {
		try {
			//Send day and time - get weekTime minutes for Wed class at 1:30 (1330)
			//Just an extra test
			
			weekTime wt = new weekTime(2,1330);
			//check getDay and time from weekTime
			assertEquals("Failed getDay() Test", 2, wt.getDay());
			assertEquals("Failed getTimeOfDay() Test", 1330,
					wt.getTimeOfDay());
			
			
		
			//Testing min, min+, nom, max-, max for getDay
		    //entering day and time - conv to mins and then to day.
			
			weekTime wtmin = new weekTime(0,1330);
			assertEquals("Failed min getDay() Test", 0, 
					wtmin.getDay());

			weekTime wtminplus = new weekTime(1,1330);
			assertEquals("Failed min+ getDay() Test", 1, 
					wtminplus.getDay());
			
			weekTime wtnom = new weekTime(3,1330);
			assertEquals("Failed nom getDay() Test", 3, 
					wtnom.getDay());
			
			weekTime wtmaxminus = new weekTime(5,1330);
			assertEquals("Failed max- getDay() Test", 5, 
					wtmaxminus.getDay());
			
			weekTime wtmax = new weekTime(6,1330);
			assertEquals("Failed max getDay() Test", 6, 
					wtmax.getDay());

				
			// Testing min, min+, nom, max-, max for get TimeOfDay
			//checks getDay from weekTime given day/time schedule weekTime
			
			weekTime wttmin = new weekTime(3,0000);
			assertEquals("Failed min getTimeOfDay() Test", 0, 
					wttmin.getTimeOfDay());
			
			weekTime wttnomminplus = new weekTime(3,0001);
			assertEquals("Failed min getTimeOfDay() Test", 1, 
					wttnomminplus.getTimeOfDay());
			
			weekTime wttnomnom = new weekTime(3,1330);
			assertEquals("Failed min+ getTimeOfDay() Test", 1330, 
					wttnomnom.getTimeOfDay());
							
			weekTime wttnommaxminus = new weekTime(3,2358);
			assertEquals("Failed max- getTimeOfDay() Test", 2358, 
					wttnommaxminus.getTimeOfDay());
				
			weekTime wttnommax = new weekTime(3,2359);
			assertEquals("Failed max getTimeOfDay() Test", 2359, 
					wttnommax.getTimeOfDay());
			
			weekTime wttminnom = new weekTime(0,1330);
			assertEquals("Failed nom getTimeOfDay() Test", 1330, 
					wttminnom.getTimeOfDay());
			
			weekTime wttminplusnom = new weekTime(1,1330);
			assertEquals("Failed nom getTimeOfDay() Test", 1330, 
					wttminplusnom.getTimeOfDay());
			
			weekTime wttmaxminusnom = new weekTime(5,1330);
			assertEquals("Failed nom getTimeOfDay() Test", 1330, 
					wttmaxminusnom.getTimeOfDay());
			
			weekTime wttmaxnom = new weekTime(6,1330);
			assertEquals("Failed nom getTimeOfDay() Test", 1330, 
					wttmaxnom.getTimeOfDay());
			
		
			
			//constructor tests for weekTime
			
			weekTime conwtmin = new weekTime(0000);
			assertEquals("weekTime Failure", 0000, 
					conwtmin.getWeekTime());
			
			weekTime conwtminplus = new weekTime(0001);
			assertEquals("weekTime Failure", 0001, 
					conwtminplus.getWeekTime());
			
			weekTime conwtnom = new weekTime(1000);
			assertEquals("weekTime Failure", 1000, 
					conwtnom.getWeekTime());
					
			weekTime conwtmaxminus = new weekTime(10018);
			assertEquals("weekTime Failure", 10018, 
					conwtmaxminus.getWeekTime());
					
			weekTime conwtmax = new weekTime(10019);
			assertEquals("weekTime Failure", 10019, 
					conwtmax.getWeekTime());
			
		}
		
		catch (BadTimeException e) {
		   fail(e.toString());
	  }
		
	
	}

}
