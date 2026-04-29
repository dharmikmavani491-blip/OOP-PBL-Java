class University {
    static int total = 0;
    static String name;

    static {
        name = "GTU";
        System.out.println("Static Block");
    }

    {
        System.out.println("Instance Block");
    }

    University() {
        total++;
    }

    static void getTotal() {
        System.out.println(total);
    }

    public static void main(String[] args) {
        University u1 = new University();
        University u2 = new University();
        getTotal();
    }
}
