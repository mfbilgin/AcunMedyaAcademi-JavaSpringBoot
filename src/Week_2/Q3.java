package Week_2;

/*Bir dizide bulunan pozitif ve negatif sayıların toplamını ayrı ayrı hesaplayan bir Java programı yazın.*/
public class Q3 {
    public static void main(String[] args) {
        int[] arr = {5, -3, 8, 3, 1, -5, -8, -1};
        int positiveSum = 0;
        int negativeSum = 0;
        for (int i : arr) {
            if (i > 0) {
                positiveSum += i;
            } else {
                negativeSum += i;
            }
        }
        System.out.println("Positive sum: " + positiveSum);
        System.out.println("Negative sum: " + negativeSum);
    }
}
