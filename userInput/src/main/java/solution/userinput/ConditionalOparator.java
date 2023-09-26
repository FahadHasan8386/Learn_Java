
package solution.userinput;
import java.util.Scanner;
public class ConditionalOparator {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int x;
        int y;
        int large;
        System.out.print("Enter two number : ");
        x = input.nextInt();
        y = input.nextInt();
        large = (x > y) ? x : y;
        System.out.println("Large number is : "+large);
        int minimum = Math.min(x , y);
        System.out.println("Minimum Number is : "+minimum);
    }
}
