import java.util.*;

// "implements Runnable" is not added until the Threading section
public class HourClock implements Runnable {

  // Instance variables
  private int hour;
  private boolean isMilitary;
  private Thread t;

  // Constructor
  public HourClock(boolean m) {
    isMilitary = m;
    hour = 1;
  }


  /* ----------------- */
  // THREADING
  /* ----------------- */

  // What is a thread in Java? Why do we use them? What two methods do we need in order to use a thread in our class? 
  // Ans: a thread is a sequence of instructions that is executed independently of other code. We use them so that we can make better use of our processing power and to perform operations simultaneously. We need start() and run()

  // We are going to use a thread to make our HourClock keep track of the time on its own. We will make it increase the hour and display the time once per second. Go ahead and add any variables, method headers, or other additions that we need to use threads. Do not define the methods yet.

  // Next, write the code for the start method.
  public void start() {
    t = new Thread(this);
    t.start();
  }

  // Next, we are going to write the code for the run method. We want the thread to display the time and increase the time forever.
  // We want the clock to increase the hour and display the time once per second, so add a line of code in your run method that makes the clock wait for 1 second each time the loop runs. 
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

  // Tick method to increment the clock's hour
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

  // Getters
  public int getHour() {
    return hour;
  }

  public boolean getIsMilitary() {
    return isMilitary;
  }

  // Setters
  public void setHour(int h) {
    hour = h;
  }

  // Display the time
  public void displayTime() {
    System.out.println("Time: " + hour + ":00");
  }
}