package week3_conditions_in_java;

public class TicketCalculator {
    public static void main(String[] args) {
        int age = 25;
        boolean isStudent = true;
        boolean isSenior = false;
        int ticketPrice = 50;

        if (isStudent) {
            if (age < 30) {
                ticketPrice = 40;
            }
        } else if (isSenior) {
            if (age >= 60) {
                ticketPrice = 35;
            }
        }

        System.out.println("Ticket price: " + ticketPrice);
    }
}
