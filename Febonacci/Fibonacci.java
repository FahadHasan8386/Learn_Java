import java.util.Scanner;
public class Fibonacci{
	public static void main(String[]args){
		Scanner input = new Scanner (System.in);
		
		System.out.println("Enter Number : ");
		int num = input.nextInt();
		int first = 0;
		int second = 1;
		int fibo;
		
		System.out.println(first+ " " +second);
		
		for (int i = 3 ;i <= num ;i++){
			
			fibo = first + second;
			System.out.print(" "+fibo);
			first = second;
			second = fibo;
		}
			System.out.println();
	}
}
