package Task;

// Define the superclass (Vehicle)
class Vehicle {
    private String make;
    private String model;
    private int year;

    // Constructor
    public Vehicle(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    // Getters (optional, but good practice)
    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    // Setter (optional)
    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                '}';
    }
}

// Define the subclass (Car) that extends Vehicle
class Car extends Vehicle {
    private int numberOfDoors;

    // Constructor (must call the superclass constructor)
    public Car(String make, String model, int year, int numberOfDoors) {
        super(make, model, year); // Call the superclass constructor
        this.numberOfDoors = numberOfDoors;
    }

    // Getters
    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    // Setter
    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + getMake() + '\'' +
                ", model='" + getModel() + '\'' +
                ", year=" + getYear() +
                ", numberOfDoors=" + numberOfDoors +
                '}';
    }

    

}

// Task13 class to create and use Car objects
public class Task13 {
    public static void main(String[] args) {
        // Create an instance of the Car class
        Car myCar = new Car("Toyota", "Camry", 2022, 4);

        // Set and get values for attributes
        System.out.println(myCar); // Use toString() for easy printing

        // Access attributes from the superclass
        System.out.println("Make: " + myCar.getMake());
        System.out.println("Model: " + myCar.getModel());
        System.out.println("Year: " + myCar.getYear());

        // Access attributes specific to the Car class
        System.out.println("Number of doors: " + myCar.getNumberOfDoors());

     
    }
}
