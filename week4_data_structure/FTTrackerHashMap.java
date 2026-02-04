package week4_data_structure;
import java.util.HashMap;
import java.util.Scanner;
import java.time.LocalDate;

public class FTTrackerHashMap {
    public static void main(String[] args) {
        HashMap<Integer, String> transactions = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        int choice; 

        while (true) {
            System.out.println("\nFinancial Transaction Tracker");
            System.out.println("1. Add Transaction");
            System.out.println("2. Transactions Yesterday");
            System.out.println("3. Total Income and Expense");
            System.out.println("4. Exit");
            System.out.println("5. Print all");
            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter type (Purchase/Sale): ");
                    String type = scanner.nextLine();
                    System.out.print("Enter amount: ");
                    double amount = scanner.nextDouble();
                    scanner.nextLine(); 
                    LocalDate date = LocalDate.now();

                    int id = transactions.size() + 1;
                    transactions.put(id, type + "," + amount + "," + date);

                    System.out.println("Transaction added with ID: " + id);
                    break;

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
