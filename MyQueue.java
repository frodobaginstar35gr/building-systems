// What is a Queue
// FIFO 
// like a line ata store - first person in line gets served first
// Add to back (enqueue), remove from front (dequeue)

public class MyQueue<E> {
  private Object[] data;
  private int front;
  private int back;
  private int size;
  private static final int DEFAULT_CAPACITY = 10;

  public MyQueue() {
    data = new Object[DEFAULT_CAPACITY];
    front = 0;
    back = 0;
    size = 0;
  }

  public void enqueue(E element) {
    if (size == data.length) {
      grow();
    }
    data[back] = element;
    back = (back + 1) % data.length;
    size++;
  }

  public E dequeue() {
    if (isEmpty()) {
      throw new IllegalStateException();
    }
    E tmp = (E) data[front];
    front++;
    size--;
    return tmp;
  }

  public E peek() {
    if (isEmpty()) {
      throw new IllegalStateException();
    }
    return (E) data[front];
  }

  public boolean isEmpty() {
    return size() == 0;
  }

  public int size() {
    return size;
  }

  private void grow() {
    int newCap = data.length * 2;
    Object[] newData = new Object[newCap];
    for (int i = 0; i < size; i++) {
      newData[i] = data[(front + i) % data.length];
    }
    data = newData;
    front = 0;
    back = size;
  }

  public static void main(String[] args) {
    MyQueue<String> queue = new MyQueue<>();

    // Test empty
    System.out.println("Empty? " + queue.isEmpty()); // true

    // Test enqueue
    queue.enqueue("A");
    queue.enqueue("B");
    queue.enqueue("C");

    System.out.println("Size: " + queue.size()); // 3
    System.out.println("Peek: " + queue.peek()); // A

    // Test dequeue
    System.out.println("Dequeue: " + queue.dequeue()); // A
    System.out.println("Dequeue: " + queue.dequeue()); // B
    System.out.println("Size: " + queue.size()); // 1

    // Test more enqueues
    queue.enqueue("D");
    queue.enqueue("E");

    System.out.println("Size: " + queue.size()); // 3
    System.out.println("Dequeue: " + queue.dequeue()); // C
    System.out.println("Dequeue: " + queue.dequeue()); // D
    System.out.println("Dequeue: " + queue.dequeue()); // E
    System.out.println("Empty? " + queue.isEmpty()); // true

    // Test growing (add 15 elements to trigger grow)
    for (int i = 0; i < 15; i++) {
      queue.enqueue("Item" + i);
    }
    System.out.println("Size after 15: " + queue.size()); // 15
  }
}
