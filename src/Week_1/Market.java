package Week_1;

import java.util.Scanner;

public class Market {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double totalPrice = 0;
        int choice = -1;
        while (choice != 0) {
            System.out.println("What would you like to buy?");
            System.out.println("1. Apple - $2.99");
            System.out.println("2. Banana - $1.99");
            System.out.println("3. Orange - $3.99");
            System.out.println("0. Complete shopping");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    totalPrice += 2.99;
                    System.out.println("You have added an apple to your cart.");
                    System.out.println("Your total is: $" + totalPrice);
                    System.out.println("-------------------------");
                    break;
                case 2:
                    totalPrice += 1.99;
                    System.out.println("You have added a banana to your cart.");
                    System.out.println("Your total is: $" + totalPrice);
                    System.out.println("-------------------------");
                    break;
                case 3:
                    totalPrice += 3.99;
                    System.out.println("You have added an orange to your cart.");
                    System.out.println("Your total is: $" + totalPrice);
                    System.out.println("-------------------------");
                    break;
                case 0:
                    System.out.println("Thank you for shopping with us. Your total is: $" + totalPrice);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    System.out.println("-------------------------");
                    break;
            }
        }
        System.out.print("Do you have a discount coupon? (yes/no): ");
        String coupon = scanner.next();
        if (coupon.equalsIgnoreCase("yes")) {
            totalPrice *= 0.9;
            System.out.println("Your new total after discount is: $" + totalPrice);
        }
        scanner.close();
    }
}
