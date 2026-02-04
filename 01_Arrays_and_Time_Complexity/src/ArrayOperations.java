
import java.util.Arrays;

public class ArrayOperations {
    public static void main(String[] args) {
        // Initialize an array
        int[] numbers = {10, 20, 30, 40, 50};
        
        System.out.println("Original Array: " + Arrays.toString(numbers));
        
        // Accessing elements (O(1))
        System.out.println("Element at index 2: " + numbers[2]);
        
        // Traversal (O(n))
        System.out.print("Traversal: ");
        for(int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
