
import java.util.Scanner;
public class TimeTable{
	public static void main (String[]args){
		Scanner input = new Scanner (System.in);
		int num ;
		System.out.print("Enter any Intiger Number : ");
			num = input.nextInt();
		for (int i = 1 ;i <= 10; i++){
			int multi = num * i;
			System.out.println(num+" * " +i+ " = " +multi);
		}
	}
}
