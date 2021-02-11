import java.util.*;

public class Day1 {
  public static void main(String[] args) {
    int[] arr = new int[] {1, 22, 4, 1, 9, 10, 7, 23, 100, 22};
    int n = 1;
    System.out.println(getNthFromArray(arr, n));
  }

  public static List<Integer> getNthFromArray(int[] arr, int N) {
    if (arr.length < N) {
      throw new IllegalArgumentException("Small array");
    }
    LinkedList<Integer> resultList = new LinkedList<>();
    for (int i = 0; i < arr.length; ++i) {
      if (i < N) {
        resultList = addElementToArray(resultList, arr[i]);
      } else {
        resultList = replaceElementInArray(resultList, arr[i]);
      }
    }
    return resultList;
  }

  public static LinkedList<Integer> addElementToArray(LinkedList<Integer> list, int element) {
    int point = 0;
    if (list.size() == 0) {
      list.add(element);
      return list;
    }
    for (int i = 0; i < list.size(); i++) {
      if (element > list.get(i)) {
        point = i+1;
      }
    }
    list.add(point, element);
    return list;
  }

  public static LinkedList<Integer> replaceElementInArray(LinkedList<Integer> list, int element) {
    int point = 0;
    for (int i = 0; i < list.size(); i++) {
      if (element > list.get(i)) {
        point = i;
      } else break;
    }
    list.remove(0);
    list.add(point, element);
    return list;
  }
}