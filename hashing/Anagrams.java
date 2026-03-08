package hashing;

import java.util.HashMap;

class Anagrams {
  public static boolean anagrams(String s1, String s2) {
    HashMap<Character, Integer> count1 = new HashMap<>();
    HashMap<Character, Integer> count2 = new HashMap<>();

    // fail check
    if (s1.length() != s2.length()) {
      return false;
    }

    for (int i = 0; i < s1.length(); i++) {
      char c1 = s1.charAt(i);
      char c2 = s2.charAt(i);
      count1.put(c1, count1.getOrDefault(c1, 0) + 1);
      count2.put(c2, count2.getOrDefault(c2, 0) + 1);
    }

    return count1.equals(count2);
  }
}
