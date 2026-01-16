# Simple ATM System

A very simple ATM system for testing purposes written in Java.

## Features

- **PIN Verification**: Secure login with PIN (default: 1234)
- **Check Balance**: View current account balance
- **Withdraw**: Withdraw money with validation
- **Deposit**: Deposit money into account
- **Easy Menu Interface**: Simple command-line menu

## Initial Setup

- Default PIN: `1234`
- Initial Balance: `$1000`

## How to Run

1. Compile the code:
   ```
   javac ATM.java
   ```

2. Run the program:
   ```
   java ATM
   ```

3. Enter PIN when prompted: `1234`

4. Choose from menu options (1-4)

## Testing

- Try withdrawing $500
- Try depositing $200
- Try withdrawing more than available balance (will show error)
- Try entering invalid PIN (access denied)