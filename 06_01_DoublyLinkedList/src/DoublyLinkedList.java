package src;

/**
 * This class implements a DoublyLinkedList.
 *
 * <p>
 * A linked list is similar to an array, it holds values. However, links in a
 * linked list do not have indexes. With a linked list you do not need to
 * predetermine it's size as it grows and shrinks as it is edited. This is an
 * example of a double ended, doubly linked list. Each link references the next
 * link and the previous one.
 */
public class DoublyLinkedList {

    /**
     * Head refers to the front of the list
     */
    protected Link head;
    
    /**
     * Tail refers to the back of the list
     */
    private Link tail;

    /**
     * Size refers to the number of elements present in the list
     */
    private int size;

    /**
     * Default Constructor
     */
    public DoublyLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    /**
     * Constructs a list containing the elements of the array
     *
     * @param array the array whose elements are to be placed into this list
     * @throws NullPointerException if the specified collection is null
     */
    public DoublyLinkedList(int[] array) {
        if (array == null) {
            throw new NullPointerException();
        }
        for (int i : array) {
            insertTail(i);
        }
    }

    /**
     * Returns true if list is empty
     *
     * @return true if list is empty
     */
    public boolean isEmpty() {
        return (head == null);
    }

    /**
     * Prints contents of the list
     */
    public void display() {
        Link current = head;
        while (current != null) {
            current.displayLink();
            current = current.next;
        }
        System.out.println();
    }

    /**
     * Prints the contents of the list in reverse order
     */
    public void displayBackwards() {
        Link current = tail;
        while (current != null) {
            current.displayLink();
            current = current.previous;
        }
        System.out.println();
    }

    /**
     * Insert an element at the head
     *
     * @param x Element to be inserted
     */
    public void insertHead(int x) {
        Link newLink = new Link(x);
        if (isEmpty()) {
            tail = newLink;
        } else {
            head.previous = newLink;
        }
        newLink.next = head;
        head = newLink;
        ++size;
    }

    /**
     * Insert an element at the tail
     *
     * @param x Element to be inserted
     */
    public void insertTail(int x) {
        Link newLink = new Link(x);
        newLink.next = null;
        if (isEmpty()) {
            tail = newLink;
            head = tail;
        } else {
            tail.next = newLink;
            newLink.previous = tail;
            tail = newLink;
        }
        ++size;
    }

    /**
     * Insert an element at the index
     *
     * @param x     Element to be inserted
     * @param index Index(from start) at which the element x to be inserted
     */
    public void insertElementByIndex(int x, int index) {
        if (index > size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        if (index == 0) {
            insertHead(x);
        } else {
            if (index == size) {
                insertTail(x);
            } else {
                Link newLink = new Link(x);
                Link previousLink = head;
                for (int i = 1; i < index; i++) {
                    previousLink = previousLink.next;
                }
                previousLink.next.previous = newLink;
                newLink.next = previousLink.next;
                newLink.previous = previousLink;
                previousLink.next = newLink;
                ++size;
            }
        }
    }

    /**
     * Delete the element at the head
     *
     * @return The new head
     */
    public Link deleteHead() {
        if (isEmpty()) return null;
        Link temp = head;
        head = head.next;

        if (head == null) {
            tail = null;
        } else {
            head.previous = null;
        }
        --size;
        return temp;
    }

    /**
     * Delete the element at the tail
     *
     * @return The new tail
     */
    public Link deleteTail() {
        if (isEmpty()) return null;
        Link temp = tail;
        tail = tail.previous;

        if (tail == null) {
            head = null;
        } else {
            tail.next = null;
        }
        --size;
        return temp;
    }

    /**
     * Delete the element from somewhere in the list
     *
     * @param x element to be deleted
     */
    public void delete(int x) {
        if (isEmpty()) return;
        
        Link current = head;

        while (current.value != x) {
            if (current != tail) {
                current = current.next;
            } else {
                throw new RuntimeException("The element to be deleted does not exist!");
            }
        }

        if (current == head) {
            deleteHead();
        } else if (current == tail) {
            deleteTail();
        } else {
            current.previous.next = current.next;
            current.next.previous = current.previous;
            --size;
        }
    }

    /**
     * Inserts element and reorders
     *
     * @param x Element to be added
     */
    public void insertOrdered(int x) {
        Link newLink = new Link(x);
        Link current = head;
        while (current != null && x > current.value) {
            current = current.next;
        }

        if (current == head) {
            insertHead(x);
        } else if (current == null) {
            insertTail(x);
        } else {
            newLink.previous = current.previous;
            current.previous.next = newLink;
            newLink.next = current;
            current.previous = newLink;
            ++size;
        }
    }

    /**
     * Deletes the passed node from the current list
     *
     * @param z Element to be deleted
     */
    public void deleteNode(Link z) {
        if (z == null) return;
        
        if (z.next == null) {
            deleteTail();
        } else if (z == head) {
            deleteHead();
        } else {
            z.previous.next = z.next;
            z.next.previous = z.previous;
            --size;
        }
    }

    /**
     * Removes duplicates from the Linked List
     */
    public void removeDuplicates() {
        Link linkOne = this.head;
        while (linkOne != null && linkOne.next != null) {
            Link linkTwo = linkOne.next;
            while (linkTwo != null) {
                Link nextLink = linkTwo.next;
                if (linkOne.value == linkTwo.value) {
                    deleteNode(linkTwo);
                }
                linkTwo = nextLink;
            }
            linkOne = linkOne.next;
        }
    }

    /**
     * Reverses the list in place
     */
    public void reverse() {
        Link presentHead = this.head;
        Link presentTail = this.tail;

        this.head = presentTail;
        this.tail = presentHead;

        Link nextLink = presentHead;
        while (nextLink != null) {
            Link nextLinkNext = nextLink.next;
            Link nextLinkPrevious = nextLink.previous;
            nextLink.next = nextLinkPrevious;
            nextLink.previous = nextLinkNext;

            nextLink = nextLinkNext;
        }
    }

    /**
     * Clears List
     */
    public void clearList() {
        head = null;
        tail = null;
        size = 0;
    }

    /**
     * This class is used to implement the nodes of the linked list.
     */
    public static class Link {
        /**
         * Value of node
         */
        public int value;
        /**
         * This points to the link in front of the new link
         */
        public Link next;
        /**
         * This points to the link behind the new link
         */
        public Link previous;

        /**
         * Constructor
         *
         * @param value Value of node
         */
        Link(int value) {
            this.value = value;
        }

        /**
         * Displays the node
         */
        public void displayLink() {
            System.out.print(value + " ");
        }
    }

    /**
     * Main Method
     *
     * @param args Command line arguments
     */
    public static void main(String[] args) {
        DoublyLinkedList myList = new DoublyLinkedList();
        
        myList.insertHead(13);
        myList.insertHead(7);
        myList.insertHead(10);
        myList.display(); // <-- 10(head) <--> 7 <--> 13(tail) -->
        myList.displayBackwards();

        myList.insertTail(11);
        myList.display(); // <-- 10(head) <--> 7 <--> 13 <--> 11(tail) -->
        myList.displayBackwards();

        myList.deleteTail();
        myList.display(); // <-- 10(head) <--> 7 <--> 13(tail) -->
        myList.displayBackwards();

        myList.delete(7);
        myList.display(); // <-- 10(head) <--> 13(tail) -->
        myList.displayBackwards();

        myList.insertOrdered(23);
        myList.insertOrdered(67);
        myList.insertOrdered(3);
        myList.display(); // <-- 3(head) <--> 10 <--> 13 <--> 23 <--> 67(tail) -->
        
        myList.insertElementByIndex(5, 1);
        myList.display(); // <-- 3(head) <--> 5 <--> 10 <--> 13 <--> 23 <--> 67(tail) -->
        myList.displayBackwards();
        
        myList.reverse(); // <-- 67(head) <--> 23 <--> 13 <--> 10 <--> 5 <--> 3(tail) -->
        myList.display();

        myList.clearList();
        myList.display();
        myList.displayBackwards();
        
        myList.insertHead(20);
        myList.display();
        myList.displayBackwards();
    }
}
