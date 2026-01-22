package assignment;

public class ParkingTicket {
    private ParkedCar car;
    private PoliceOfficer officer;
    private double fine;

    public ParkingTicket(ParkedCar car, PoliceOfficer officer, int minutesOver) {
        this.car = car;
        this.officer = officer;
        this.fine = calculateFine(minutesOver);
    }

    private double calculateFine(int minutesOver) {
        int hoursOver = (int) Math.ceil(minutesOver / 60.0);
        return 25 + (hoursOver - 1) * 10;
    }

    public double getFine() {
        return fine;
    }

    @Override
    public String toString() {
        return car.toString() + "\n" +
               "Officer Name: " + officer.getName() + "\n" +
               "Badge Number: " + officer.getBadgeNumber() + "\n" +
               "Fine: $" + fine;
    }
}
