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

                    int id = transactions.size() + 1; // unique ID
                    transactions.put(id, type + "," + amount + "," + date);

                    System.out.println("Transaction added with ID: " + id);
                    break;

                case 2:
                    LocalDate yesterday = LocalDate.now().minusDays(1);
                    int count = 0;
                    for (String transaction : transactions.values()) {
                        String[] parts = transaction.split(",");
                        if (parts[2].equals(yesterday.toString())) {
                            count++;
                        }
                    }
                    System.out.println("Transactions yesterday: " + count);
                    break;

                case 3:
                    double income = 0, expense = 0;
                    for (String transaction : transactions.values()) {
                        String[] parts = transaction.split(",");
                        String tType = parts[0];
                        double tAmount = Double.parseDouble(parts[1]);
                        if (tType.equalsIgnoreCase("Sale")) {
                            income += tAmount;
                        } else if (tType.equalsIgnoreCase("Purchase")) {
                            expense += tAmount;
                        }
                    }
                    System.out.println("Total Income: " + income);
                    System.out.println("Total Expense: " + expense);
                    break;

                case 5:
                    System.out.println("All transactions:");
                    for (Integer key : transactions.keySet()) {
                        System.out.println("ID " + key + ": " + transactions.get(key));
                    }
                    break;

                case 4:
                    System.out.println("Exiting tracker. Goodbye!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please enter 1-5.");
            }
        }
    }
}
