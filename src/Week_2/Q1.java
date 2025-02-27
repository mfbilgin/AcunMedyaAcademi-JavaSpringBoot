package Week_2;

import java.util.Scanner;

/*Kullanıcıdan 10 adet tam sayı alarak bir diziye
 ekleyin. Dizinin ortalamasını hesaplayan ve 50’den büyük olan elemanları listeleyen bir Java programı yazın.*/
public class Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int[] arr = new int[10];
        double sum = 0;
        System.out.println("Enter ten number: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
            sum += arr[i];
        }
        double average = sum / arr.length;
        System.out.println("Average: " + average);
        System.out.println("Numbers greater than 50: ");
        for (int i : arr) {
            if (i > 50) {
                System.out.println(i);
            }
        }
    }
}
