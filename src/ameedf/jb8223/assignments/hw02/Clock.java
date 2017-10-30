package ameedf.jb8223.assignments.hw02;

/**
 * This class will represent a 24-hours clock up to micro-seconds precision (1000 millisecond = 1 second).
 * That means that it will represent hours of the form "HH:MM:SS.mmm", where
 * HH - represents the hours in 24 format. Range: [0-23]
 * MM - represents the minutes. Range: [0-59]
 * SS - represents the seconds. Range: [0-59]
 * sss - represents the micro-seconds. Range: [0-999]
 *
 * It will have 2 constructors:
 * 1. One constructor with 4 parameters: hours, minutes, seconds and milliseconds.
 *    Assume the input is always valid for this constructor
 * 2. One constructor with no parameters. This will initialize the clock to 14:07:53.980
 *
 * It will have these methods:
 * 1. addHours - with a single parameter which represents the number of hours to add.
 *    It will add the hours only if it's in the range [0..1,000,000,000]. No value is returned
 * 2. addMinutes - with a single parameter which represents the number of minutes to add.
 *    It will add the minutes only if it's in the range [0..1,000,000,000]. No value is returned
 * 3. addSeconds - with a single parameter which represents the number of seconds to add.
 *    It will add the seconds only if it's in the range [0..1,000,000,000]. No value is returned
 * 4. addMilliseconds - with a single parameter which represents the number of milliseconds to add.
 *    It will add the milliseconds only if it's in the range [0..1,000,000,000]. No value is returned
 * 5. print - with a single boolean parameter that indicates weather we want to display a 24 hours clock
 *    or 12 hours clock. If a 12 hours clock is chosen it will add "AM/PM" at the end of the input.
 *    NOTE: the printout should include leading zeros (don't use any formatting methods !!)
 *    For example: 12:3:9.56 --> 12:03:09.056
 *
 * The implementation must NOT use any external classes (except for the printout)
 * BONUS 1: change the addHours, addMinutes, addSeconds and addMilliseconds methods to accept arguments
 *          within the range [-1,000,000,000 .. 1,000,000,000]. Meaning: negative values are allowed.
 *          For example, adding (-1) seconds to 00:00:00.000 will take the clock back to 23:59:59.000
 * BONUS 2: the same functionality as in "BONUS 1" while using as few member variables / memory as possible
 */
public class Clock {
}package clock;


/*
 * 
 * This class will represent a 24-hours clock up to micro-seconds precision (1000 millisecond = 1 second).
 * That means that it will represent hours of the form "HH:MM:SS.mmm", where
 * HH - represents the hours in 24 format. Range: [0-23]
 * MM - represents the minutes. Range: [0-59]
 * SS - represents the seconds. Range: [0-59]
 * sss - represents the micro-seconds. Range: [0-999]
 */

public class Clock {
	private int hours;
	private int minutes;
	private int seconds;
	private int milliseconds;
	
	public int min = 0;
	public int max = 1000000000;
	
/*
 *   It will have 2 constructors:
 * 		1. One constructor with 4 parameters: hours, minutes, seconds and milliseconds.
 *    		Assume the input is always valid for this constructor
 */
	public Clock(int hours,int minutes, int seconds, int milliseconds) {
		this.hours = hours;
		this.minutes = minutes;
		this.seconds = seconds;
		this.milliseconds = milliseconds;
	}
	//	2. One constructor with no parameters. This will initialize the clock to 14:07:53.980
	
	public Clock() {
		this.hours = 14;
		this.minutes = 07;
		this.seconds = 53;
		this.milliseconds = 980;
	}
	/*
	 *   1. addHours - with a single parameter which represents the number of hours to add.
	 *    It will add the hours only if it's in the range [0..1,000,000,000]. No value is returned
	 */
	public void addHours(int hours) {
		do {
			this.hours = (hours+this.hours) % 24;
			}
			while ((hours <= max) || (hours >= min));
	}
		
		/*
		 *  2. addMinutes - with a single parameter which represents the number of minutes to add.
		 *    It will add the minutes only if it's in the range [0..1,000,000,000]. No value is returned
		 */
		
		
		public void addMinutes(int minutes) {
			do {
				this.minutes = (minutes+this.minutes) % 60;
				}
				while ((minutes <= max) || (minutes >= min));	
		}
			 /* 3. addSeconds - with a single parameter which represents the number of seconds to add.
			 *    It will add the seconds only if it's in the range [0..1,000,000,000]. No value is returned
			*/
			
			public void addSeconds(int seconds) {
				do {
					this.seconds = (seconds+this.seconds) % 60;
					}
					while ((seconds <= max) || (seconds >= min));
			}
				/*
				 * 4. addMilliseconds - with a single parameter which represents the number of milliseconds to add.
				 *    It will add the milliseconds only if it's in the range [0..1,000,000,000]. No value is returned
				 */
				
				
				public void addMilliseconds(int milliseconds) {
					do {
						this.milliseconds = (milliseconds+this.milliseconds) % 1000;
						}
						while ((milliseconds <= max) || (milliseconds >= min));
				}

				
				/*
				 * 5. print - with a single boolean parameter that indicates weather we want to display a 24 hours clock
				 *    or 12 hours clock. If a 12 hours clock is chosen it will add "AM/PM" at the end of the input.
				 */
				
//				public static void print(Clock ) {
	//				System.out.println(account1);
		//		}


	
}

