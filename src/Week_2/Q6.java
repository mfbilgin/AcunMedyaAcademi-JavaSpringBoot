package Week_2;

import java.util.ArrayList;
import java.util.Random;

/*Bir ArrayList<Integer> oluşturun ve içine rastgele 20 sayı ekleyin.
	•	Sadece çift sayıları ayrı bir listeye ekleyin ve yazdırın.*/
public class Q6 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        ArrayList<Integer> evenNumbers = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            numbers.add(random.nextInt(100));
        }
        for (int number : numbers) {
            if (number % 2 == 0) {
                evenNumbers.add(number);
            }
        }
        System.out.println("Even numbers: " + evenNumbers);
    }
}
