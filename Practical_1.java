import java.util.Scanner;

public class ATMNotes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int amount;

        System.out.print("Enter amount: ");
        amount = sc.nextInt();

        int n100, n50, n10, n5, n2, n1;

        n100 = amount / 100;
        amount = amount % 100;

        n50 = amount / 50;
        amount = amount % 50;

        n10 = amount / 10;
        amount = amount % 10;

        n5 = amount / 5;
        amount = amount % 5;

        n2 = amount / 2;
        amount = amount % 2;

        n1 = amount / 1;

        System.out.println("100 Notes = " + n100);
        System.out.println("50 Notes  = " + n50);
        System.out.println("10 Notes  = " + n10);
        System.out.println("5 Notes   = " + n5);
        System.out.println("2 Notes   = " + n2);
        System.out.println("1 Notes   = " + n1);
    }
}
