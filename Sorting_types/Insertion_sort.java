package Sorting_types;

public class Insertion_sort {
    private static void PrintArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = { 7, 8, 3, 1, 2 };

        // Insertion_sort
        for (int i = 1; i < arr.length; i++) {
            // why i=1 because we concidered the first element at index[0] to be sorted.
            int current = arr[i];
            int j = i - 1;
            while (j >= 0 && current < arr[j]) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = current;
        }

        // Time_complixety_of_Insertion_sort_is -> O(n^2)
        PrintArray(arr);
    }

}
