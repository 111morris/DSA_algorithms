package src;

import java.util.Arrays;

public class CountingSort {
    public static void sort(int[] arr) {
        if (arr.length == 0) return;
        
        int n = arr.length;
        int max = Integer.MIN_VALUE;
        for (int i : arr) {
            max = Math.max(max, i);
        }

        int[] count = new int[max + 1];
        for (int i : arr) {
            count[i]++;
        }

        int index = 0;
        for (int i = 0; i <= max; i++) {
            while (count[i] > 0) {
                arr[index++] = i;
                count[i]--;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 4, 2, 2, 8, 3, 3, 1 };
        System.out.println("Unsorted: " + Arrays.toString(arr));
        sort(arr);
        System.out.println("Sorted: " + Arrays.toString(arr));
    }
}
