    public class Main{
        public static void main(String[]args){

            Flight flight=new Flight("ABA101","London",1);

            Passenger p1=new Passenger("Dias","Serikov","AP101","ABA100");
            Passenger p2=new Passenger("Kamila","Amirova","AD109","ABA109");

            Booking b1=new Booking(p1,flight);
            b1.displayBooking();

            Booking b2=new Booking(p2,flight);
            b2.displayBooking();

            flight.display();

        }
    }