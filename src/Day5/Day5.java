package Day5;

public class Day5 {
  public static void main(String[] args) {
    Consumer consumer = new Consumer();
    consumer.addTask("Task1", 1);
    consumer.addTask("Task2", 0);
    consumer.addTask("Task3", 1);

    System.out.println(consumer.getTask());
    System.out.println(consumer.getTask());
    System.out.println(consumer.getTask());
    System.out.println(consumer.getTask());
  }
}
