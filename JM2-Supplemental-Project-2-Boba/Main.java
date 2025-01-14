import java.util.*;
class Main {
  public static void main(String[] args) {
    // Create scanner to get input
    Scanner in = new Scanner(System.in);
    
    // Get input from user for initial order
    System.out.println("Welcome to our boba tea shop!");
    System.out.println("These are our flavors: mango green tea, taro milk tea, peach oolong tea, and brown sugar milk tea");
    System.out.println("What flavor would you like?");
    String flavor = in.nextLine();
    System.out.println("Great choice! Would you like that iced?");
    System.out.println("Please enter Y or N");
    String iced = in.nextLine();
    // set to true if user says "Y"
    boolean i = iced.equals("Y");
    
    // Create instance of boba class 
    Boba order = new Boba(flavor, i);

    // Check if user wants topping 
    System.out.println("We're working on your order!");
    System.out.println("Would you like any toppings? Please enter Y or N");
    String t = in.nextLine();
    if (t.equals("Y")) {
      System.out.println("These are our toppings: pearls, coconut jelly, or mango popping boba");
      System.out.println("What would you like?");
      t = in.nextLine();
      order.addTopping(t);
    } 
    // Print out their order
    System.out.println("Here's your order!");
    System.out.println("\n"+order);

    // Create top order
    Boba topOrder = new Boba("brown sugar milk tea", true, "pearls");
    // Check if user ordered top order 
    if (order.isSameOrder(topOrder)) {
      System.out.println("Great choice! That's our most popular order");
    }
  }
}