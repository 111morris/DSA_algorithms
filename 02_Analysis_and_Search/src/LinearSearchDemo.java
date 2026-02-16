package src;

public class LinearSearchDemo {
 public static void main(String[] args) {
  int nums[] = { 5, 7, 9, 11, 13 };
  int target = 11;

  int result = linearSearch(nums, target);
  if (result != -1) {
   System.out.println("Element found at index: " + result);
  } else {
   System.out.println("Element not found");
  }
 }

 public static int linearSearch(int[] nums, int target) {
  int steps = 0;
  for (int i = 0; i < nums.length; i++) {
   steps++;
   if (nums[i] == target) {
    System.out.println("Steps taken by Linear: " + steps);
    return i;
   }
  }
  System.out.print("Steps taken by linear: " + steps);
  return -1;
 }

 public static int binarySearch(int[] nums, int target) {
  int low = 0;
  int high = nums.length - 1;

  int steps = 0;

  while (low <= high) {
   // do this
   steps++;

   int mid = (low + high) / 2;
   if (nums[mid] == target) {
    System.out.println("Steps taken by binarySearch: " + steps);
    return mid;
   } else if (nums[mid] < target) {
    low = mid + 1;
   } else {
    high = mid - 1;
   }
  }
  System.out.println("Steps taken by binary search: " + steps);
  return -1;
 }
}