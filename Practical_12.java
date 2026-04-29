interface Order {
    void placeOrder(String item, int qty);
    void cancelOrder(int id);
    void generateBill();
}

abstract class PartialOrder implements Order {
    String item;
    int qty;

    public void placeOrder(String i, int q) {
        item = i;
        qty = q;
        System.out.println("Order Placed");
    }
}

class FinalOrder extends PartialOrder {
    public void cancelOrder(int id) {
        System.out.println("Order Cancelled " + id);
    }

    public void generateBill() {
        System.out.println("Bill = " + qty * 100);
    }

    public static void main(String[] args) {
        FinalOrder f = new FinalOrder();
        f.placeOrder("Pen", 5);
        f.generateBill();
    }
}
