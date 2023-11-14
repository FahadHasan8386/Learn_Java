// Base Class
class Person {
    String name;
    double depositMoney;
    int millCount;

    // Constructor
    public Person(String name, double depositMoney, int millCount) {
        this.name = name;
        this.depositMoney = depositMoney;
        this.millCount = millCount;
    }
    // Display Info
    public void display() {
        System.out.println("Name               : " + name);
        System.out.println("Total Deposit Money: " + String.format("%.2f", depositMoney)); // Format to two decimal places
        System.out.println("Total mill count   : " + millCount);
    }
    // Display Person details
    public void show(String s) {
        System.out.println(s + " Details");
    }
    // Get Deposit money
    public double getDepositMoney() {
        return depositMoney;
    }

    // Get Mill Count
    public int getMillCount() {
        return millCount;
    }
}
// Main Class
public class MealSystem {
    public static void main(String[] args) {
        int totalBazarCost = 3000;

        // Objects creation
        Person p1 = new Person("Fahad", 2000, 39);
        Person p2 = new Person("Atik", 500, 10);
        Person p3 = new Person("Niloy", 1000, 39);

        p1.show("Person 1");
        p1.display();
        System.out.println();
        p2.show("Person 2");
        p2.display();
        System.out.println();
        p3.show("Person 3");
        p3.display();
        System.out.println();

        // Calculate and display the sum
        double totalDepositMoney = p1.getDepositMoney() + p2.getDepositMoney() + p3.getDepositMoney();
        int totalMillCount = p1.getMillCount() + p2.getMillCount() + p3.getMillCount();

        System.out.println("Total Deposit Money for all persons: " + String.format("%.2f", totalDepositMoney));
        System.out.println("Total mill count for all persons___: " + totalMillCount);

        // Calculate Mill Rate
        double millRate = totalDepositMoney / totalMillCount;
        System.out.println("Running Mill Rate is_______________: " + String.format("%.2f", millRate));// Format to two decimal places

        // Calculate Available Money
        double availableMoney = totalDepositMoney - totalBazarCost;
        System.out.println("Money Available____________________: " + String.format("%.2f", availableMoney));// Format to two decimal places
		
		//Calculate how much money person is used
        double p1Money = p1.getMillCount() * millRate;
        double p2Money = p2.getMillCount() * millRate;
        double p3Money = p3.getMillCount() * millRate;

        System.out.println("Person 1 used money__: " + String.format("%.2f", p1Money));// Format to two decimal places
        System.out.println("Person 2 used money__: " + String.format("%.2f", p2Money));
        System.out.println("Person 3 used money__: " + String.format("%.2f", p3Money));
		
		//Calculate how much money person have avaiable
        double p1AvailableMoney = p1.getDepositMoney() - p1Money;
        double p2AvailableMoney = p2.getDepositMoney() - p2Money;
        double p3AvailableMoney = p3.getDepositMoney() - p3Money;

        System.out.println("P1 Available Money___: " + String.format("%.2f", p1AvailableMoney));// Format to two decimal places
        System.out.println("P2 Available Money___: " + String.format("%.2f", p2AvailableMoney));
        System.out.println("P3 Available Money___: " + String.format("%.2f", p3AvailableMoney));
    }
}