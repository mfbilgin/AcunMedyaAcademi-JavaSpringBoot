package Week_2;

import java.util.ArrayList;
import java.util.Scanner;

/*Bir ArrayList<String> içerisine 5 farklı şehir ekleyin.
	•	Kullanıcıdan alınan bir şehrin listede olup olmadığını bulan bir Java programı yazın.
	•	Eğer şehir listede varsa, indeksini yazdırın.
*/
public class Q7 {
    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<>();
        cities.add("ANKARA");
        cities.add("İSTANBUL");
        cities.add("İZMİR");
        cities.add("TRABZON");
        cities.add("GAZİANTEP");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a city: ");
        String city = scanner.next();
        if (cities.contains(city.toUpperCase())) {
            System.out.println(city + " is in the list. At index " + cities.indexOf(city.toUpperCase()));
        } else {
            System.out.println(city + " is not in the list.");
        }
    }
}
