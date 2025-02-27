package Week_2;

/*Bir dizide tekrar eden elemanları bulan bir program yazın. (Örnek giriş: [5, 3, 8, 3, 1, 5, 8] → Çıktı: Tekrar eden sayılar: 3, 5, 8)*/
public class Q2 {
    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 3, 1, 5, 8};
        System.out.print("Repeating numbers: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.print(arr[i] + " ");
                    break;
                }
            }
        }
    }
}
