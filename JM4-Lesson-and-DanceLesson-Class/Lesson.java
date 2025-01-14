public class Lesson implements Comparable<Lesson> {
  private int duration;
  private int size;
  private String subject;

  public Lesson(int d, int s, String sb) {
    duration = d;
    size = s;
    subject = sb;
  }

  public String toString() {
    return "Duration: " + duration + " minutes, Number of Students: " + size + ", Subject: " + subject;
  }
  
  public int compareTo(Lesson l) {
    if (duration > l.duration){
      return 1;
    }
    else if (duration < l.duration){
      return -1;
    }
    else {
      return 0;
    }
  }
}