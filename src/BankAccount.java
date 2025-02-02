public class BankAccount {
    public static void main(String[] args) {
        // Initial balance
        double balance = 2175.37;

        // Step-by-step transactions
        balance -= 302.50;          // Withdraw $302.50
        balance += 50.03;           // Deposit $50.03
        balance -= balance / 2;     // Withdraw half of the current balance
        balance += 20;              // Deposit $20
        balance -= 1;               // Withdraw $1
        balance *= 2;               // Double the current balance (paycheck deposit)
        balance += 1;               // Deposit $1

        // Output the final balance
        System.out.printf("Bob's final account balance is: $%.2f%n", balance);
    }
}
