package Day4;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Task2 {
  public static void main(String[] args) {
    File path = new File("C:\\Users\\ЧлекКонстантин\\Desktop");
    readFiles(path);
  }

  public static void readFiles(File baseDirectory) {
    if (!baseDirectory.isDirectory()) {
      throw new IllegalArgumentException("Не директория");
    }
    scanner:
    for (File file : baseDirectory.listFiles()) {
      if(file.isFile()) {
        System.out.print(file.getName() + " | ");
      } else {
        System.out.println();
        System.out.println(file.getAbsolutePath());
        if (Objects.equals(file.listFiles(), null)) {
          continue scanner;
        }
        readFiles(file);
      }
    }
  }

}
