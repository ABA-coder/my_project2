public class Main {
    public static void main(String[] args) {
        DatabaseService db = new DatabaseService();
        Flight flight = new Flight("ABA101", "London", 2);

        db.saveFlight(flight.getFlightNumber(), flight.getDestination(), flight.getCapacity());

        Passenger p1 = new Passenger("Dias", "Serikov", "AP101", "ABA101");
        Passenger p2 = new Passenger("Kamila", "Amirova", "AD109", "ABA101");
        CrewMember c1 = new CrewMember("Alex", "Brown", "Pilot");

        Booking b1 = new Booking(p1, flight);
        Booking b2 = new Booking(p2, flight);

        db.updateCapacity(flight.getFlightNumber(), flight.getCapacity());

        b1.displayBooking();
        b2.displayBooking();

        AirlineService service = new AirlineService();
        service.addHuman(p1);
        service.addHuman(p2);
        service.addHuman(c1);

        service.sortBySurname();
        service.showAll();

        db.readFlights();
    }
}