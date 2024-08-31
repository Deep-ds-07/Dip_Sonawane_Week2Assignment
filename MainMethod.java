package BankS_week2;

public class MainMethod {

	public static void main(String[] args) {
		SavingAccount savingAccount = new SavingAccount(123456781, "Deep", 8317267448L, 20000);
		savingAccount.deposit(5000);
		savingAccount.withdraw(12000);
		savingAccount.displayBalance();

		System.out.println(); 

		CurrentAccount currentAccount = new CurrentAccount(876543210, "Deep", 8317267448L, 15000);
		currentAccount.deposit(3000);
		currentAccount.withdraw(5000);
		currentAccount.displayBalance();
	}
}
