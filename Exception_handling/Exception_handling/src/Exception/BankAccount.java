package Exception;

public class BankAccount {
   private double amount;
   private double balance;
   
   public BankAccount (double amount) {
	this.balance=amount;
}
   public void withdraw(double amount) throws Exception {
	if(amount>balance){
		throw new InsufficentFundException();
	}
	balance-=amount;
}
}
