package schedulingTool;

public class myTest {
	public static void main(String args[]) {
		try {
			//Wed at 1:30
			weekTime wt = new weekTime(2, 1330); 
			
			// minute time from day and time
			System.out.println("wt = " + wt.getWeekTime());
			
			// Takes in minutes, gives day
			System.out.println("day = " + wt.getDay());
			
			//military time from minutes
			System.out.println("time of day = " + wt.getTimeOfDay());
			
			//bad week time - day out of range
			weekTime badwt = new weekTime(8, 800);
			System.out.println("badwt = " + badwt.getWeekTime());
			
			//bad week time - time out of range
			weekTime badwt1 = new weekTime(5, 1377);
			System.out.println("badwt = " + badwt1.getWeekTime());
			
			// bad week time - one minute over
			weekTime badwt2 = new weekTime(24*60*7);
			System.out.println("badwt = " + badwt2.getWeekTime());
			
		}
		catch (BadTimeException e) {
			System.out.println("Exception is " + e.toString());
		}
	}
}
