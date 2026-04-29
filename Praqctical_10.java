class Vehicle {
    protected String number, brand, fuel;

    Vehicle(String n, String b, String f) {
        number = n;
        brand = b;
        fuel = f;
    }

    void displayDetails() {
        System.out.println(number + " " + brand + " " + fuel);
    }
}

class Car extends Vehicle {
    int seats;
    boolean ac;

    Car(String n, String b, String f, int s, boolean a) {
        super(n, b, f);
        seats = s;
        ac = a;
    }

    void displayDetails() {
        super.displayDetails();
        System.out.println("Seats=" + seats + " AC=" + ac);
    }
}

class ElectricCar extends Car {
    int battery;
    int chargeTime;

    ElectricCar(String n, String b, int s, boolean a, int bat, int ct) {
        super(n, b, "Electric", s, a);
        battery = bat;
        chargeTime = ct;
    }

    void displayDetails() {
        super.displayDetails();
        System.out.println("Battery=" + battery + " Charge=" + chargeTime);
    }

    public static void main(String[] args) {
        Vehicle v = new Car("GJ01", "Honda", "Petrol", 5, true);
        v.displayDetails();

        if (v instanceof Car) {
            Car c = (Car) v;
            c.displayDetails();
        }

        ElectricCar e = new ElectricCar("GJ02", "Tesla", 5, true, 80, 2);
        e.displayDetails();
    }
}
