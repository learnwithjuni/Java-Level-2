import java.util.*;

class Main {
  public static void main(String[] args) {
    Lesson juni = new Lesson(50, 1, "coding");
    Lesson art = new Lesson(30, 6, "art");
    Lesson piano = new Lesson(60, 1, "piano");
    DanceLesson ballet = new DanceLesson(120, 12, 2, "ballet");
    DanceLesson jazz = new DanceLesson(90, 8, 3, "jazz");

    Lesson[] arr = {juni, art, piano, ballet, jazz};
    Arrays.sort(arr);

    System.out.println("\nHere are all of Olivia's lessons sorted by duration: ");
    for (Lesson l : arr) {
      System.out.println(l);
    }

    System.out.println("\nBallet has the same difficulty as Jazz Dance: " + ballet.hasSameDifficulty(jazz));
    System.out.println("Ballet is easier than Jazz Dance: " + ballet.easierThan(jazz));
  }
}