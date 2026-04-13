package hashing;

import java.util.*;

class Source {
  public static List<String> intersectionWithDupes(List<String> listA, List<String> listB) {
    HashMap<String, Integer> countA = new HashMap<>();
    HashMap<String, Integer> countB = new HashMap<>();
    List<String> result = new ArrayList<>();

    for (String s : listA) {
      countA.put(s, countA.getOrDefault(s, 0) + 1);
    }

    for (String s : listB) {
      countB.put(s, countB.getOrDefault(s, 0) + 1);
    }

    for (String s : countA.keySet()) {
      if (countB.containsKey(s)) {
        int overlap = Math.min(countA.get(s), countB.get(s));
        for (int i = 0; i < overlap; i++) {
          result.add(s);
        }
      }
    }
    return result;
  }

  public static void run() {
    // this function behaves as `main()` for the 'run' command
    // you may sandbox in this function , but should not remove it
  }
}
