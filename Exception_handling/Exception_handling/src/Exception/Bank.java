package Exception;

public class Bank {
  public static void main(String[] args) {
	BankAccount bankaccount= new BankAccount(10);
	try {
		bankaccount.withdraw(11);
	} catch (Exception e) {
		System.out.println(e);
	}
}
}
