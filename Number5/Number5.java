
abstract class Employee
{	
	int salary;
	Employee(int salary)
	{
		this.salary = salary;
	}
	abstract int  calculateSalary();
	abstract void displayInfo();
}
class Manager extends Employee
{	
	Manager()
	{
		super(30000);
	}
	int  calculateSalary(){return (super.salary*12);}
	void displayInfo()
	{
		System.out.println("Manager annual salary = "+calculateSalary());
	}
}
class Programmer extends Employee
{	
	Programmer()
	{
		super(100000);
	}
	int  calculateSalary(){return (super.salary*12);}
	void displayInfo()
	{
		System.out.println("Programmer annual salary = "+calculateSalary());
	}
}
class Number5
{
	public static void main(String args[])
	{
		Employee e;
		e = new Manager();
		e.displayInfo();
		
		e = new Programmer();
		e.displayInfo();
	}
}