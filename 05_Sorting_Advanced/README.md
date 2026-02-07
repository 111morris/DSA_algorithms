# Sorting (Advanced)

## Theory

### Merge Sort
A divide and conquer algorithm. It divides the input array into two halves, calls itself for the two halves, and then merges the two sorted halves.
*   **Time Complexity**: O(n log n) always.
*   **Space Complexity**: O(n)

### Quick Sort
A divide and conquer algorithm. It picks an element as pivot and partitions the given array around the picked pivot.
*   **Time Complexity**: O(n log n) average, O(n^2) worst case.
*   **Space Complexity**: O(log n)

## Implementation Details
- `src/MergeSort.java`
- `src/QuickSort.java`
