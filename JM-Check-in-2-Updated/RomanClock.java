import java.util.*;

// A Roman clock is similar to a regular HourClock, except that a Roman clock always has 12 hours and uses special Roman numerals to represent the hour instead of the numbers from 1-12

// The RomanClock should be a subclass of the HourClock. What do we need to add to the class definition of the RomanClock to indicate that it is a subclass of the HourClock?
public class RomanClock extends HourClock {
  // What variables, if any, do we need to construct a RomanClock? Write the constructor for the RomanClock object. Don’t forget to call the parent constructor to set the isMilitary variable. 

  // An array of the Roman numerals from 1-12
  private String[] numerals = {"I", "II", "III", "IV", "V", "VI", "VII", "IIX", "IX", "X", "XI", "XII"};
  
// Maps - 2 Create a map to convert Roman numerals to decimal numbers 
  private Map<String, Integer> numeralsToNums = new HashMap<>();

  public RomanClock() {
    super(false);
  }

  // What does it mean to override a method? Override the displayTime method, so that instead of printing out the hour as a regular number from 1-12, we will display the time as a RomanNumeral.
  public void displayTime() {
    System.out.println("Roman Time: " + numerals[getHour()-1]);
  }

  // The updateMap() method is used for questions on mapping
  public void updateMap() {
    // Maps - 2 populate the map with with romanNumerals as keys and their corresponding decimal number as values.
    for(int i = 0; i < numerals.length; i++){
      numeralsToNums.put(numerals[i], i+1);
    }

     // Maps-3,4: Iterate through the map and print out each numeral and decomal number on the same line
      for(String num : numeralsToNums.keySet()){
        System.out.println(num + ": " + numeralsToNums.get(num));
      }
    
    // Maps-5: Write the code to check if the roman numeral “L” is in the map. If it is, print “L is on the map!”. If it’s not, add it to the map. (“L” is the Roman numeral for 50.)
    if(numeralsToNums.containsKey("L")){
      System.out.println("L is on the map!");
    }else{
      numeralsToNums.put("L", 50);
    }
  };



}