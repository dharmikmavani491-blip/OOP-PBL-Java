import java.util.Scanner;

public class AddOneDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;
        System.out.print("Enter five digit number: ");
        num = sc.nextInt();

        int d1, d2, d3, d4, d5;

        d5 = num % 10;
        num = num / 10;

        d4 = num % 10;
        num = num / 10;

        d3 = num % 10;
        num = num / 10;

        d2 = num % 10;
        num = num / 10;

        d1 = num % 10;

        d1 = (d1 + 1) % 10;
        d2 = (d2 + 1) % 10;
        d3 = (d3 + 1) % 10;
        d4 = (d4 + 1) % 10;
        d5 = (d5 + 1) % 10;

        System.out.println("New Number = " + d1 + d2 + d3 + d4 + d5);
    }
}
