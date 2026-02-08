
public class MyArrayList<E> {
  // need
  // 1. an array to hold the data
  // 2. a counter for how many elements we havae
  // methods to add, get, remove

  private Object[] data;
  private int size;
  private static final int DEFAULT_CAPACITY = 10;

  // Constructor
  public MyArrayList() {
    data = new Object[DEFAULT_CAPACITY];
    size = 0;
  }

  public void add(E element) {
    if (size == data.length) {
      grow();
    }
    // add ele at the next available position
    data[size] = element;
    size++;
  }

  private void grow() {
    int newCap = data.length * 2;
    Object[] newData = new Object[newCap];
    for (int i = 0; i < size; i++) {
      newData[i] = data[i];
    }
    data = newData;
  }

  public E get(int index) {
    if (index < 0 || index > size - 1) {
      throw new IndexOutOfBoundsException("Index " + index + " is out of bounds for size " + size);

    }

    return (E) data[index];

  }

  public static void main(String[] args) {
    MyArrayList<String> list = new MyArrayList<>();
    list.add("first");
    list.add("second");
    list.add("third");

    System.out.println(list.get(0)); // Should print "first"
    System.out.println(list.get(1)); // Should print "second"
    System.out.println(list.get(2)); // Should print "third"

    // Test bounds checking
    list.get(999); // Should throw exception
  }

}
