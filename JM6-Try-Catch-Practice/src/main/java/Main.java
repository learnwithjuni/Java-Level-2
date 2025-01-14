// Main.java

class Main {
  public static void main(String[] args) {

    // First we'll write a try catch statement to handle the possibility of dividing by 0
    System.out.println("Testing random division");
    
    int randomNumerator = (int)(Math.random()*10);
    int randomDivisor = (int)(Math.random()*10);

    try {
      int result = randomNumerator / randomDivisor; 
      System.out.println("The result of " + randomNumerator + " divided by " + randomDivisor + " is " + result);
    } catch (Exception e) { 
      System.out.println("An error occurred!");
      System.out.println("You tried to divide " + randomNumerator + " by " + randomDivisor);
    }

    // Now we'll write a try catch statement to handle the possibility of trying to access an index that's out of bounds 
    System.out.println("\nTesting random indexing");
    
    int randomIndex  = (int)(Math.random()*4);
    int[] numbers = {1, 2, 3};
    
    try {
      System.out.println("The element at index " + randomIndex + " of the array is " + numbers[randomIndex]);
    } catch (Exception e) { 
          System.out.println("An error occurred!");
          System.out.println("You tried to access index " + randomIndex + " of an array of length " + numbers.length);
    } 
  }
}