public class Passenger {
    private String name;
    private String surname;
    private String passportNumber;
    private String flightNumber;
    public Passenger(String name,String surname,String passportNumber,String flightNumber){
        this.name=name;
        this.surname=surname;
        this.passportNumber=passportNumber;
        this.flightNumber=flightNumber;
    }
    public String getname(){
        return name;
    }
    public String getsurname(){
        return surname;
    }
    public String getpassportNumber(){
        return passportNumber;
    }
    public String getflightNumber(){
        return flightNumber;
    }
    public void display(){
        System.out.println("Name:"+name);
        System.out.println("Surname:"+surname);
        System.out.println("Pasport:"+passportNumber);
        System.out.println("Flight Number:"+flightNumber);
    }
}

