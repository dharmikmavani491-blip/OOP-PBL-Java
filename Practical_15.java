class NotSufficientFundException extends Exception {
    NotSufficientFundException(String s) {
        super(s);
    }
}

class Bank {
    double bal = 1000;

    void deposit(double amt) {
        bal += amt;
    }

    void withdraw(double amt) throws NotSufficientFundException {
        if (amt > bal)
            throw new NotSufficientFundException("Not Sufficient Fund");
        bal -= amt;
        System.out.println("Withdrawn " + amt);
    }

    public static void main(String[] args) {
        Bank b = new Bank();
        b.deposit(1000);

        try {
            b.withdraw(400);
            b.withdraw(300);
            b.withdraw(500);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
