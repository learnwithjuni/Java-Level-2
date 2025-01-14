import java.util.*;

class Main {
  public static void main(String[] args) {
    House h1 = new House("1 Sherwood Dr", 500000, 5000);
    House h2 = new House("123 Main St", 250000, 2000);
    House h3 = new House ("20 Elm St", 500000, 3000);
    House h4 = new House ("P. Sherman 42 Wallaby Way Sydney", 500000, 1000);

    House[] arr = new House[4];
    arr[0] = h1;
    arr[1] = h2;
    arr[2] = h3;
    arr[3] = h4;

    Arrays.sort(arr);

    System.out.println();
    for (House house : arr) {
      System.out.println(house);
      System.out.println();
    }
  }
}