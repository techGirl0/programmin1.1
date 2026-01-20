package week1_introduction;
import java.util.Scanner;

public class ATM {
    private double balance;
    private String pin;

    // Constructor
    public ATM(double initialBalance, String pin) {
        this.balance = initialBalance;
        this.pin = pin;
    }

    // Check balance
    public void checkBalance() {
        System.out.println("Your current balance: $" + balance);
    }

    // Withdraw money
    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient funds! Your balance: $" + balance);
        } else if (amount <= 0) {
            System.out.println("Invalid amount!");
        } else {
            balance -= amount;
            System.out.println("Withdrawal successful! You withdrew: $" + amount);
            System.out.println("Remaining balance: $" + balance);
        }
    }

    // Deposit money
    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid amount!");
        } else {
            balance += amount;
            System.out.println("Deposit successful! You deposited: $" + amount);
            System.out.println("New balance: $" + balance);
        }
    }

    // Verify PIN
    public boolean verifyPin(String enteredPin) {
        return this.pin.equals(enteredPin);
    }

    // Display menu and handle user input
    public void start() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("===== Welcome to ATM =====");
        System.out.print("Enter your PIN: ");
        String enteredPin = scanner.nextLine();

        if (!verifyPin(enteredPin)) {
            System.out.println("Invalid PIN! Access denied.");
            scanner.close();
            return;
        }

        boolean running = true;

        while (running) {
            System.out.println("\n===== ATM Menu =====");
            System.out.println("1. Check Balance");
            System.out.println("2. Withdraw");
            System.out.println("3. Deposit");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    checkBalance();
                    break;
                case 2:
                    System.out.print("Enter amount to withdraw: $");
                    double withdrawAmount = scanner.nextDouble();
                    withdraw(withdrawAmount);
                    break;
                case 3:
                    System.out.print("Enter amount to deposit: $");
                    double depositAmount = scanner.nextDouble();
                    deposit(depositAmount);
                    break;
                case 4:
                    System.out.println("Thank you for using ATM. Goodbye!");
                    running = false;
                    break;
                default:
                    System.out.println("Invalid option! Please try again.");
            }
        }

        scanner.close();
    }

    public static void main(String[] args) {
        // Create an ATM instance with initial balance $1000 and PIN "1234"
        ATM atm = new ATM(1000, "1234");
        atm.start();
    }
}
