package schedulingTool;
//Overlapcheck is used to verify that the new schedule request does not
//interfere with an existing event.  

public class Overlapcheck {
  private int overlaps;
  
  public Overlapcheck() {
	  overlaps = 0;
  }

   // overlap check						
	public Overlapcheck(int m1, int m2)throws BadTimeException {
		if (m1 < 0 || m1 > 10020)
			throw new BadTimeException("Invalid Time Overlap Check");
		if (m2 < 0 || m2 > 10020)
			throw new BadTimeException("Invalid Time Overlap Check");
	       	overlaps = 0;
			if ((m1<m2) && ((m1+59)> m2))
				overlaps = 1;
			if ((m2<m1) && ((m2+59)>m1))
		      overlaps = 1;	
			if (m1==m2)
				overlaps = 1;
			}
	
	public int getOverlapcheck() {
		return overlaps;
	}

	public void setOverlapcheck(int olap) throws BadTimeException {
		if (olap < 0 || olap > 2)
			throw new BadTimeException("Invalid Overlap Set");
		overlaps = olap;
	}
}
