
public class MyStack<E> {
  private MyArrayList<E> storage;

  public MyStack() {
    storage = new MyArrayList<>();
  }

  public void push(E element) {
    storage.add(element);
  }

  public E pop() {
    return storage.remove(storage.size() - 1);
  }

  public E peek() {
    return storage.get(storage.size() - 1);
  }

  public boolean isEmpty() {
    return storage.size() == 0;
  }

  public int size() {
    return storage.size();
  }

  public static void main(String[] args) {
    MyStack<String> stack = new MyStack<>();

    System.out.println("Empty? " + stack.isEmpty()); // true

    stack.push("A");
    stack.push("B");
    stack.push("C");

    System.out.println("Size: " + stack.size()); // 3
    System.out.println("Peek: " + stack.peek()); // C
    System.out.println("Pop: " + stack.pop()); // C
    System.out.println("Pop: " + stack.pop()); // B
    System.out.println("Size: " + stack.size()); // 1
    System.out.println("Empty? " + stack.isEmpty()); // false
    System.out.println("Pop: " + stack.pop()); // A
    System.out.println("Empty? " + stack.isEmpty()); // true
  }

}
