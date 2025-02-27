package Week_2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

/*Kullanıcıdan 10 adet kelime alarak bir ArrayList<String> içine ekleyin. Girilen kelimeleri alfabetik sıraya göre sıralayan bir Java programı yazın.*/
public class Q5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<>();
        System.out.println("Enter ten words: ");
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter word " + (i + 1) + ": ");
            words.add(scanner.next());
        }
        words.sort(Comparator.naturalOrder());
        System.out.println("Sorted words: " + words);
    }
}
