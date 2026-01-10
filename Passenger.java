public class Passenger extends Human {
    private String passportNumber;
    private String flightNumber;

    public Passenger(String name, String surname, String passportNumber, String flightNumber) {
        super(name, surname);
        this.passportNumber = passportNumber;
        this.flightNumber = flightNumber;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    @Override
    public String getRole() {
        return "Passenger";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Passenger)) return false;
        Passenger p = (Passenger) o;
        return passportNumber.equals(p.passportNumber);
    }

    @Override
    public int hashCode() {
        return passportNumber.hashCode();
    }
}
