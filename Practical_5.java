class BankAccount {
    String id, name;
    double bal;

    void assign(String i, String n, double b) {
        id = i;
        name = n;
        bal = b;
    }

    void display() {
        System.out.println(id + " " + name + " " + bal);
    }

    public static void main(String[] args) {
        BankAccount a[] = new BankAccount[3];

        for (int i = 0; i < 3; i++)
            a[i] = new BankAccount();

        a[0].assign("101", "A", 1000);
        a[1].assign("102", "B", 2000);
        a[2].assign("103", "C", 3000);

        String search = "102";

        for (int i = 0; i < 3; i++)
            if (a[i].id.equals(search))
                a[i].display();
    }
}
