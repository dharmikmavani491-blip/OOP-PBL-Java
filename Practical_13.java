class A {
    public int pub = 10;
    protected int pro = 20;
    private int pri = 30;

    void show() {
        System.out.println(pri);
    }
}

class B extends A {
    void display() {
        System.out.println(pub);
        System.out.println(pro);
    }
}

class PackageDemo {
    public static void main(String[] args) {
        B b = new B();
        b.display();
    }
}
