public class Boba {
  private String flavor;
  private boolean iced;
  private String topping;

  // constructor
  public Boba(String f, boolean i, String t) {
    flavor = f;
    iced = i;
    topping = t;
  }

  // overloaded constructor
  public Boba (String f, boolean i) {
    flavor = f;
    iced = i;
  }

  public String getFlavor() {
    return flavor;
  }

  public boolean getIced() {
    return iced;
  }

  public String getTopping() {
    return topping;
  }

  public void addTopping(String t) {
    topping = t;
  }

  // check if two orders are the same 
  public boolean isSameOrder(Boba b) {
    if (flavor.equals(b.getFlavor()) && iced == b.getIced() && topping.equals(b.getTopping())) {
      return true;
    } else {
      return false;
    }
  }

  public String toString() {
    return "Flavor: " + flavor + ", Iced: " + iced + ", Topping: " + topping;
  }
}