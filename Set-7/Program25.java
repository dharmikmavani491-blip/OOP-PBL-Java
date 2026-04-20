// Class with synchronized method
class TablePrinter {

    // Synchronized method
    synchronized void printTable(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
            try {
                Thread.sleep(200); // small delay for visibility
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
        System.out.println(); // line gap after each table
    }
}

// Thread class
class MyThread extends Thread {
    TablePrinter tp;
    int number;

    // Constructor
    MyThread(TablePrinter tp, int number) {
        this.tp = tp;
        this.number = number;
    }

    public void run() {
        tp.printTable(number);
    }
}

// Main class
public class Main {
    public static void main(String[] args) {

        TablePrinter tp = new TablePrinter();

        // Two threads for different tables
        MyThread t1 = new MyThread(tp, 5);
        MyThread t2 = new MyThread(tp, 7);

        t1.start();
        t2.start();
    }
}
