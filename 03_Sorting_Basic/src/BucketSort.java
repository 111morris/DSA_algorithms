package src;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Arrays;

public class BucketSort {
 public static void sort(float[] arr) {
  int n = arr.length;
  if (n <= 0)
   return;

  @SuppressWarnings("unchecked")
  ArrayList<Float>[] buckets = new ArrayList[n];

  for (int i = 0; i < n; i++) {
   buckets[i] = new ArrayList<Float>();
  }

  for (int i = 0; i < n; i++) {
   int bucketIndex = (int) (arr[i] * n);
   buckets[bucketIndex].add(arr[i]);
  }

  for (int i = 0; i < n; i++) {
   Collections.sort(buckets[i]);
  }

  int index = 0;
  for (int i = 0; i < n; i++) {
   for (int j = 0; j < buckets[i].size(); j++) {
    arr[index++] = buckets[i].get(j);
   }
  }
 }

 public static void main(String[] args) {
  float[] arr = { (float) 0.897, (float) 0.565, (float) 0.656, (float) 0.1234, (float) 0.665, (float) 0.3434 };
  System.out.println("Unsorted: " + Arrays.toString(arr));
  sort(arr);
  System.out.println("Sorted: " + Arrays.toString(arr));
 }
}
