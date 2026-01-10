public class Flight {
    private String flightNumber;
    private String destination;
    private int capacity;

    public Flight(String flightNumber, String destination, int capacity) {
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.capacity = capacity;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public int getCapacity() {
        return capacity;
    }

    public void reduceCapacity() {
        if (capacity > 0) {
            capacity--;
        }
    }

    @Override
    public String toString() {
        return "Flight{" +
                "flightNumber='" + flightNumber + '\'' +
                ", destination='" + destination + '\'' +
                ", capacity=" + capacity +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Flight)) return false;
        Flight f = (Flight) o;
        return flightNumber.equals(f.flightNumber);
    }

    @Override
    public int hashCode() {
        return flightNumber.hashCode();
    }
}
