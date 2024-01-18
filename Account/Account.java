
public class Account{
	
	public static void main(String[]args){
		
	int accountNumber;
	String accountHolderName;
	double balance;

	void setAccountNumber(int an){
		accountNumber = an;
	}
	void setAccountHolderName(String ahn){
		accountHolderName = ahn;
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

	public void Showdown(){
		System.out.println("Account Number is : "+accountNumber);
		System.out.println("Account Holder Name is : "+accountHolderName);
		System.out.println("Account balance is : "+balance);
	}
}
}