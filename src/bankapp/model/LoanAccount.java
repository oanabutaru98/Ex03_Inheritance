package bankapp.model;

public interface LoanAccount {
    double borrow(double amount);
    void payLoanBack(double amount, double interestRate, int durationInMonths);
    void payLoanPerMonth(double amount, double interestRate, int durationInMonths);
}
