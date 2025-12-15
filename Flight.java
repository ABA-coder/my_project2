public class Flight {
    private String flightNumber;
    private String destination;
    private int capacity;

    public Flight(String flightNumber, String destination, int capacity) {
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.capacity = capacity;
    }
    public String getflightNumber(){
        return flightNumber;
    }
    public String getdestination(){
        return destination;
    }
    public int getcapacity(){
        return capacity;
    }
    public void display(){
        System.out.println("flight Number:"+flightNumber);
        System.out.println("Destination"+destination);
        System.out.println("Capacity"+capacity);
    }



}
