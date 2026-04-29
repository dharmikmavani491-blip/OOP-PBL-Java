import java.util.*;
class PasswordCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String p = sc.nextLine();

        int digit = 0;
        boolean valid = true;

        if (p.length() < 8)
            valid = false;

        for (int i = 0; i < p.length(); i++) {
            char c = p.charAt(i);

            if (Character.isDigit(c))
                digit++;
            else if (!Character.isLetter(c))
                valid = false;
        }

        if (digit < 2)
            valid = false;

        if (valid)
            System.out.println("Valid");
        else
            System.out.println("Invalid");
    }
}
