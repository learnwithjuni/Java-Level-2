public class Timer implements Runnable 
{
  // Instance variables
  private Thread t;
  private int time;
  private boolean running;
  

  // Constructor - default to 30 seconds starting time 
  // Change "time" for more or less time
  public Timer() {
    time = 30;
    running = true;
  }

  // The init method is used to begin the thread
  public void init() {
    t = new Thread(this);
    t.start();
  }

  // The run method contains the code we want to repeat
  public void run() {
    while (running && time > 0) {
      try {
        Thread.sleep(1000);
        time--;
      } catch (Exception e) {
      }
    }
  }

  public int getTime() {
    return time;
  }

  public void stop() {
    running = false;
  }

}