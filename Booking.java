public class Booking {

    private Passenger passenger;
    private Flight flight;
    private String status;

    public Booking(Passenger passenger, Flight flight) {
        this.passenger = passenger;
        this.flight = flight;

        if (flight.getcapacity() > 0 &&
                passenger.getflightNumber().equals(flight.getflightNumber())) {

            status = "CONFIRMED";
            flightSeatReduce();

        } else {
            status = "CANCELLED";
        }
    }
    private void flightSeatReduce() {
        int newCapacity = flight.getcapacity() - 1;

}

    public void displayBooking() {
        passenger.display();
        flight.display();
        System.out.println("Booking Status: " + status);
    }
}
