package Week_2;

import java.util.ArrayList;
import java.util.Random;

/*Java’daki ArrayList metodlarını araştırın ve her biri için ne işe yaradığını, nasıl kullanıldığını ve örnek kod yazın:
	•	get()
	•	set()
	•	remove()
	•	clear()
	•	size()
*/
public class Q9 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            numbers.add(random.nextInt(100));
        }
        System.out.println("Numbers: " + numbers);
        System.out.println("Size: " + numbers.size());
        System.out.println("First element: " + numbers.get(1));
        numbers.set(0, 100);
        System.out.println("First element after set: " + numbers.get(1));
        numbers.remove(1);
        System.out.println("First element after remove: " + numbers.get(1));
        numbers.clear();
        System.out.println("Numbers after clear: " + numbers);
    }
}
