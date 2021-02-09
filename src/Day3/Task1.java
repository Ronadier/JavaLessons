package Day3;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;

public class Task1 {
  public static void main(String[] args) {
    System.out.println(getSimpleNumbers(111111));
  }

private static ArrayList<Integer> getSimpleNumbers (int n) {
    ArrayList<Integer> foundedSimpleNumbers = new ArrayList<>();
    if (n < 2) {
        return foundedSimpleNumbers;
    }
    long beginFunc = System.currentTimeMillis();
    nextNumber:
    for (int number = 2; number <= n; number++) {
      if (isSimple(number, foundedSimpleNumbers)) {
          foundedSimpleNumbers.add(number);
      }
    }
    System.out.println("Время выполнения функции "+(System.currentTimeMillis() - beginFunc) + " мс");
    return foundedSimpleNumbers;
}

private static boolean isSimple (int number, ArrayList<Integer> foundedSimpleNumbers) {
    for (int foundedSimpe : foundedSimpleNumbers) {
        if (number % foundedSimpe == 0) {
            return false;
        }
    }
    return true;
}

}

// на вход - n, возвращать массив простых чисел до n
