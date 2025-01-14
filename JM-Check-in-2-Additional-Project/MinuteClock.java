public class MinuteClock extends HourClock
{
  // Instance variables
  private int minute;
  
  // Constructor
  public MinuteClock(boolean m) {
    super(m);
    minute = 0;
  }
    
  // Getters
  public int getMinute() {
    return minute;
  }
  
  // Display the time in a nice format
  public void displayTime() {
    if (minute < 10) {
      System.out.println("Time: " + getHour() + ":0" + getMinute());
    }
    else {
      System.out.println("Time: " + getHour() + ":" + getMinute());
    }

    // Alternatively, introduce String.format or inline conditional statements
    // System.out.println("Time: " + getHour() + String.format(":%02d", minute));
    // System.out.println("Time: " + getHour() + ":" + (minute < 10 ? "0" : "") + minute);
  }
    
  // Increase the time by one minute. Be careful of when the minute and hour need to wrap back around. 
  public void tick() {
    // We have not taught calling super versions of functions. If your student is advanced feel free to show them how we could use super.tick() to simplify the code; if not you can use the second implementation
    if (minute == 59) {
      minute = 0;
      super.tick();
    }
    else {
      minute++;
    }

    /* Second implementation
    if (minute >= 59) {
      // Set minute back to 0
      minute = 0;
      // Tick the hour (essentially just the code from super.tick())
      if (getIsMilitary()) {
        setHour((getHour() + 1) % 24);
      } else {
        if (getHour() >= 12) {
          setHour(1);
        } else {
          setHour(getHour()+1);
        }
      }
    }
    else {
      minute++;
    }
    */
  }
}