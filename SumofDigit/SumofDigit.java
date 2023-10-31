import java.util.Scanner;
public class SumofDigit
{
	public static void main (String[]args)
	{
		Scanner input = new Scanner(System.in);
		int num , temp , r ;
		int sum = 0;
        System.out.print("Enter any Number :");
		num = input.nextInt();
		
		temp  = num;
		while (temp != 0)
		{
			r = temp % 10;
			sum = sum + r;
			temp = temp / 10;
		}
		System.out.println("Sum of Digit "+sum);
	}
}