import java.util.*;

public class Array{
	
	public static void main(String[]args){

	int a[] = new int[3];
		a[0] = 1;
		a[1] = 2;
		a[2] = 3;

		int num [] = {2 , 22 , 12 , 33 , 65 , 87};
		int m = num.length;
		System.out.println ("Enter number : " );
	for (int i = 0 ;i < m ;i++){
		System.out.print(" "+num[i]);
	
	
	}
		System.out.println("/n");
		System.out.print("Accending order num : ");
		Arrays.sort(num);
	for (int i = 0 ;i < m ; i++){
		System.out.print(" " +num[i]);
	}	

	}
}