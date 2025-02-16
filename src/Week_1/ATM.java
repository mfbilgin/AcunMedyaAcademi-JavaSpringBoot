package Week_1;

import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String correctPin = "1234";
        double accountBalance = 1000.00;
        System.out.print("Welcome to the ATM. Please enter your PIN: ");
        String enteredPin = scanner.nextLine();
        int attempts = 1;
        while (!enteredPin.equals(correctPin)) {
            if (attempts == 3) {
                System.out.println("You have exceeded the maximum number of attempts. Your account is now locked.");
                return;
            }
            System.out.println("Incorrect PIN. Please try again.");
            attempts++;
            System.out.print("Enter your PIN: ");
            enteredPin = scanner.nextLine();
        }
        System.out.println("PIN accepted. You now have access to your account.");
        int choice = 0;
        while (choice != 4) {
            System.out.println("What would you like to do?");
            System.out.println("1. Check balance");
            System.out.println("2. Deposit money");
            System.out.println("3. Withdraw money");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            if (choice == 1) {
                System.out.println("Your account balance is: $" + accountBalance);
                System.out.println("-------------------------");
            } else if (choice == 2) {
                System.out.println("How much would you like to deposit?");
                double depositAmount = scanner.nextDouble();
                accountBalance += depositAmount;
                System.out.println("Your new account balance is: $" + accountBalance);
                System.out.println("-------------------------");
            } else if (choice == 3) {
                System.out.println("How much would you like to withdraw?");
                double withdrawAmount = scanner.nextDouble();
                if (withdrawAmount > accountBalance) {
                    System.out.println("Insufficient funds.");
                } else {
                    accountBalance -= withdrawAmount;
                    System.out.println("Your new account balance is: $" + accountBalance);
                }
                System.out.println("-------------------------");
            } else if (choice == 4) {
                System.out.println("Thank you for using our ATM. Goodbye!");
            } else {
                System.out.println("Invalid choice. Please try again.");
                System.out.println("-------------------------");
            }

        }
        scanner.close();
    }
}
