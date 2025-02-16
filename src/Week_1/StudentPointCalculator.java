package Week_1;

import java.util.Scanner;

public class StudentPointCalculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] grades = new int[5];
        double sum = 0;
        int max = 0;
        int min = 100;
        for (int i = 0; i < grades.length; i++) {
            System.out.print("Enter the grade of lesson " + (i + 1) + ": ");
            grades[i] = scanner.nextInt();
            sum += grades[i];
            if (grades[i] > max) {
                max = grades[i];
            }
            if (grades[i] < min) {
                min = grades[i];
            }
        }
        double average = sum / grades.length;
        System.out.println("Your average grade is: " + average);
        if (average >= 50) {
            System.out.println("You passed.");
        } else {
            System.out.println("You failed.");
        }
        boolean lowGrade = false;
        for (int grade : grades) {
            if (grade < 30) {
                lowGrade = true;
                break;
            }
        }
        if (lowGrade) {
            System.out.println("You have low grades in some lessons.");
        }
        System.out.println("The highest grade is: " + max);
        System.out.println("The lowest grade is: " + min);
        scanner.close();

    }
}
