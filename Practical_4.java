class Time {
    int h, m;

    void setTime(int hh, int mm) {
        h = hh;
        m = mm;
    }

    void addTime(Time t1, Time t2) {
        m = t1.m + t2.m;
        h = t1.h + t2.h + m / 60;
        m = m % 60;
    }

    void display() {
        System.out.println(h + ":" + m);
    }

    public static void main(String[] args) {
        Time t1 = new Time();
        Time t2 = new Time();
        Time t3 = new Time();

        t1.setTime(2, 40);
        t2.setTime(3, 30);

        t3.addTime(t1, t2);
        t3.display();
    }
}
