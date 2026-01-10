public class Main {
    public static void main(String[] args) {

        Flight flight = new Flight("ABA101", "London", 2);

        Passenger p1 = new Passenger("Dias", "Serikov", "AP101", "ABA101");
        Passenger p2 = new Passenger("Kamila", "Amirova", "AD109", "ABA101");

        CrewMember c1 = new CrewMember("Alex", "Brown", "Pilot");

        Booking b1 = new Booking(p1, flight);
        Booking b2 = new Booking(p2, flight);

        b1.displayBooking();
        b2.displayBooking();

        AirlineService service = new AirlineService();
        service.addHuman(p1);
        service.addHuman(p2);
        service.addHuman(c1);

        System.out.println("=== ALL PEOPLE ===");
        service.showAll();

        System.out.println("\n=== SORTED BY SURNAME ===");
        service.sortBySurname();
        service.showAll();

        System.out.println("\n=== PASSENGERS ONLY ===");
        service.showPassengersOnly();
    }
}
