package recursion;

import java.util.*;

class Sum {
  public static int sumNumbersRecursive(List<Integer> numbers) {
    if (numbers.size() == 0) {
      return 0;
    }

    return numbers.get(0) + sumNumbersRecursive(numbers.subList(1, numbers.size()));
  }

  public static void run() {
    // this function behaves as `main()` for the 'run' command
    // you may sandbox in this function , but should not remove it
  }
}
