package Week_2;

import java.util.ArrayList;
import java.util.Random;

/*Bir ArrayList<Integer> oluşturun ve içine 10 sayı ekleyin.
	•	Listenin en büyük ve en küçük elemanını bulan bir Java programı yazın.
	* */
public class Q8 {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            numbers.add(random.nextInt(100));
        }
        System.out.println("Numbers: " + numbers);
        int max = numbers.getFirst();
        int min = numbers.getFirst();
        for (int number : numbers) {
            if (number > max) {
                max = number;
            }
            if (number < min) {
                min = number;
            }
        }
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
    }
}
