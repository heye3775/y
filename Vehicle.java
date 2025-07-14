class Vehicle {
    void fuelEfficiency()
    {
        System.out.println("Fuel Efficiency varies by vehicle");
    }
}
class Car extends Vehicle {
    @Override
    void fuelEfficiency()
    {
        System.out.println("Car's mileage is 15 mph");
    }
}
class Bike extends Vehicle {
    @Override
    void fuelEfficiency()
    {
        System.out.println("Bike's mileage is 30 mph");
    }
}
class Main {
    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[3];
        vehicles[0] = new Car();
        vehicles[1] = new Bike();
        vehicles[2] = new Car();
        for (Vehicle v : vehicles) {
            v.fuelEfficiency();
        }
    }
}