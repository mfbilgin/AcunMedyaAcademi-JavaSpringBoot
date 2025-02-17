package Week_1;

import java.util.Scanner;

public class TrafficTicket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int speedLimit = 90;

        System.out.print("Enter the speed limit: ");
        int speed = scanner.nextInt();
        if (speed < 0) {
            System.out.println("Invalid speed limit.");
            return;
        }

        if (speed > speedLimit && speed <= speedLimit + 20) {
            System.out.println("You have exceeded the speed limit by 1-20 km/h. Your fine is ₺1000.");
        } else if (speed > speedLimit + 20 && speed <= speedLimit + 40) {
            System.out.println("You have exceeded the speed limit by 21-40 km/h. Your fine is ₺2000.");
        } else if (speed > speedLimit + 40) {
            System.out.println("You have exceeded the speed limit by more than 40 km/h. Your license is revoked.");
        } else {
            System.out.println("You are within the speed limit.");
        }
    }
}
