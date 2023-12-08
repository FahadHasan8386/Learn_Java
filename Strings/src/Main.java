import java.util.Scanner;

public class Main {
    public static void main (String[]args){
        String first = "Fahad";
        String last = "Fahad";
        String fullName = first +" " +last;
        System.out.println(first + " " +last);
        System.out.println(fullName);
        System.out.println(fullName.length());
        if(first.equals(last)){
            System.out.println("Strings are equal");
        }
        else {
            System.out.println("Strings are not equal");
        }
    }
}
