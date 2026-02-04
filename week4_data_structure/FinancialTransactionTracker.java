package week4_data_structure;
import java.util.ArrayList;
import java.util.Scanner;

public class FinancialTransactionTracker {
    public static void main(String[] args) {
        ArrayList<String> transactions = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nFinancial Transaction Tracker");
            System.out.println("1. Add Transaction");
            System.out.println("2. Transactions Yesterday");
            System.out.println("3. Total Income and Expense");
            System.out.println("4. Exit");
            System.out.println("5. Print all");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 4:
                    System.out.println("Exiting tracker. Goodbye!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Option selected: " + choice);
            }
        }
    }
}
