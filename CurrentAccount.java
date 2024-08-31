package BankS_week2;

public class CurrentAccount extends BankAccount {
	
	    private static final double MINIMUM_BALANCE = 10000.0;

	    public CurrentAccount(int accountNumber, String accountHolderName, long mobileNumber, double initialBalance) {
	        super(accountNumber, accountHolderName, mobileNumber, initialBalance);
	    }

	    @Override
	    public void withdraw(double amount) {
	        if (balance - amount < MINIMUM_BALANCE) {
	            System.out.println("Cannot withdraw. Balance must not fall below $" + MINIMUM_BALANCE);
	        } else {
	            super.withdraw(amount);
	        }
	    }
	}
