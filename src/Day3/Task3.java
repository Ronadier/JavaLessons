package Day3;

import java.util.ArrayList;

public class Task3 {
  public static void main(String[] args) {

  }

  private static boolean isMatrixTrue (ArrayList<ArrayList<Integer>> matrix) {
    if (matrix.size() < 1) {
      throw new IllegalArgumentException("size < 1");
    }
    int sizeFirstArray = matrix.get(0).size();

    for (ArrayList<Integer> arr : matrix) {
      if (arr.size() != sizeFirstArray) {
        throw new IllegalArgumentException("matrix is broken");
      }
      for (int element : arr) {
        if (element != 0 || element != 1) {
          throw new IllegalArgumentException("matrix is broken");
        }
      }
    }
  }

  private static boolean isArrayTrue (ArrayList<Integer> arr) {
    
  }
}

//  Тебе на вход в функцию придет матрица N на M, заполненная только 1 или 0. ArrayList<ArrayList<Integer>>
//        Надо вернуть true, если она валидная. И false - если нет.
//        Валидной является матрица, у которой ни в одной строке И ни в одной колонке нет только нулей или только единиц.