import java.util.Scanner;
//class 
public class Reverse
	{
		public static void main (String[]args)
		{
			//input Scanner 
			Scanner input = new Scanner (System.in);
			
			int num ,temp ,r ;
			int sum = 0;
			
			System.out.print("Enter any intiger number : ");
			num = input.nextInt();
			
			temp = num;
			
			while ( temp != 0)
			{
				r = temp % 10;
				sum = sum * 10 + r;
				temp = temp / 10;
			}
			System.out.println("Reverse Number : "+sum);
		}
	}
	