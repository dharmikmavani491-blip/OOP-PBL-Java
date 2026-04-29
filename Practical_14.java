class AverageDemo {
    static double average(String a[]) throws Exception {
        double sum = 0;

        for (int i = 0; i < a.length; i++)
            sum += Double.parseDouble(a[i]);

        return sum / a.length;
    }

    public static void main(String[] args) {
        String x[] = {"10", "20", "30"};

        try {
            System.out.println(average(x));
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("Done");
        }
    }
}
