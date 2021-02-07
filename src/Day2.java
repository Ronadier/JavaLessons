import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;

public class Day2 {
  public static void main(String[] args) {
    String str = "[[({})]]";
  }

  private static boolean isStringRight (String str) {
    char[] arr = str.toCharArray();
    HashMap<Character, Character> skobochki = new HashMap<>();
    skobochki.put('(', ')');
    skobochki.put('[', ']');
    skobochki.put('{', '}');
    Deque<Character> deq = new ArrayDeque<>();

  }

}


//Задачка на строку из 6 разных скобок [{()}]