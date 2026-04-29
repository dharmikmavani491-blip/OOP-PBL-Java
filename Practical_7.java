class LoanCalculator {
    void calculateEMI(int p, int t, float r) {
        System.out.println((p + p * r * t / 100) / t);
    }

    void calculateEMI(double p, int t, double r) {
        System.out.println((p + p * r * t / 100) / t);
    }

    void calculateEMI(int p, int t) {
        System.out.println((p + p * 10 * t / 100) / t);
    }

    public static void main(String[] args) {
        LoanCalculator l = new LoanCalculator();
        l.calculateEMI(100000, 12, 7.5f);
        l.calculateEMI(50000.0, 10, 8.0);
        l.calculateEMI(20000, 5);
    }
}
