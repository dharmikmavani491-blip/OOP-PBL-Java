import java.util.*;

class Box<T> {
    ArrayList<T> list = new ArrayList<T>();

    void addItem(T item) {
        list.add(item);
    }

    void display() {
        System.out.println(list);
    }
}

class BoxDemo {
    public static void main(String[] args) {
        Box<String> names = new Box<String>();
        names.addItem("Rahul");
        names.addItem("Amit");

        Box<Integer> roll = new Box<Integer>();
        roll.addItem(101);
        roll.addItem(102);

        names.display();
        roll.display();
    }
}
