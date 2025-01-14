import java.util.Map;
import java.util.*;

public class AnimalPlayer implements Runnable 
{
  // Instance variables
  private String sound;
  private int interval;
  private Thread t;

  // Constructor
  public AnimalPlayer(String s, int i) {
    sound = s;
    interval = i;
  }
  
  // The init method is used to begin the thread
  public void init() {
    t = new Thread(this);
    t.start();
  }

  // The run method contains the code we want to repeat
  public void run() {
    while (true) {
      System.out.println(sound);

      try {
        Thread.sleep(interval);
      } catch (Exception e) {
      }
    }
  }

}