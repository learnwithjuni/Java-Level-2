public class House implements Comparable<House> {
  private String address;
  private int price;
  private int sqft;
  private static int numHouses;

  public House(String a, int p, int s) {
    address = a;
    price = p;
    sqft = s;
    numHouses++;
  }

  public int getPrice() {
    return price;
  }

  public int getSqFt() {
    return sqft;
  }

  public static int getNumHouses() {
    return numHouses;
  }

  public String toString() {
    return "Address: " + address + "\nPrice: $" + price + "\nSq ft: " + sqft + " sq. ft.";
  }

  public int compareTo(House house2) {
    if (price < house2.getPrice()) {
      return -1;
    } else if (price > house2.getPrice()) {
      return 1;
    } else {
      if (sqft < house2.getSqFt()) {
        return -1;
      } else if (sqft > house2.getSqFt()) {
        return 1;
      } else {
        return 0;
      }
    }
  }
}