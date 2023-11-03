// person class defination
public class Person1
{
	int id;
	String name;
	double salary;

	// constructor
	Person1(int id, String name, double salary)
	{
		this.id = id;
		this.name = name ;
		this.salary = salary;
	}
	
	// set id
	void setId (int id)
	{
		this.id = id;
	}
	// get id
	int getId()
	{
		return id;
	}
	
	// set name
	void setName(String name)
	{
		this.name = name;
	}
	// get name
	String getName()
	{
		return name;
	}
	
	// set salary
	void setSalary (double salary)
	{
		this.salary = salary;
	}
	// get salary
	double getSalary()
	{
		return salary;
	}
	
	// show info
	void showInfo()
	{
		System.out.println("Your id is: " +id);
		System.out.println("Your Name is: " +name);
		System.out.println("Your Salary is: " +salary);
	}
}
//Inherite Sakib class
class Sakib extends Person1
{
	int MatchPlayed;
	int TotalRun;
	int TotalWicket;
	double AvgRun;
	double AvgWicket;
	double AnnualSalary;
	
    //Constructor Sakib class
	public Sakib(int matchPlayed ,int totalRun,int totalWicket)
	{
		super(0,"",0);
		this.MatchPlayed = matchPlayed;
		this.TotalRun = totalRun;
		this.TotalWicket = totalWicket;
	}
	//Set method
	void setMatchPlayed (int matchPlayed)
	{
	this.MatchPlayed = matchPlayed;
	}
	//get method
	int getMatchPlayed()
	{
		return MatchPlayed;
	}
	//Set method
	void setTotalRun (int totalRun)
	{
	this.TotalRun = totalRun;
	}
	//get method
	int getTotalRun()
	{
		return TotalRun;
	}
	//Set mehtod
	void setTotalWicket (int totalWicket)
	{
	this.TotalWicket = totalWicket;
	}
	//get method
	int getTotalWicket()
	{
		return TotalWicket;
	}
	
	//Avarage run count
	double AvgRun()
	{
		double ar = TotalRun / MatchPlayed;
		return ar;
	}
	//Avarage wicket count
	double AvgWicket()
	{
		double aw = TotalWicket / MatchPlayed;
		return aw;
	}
	//Salary count
	double AnnualSalary()
	{
		double as = Salary * 12;
		return as;
	}
	//Show down
	void showInfo ()
	{
		System.out.println("Match Played : "+MatchPlayed);
		System.out.println("TotalRun : "+TotalRun);
		System.out.println("TotalWicket : "+TotalWicket);
		System.out.println("Avarage Run : " +AvgRun());
		System.out.println("Avarage Wicket : " +AvgWicket());
		System.out.println("Annual Salary : " +AnnualSalary());
	}
}
//main class
public class Person{
public static void main(String[]args)
{	
	Person1 p1 = new Person1();
	p1.setId(2350204);
	p1.setName("Sakib Al Hasan");
	p1.setSalary(50000);
	p1.showInfo();
	Sakib s1 = new Sakib();
	s1.setMatchPlayed(20);
	s1.setTotalRun(2000);
	s1.setTotalWicket(20);
	s1.showInfo();	
}
}