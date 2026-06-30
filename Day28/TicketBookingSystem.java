package Day28;
import java.util.Scanner;

public class TicketBookingSystem {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int totalSeats = 10;
        String[] passengerName = new String[totalSeats];
        boolean[] booked = new boolean[totalSeats];

        int choice;

        do {
            System.out.println("\n===== Ticket Booking System =====");
            System.out.println("1. Book Ticket");
            System.out.println("2. Cancel Ticket");
            System.out.println("3. Display Booked Tickets");
            System.out.println("4. Check Available Seats");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scan.nextInt();
            scan.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter Seat Number (1-10): ");
                    int seat = scan.nextInt();
                    scan.nextLine();

                    if (seat < 1 || seat > totalSeats) {
                        System.out.println("Invalid Seat Number!");
                    } else if (booked[seat - 1]) {
                        System.out.println("Seat Already Booked!");
                    } else {
                        System.out.print("Enter Passenger Name: ");
                        passengerName[seat - 1] = scan.nextLine();
                        booked[seat - 1] = true;
                        System.out.println("Ticket Booked Successfully!");
                    }
                    break;

                case 2:
                    System.out.print("Enter Seat Number to Cancel: ");
                    seat = scan.nextInt();

                    if (seat < 1 || seat > totalSeats) {
                        System.out.println("Invalid Seat Number!");
                    } else if (!booked[seat - 1]) {
                        System.out.println("Seat is Already Available!");
                    } else {
                        booked[seat - 1] = false;
                        passengerName[seat - 1] = "";
                        System.out.println("Ticket Cancelled Successfully!");
                    }
                    break;

                case 3:
                    System.out.println("\nBooked Tickets:");
                    boolean found = false;

                    for (int i = 0; i < totalSeats; i++) {
                        if (booked[i]) {
                            System.out.println("Seat " + (i + 1) +
                                               " -> " + passengerName[i]);
                            found = true;
                        }
                    }

                    if (!found) {
                        System.out.println("No Tickets Booked.");
                    }
                    break;

                case 4:
                    System.out.println("\nAvailable Seats:");
                    found = false;

                    for (int i = 0; i < totalSeats; i++) {
                        if (!booked[i]) {
                            System.out.print((i + 1) + " ");
                            found = true;
                        }
                    }

                    if (!found) {
                        System.out.println("No Seats Available.");
                    } else {
                        System.out.println();
                    }
                    break;

                case 5:
                    System.out.println("Thank You!");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 5);

        scan.close();
    }
}