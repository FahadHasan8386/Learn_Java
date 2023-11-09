class person{
	String name;
	double depositMoney;
	
	public person (String name , double depositMoney )
	{
		this.name = name;
		this.depositMoney = depositMoney;
	}
	
	public void display()
	{
		System.out.println("Name : "+name);
		System.out.println("Total Deposit Money : "+depositMoney);			
	}
	
	public void show(String s){
        System.out.println(s + " Details");
    }
}
public class MealSystem{
	public static void main (String []args){
		person p1 = new person ("Fahad" , 2000 );			
		person p2 = new person ("Atik" , 500);
		person p3 = new person ("Niloy" ,1000);
		p1.show("Person 1");
		p1.display();
		p2.show("Person 2");
		p2.display();
		p3.show("Person 3");
		p3.display();	
	}
}
