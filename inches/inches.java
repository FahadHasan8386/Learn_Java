package Inches.java;

import java.util.Scanner;
public class inches{
	public static void main (String[] args){
		
		Scanner input = new Scanner (System.in);
		double inch , meter;
		System.out.println("Input meter Velues: ");
		inch = input.nextDouble();
		meter = inch * 0.0254;
		System.out.println(inch+ " inch is " +meter+ " meter.");
	}
}
