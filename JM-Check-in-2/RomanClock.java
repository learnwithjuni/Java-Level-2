// A Roman clock is similar to a regular HourClock, except that a Roman clock always has 12 hours and uses special Roman numerals to represent the hour instead of the numbers from 1-12

// The RomanClock should be a subclass of the HourClock. What do we need to add to the class definition of the RomanClock to indicate that it is a subclass of the HourClock?
public class RomanClock extends HourClock {
  // What variables, if any, do we need to construct a RomanClock? Write the constructor for the RomanClock object. Don’t forget to call the parent constructor to set the isMilitary variable. 

  // An array of the Roman numerals from 1-12
  private String[] numerals = {"I", "II", "III", "IV", "V", "VI", "VII", "IIX", "IX", "X", "XI", "XII"};
  
  public RomanClock() {
    super(false);
  }

  // What does it mean to override a method? Override the displayTime method, so that instead of printing out the hour as a regular number from 1-12, we will display the time as a RomanNumeral.
  public void displayTime() {
    System.out.println("Roman Time: " + numerals[getHour()-1]);
  }
}