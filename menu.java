import java.util.Scanner;
public class menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DatabaseService db = new DatabaseService();

        while(true) {
            System.out.println("\n--- AIRLINE MANAGEMENT SYSTEM ---");
            System.out.println("1. Save New Flight to DB");
            System.out.println("2. Show All Flights from DB");
            System.out.println("3. Update Flight Capacity");
            System.out.println("0. Exit");
            System.out.print("Choose: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            if(choice == 0) break;

            switch(choice) {
                case 1: {
                    System.out.print("Enter Flight Number: ");
                    String number = scanner.nextLine();
                    System.out.print("Enter Destination: ");
                    String dest = scanner.nextLine();
                    System.out.print("Enter Capacity: ");
                    int cap = scanner.nextInt();

                    db.saveFlight(number, dest, cap);
                    break;
                }
                case 2: {
                    db.readFlights();
                    break;
                }
                case 3: {
                    System.out.print("Flight Number to update: ");
                    String number = scanner.nextLine();
                    System.out.print("New Capacity: ");
                    int newCap = scanner.nextInt();

                    db.updateCapacity(number, newCap);
                    break;
                }
            }
        }
    }
}