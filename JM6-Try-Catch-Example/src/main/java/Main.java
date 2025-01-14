// Main.java

class Main {
  public static void main(String[] args) {

    // comment out this line how to see how the try catch statement below can stop our code from crashing!
   int result = 10 / 0; 
    
    // the try block contains code we want to monitor for exceptions
    // in this case, our code should throw an ArithmeticException because we are dividing by 0
    try {
      int result = 10 / 0; 
      // Catch any exception and print out our error message rather than crashing the program 
    } catch (Exception e) { 
      System.out.println("An error occurred!");
    }

  }
}