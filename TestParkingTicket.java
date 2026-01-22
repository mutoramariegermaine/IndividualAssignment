package assignment;

public class TestParkingTicket {
    public static void main(String[] args) {

        PoliceOfficer officer = new PoliceOfficer("John Smith", "A123");

        ParkedCar car1 = new ParkedCar("Toyota", "Camry", "Blue", "ABC123", 30);
        ParkingMeter meter1 = new ParkingMeter(60);

        ParkingTicket ticket1 = officer.issueTicket(car1, meter1);
        System.out.println("Test Case 1: Car within time");
        System.out.println(ticket1 == null ? "PASS: No ticket issued\n" : "FAIL\n");

        ParkedCar car2 = new ParkedCar("Honda", "Civic", "Red", "XYZ789", 90);
        ParkingMeter meter2 = new ParkingMeter(60);

        ParkingTicket ticket2 = officer.issueTicket(car2, meter2);
        System.out.println("Test Case 2: 30 minutes over");
        System.out.println(ticket2 != null ? ticket2 + "\nPASS\n" : "FAIL\n");

        ParkedCar car3 = new ParkedCar("Ford", "Focus", "Black", "LMN456", 190);
        ParkingMeter meter3 = new ParkingMeter(60);

        ParkingTicket ticket3 = officer.issueTicket(car3, meter3);
        System.out.println("Test Case 3: Over 2 hours");
        System.out.println(ticket3 != null ? ticket3 + "\nPASS\n" : "FAIL\n");
    }
}

