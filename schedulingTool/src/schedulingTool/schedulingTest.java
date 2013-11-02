package schedulingTool;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class schedulingTest {

	//JUnit Testing for getDay and getTimeOfDay
	
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		try {
			//Send days and min - get weekTime minutes for Wed class at 1:30 (1330)
			weekTime wt = new weekTime(2,1330);
			//check getDay from weekTime
			assertEquals("Failed getDay() Test", 2, wt.getDay());
			assertEquals("Failed getTimeOfDay() Test", 1330,
					wt.getTimeOfDay());
			//Testing min, min+, nom, max-, max for getDay
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
			weekTime wtt = new weekTime(6,2359);
			assertEquals("Failed getTimeOfDay() Test", 2359,
					wtt.getTimeOfDay());
			weekTime wttmin = new weekTime(0,0000);
			assertEquals("Failed min getTimeOfDay() Test", 0, 
					wttmin.getTimeOfDay());
			weekTime wttminplus = new weekTime(1,0001);
			assertEquals("Failed min+ getTimeOfDay() Test", 1, 
					wttminplus.getTimeOfDay());
			weekTime wttnom = new weekTime(3,1330);
			assertEquals("Failed nom getTimeOfDay() Test", 1330, 
					wttnom.getTimeOfDay());
			weekTime wttmaxminus = new weekTime(6,2358);
			assertEquals("Failed max- getTimeOfDay() Test", 2358, 
					wttmaxminus.getTimeOfDay());
			weekTime wttmax = new weekTime(6,2359);
			assertEquals("Failed max getTimeOfDay() Test", 2359, 
					wttmax.getTimeOfDay());
			
			
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
			weekTime conwtmaxminus = new weekTime(10078);
			assertEquals("weekTime Failure", 10078, 
					conwtmaxminus.getWeekTime());
			weekTime conwtmax = new weekTime(10079);
			assertEquals("weekTime Failure", 10079, 
					conwtmax.getWeekTime());
			
						
		}
		catch (BadTimeException e) {
		   fail(e.toString());
	  }
	}

}
