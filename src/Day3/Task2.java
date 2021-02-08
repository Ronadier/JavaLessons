package Day3;

public class Task2 {
  public static void main(String[] args) {

  }

  private static void fizzBuzz (int n) {
    if (n < 3) {
      throw new RuntimeException("N smaller then 3");
    }
    for (int number = 3; number < n; number++) {
      if (number % 3 == 0) {
        System.out.print(number + ": Fizz");
      }
      if (number % 5 == 0) {
        System.out.print(number + ": Buzz");
      }
    }
  }


}

//цикл до n. Если число %3 == 0 -> FIZZ, %5 -> BUZZ