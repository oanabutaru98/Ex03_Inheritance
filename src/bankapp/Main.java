package bankapp;

import bankapp.exception.InsufficientFundsException;
import bankapp.model.CurrentAccount;

public class Main {
    public static void main(String[] args) {
        CurrentAccount currentAccount = new CurrentAccount(
                "Oana",
                "123456789",
                "EUR",
                0,
                10.0,
                1.5
        );

        currentAccount.displayBalance();
        currentAccount.deposit(10);
        try {
            currentAccount.withdraw(5);
            currentAccount.withdraw(30);
        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        }

        currentAccount.borrow(100);
        currentAccount.payLoanBack(100, 1, 10);
        currentAccount.displayBalance();
        currentAccount.payLoanPerMonth(100, 1.5, 10);
        currentAccount.displayBalance();
    }
}
