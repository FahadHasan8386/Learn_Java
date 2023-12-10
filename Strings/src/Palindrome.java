
import java.util.Scanner;
public class Palindrome {

    public static void main(String[]agrs) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any Number : ");
        int num = sc.nextInt();
        int ori_num = num;
        int rev = 0;

        while (num != 0) {

            rev = rev * 10 + num % 10;
            num = num / 10;

        }
        System.out.println("Reverse number is :" + rev);
        if (ori_num == rev) {
            System.out.println("Palindrome Number");
        } else {
            System.out.println("Not Prlindrome Number");
        }
    }
}
