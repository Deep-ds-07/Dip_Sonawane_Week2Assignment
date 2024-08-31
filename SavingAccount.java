package BankS_week2;

public class SavingAccount extends BankAccount {
	
    private static final double WITHDRAWAL_LIMIT = 10000.0;

    public SavingAccount(int accountNumber, String accountHolderName, long mobileNumber, double initialBalance) {
        super(accountNumber, accountHolderName, mobileNumber, initialBalance);
    }

    @Override
    public void withdraw(double amount) {
        if (amount > WITHDRAWAL_LIMIT) {
            System.out.println("Cannot withdraw more than $" + WITHDRAWAL_LIMIT + " in a day.");
        } else {
            super.withdraw(amount);
        }
    }
}


