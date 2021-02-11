package Day4;

import java.util.ArrayList;

public class Task1 {
  public static void main(String[] args) {
    System.out.println(getNthElement(5));
  }

  private static int getNthElement (int element) {
    if (element < 1) {
      throw new IllegalArgumentException("N < 0");
    }
    if (element == 1) {
      return 1;
    }
    return getNthElement(element-1) * element;
  }


}
