// Base Class
class person {
    String name;
    double depositMoney;
    int millCount;

    public person(String name, double depositMoney, int millCount) {
        this.name = name;
        this.depositMoney = depositMoney;
        this.millCount = millCount;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Total Deposit Money: " + depositMoney);
        System.out.println("Total mill count: " + millCount);
    }

    public void show(String s) {
        System.out.println(s + " Details");
    }

    public double getDepositMoney() {
        return depositMoney;
    }

    public int getMillCount() {
        return millCount;
    }
	
}

public class MealSystem {
    public static void main(String[] args) {
        person p1 = new person("Fahad", 2000, 39);
        person p2 = new person("Atik", 500, 10);
        person p3 = new person("Niloy", 1000, 39);

        p1.show("Person 1");
        p1.display();
        p2.show("Person 2");
        p2.display();
        p3.show("Person 3");
        p3.display();

        // Calculate and display the sum
        double totalDepositMoney = p1.getDepositMoney() + p2.getDepositMoney() + p3.getDepositMoney();
        int totalMillCount = p1.getMillCount() + p2.getMillCount() + p3.getMillCount();

        System.out.println("Total Deposit Money for all persons: " + totalDepositMoney);
        System.out.println("Total mill count for all persons: " + totalMillCount);
		
		double millRate = totalDepositMoney / totalMillCount;
		System.out.println("Running Mill Rate is : "+millRate);
		
    }
}
