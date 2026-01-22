public class Flight {
    private String flightNumber;
    private String destination;
    private int capacity;

    public Flight(String flightNumber, String destination, int capacity) {
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.capacity = capacity;
    }

    public String getFlightNumber() { return flightNumber; }
    public String getDestination() { return destination; }
    public int getCapacity() { return capacity; }

    public void reduceCapacity() {
        if (this.capacity > 0) {
            this.capacity--;
        }
    }

    @Override
    public String toString() {
        return "Flight{flightNumber='" + flightNumber + "', destination='" + destination + "', capacity=" + capacity + "}";
    }
}