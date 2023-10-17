
public class Account{
	private int accountNumber;
	private String accountHolderName;
	private double balance;
	void setAccountNumber(int an){
		accountNumber = an;
	}
	void setAccountHolderName(String ahn){
		AccountHolderName = ahn;
	}
	void setBalance(double b){
		balance = b;
	}
	public int getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public double getBalance() {
        return balance;
    }
	
	void showDetails( ){
		System.out.println("Account Number is : "+accountNumber);
		System.out.println("Account Holder Name is : "+AccountHolderName);
		System.out.println("Account balance is : "+balance);
	}