package hashing;

import java.util.List;
import java.util.HashMap;

class Source {
  public static List<Integer> pairSum(List<Integer> numbers, int target) {
    HashMap<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < numbers.size(); i++) {
      int n = numbers.get(i);
      int complement = target - n;
      if (map.containsKey(complement)) {
        return List.of(map.get(complement), i);
      }
      map.put(n, i);
    }

    return null;
  }

  public static void run() {
  }
}
