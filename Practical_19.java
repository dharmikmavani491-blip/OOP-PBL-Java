import java.util.*;

class SortDemo {

    static <T extends Comparable<T>> void sortList(List<T> list) {
        Collections.sort(list);
    }

    public static void main(String[] args) {

        ArrayList<Integer> n = new ArrayList<Integer>();
        n.add(30);
        n.add(10);
        n.add(20);

        System.out.println("Before = " + n);
        sortList(n);
        System.out.println("After = " + n);

        ArrayList<String> s = new ArrayList<String>();
        s.add("Zara");
        s.add("Amit");
        s.add("Ravi");

        System.out.println("Before = " + s);
        sortList(s);
        System.out.println("After = " + s);
    }
}
