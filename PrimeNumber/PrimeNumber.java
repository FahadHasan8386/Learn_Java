import java.util.Scanner;
public class PrimeNumber{
	
	public static void main (String[]args){
		int num;
			Scanner input = new Scanner (System.in);
			System.out.print("Enter any possitive Number : ");
			num = input.nextInt();
		int count = 0;
		if (num == 0 || num == 1){
			System.out.println("It is not a prime number. ");
		}
		else{
			for (int i = 2 ; i < num/2 ;i++){
				if (num % i  == 0){
					count++;
					break;
				}
			}
				if (count == 0 ){
					System.out.println("It is a prime Number. ");
				}
				else{
					System.out.println("It is not a prime number. ");
				}
		}
	}
}
				