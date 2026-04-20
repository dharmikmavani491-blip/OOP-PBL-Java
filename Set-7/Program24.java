// Thread T1: prints 1 to 100
class T1 extends Thread {
    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.println(i);
        }
    }
}

// Thread T2: prints 101 to 200
class T2 extends Thread {
    public void run() {
        for (int i = 101; i <= 200; i++) {
            System.out.println(i);
        }
    }
}

// Thread T3: prints 201 to 300
class T3 extends Thread {
    public void run() {
        for (int i = 201; i <= 300; i++) {
            System.out.println(i);
        }
    }
}

// Main class
public class Main {
    public static void main(String[] args) {

        T1 t1 = new T1();
        T2 t2 = new T2();
        T3 t3 = new T3();

        try {
            // Start and complete T1 first
            t1.start();
            t1.join();

            // Then T2
            t2.start();
            t2.join();

            // Then T3
            t3.start();
            t3.join();

        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}
