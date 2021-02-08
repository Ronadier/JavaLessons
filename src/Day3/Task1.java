package Day3;

import java.util.ArrayList;

public class Task1 {
  public static void main(String[] args) {
    System.out.println(getSimpleNumbers(10));
  }

private static ArrayList<Integer> getSimpleNumbers (int n) {
    ArrayList<Integer> result = new ArrayList<>();
    for (int i = 2; i < n; i++) {
      for (int j = 2; j <= i/2; j++) {
        if (i%j == 0) {
          break;
        } else if (j == n/2) {
          result.add(i);
        }
      }
    }
    return result;
}

}

// на вход - n, возвращать массив простых чисел до n
