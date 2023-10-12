class digit 
{
	public static void main (String[]args){
		
		int num = 545;
		int sum = 0;
		while (num != 0){
			
			int r = num % 10;
			sum = sum + r;
			num = num /10;
			
		}
		System.out.println(sum);
	}
}