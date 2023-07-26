package bankapp.model;

public class CurrentAccount extends Account implements LoanAccount{
    private double monthlyFee;
    private double loanBalance;
    public CurrentAccount(String owner, String IBAN, String currency,
                          double openingBalance, double currentBalance,
                          double monthlyFee) {
        super(owner, IBAN, currency, openingBalance, currentBalance);
        this.monthlyFee = monthlyFee;
        this.loanBalance = 0;
    }

    public double getMonthlyFee() {
        return monthlyFee;
    }

    public void setMonthlyFee(double monthlyFee) {
        this.monthlyFee = monthlyFee;
    }

    public void setLoanBalance(double loanBalance) {
        this.loanBalance = loanBalance;
    }

    public double getLoanBalance() {
        return loanBalance;
    }

    @Override
    public void deposit(double amount) {
        double newBalance = getCurrentBalance() + amount;
        setCurrentBalance(newBalance);
        displayBalance();
    }

    @Override
    public void withdraw(double amount) {
        if (isWithdrawPossible(amount)) {
            double newBalance = getCurrentBalance() - amount;
            setCurrentBalance(newBalance);
        } else {
            System.out.println("Withdrawing is not possible. Getting overdraft.");
            getOverdraft(amount);
        }
        displayBalance();
    }
    private double getOverdraft(double amount) {
        double newBalance = getCurrentBalance() - amount;
        setCurrentBalance(newBalance);
        return newBalance;
    }

    @Override
    public double borrow(double amount) {
        double newBalance = getCurrentBalance() + amount;
        setCurrentBalance(newBalance);
        displayBalance();
        setLoanBalance(amount);
        System.out.println("Loan balance: " + getLoanBalance());
        return newBalance;
    }

    @Override
    public void payLoanBack(double amount, double interestRate, int durationInMonths) {
        double payment = amount + interestRate*durationInMonths;
        if (getCurrentBalance() < payment) {
            System.out.println("Cannot pay loan.");
        } else {
            double newBalance = getCurrentBalance() - payment;
            setCurrentBalance(newBalance);
            setLoanBalance(0);
        }

    }

    @Override
    public void payLoanPerMonth(double amount, double interestRate, int durationInMonths) {
        double paymentPerMonth = (amount/durationInMonths) * interestRate;
        if (paymentPerMonth > getCurrentBalance()) {
            System.out.println("Cannot pay monthly loan");
        } else {
            double newBalance = getCurrentBalance() - paymentPerMonth;
            setCurrentBalance(newBalance);
            setLoanBalance(amount - paymentPerMonth);
        }
    }
}
