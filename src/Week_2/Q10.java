package Week_2;

import java.util.Arrays;

/*Aşağıdaki dizilerle ilgili metodları araştırın ve her biri için açıklama ve örnek kod yazın:
	•	Arrays.sort()
	•	Arrays.binarySearch()
	•	Arrays.copyOfRange()
	•	Arrays.equals()
	•	Arrays.fill()
*/
public class Q10 {

    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 3, 1, 5, 8};
        int[] arr2 = {5, 3, 8, 3, 1, 5, 8};
        int[] arr3 = {5, 3, 8, 3, 1, 5, 8};

        System.out.println("Original array: ");
        printArray(arr);

        // The sort function sorts the array in ascending order
        System.out.println("Sorted array: ");
        Arrays.sort(arr);
        printArray(arr);

        // The binarySearch function returns the index of the element if it exists in the array, otherwise returns the negative value of the index where it should be inserted
        System.out.println("Index of 3: " + Arrays.binarySearch(arr, 3));

        // The copyOfRange function copies the array from the start index to the end index
        System.out.println("Copy of range(1,4): ");
        printArray(Arrays.copyOfRange(arr, 1, 4));
        // The equals function compares two arrays and returns true if they are equal
        System.out.println("Equals: " + Arrays.equals(arr, arr2));

        // The fill function fills the array with the given value
        Arrays.fill(arr3, 0);
        System.out.println("Fill(0): ");
        printArray(arr3);
    }

    public static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
