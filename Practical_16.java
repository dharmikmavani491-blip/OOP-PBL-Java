class MyThread extends Thread {
    int start, end;
    long sum = 0;

    MyThread(int s, int e) {
        start = s;
        end = e;
    }

    public void run() {
        for (int i = start; i <= end; i++)
            sum += i;
    }
}

class ThreadDemo {
    public static void main(String[] args) throws Exception {
        MyThread t1 = new MyThread(1, 1000);
        MyThread t2 = new MyThread(1001, 2000);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Total Sum = " + (t1.sum + t2.sum));
    }
}
