package bankapp.model;

public class SavingsAccount extends Account{
    public SavingsAccount(String owner, String IBAN, String currency, double openingBalance, double currentBalance) {
        super(owner, IBAN, currency, openingBalance, currentBalance);
    }

    @Override
    public void deposit(double amount) {
    }

    @Override
    public void withdraw(double amount) {
    }
}
