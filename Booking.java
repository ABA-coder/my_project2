public class Booking {
    private Passenger passenger;
    private Flight flight;
    private String status;

    public Booking(Passenger passenger, Flight flight) {
        this.passenger = passenger;
        this.flight = flight;

        if (flight.getCapacity() > 0 &&
                passenger.getFlightNumber().equals(flight.getFlightNumber())) {

            status = "CONFIRMED";
            flight.reduceCapacity();
        } else {
            status = "CANCELLED";
        }
    }

    public void displayBooking() {
        System.out.println(passenger);
        System.out.println(flight);
        System.out.println("Booking Status: " + status);
        System.out.println("----------------------");
    }
}
