
package solution.userinput;

import java.util.Scanner;
public class Assignment9 {
    public static void main(String[]args)
    {
       Scanner input = new Scanner(System.in);
        //int num;
       System.out.print("Enter one number : ");
       int num = input.nextInt();
       switch (num)
               {
                   case 1:
                       System.out.println ("Selected language is Bangali.");
                       break;
                   case 2:
                       System.out.println ("Selected language is English.");
                       break;
                   case 3:
                       System.out.println ("Selected language is Hindi.");
                       break;
                   case 4:
                       System.out.println ("Selected language is Urdu.");
                       break;
                   default:
                       System.out.println ("Not a Digit.");
                               
               }
    }
}
