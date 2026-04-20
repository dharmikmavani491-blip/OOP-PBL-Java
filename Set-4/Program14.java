class BankAccount {
    protected String accountNumber;
    protected String accountHolderName;
    protected double balance;

    // Method to open account
    public void openAccount(String accNo, String name, double initialBalance) {
        accountNumber = accNo;
        accountHolderName = name;
        balance = initialBalance;
        System.out.println("Account opened successfully for " + accountHolderName);
    }

    // Deposit method
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    // Withdraw method
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    // Check balance
    public void checkBalance() {
        System.out.println("Current Balance: " + balance);
    }
}

// SavingAccount subclass
class SavingAccount extends BankAccount {
    private double interestRate = 4.0; // %

    public void calculateInterest() {
        double interest = (balance * interestRate) / 100;
        System.out.println("Interest (Saving Account): " + interest);
    }
}

// FixedDepositAccount subclass
class FixedDepositAccount extends BankAccount {
    private double rate = 6.5; // %
    private int years = 2;

    public void maturityAmount() {
        double maturity = balance * Math.pow((1 + rate / 100), years);
        System.out.println("Maturity Amount (FD): " + maturity);
    }
}

// Main class
public class Main {
    public static void main(String[] args) {

        // Saving Account
        SavingAccount sa = new SavingAccount();
        sa.openAccount("SA101", "Dharmik", 10000);
        sa.deposit(2000);
        sa.withdraw(1500);
        sa.checkBalance();
        sa.calculateInterest();

        System.out.println();

        // Fixed Deposit Account
        FixedDepositAccount fd = new FixedDepositAccount();
        fd.openAccount("FD201", "Rahul", 20000);
        fd.checkBalance();
        fd.maturityAmount();
    }
}
