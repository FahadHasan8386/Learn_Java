package solution.userinput;
import java.util.Scanner;
public class SeriesJava {
    public static void main(String[]args){
        Scanner input =new Scanner(System.in);
        int last ;
        int sum = 0;
        System.out.print("Enter last number : ");
        last = input.nextInt();
        for(int i = 1 ; i <= last ; i++){
            System.out.print(i+" ");
            sum = sum + i;
            
        }
        
        System .out.println(" ");
        System .out.println("Sum : "+sum);
    }
    
}
