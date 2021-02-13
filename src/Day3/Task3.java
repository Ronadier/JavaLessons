package Day3;

import java.util.ArrayList;

public class Task3 {
  public static void main(String[] args) {
    ArrayList<Integer> arr1 = new ArrayList<>();
    ArrayList<Integer> arr2 = new ArrayList<>();
    ArrayList<Integer> arr3 = new ArrayList<>();
    arr1.add(0);
    arr1.add(0);
    arr1.add(0);
    arr2.add(0);
    arr2.add(0);
    arr2.add(0);
    arr3.add(0);
    arr3.add(0);
    arr3.add(0);
    ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
    matrix.add(arr1);
    matrix.add(arr2);
    matrix.add(arr3);

    System.out.println(isMatrixTrue(matrix));
  }

  private static boolean isMatrixTrue (ArrayList<ArrayList<Integer>> matrix){
    if (matrix.size() < 1) {
      throw new IllegalArgumentException("matrix size < 1");
    }
    for (ArrayList<Integer> line : matrix) {
      if (line.size() != matrix.get(0).size()) {
        throw new IllegalArgumentException("Matrix is broken");
      }
    }
    if (isColumnsTrue(matrix) || isLinesTrue(matrix)) {
      return true;
    }
    return false;
  }
  private static boolean isColumnsTrue (ArrayList<ArrayList<Integer>> matrix) {
    ArrayList<Integer> column = new ArrayList<>();
    for (int i = 0; i < matrix.size(); i++) {
      column.add(matrix.get(i).get(0));
      matrix.get(i).remove(0);
    }
    if (isListTrue(column)) {
      return true;
    }

    if (matrix.get(0).size() == 0) return false;
    return isColumnsTrue(matrix);
  }

  private static boolean isLinesTrue (ArrayList<ArrayList<Integer>> matrix) {
    if (isListTrue(matrix.get(0))) {
      return true;
    }
    matrix.remove(0);
    if (matrix.size() == 0) return false;
    return isLinesTrue(matrix);
  }

  private static boolean isListTrue (ArrayList<Integer> line) {
    for (int element : line) {
      if (element != 0 && element != 1) {
        throw new IllegalArgumentException("Element !=0 or 1");
      } else if ((line.get(0) == 0 && element == 1) || (line.get(0) == 1 && element == 0)) {
        return true;
      }
    }
    return false;
  }
}

//  Тебе на вход в функцию придет матрица N на M, заполненная только 1 или 0. ArrayList<ArrayList<Integer>>
//        Надо вернуть true, если она валидная. И false - если нет.
//        Валидной является матрица, у которой ни в одной строке И ни в одной колонке нет только нулей или только единиц.