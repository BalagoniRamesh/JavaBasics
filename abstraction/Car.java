package abstraction;

public class Car extends Vehicle {
    public Car(String make, String model) {
        super(make, model);
    }

    @Override
    public void start() {
        System.out.println("\nStarting the car...");
    }

    @Override
    public void stop() {
    	// TODO Auto-generated method stub
    	System.out.println("Stopping the car...");

    }
}

