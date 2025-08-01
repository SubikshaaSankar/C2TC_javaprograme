package assignment5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String inputLine = sc.nextLine();
        String[] bookingDetails = inputLine.split(",");

        if (bookingDetails.length != 3) {
            System.out.println("Invalid input format. Please enter: stageEvent,customer,noOfSeats");
            return;
        }

        String stageEvent = bookingDetails[0];
        String customer = bookingDetails[1];
        int noOfSeats = Integer.parseInt(bookingDetails[2]);

        TicketBooking booking = new TicketBooking(stageEvent, customer, noOfSeats);

        int choice = sc.nextInt();
        sc.nextLine(); // consume leftover newline

        booking.display();

        switch (choice) {
            case 1:
                double cashAmount = sc.nextDouble();
                booking.makePayment(cashAmount);
                break;
            case 2:
                double walletAmount = sc.nextDouble();
                sc.nextLine(); // consume newline
                String walletNumber = sc.nextLine();
                booking.makePayment(walletAmount, walletNumber);
                break;
            case 3:
                String holderName = sc.nextLine();
                double cardAmount = sc.nextDouble();
                sc.nextLine();
                String creditCardType = sc.nextLine();
                String ccv = sc.nextLine();
                booking.makePayment(holderName, cardAmount, creditCardType, ccv);
                break;
            default:
                System.out.println("Invalid choice");
        }
    }
}
