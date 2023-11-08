// Base class Employee

class Employee {
	
    private String name;
    private String role;

		public Employee(String name, String role) {
			this.name = name;
			this.role = role;
		}

		public String getName() {
			return name;
		}

		public String getRole() {
			return role;
		}

		//Overridden by subclasses
		public double calculateSalary() {
			return 0.0;
		}
}

// Subclass
class Manager extends Employee {
	
    public Manager(String name) {
        super(name, "Manager");
    }

    public double calculateSalary() {
        // Calculate the Manager's salary
        return 9000.0;
    }
}

// Subclass Programmer
class Programmer extends Employee {
	
    public Programmer(String name) {
        super(name, "Programmer");
    }

    public double calculateSalary() {
        // Calculate the Programmer's salary
        return 5600.0;
    }
}

public class PolymorphismExample {
    public static void main(String[] args) {
        Employee manager = new Manager("Lilo Heidi");
        Employee programmer = new Programmer("Margrit Cathrin");

        // Display Manager's info
        System.out.println("Manager: " + manager.getName());
        System.out.println("Role: " + manager.getRole());
        System.out.println("Salary: $" + manager.calculateSalary());
        System.out.println();

        // Display Programmer's info
        System.out.println("Programmer: " + programmer.getName());
        System.out.println("Role: " + programmer.getRole());
        System.out.println("Salary: $" + programmer.calculateSalary());
    }
}
