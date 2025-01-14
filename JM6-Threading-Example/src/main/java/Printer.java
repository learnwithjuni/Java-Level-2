public class Printer implements Runnable 
{
  // Instance variables
  private String phrase;
  private Thread t;

  // Constructor
  public Printer(String p) {
    phrase = p;
  }

  // The init method is used to begin the thread
  public void init() {
    t = new Thread(this);
    t.start();
  }

  // The run method contains the code we want to repeat
  public void run() {
    while (true) {
      System.out.println(phrase);

      try {
        Thread.sleep(1000);
      } catch (Exception e) {
      }
    }
  }

}