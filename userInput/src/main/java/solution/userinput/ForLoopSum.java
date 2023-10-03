package solution.userinput;
import java.util.Scanner;

public class ForLoopSum {
    public static void main(String[]args){
        Scanner input =new Scanner(System.in);
        int sum = 0;
        int first , scoend;
        System.out.print("Enter First Number : ");
        first = input.nextInt();
        System.out.print("Enter Scoend Number : ");
        scoend = input.nextInt();
        for (int i = first ; i <= scoend ; i++){
            if (i % 2 == 0){
                sum = sum + i ;
                System.out.print(" "+i);
            }
        }
        System.out.println();
        System.out.println("Sum of first to scoend even number : "+sum);
    }
    
           
    
}
