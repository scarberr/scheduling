package schedulingTool;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class OverlapcheckTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testOverlapCheck() {
		
		try{
		Overlapcheck ug = new Overlapcheck(3, 0);
		assertEquals("Failed nom, min Overlap", 1,
	    		ug.getOverlapcheck()); 	
		
	    Overlapcheck ugnomminplus = new Overlapcheck(0003, 0001);
		assertEquals("Failed nom, min+ Overlap", 1, 
				ugnomminplus.getOverlapcheck());
		
		Overlapcheck ugnomnom = new Overlapcheck(3, 3);
	    assertEquals("Failed nom, nom Overlap", 1,
	    		ugnomnom.getOverlapcheck()); 	
			    
	    Overlapcheck ugnommaxminus = new Overlapcheck(3, 10019);
	    assertEquals("Failed nom, max- Overlap", 0,
	    		ugnommaxminus.getOverlapcheck()); 	
	    
		Overlapcheck ugnommax = new Overlapcheck(3, 10020);
	    assertEquals("Failed nom, max Overlap", 0,
	    		ugnommax.getOverlapcheck()); 	
		 
	    Overlapcheck ugminnom = new Overlapcheck(0, 3);
	    assertEquals("Failed nom, min Overlap", 1, 
	    		ugminnom.getOverlapcheck()); 	
		
	    Overlapcheck ugminplusnom = new Overlapcheck(1, 3);
	    assertEquals("Failed nom, min+ Overlap", 1,
	    		ugminplusnom.getOverlapcheck()); 	
		 
	    Overlapcheck ugmaxminusnom = new Overlapcheck(10019, 3);
	    assertEquals("Failed max-, nom Overlap", 0,
	    		ugmaxminusnom.getOverlapcheck()); 	
		
	    Overlapcheck ugmaxnom = new Overlapcheck(10020, 3);
	    assertEquals("Failed max, nom Overlap", 0,
	    		ugmaxnom.getOverlapcheck()); 	
	    		
		} //end try
			
	    catch (BadTimeException e) {
			   fail(e.toString());
	  	} 
	}  //end test overlapcheck
} //end class OverlapcheckTest
