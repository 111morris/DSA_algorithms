package src;

public class Queue {
 int front, rear, size;
 int capacity;
 int array[];

 public Queue(int capacity) {
  this.capacity = capacity;
  front = this.size = 0;
  rear = capacity - 1;
  array = new int[this.capacity];
 }

 void enqueue(int item) {
  if (isFull(this))
   return;
  rear = (rear + 1) % capacity;
  array[rear] = item;
  size = size + 1;
  System.out.println(item + " enqueued to queue");
 }

 int dequeue() {
  if (isEmpty(this))
   return Integer.MIN_VALUE;
  int item = array[front];
  front = (front + 1) % capacity;
  size = size - 1;
  return item;
 }

 boolean isFull(Queue queue) {
  return (queue.size == queue.capacity);
 }

 boolean isEmpty(Queue queue) {
  return (queue.size == 0);
 }

 public static void main(String[] args) {
  Queue queue = new Queue(1000);
  queue.enqueue(10);
  queue.enqueue(20);
  queue.enqueue(30);
  System.out.println(queue.dequeue() + " dequeued from queue");
 }
}
