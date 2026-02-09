
public class MyArrayList<E> {
  // need
  // 1. an array to hold the data
  // 2. a counter for how many elements we havae
  // methods to add, get, remove

  private Object[] data;
  private int size;
  private static final int DEFAULT_CAPACITY = 10;

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

  public int size() {
    return size;
  }

  public E remove(int index) {
    if (index < 0 || index > size - 1) {
      throw new IndexOutOfBoundsException("Index " + index + "is out of bounds for size " + size);

    }

    E removedElement = (E) data[index];

    for (int i = index + 1; i < size; i++) {
      data[i - 1] = data[i];
    }

    data[size - 1] = null;

    size = size - 1;

    return removedElement;
  }

  public boolean contains(E element) {
    for (int i = 0; i < size; i++) {
      if (data[i] == null && element == null) {
        return true;
      }
      if (data[i] != null && data[i].equals(element)) {
        return true;
      }
    }
    return false;
  }

  public static void main(String[] args) {
    MyArrayList<String> list = new MyArrayList<>();
    list.add("A");
    list.add("B");
    list.add("C");
    list.add(null);

    System.out.println(list.contains("B")); // Should be true
    System.out.println(list.contains("Z")); // Should be false
    System.out.println(list.contains(null)); // Should be true
    System.out.println(list.contains("A")); // Should be true

    list.remove(1); // Remove "B"
    System.out.println(list.contains("B")); // Should be false now
  }
}
