import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner nm = new Scanner(System.in);
        System.out.println("What is your name ?");
        String first1 = nm.nextLine();
        System.out.println(first1.toUpperCase());
        String First1 = first1.toUpperCase();
        System.out.println("Your name is : " +First1);
    }
}
