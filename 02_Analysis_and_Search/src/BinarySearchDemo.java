
package src;

import java.util.Arrays;

public class BinarySearchDemo {

 public static void main(String[] args) {
  int[] list = { 20, 22, 23, 25, 26, 27, 28, 30, 40, 41, 45, 47, 50 };
  int target = 20;

  int result = binarySearch(list, target);

  System.out.println("Original Array list: " + Arrays.toString(list) + "\nTarget value: " + target);

  if (result != -1) {
   System.out.println("The index value is: " + result);
  } else {
   System.out.println("There was an error");
  }

 }

 public static int binarySearch(int[] list, int target) {
  int low = 0;
  int high = list.length - 1;

  while (low <= high) {
   int mid = (low + high) / 2;

   if (list[mid] == target)
    return mid;
   else if (list[mid] < target)
    low = mid + 1;
   else
    high = mid - 1;
  }
  return -1;
 }
}