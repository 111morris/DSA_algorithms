package src;

public class LinearSearch {
 public static int search(int[] arr, int target) {
  for (int i = 0; i < arr.length; i++) {
   if (arr[i] == target) {
    return i;
   }
  }
  return -1;
 }

 public static void main(String[] args) {
  int[] data = { 5, 3, 8, 4, 2 };
  int target = 8;
  int result = search(data, target);

  if (result != -1)
   System.out.println("Element found at index: " + result);
  else
   System.out.println("Element not found.");
 }
}