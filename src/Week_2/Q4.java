package Week_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/*Kullanıcıdan 10 adet sayı alıp bir ArrayList içine ekleyen ve ardından bu sayıları büyükten küçüğe sıralayan bir program yazın.*/
public class Q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        System.out.println("Enter ten number: ");
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers.add(scanner.nextInt());
        }
        numbers.sort(Collections.reverseOrder());
        System.out.println("Sorted numbers: " + numbers);
    }
}
