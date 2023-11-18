abstract class BankAccount {
    protected double balance;

    BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    abstract void deposit(double amount);

    abstract void withdraw(double amount);

    double getBalance() {
        return balance;
    }
}

class SavingsAccount extends BankAccount {

    SavingsAccount(double initialBalance) {
        super(initialBalance);
    }

 
    void deposit(double amount) {
        balance += amount;
        System.out.println("Savings Account - Deposit: $" + amount);
    }

    
    void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Savings Account - Withdrawal: $" + amount);
        } else {
            System.out.println("Insufficient funds in Savings Account");
        }
    }
}

class CurrentAccount extends BankAccount {
    

    CurrentAccount(double initialBalance) {
        super(initialBalance);
    }

    
    void deposit(double amount) {
        balance += amount;
        System.out.println("Current Account - Deposit: $" + amount);
    }

    void withdraw(double amount) {
        
        balance -= amount;
        System.out.println("Current Account - Withdrawal: $" + amount);
    }
}

public class Abstraction3 {
    public static void main(String[] args) {
     
        SavingsAccount savingsAccount = new SavingsAccount(1000);
        savingsAccount.deposit(500);
        savingsAccount.withdraw(200);
        System.out.println("Savings Account Balance: $" + savingsAccount.getBalance());

        CurrentAccount currentAccount = new CurrentAccount(2000);
        currentAccount.deposit(1000);
        currentAccount.withdraw(2500);
        System.out.println("Current Account Balance: $" + currentAccount.getBalance());
    }
}
