import java.util.Scanner;
public class LeapYear{
	public static void main (String []args){
	int year;
	Scanner input = new Scanner (System.in);
		System.out.println("Enter a year : ");
		year = input.nextInt();
		
	if (year % 4 == 0 && year % 100 !=0){
		System.out.println("The year is a Leap Year..");
	}
	else if (year % 400 == 0){
		System.out.println("The year is a Leap Year..");
	}
	else {
		System.out.println("The Year is not Leap Year..");
	}
	}
}