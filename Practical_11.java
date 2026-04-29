import java.util.*;

class Payment {
    void processPayment(int amt) {
        System.out.println("Payment Processing");
    }
}

class CreditCardPayment extends Payment {
    void processPayment(int amt) {
        System.out.println("Payment of Rs." + amt + " done using Credit Card");
    }
}

class UPIPayment extends Payment {
    void processPayment(int amt) {
        System.out.println("Payment of Rs." + amt + " done using UPI");
    }
}

class PaymentDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ch = sc.nextInt();
        int amt = sc.nextInt();

        Payment p;

        if (ch == 1)
            p = new CreditCardPayment();
        else
            p = new UPIPayment();

        p.processPayment(amt);
    }
}
