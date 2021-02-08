package Day3;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;

public class Task1 {
  public static void main(String[] args) {
    System.out.println(getSimpleNumbers(Integer.MAX_VALUE));
  }

private static ArrayList<Integer> getSimpleNumbers (int n) {
    ArrayList<Integer> foundedSimpleNumbers = new ArrayList<>();
    long beginFunc = System.currentTimeMillis();
    nextNumber:
    for (int number = 2; number <= n; number++) {
      for (int delitel = 2; delitel <= number/2; delitel++) {
        if (number%delitel == 0) {
          continue nextNumber;
        }
      }
      foundedSimpleNumbers.add(number);
    }
    System.out.println("Время выполнения функции "+(System.currentTimeMillis() - beginFunc));
    return foundedSimpleNumbers;
}

private static boolean isSimple (int number, ArrayList<Integer> foundedSimpleNumbers) {

}

}

// на вход - n, возвращать массив простых чисел до n
