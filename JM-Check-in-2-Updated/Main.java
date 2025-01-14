class Main {
  public static void main(String[] args) {
    /* -------------------- */
    // INHERITANCE
    /* -------------------- */

    // What is a subclass? Give an example of a superclass and subclass. Why do we use subclasses in Java?
    // Ans: a subclass is a Class that inherits all of the public variables and methods from its superclass. Subclasses help to reduce redundant code and to make related operations between related objects easier.
    // Any number of real-world examples are acceptable to describe a superclass and subclass, such as Person -> Student, Dog -> GermanShepherd, or Droid -> BattleDroid

    // Create two hour clock objects. One clock should be in normal time and the other clock should be in military time. 
    HourClock h1 = new HourClock(false);
    HourClock h2 = new HourClock(true);
    
    // Call the displayTime method of the normal clock. What happens? Then call the tick method and display the time again. What happens to the time? Tick the clock and display the time 20 times in a loop. what happens when the time gets to 12:00? Repeat this process with the military time clock.
    for (int i = 0; i < 20; ++i) {
      h1.displayTime();
      h1.tick();
    }
    for (int i = 0; i < 20; ++i) {
      h2.displayTime();
      h2.tick();
    }


    RomanClock r1 = new RomanClock();

    

    // Test that the threading works
    h1.start();
    r1.start();
    // Test mapping
    r1.updateMap(); 
  }
}