// What is a Queue
// FIFO 
// like a line ata store - first person in line gets served first
// Add to back (enqueue), remove from front (dequeue)
//

public class MyQueue<E> {
  private Object[] data;
  private int front;
  private int back;
  private int size;
  private static final int DEFAULT_CAPACITY = 10;

  public MyQueue() {
    // TODO: initialize
  }

  public void enqueue(E element) {
    // TODO: add to back
  }

  public E dequeue() {
    // TODO: look at front
  }

  public E peek() {
    // TODO: look at front
  }

  public boolean isEmpty() {
    // TODO:
  }

  public int size() {
    // TODO:
  }
}
