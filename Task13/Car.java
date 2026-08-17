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