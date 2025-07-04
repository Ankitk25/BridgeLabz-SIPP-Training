package BankingSystem;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<BankAccount> accounts = new ArrayList<>();

        BankAccount sa = new SavingsAccount("SAV123", "Alice", 7000);
        BankAccount ca = new CurrentAccount("CUR456", "Bob", 12000);

        accounts.add(sa);
        accounts.add(ca);

        for (BankAccount acc : accounts) {
            acc.displayAccount();
            System.out.println("Interest Earned: ₹" + acc.calculateInterest());

            acc.deposit(1000);
            acc.withdraw(2000);

            if (acc instanceof Loanable) {
                Loanable loan = (Loanable) acc;
                System.out.println("Eligible for loan: " + (loan.calculateLoanEligibility() ? "Yes" : "No"));
                loan.applyForLoan(50000);
            }

            System.out.println("---------------------------");
        }
    }
}
