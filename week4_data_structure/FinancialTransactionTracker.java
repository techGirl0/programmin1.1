package week4_data_structure;
import java.util.ArrayList; 

public class FinancialTransactionTracker {
    public static void main(String[] args) {
        
        ArrayList<String> history = new ArrayList<>();
        
        history.add("Purchase,50.00,2025-01-15");
        history.add("Sales,100.00,2025-01-16");
        history.add("Purchase,10.50,2025-01-16");

        System.out.println("--- All Transactions ---");
        for (String record : history) {
            System.out.println(record);
        }
    }
}
