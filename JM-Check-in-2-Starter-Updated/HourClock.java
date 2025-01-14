import java.util.*;

// An HourClock object keeps track of the current hour and displays it in a nice format.

public class HourClock {

  // hour represents the current time of the clock. 
  // isMilitary is true if the time is in military time. In military time, the clock goes from 0-23 hours instead of from 1-12
  private int hour;
  private boolean isMilitary;

  // Constructor
  public HourClock(boolean m) {
    isMilitary = m;
    hour = 1;
  }

  // tick method to increment the clock 
  // If the clock is a military time clock, the hour should reset to 0 when it goes past 23. If it is NOT a military clock, the time should reset to 1 when it goes past 12.
  public void tick() {
    if (isMilitary) {
      if (hour >= 23) {
        hour = 0;
      } else {
        hour++;
      }
    } else {
      if (hour >= 12) {
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