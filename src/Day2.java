import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;

public class Day2 {
  public static void main(String[] args) {
    String str = "[[({})]";
    System.out.println(isStringRight(str));
  }

  private static boolean isStringRight (String str) {
    char[] arr = str.toCharArray();
    HashMap<Character, Character> skobochki = new HashMap<>();
    skobochki.put('(', ')');
    skobochki.put('[', ']');
    skobochki.put('{', '}');
    Deque<Character> deq = new ArrayDeque<>();
    for (int i = 0; i<arr.length; i++) {
      deq.add(arr[i]);
      if (!skobochki.containsKey(arr[i])) {
        Character lastChar = deq.pollLast();
        if (!(lastChar.equals(skobochki.get(deq.pollLast())))) {
          return false;
        }
      }
    }
    return true;
  }

}


//Задачка на строку из 6 разных скобок [{()}]