# Doubly Linked List

## Theory
A Doubly Linked List is a linear data structure in which each node contains three parts:
1. `value`: The data element
2. `next`: A reference to the next node in the sequence
3. `previous`: A reference to the previous node in the sequence

Compared to a Singly Linked List, a Doubly Linked List allows traversal in both directions (forward and backward) and can make deletion and insertion operations more efficient when the reference to a specific node is already known.

### Advantages
- Can be traversed sequentially in either direction.
- Deletion of a given node is simpler and more efficient (`O(1)` if a reference to the node is known) compared to a singly linked list (`O(N)` since the previous node's `next` pointer needs to be updated).
- Insertion before a given node is also `O(1)`.

### Disadvantages
- Each node requires extra memory to store the `previous` pointer.
- Operations take slightly longer due to the overhead of updating multiple pointers.

## Implementation Details

The file `src/DoublyLinkedList.java` provides a comprehensive implementation, including a nested static `Link` class for list nodes.

### Supported Operations
The `DoublyLinkedList` class includes various common operations, some of which are:
- `insertHead(value)`: Inserts at the beginning of the list.
- `insertTail(value)`: Inserts at the end of the list.
- `insertOrdered(value)`: Inserts the element in order, assuming the list is sorted.
- `insertElementByIndex(value, index)`: Inserts elements at a specified position.
- `deleteHead()`: Removes and returns the first element.
- `deleteTail()`: Removes and returns the last element.
- `delete(value)`: Removes the first node that matches the target value.
- `removeDuplicates()`: Removes all duplicate values from the list.
- `reverse()`: Reverses the linked list in place.
- `display()`: Prints the list from start to end.
- `displayBackwards()`: Prints the list from end to start to verify `previous` links are intact.
- `clearList()`: Empties the list.
