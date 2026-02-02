# Analysis and Search

## Theory

### Linear Search

Iterates through the entire list to find the target element.

* **Time Complexity**: O(n)
* **Best Case**: O(1) (element is first)
* **Worst Case**: O(n) (element is last or not present)

### Pseudocode for Linear Search

```
procedure LinearSearch(A: list of items, target: item to search for)
	n = length(A)
	for i from 0 to n-1
		if A[i] equals target then 
			return i // Return the index where the target element is found 
		end if
	end for 
	return -1 // Return -1 if the target element is not found in the list 
end procedure
```

### Binary Search

Divided the search interval in half. Requires a sorted array.

* **Time Complexity**: O(log n)
* **Best Case**: O(1) (element is middle)

### Pseudocode for Binary Search 

```
procedure BinarySearch(A: list of sorted items, target: item to search for)
	left = 0
	right = length(A) - 1

	while left <= right 
		mid = (left + right) / 2
		if A[mid] equals target then 
			return mid // Return the index where the target element is found 
		else if A[mid] < target then 
			left = mid + 1 // Continue searching in the right half
		else 
			right = mid -1 // Continue searching in the left half 
		end if 
	end while 

	return -1 // Return -1 if the target element is not found in the list 
end procedure

```



## Implementation Details

- `src/LinearSearch.java`: Implementation of Linear Search.
- `src/BinarySearch.java`: Implementation of Binary Search.
- `src/BinarySearchDemo.java`: Demo implementation of Binary Search.
