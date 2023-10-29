// Personal Information Class

class PersonalInfo{
    public static void main(String[] args) {
       Person p1 = new Person();
	   
	   p1.setId(33);
	   p1.setName("Rakib");
	   p1.setSalary(123.456);
	   p1.showInfo();
    }
}

// Person Class
class Person{
	int Id;
	String Name;
	double Salary;
	
	// Constructor
	public Person(){} // for null value
	
	// with value when initialized object
	public Person(int id, String name, double salary){
		
		// set parameter
		this.setId(id);
		this.setName(name);
		this.setSalary(salary);
		
		// Value assing with constructor
		
		this.Id = this.getId();
		this.Name = this.getName();
		this.Salary = this.getSalary();
	}
	
	// Set Id
	public void setId(int id){
		this.Id = id;
	}
	
	// Get Id
	public int getId(){
		return this.Id;
	}
	
	// Set Name
	public void setName(String name){
		this.Name = name;
		
	}
	
	// Get Name
	public String getName(){
		return this.Name;
	}
	
	// Set Salary
	public void setSalary(double salary){
		this.Salary = salary;
	}
	
	// Get Salary
	public double getSalary(){
		return this.Salary;
	}
	
	// Show Info
	public void showInfo(){
		System.out.println("Your id is: " + this.Id);
		System.out.println("Your Name is: " + this.Name);
		System.out.println("Your Salary is: " + this.Salary);
	}
}