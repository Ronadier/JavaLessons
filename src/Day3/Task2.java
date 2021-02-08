package Day3;

public class Task2 {
  public static void main(String[] args) {
    fizzBuzz(15);
  }

  private static void fizzBuzz (int n) {
    if (n < 3) {
      throw new RuntimeException("N smaller then 3");
    }
    for (int number = 3; number <= n; number++) {
      int fizzBuzz = 0;
      if (number % 3 == 0) {
        fizzBuzz = 1;
      }
      if (number % 5 == 0) {
        fizzBuzz = 2;
      }
      if (number % 3 == 0 && number % 5 == 0) {
        fizzBuzz = 3;
      }
      switch (fizzBuzz) {
        case 1 :
          System.out.println(number + ": Fizz");
          break;
        case 2 :
          System.out.println(number + ": Buzz");
          break;
        case 3 :
          System.out.println(number + ": FizzBuzz");
          break;
      }
    }
  }


}

//цикл до n. Если число %3 == 0 -> FIZZ, %5 -> BUZZ