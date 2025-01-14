import java.util.*;

public class HourClock implements Runnable {

  // instance variables
  private int hour;
  private boolean isMilitary;
  Thread t;

  // Constructor
  public HourClock(boolean m) {
    isMilitary = m;
    hour = 1;
  }

  // thread start 
  public void start() {
    t = new Thread(this);
    t.start();
  }

  // thread run
  public void run() {
    while (true) {
      displayTime();
      tick();

      try {
        Thread.sleep(1000);
      } catch (Exception e) {
      }
    }
  }

  // tick method to increment the clock
  public void tick() {
    if (isMilitary) {
      if (hour >= 23) {
        hour = 0;
      } else {
        hour++;
      }
    } else {
      if (hour == 12) {
        hour = 1;
      } else {
        hour++;
      }
    }
  }

  // getters
  public int getHour() {
    return hour;
  }

  public boolean getIsMilitary() {
    return isMilitary;
  }

  // setters
  public void setHour(int h) {
    hour = h;
  }
  // display the time
  public void displayTime() {
    System.out.println("Time: " + hour + ":00");
  }

}