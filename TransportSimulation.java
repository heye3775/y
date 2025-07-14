import java.util.*;

interface Vehicle {
    void start();
    void stop();
    String getFuelType();
}

class Car implements Vehicle {
    @Override
    public void start()
    {
        System.out.println("Car is starting.");
    }
    
    @Override
    public void stop()
    {
        System.out.println("Car is stopping.");
    }
    
    @Override
    public String getFuelType()
    {
        return "Petrol";
    }
}

class Bike implements Vehicle {
    @Override
    public void start()
    {
        System.out.println("Bike is starting.");
    }
    
    @Override
    public void stop()
    {
        System.out.println("Bike is stopping.");
    }
    
    @Override
    public String getFuelType()
    {
        return "P";
    }
}

class Truck implements Vehicle {
    @Override
    public void start()
    {
        System.out.println("Truck is starting.");
    }
    
    @Override
    public void stop()
    {
        System.out.println("Truck is stopping.");
    }
    
    @Override
    public String getFuelType()
    {
        return "Diesel";
    }
}


public class TransportSimulation {
    public static void main(String[] args) {
        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new Car());
        vehicles.add(new Bike());
        vehicles.add(new Truck());

        for (Vehicle v : vehicles) {
            v.start();
            System.out.println("Fuel type: " + v.getFuelType());
            v.stop();
            System.out.println();
        }
    }
}