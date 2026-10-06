class Vehicle {
    void start() {
        System.out.println("Vehicle starts");
    }
}

class Car extends Vehicle {
    void driveCar() {
        System.out.println("Car is driving");
    }
}

class Bike extends Vehicle {
    void rideBike() {
        System.out.println("Bike is riding");
    }
}

class Hierarchical {
    public static void main(String[] args) {

        Car c = new Car();
        System.out.println("Car:");
        c.start();
        c.driveCar();

        Bike b = new Bike();
        System.out.println("\nBike:");
        b.start();
        b.rideBike();
    }
}