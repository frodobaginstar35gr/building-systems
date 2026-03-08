package hashing;

import java.util.HashMap;

class MostFrequentChar {
  public static char mostFrequentChar(String s) {
    HashMap<Character, Integer> count = new HashMap<>();
    char mostFrequentChar = s.charAt(0);

    for (char c : s.toCharArray()) {
      count.put(c, count.getOrDefault(c, 0) + 1);
    }

    int maxCount = 0;

    for (int i = 0; i < s.length(); i++) {
      char currChar = s.charAt(i);
      if (count.get(currChar) > maxCount) {
        maxCount = count.get(currChar);
        mostFrequentChar = currChar;
      }
    }
    return mostFrequentChar;
  }
}
