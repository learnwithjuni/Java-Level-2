public class SimpleAnimation implements Runnable {
  // Instance variables
  private int position;
  private boolean movingRight;
  private Thread t;

  // Constructor
  public SimpleAnimation() {
    position = 0;
    movingRight = true;
  }

  // The init method is used to begin the thread
  public void init() {
    t = new Thread(this);
    t.start();
  }

  // The run method contains the code we want to repeat
  public void run() {
    while (true) {
      display();
      move();
      try {
        Thread.sleep(100); // Wait 100 milliseconds
      } catch (Exception e) {
      }
    }
  }

  // Create a string with an 0 in the designated position
  private void display() {
    String row = "";
    for (int i = 0; i < 20; i++) {
      if (i == position) {
        row = row + "0";
      } else {
        row = row + " ";
      }
    }
    System.out.print("\r" + row);
  }

  // Update the position
  private void move() {
    if (movingRight) {
      position++;
      if (position == 19) {
        movingRight = false;
      }
    } else {
      position--;
      if (position == 0) {
        movingRight = true;
      }
    }
  }

}