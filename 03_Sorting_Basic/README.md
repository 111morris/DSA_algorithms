## Sorting (Basic)

## Theory

### Bubble Sort

Repeatedly steps through the list, compares adjacent elements and swaps them if they are in the wrong order.

* **Time Complexity** : O(n²)
* **Space Complexity** : O(1)
* **Stable** : Yes

### Cyclic Sort

Iterates through the array and places each element at its correct index (value - 1) by swapping. Ideal for range 1 to N.

* **Time Complexity** : O(n)
* **Space Complexity** : O(1)
* **Stable** : No

### Selection Sort

Divides the input list into two parts: a sorted sublist built from left to right and an unsorted sublist. Repeatedly selects the smallest element from the unsorted portion and moves it to the sorted portion.

* **Time Complexity** : O(n²)
* **Space Complexity** : O(1)
* **Stable** : No

### Insertion Sort

Builds the final sorted list one element at a time by inserting each new element into its proper position among the already sorted elements.

* **Time Complexity** :
* Best Case: O(n)
* Average & Worst Case: O(n²)
* **Space Complexity** : O(1)
* **Stable** : Yes

### Quick Sort

A divide-and-conquer algorithm that selects a *pivot* element and partitions the array so that elements smaller than the pivot come before it and elements larger come after. The subarrays are then recursively sorted.

* **Time Complexity** :
* Best & Average Case: O(n log n)
* Worst Case: O(n²)
* **Space Complexity** : O(log n)
* **Stable** : No

### Merge Sort

A divide-and-conquer algorithm that divides the list into halves, recursively sorts them, and then merges the sorted halves.

* **Time Complexity** : O(n log n)
* **Space Complexity** : O(n)
* **Stable** : Yes

### Counting Sort

A non-comparison sorting algorithm that counts the occurrences of each distinct element and uses this information to place elements in the correct order.

* **Time Complexity** : O(n + k)
  *(k = range of input values)*
* **Space Complexity** : O(k)
* **Stable** : Yes
* **Limitation** : Works best when the range of values is small

### Radix Sort

Sorts numbers digit by digit, starting from the least significant digit to the most significant digit, typically using counting sort as a subroutine.

* **Time Complexity** : O(d(n + k))
  *(d = number of digits)*
* **Space Complexity** : O(n + k)
* **Stable** : Yes

### Heap Sort

Uses a binary heap data structure to sort elements. The largest element is repeatedly removed from the heap and placed at the end of the array.

* **Time Complexity** : O(n log n)
* **Space Complexity** : O(1)
* **Stable** : No

### Bucket Sort

Distributes elements into several buckets, sorts each bucket individually (often using insertion sort), and then concatenates the buckets.

* **Time Complexity** :
* Average Case: O(n + k)
* Worst Case: O(n²)
* **Space Complexity** : O(n)
* **Stable** : Depends on bucket sorting method

## Implementation Details

* `src/BubbleSort.java`
* `src/SelectionSort.java`
* `src/InsertionSort.java`
* `src/CyclicSort.java`
* `src/QuickSort.java`
* `src/MergeSort.java`
* `src/CountingSort.java`
* `src/RadixSort.java`
* `src/HeapSort.java`
* `src/BucketSort.java`

If you want, I can:

* add **Java pseudocode** for each sort
* turn this into **exam-ready notes**
* or match it to **your actual Java implementations**

Just say the word 👍
