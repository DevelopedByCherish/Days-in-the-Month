/*
 * Cherish Shanks
 *  Days in a Month
 *  May 13,2017
 */
import java.util.*;

public class DaysInMonthy {
	
	public static void main( String[] args )
	{
		Scanner Keyboard = new Scanner (System.in);
		
		int month;
		System.out.println("Enter number of the Month to set your month ( Example Jan=1, Feb=2 etc.):  ");
		month = Keyboard.nextInt();
		
		int year;
		System.out.println("Enter Year to set the year (Example: 2017): ");
		year =Keyboard.nextInt();
		
		int num;
		
		String monthName = null;

		// Determines how many days is in the month
		switch ( month )
		{
			case 4 : case 6 : case 9 : case 11 : num = 30 ; break ;
			case 2 : num = (year % 4 == 0) ? 29 : 28; break ;
			default: num =31;
		}
		
		// Names the Month
		switch (month)
		{
		case 1: monthName = "January" ;
		break;
		case 2: monthName = "February";
		break;
		case 3: monthName = "March" ;
		break;
		case 4: monthName = "April" ;
		break;
		case 5: monthName = "May" ;
		break;
		case 6: monthName = "June" ;
		break;
		case 7: monthName = "July" ;
		break;
		case 8: monthName = "August";
		break;
		case 9: monthName = "September" ;
		break;
		case 10: monthName = "October" ;
		break;
		case 11: monthName = "November";
		break;
		case 12: monthName = "December";
		break; 
		default: monthName = "your month";
		
		}
		
		
		System.out.println( month+ "/" +year+ ": In "+year+ " there are " +num+ " days in "+monthName+".");	
	}
}
