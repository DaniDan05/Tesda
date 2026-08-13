abstract class Vehicle {
    private String make;
    private String model;
    private int year;

    Vehicle(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }
    
    public String getMake() {
        return make;
    }
    
    public String getModel() {
        return model;
    }
    
    public int getYear() {
        return year;
    }

}

class Car extends Vehicle {
    private int numberOfDoors;

    Car (String make, String model, int year, int numberOfDoors) {
        super(make, model, year);
        this.numberOfDoors = numberOfDoors;
    }
    
    void displayDetails(){
        System.out.println(
            "Car Details:\n" +
            "Make: " + getMake() + "\n" +
            "Model: " + getModel() + "\n" +
            "Year: " + getYear() + "\n" +
            "Number of Doors: " + numberOfDoors
        );
    }
}


public class Task13 {
    public static void main(String[] args) {
        Car car = new Car("Toyota", "Camry", 2020, 4);
        car.displayDetails();
    }
}
