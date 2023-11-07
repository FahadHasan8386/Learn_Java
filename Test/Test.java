import java.lang.*;
class  Person1
{
	 int id;
	 String name;
	 double salary;

	Person1()
	{
		
	}
	Person1(int id, String name, double salary)
	{
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	void setId(int id)
	{
		this.id = id;
	}
	int getId()
	{
		return id;
	}
	void setName(String name)
	{
		this.name = name;
	}
	String getName()
	{
		return name;
	}
	void setSalary(double salary)
	{
		this.salary = salary;
	}
	double getSalary()
	{
		return salary;
	}
	void showInfo()
	{
		
		System.out.println("Id = "+ getId());
		System.out.println("Name = "+ getName());
		System.out.println("Salary = "+ getSalary());
	}
}
class Sakib extends Person1
{
	int matchPlayed;
	int totalRun;
	int totalWicket;
	
	Sakib(){}
	Sakib(int id, String name, double salary, int matchPlayed, int totalRun, int totalWicket)
	{
		//super(id, name, salary);
		this.matchPlayed = matchPlayed;
		this.totalRun = totalRun;
		this.totalWicket = totalWicket;
	}
	void setMatchPlayed(int matchPlayed)
	{
		this.matchPlayed = matchPlayed;
	}
	int getMatchPlayed()
	{
		return this.matchPlayed;
	}
	void setTotalRun(int totalRun)
	{
		this.totalRun = totalRun;
	}
	int getTotalRun()
	{
		return this.totalRun;
	}
	void setTotalWicket(int totalWicket)
	{
		this.totalWicket = totalWicket;
	}
	int getTotalWicket()
	{
		return this.totalWicket;
	}
	double avgRun()
	{
		double avR = this.totalRun / this.matchPlayed;
		return avR;
	}
	double avgWicket()
	{
		double avW = this.totalWicket / this.matchPlayed;
		return avW;
	}
	double annualSalary()
	{
		double ys = this.salary * 12;
		return ys;
	}
	void showInfo()
	{
		super.showInfo();
		System.out.println("Match Played = "+ getMatchPlayed());
		System.out.println("Total Run = "+ getTotalRun());
		System.out.println("Total Wicket = "+ getTotalWicket());
		System.out.println("Avarage Run = "+ avgRun());
		System.out.println("Avarage Wicket = "+ avgWicket());
		System.out.println("Annual Salary = "+ annualSalary());
	}

}

class Test{
	public static void main(String args[])
	{
		
	    Sakib s = new Sakib();
		Sakib s1 = new Sakib();
		s.setId(2350232);
		s.setName("Sakib");
		s.setSalary(100000.00);
		
		s.setMatchPlayed(8);
		s.setTotalRun(500);
		s.setTotalWicket(6);
		System.out.println("Print Sakib details");
		s.showInfo();
		
		System.out.println();
		s1.setId(2350205);
		s1.setName("Sadman");
		s1.setSalary(10000.00);
		s1.setMatchPlayed(8);
		s1.setTotalRun(500);
		s1.setTotalWicket(6);
		System.out.println("Print Fahad details");
		s1.showInfo();
	}
}