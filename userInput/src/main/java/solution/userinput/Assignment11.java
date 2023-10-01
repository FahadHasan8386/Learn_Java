
package solution.userinput;
import java.util.Scanner;
public class Assignment11 {
    public static void main(String[]args){
        Scanner input = new Scanner (System.in);
        System.out.println("Enter a number : ");
        int n = input.nextInt();
        int Fact = 1;
        for(int i = 1 ; i <= n ; i++){
             Fact = Fact * i;
        }
        System.out.println("Factorial is : "+Fact);
    }
}
