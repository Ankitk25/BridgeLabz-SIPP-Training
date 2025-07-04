package BankingSystem;

public class CurrentAccount extends BankAccount implements Loanable {
    private double interestRate = 0.01; 
    
    public CurrentAccount(String accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    @Override
    public double calculateInterest() {
        return getBalance() * interestRate;
    }

    @Override
    public void applyForLoan(double amount) {
        System.out.println("Loan applied for ₹" + amount + " (Current Account)");
    }

    @Override
    public boolean calculateLoanEligibility() {
        return getBalance() >= 10000;
    }
}
