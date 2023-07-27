package bankapp.model;

import bankapp.exception.InsufficientFundsException;

public abstract class Account {
    private String owner;
    private String IBAN;
    private String currency;
    private double openingBalance;
    private double currentBalance;

    public Account(String owner, String IBAN, String currency,
                   double openingBalance, double currentBalance) {
        this.owner = owner;
        this.IBAN = IBAN;
        this.currency = currency;
        this.openingBalance = openingBalance;
        this.currentBalance = currentBalance;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getIBAN() {
        return IBAN;
    }

    public void setIBAN(String IBAN) {
        this.IBAN = IBAN;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public double getOpeningBalance() {
        return openingBalance;
    }

    public void setOpeningBalance(double openingBalance) {
        this.openingBalance = openingBalance;
    }

    public double getCurrentBalance() {
        return currentBalance;
    }

    public void setCurrentBalance(double currentBalance) {
        this.currentBalance = currentBalance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "owner='" + owner + '\'' +
                ", IBAN='" + IBAN + '\'' +
                ", currency='" + currency + '\'' +
                ", openingBalance=" + openingBalance +
                ", currentBalance=" + currentBalance +
                '}';
    }

    public void displayBalance() {
        System.out.println("Current balance: " + currentBalance);
    }
    public abstract void deposit(double amount);
    public abstract void withdraw(double amount) throws InsufficientFundsException;

    public boolean isWithdrawPossible(double amount) {
        return currentBalance >= amount;
    }


}
