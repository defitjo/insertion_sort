import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = { 5, 1, 9, 3, 10, 2, 6, 4, 8, 7 };
        int[] result = insertionSort(arr);
        System.out.println(Arrays.toString(result));
    }

    public static int[] insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            while (i > 0 && arr[i - 1] > arr[i]) {
                int temp = arr[i];
                arr[i] = arr[i - 1];
                arr[i - 1] = temp;
                i -= 1;
            }
        }
        return arr;
    }
}
