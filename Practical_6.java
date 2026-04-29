class BillGenerator {
    void generateBill(int total) {
        System.out.println("Bill = " + total);
    }

    void generateBill(int total, int discount) {
        System.out.println("Bill = " + (total - discount));
    }

    void generateBill(int total, double per) {
        System.out.println("Bill = " + (total - total * per / 100));
    }

    public static void main(String[] args) {
        BillGenerator b = new BillGenerator();
        b.generateBill(1000);
        b.generateBill(1000, 100);
        b.generateBill(1000, 10.0);
    }
}
