package hashing;

import java.util.List;
import java.util.HashSet;
import java.util.ArrayList;

class Source {
  public static List<Integer> intersection(List<Integer> listA, List<Integer> listB) {
    HashSet<Integer> check = new HashSet<>();
    List<Integer> result = new ArrayList<>();

    for (int n : listA) {
      check.add(n);
    }

    for (int n : listB) {
      if (check.contains(n)) {
        result.add(n);
      }
    }

    return result;
  }

}
