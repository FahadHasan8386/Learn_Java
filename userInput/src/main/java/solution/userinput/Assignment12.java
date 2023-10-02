
package solution.userinput;

import java.util.Scanner;
public class Assignment12 {
    public static void main (String[]args){
        Scanner input =new Scanner(System.in);
        System.out.print("Enter first Number : ");
        int first = input.nextInt();
        System.out.print("Enter Scoend Number : ");
        int scoend = input.nextInt();
        System.out.print("Odd number betwwen first to scoend : ");
        int sum = 0;
        for (int i = first ; i <= scoend ; i++){
            if (i % 2 !=0 ){
                System.out .print(i+ " ");
                sum += i;
            }
        }
         
        System.out.println ("Sum of odd number : "+sum);
    }
    
}
