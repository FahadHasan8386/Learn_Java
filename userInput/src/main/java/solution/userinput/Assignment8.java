package solution.userinput;
import java.util.Scanner;
public class Assignment8
{
     public static void main(String[] args)
     {
        Scanner input = new Scanner(System.in);
        //char ab,cd;
        
        System.out.print("Do you complete Bsc ? = ");
        char ab = input.next().charAt(0);
        System.out.print("Do you complete Ielts ? = ");
        char cd = input.next().charAt(0);
        
        if((ab=='Y'||ab=='y') && (cd=='Y'||cd=='y')){
      
        System.out.println ("You are eligable to this job .");
        }
        else if((ab=='N'||ab=='n') && (cd=='N'||cd=='n'))
        {
        System.out.println("You are not eligable to this job.");
        }
        else{
        System.out.println("Wrong input.");
        }
}}