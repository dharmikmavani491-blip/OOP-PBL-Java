// Abstract class
abstract class Vehicle {

    // Abstract methods
    abstract String fuelType();
    abstract int noOfWheels();
}

// Subclass Car
class Car extends Vehicle {

    @Override
    String fuelType() {
        return "Petrol/Diesel";
    }

    @Override
    int noOfWheels() {
        return 4;
    }
}

// Subclass Bike
class Bike extends Vehicle {

    @Override
    String fuelType() {
        return "Petrol";
    }

    @Override
    int noOfWheels() {
        return 2;
    }
}

// Main class
public class Main {
    public static void main(String[] args) {

        Vehicle car = new Car();
        Vehicle bike = new Bike();

        // Car details
        System.out.println("Car Details:");
        System.out.println("Fuel Type: " + car.fuelType());
        System.out.println("Number of Wheels: " + car.noOfWheels());

        System.out.println();

        // Bike details
        System.out.println("Bike Details:");
        System.out.println("Fuel Type: " + bike.fuelType());
        System.out.println("Number of Wheels: " + bike.noOfWheels());
    }
}
