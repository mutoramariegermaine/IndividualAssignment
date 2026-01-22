package assignment;

public class ParkedCar {
    private String make;
    private String model;
    private String color;
    private String licenseNumber;
    private int minutesParked;

    public ParkedCar(String make, String model, String color,
                     String licenseNumber, int minutesParked) {
        this.make = make;
        this.model = model;
        this.color = color;
        this.licenseNumber = licenseNumber;
        this.minutesParked = minutesParked;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public int getMinutesParked() {
        return minutesParked;
    }

    public void setMinutesParked(int minutesParked) {
        this.minutesParked = minutesParked;
    }

    @Override
    public String toString() {
        return "Car Info:\n" +
               "Make: " + make + "\n" +
               "Model: " + model + "\n" +
               "Color: " + color + "\n" +
               "License Number: " + licenseNumber + "\n" +
               "Minutes Parked: " + minutesParked;
    }
}
