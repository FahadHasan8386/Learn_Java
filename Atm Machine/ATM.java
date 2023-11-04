import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        double[] accountBalances = new double[6];
        int[] recentTransactions = new int[6];

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Welcome to the ATM!");
            System.out.println("1. Withdraw Money");
            System.out.println("2. Transfer Money");
            System.out.println("3. Check Recent Transactions");
            System.out.println("4. Exit");
            System.out.print("Select an option: ");

            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.print("Enter the amount you want to withdraw: ");
                    double withdrawAmount = scanner.nextDouble();
                    System.out.print("Enter your current account balance: ");
                    double currentBalance = scanner.nextDouble();

                    if (withdrawAmount <= currentBalance) {
                        currentBalance -= withdrawAmount;
                        System.out.println("Money withdrawn successfully.");
                    } else {
                        System.out.println("Insufficient funds.");
                    }

                    accountBalances[0] = currentBalance;
                    recentTransactions[0] = 1;
                    break;

                case 2:
                    System.out.print("Enter the recipient's account number: ");
                    int recipientAccountNumber = scanner.nextInt();
                    System.out.print("Enter the transfer amount: ");
                    double transferAmount = scanner.nextDouble();
                    System.out.print("Enter your current account balance: ");
                    double currentBalanceTransfer = scanner.nextDouble();

                    if (transferAmount <= currentBalanceTransfer) {
                        currentBalanceTransfer -= transferAmount;
                        System.out.println("Money transferred successfully.");
                    } else {
                        System.out.println("Insufficient funds for the transfer.");
                    }

                    accountBalances[1] = currentBalanceTransfer;
                    recentTransactions[1] = 2;
                    break;

                case 3:
                    System.out.println("Recent Transactions:");
                    for (int i = 0; i < 6; i++) {
                        if (recentTransactions[i] == 1) {
                            System.out.println("Withdrawn: " + accountBalances[i]);
                        } else if (recentTransactions[i] == 2) {
                            System.out.println("Transferred: " + accountBalances[i]);
                        }
                    }
                    break;

                case 4:
                    System.out.println("Thank you for using the ATM!");
                    System.exit(0);

                default:
                    System.out.println("Invalid option. Please try again.");
                    break;
            }
        }
    }
}
