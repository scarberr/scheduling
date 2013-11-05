package schedulingTool;

/* 
 * The scheduling tool program helps to schedule graduate students.  This portion helps
 * with some of the administrative functions.  The basic unit is the minute.  It is 
 * represented by the variable weekMinutes.  The weekMinutes variable is the number of
 * minutes in a week starting from midnight Sunday (Monday Morning).  The weekMinutes clock
 * is a 24 hour clock which is also known as military time.  Since graduate students are
 * sometimes thought of as slave labor, the tool allows for scheduling over all week minutes.  
 * It is currently set to look only at a 1 week range.  The week begins at Midnight on Sunday
 * which, on a minute clock, is also 0000 hours Monday morning or the day class schedules start.
 * The maximum clock time for a day is 2359.  The end of the week (calculated in minutes) is
 * defined as MAXWEEKMINUTES and is the upper boundary beyond which scheduling can not take place.    
 * All scheduled events are scheduled for 59 minutes in length to allow the students to plan
 * their days.  There is a special agreement that effects Sunday.  The students lobbied for no 
 * assignments after 11PM on Sundays and the University agreed.
 *    
 * This portion of the tool focuses on the functionality of getDay() which will convert minutes 
 * to the day of the week and getTimeofDay() which converts minutes to military time.  Days of the
 * week are noted by 0-6 corresponding to Monday (0) through Sunday (6).  Because
 * classes are scheduled in days and times, it also converts a day and time to the basic 
 * unit: weekMinutes.
 *
 *Scheduling overlaps are calculated comparing the duration of the scheduled event.  Since all 
 *appointments are scheduled for 59 minutes, the stop time is calculated as 59 minutes after 
 *the start time.
 */

public class weekTime { 
	private int weekMinutes;
	private static int MAXWEEKMINUTES = ((7*24*60)-60);  // max minutes in week
	
	public weekTime() {
		weekMinutes = 0;
		
	}
			
	public weekTime(int weekMins) throws BadTimeException {
		setWeekTime(weekMins);
	}
		
	
	//Checks to ensure day and time is within range
	//Converts day and time to weekMinutes.
	
	public weekTime(int day, int mtime) throws BadTimeException {
		if (day < 0 || day > 6)
			throw new BadTimeException("Invalid day");
		int hours = mtime / 100;
		int mins = mtime % 100;
		if (hours < 0 || hours >= 24 || mins < 0 || mins >= 60)
			throw new BadTimeException("Invalid military time");
		weekMinutes = day*24*60 + hours*60 + mins;
	}
	
	//set/get week time in week minutes - ensures with-in acceptable range
	
	public void setWeekTime(int weekMins) throws BadTimeException {
		if (weekMins < 0 || weekMins >= MAXWEEKMINUTES)
			throw new BadTimeException("Invalid week minutes");
		weekMinutes = weekMins;
	}
	
	public int getWeekTime() {
		return weekMinutes;
	}
	
	//getDay() calculates and returns the day of the week from the minutes. 
	//The Week starts Sunday at 12AM (Midnight) which is Monday morning.
	//Days are noted as 0-6 for Monday thru Sunday.
	 
	 
	public int getDay() {
		return weekMinutes / (60*24);
	}
	
	//convert to military time.
		public int getTimeOfDay() {
		int rmins = weekMinutes % (60*24);
		int hours = rmins / 60;
		int mins = rmins % 60;
		
		return hours*100 + mins;
	}
	
}
