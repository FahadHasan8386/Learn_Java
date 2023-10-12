class Year{
	public static void main (String[]args){
		int min = 3456789;
		int year = ((min / 60)/24/365);
		int day = ((min / 60 )/24%365);
		System.out.println("Year = " +year );
		System.out.println("Day = "+day);
	}
}
	