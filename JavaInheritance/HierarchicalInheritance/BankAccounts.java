package JavaInheritence.HierarchicalInheritence;
import java.util.*;
class BankAccount {
    String accountNumber;
    double balance;

    BankAccount(String acc, double bal) {
        this.accountNumber = acc;
        this.balance = bal;
    }
}

class SavingsAccount extends BankAccount {
    double interestRate;

    SavingsAccount(String acc, double bal, double rate) {
        super(acc, bal);
        this.interestRate = rate;
    }

    void displayAccountType() {
        System.out.println("Savings Account");
    }
}

class CheckingAccount extends BankAccount {
    double withdrawalLimit;

    CheckingAccount(String acc, double bal, double limit) {
        super(acc, bal);
        this.withdrawalLimit = limit;
    }

    void displayAccountType() {
        System.out.println("Checking Account");
    }
}

class FixedDepositAccount extends BankAccount {
    int termInMonths;

    FixedDepositAccount(String acc, double bal, int term) {
        super(acc, bal);
        this.termInMonths = term;
    }

    void displayAccountType() {
        System.out.println("Fixed Deposit Account");
    }

    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount("S001", 10000, 4.5);
        CheckingAccount ca = new CheckingAccount("C001", 5000, 2000);
        FixedDepositAccount fa = new FixedDepositAccount("F001", 20000, 12);

        sa.displayAccountType();
        ca.displayAccountType();
        fa.displayAccountType();
    }
}