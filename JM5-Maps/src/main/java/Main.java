import java.util.Map;

import java.util.*;
class Main {
  public static void main(String[] args) {

    // 1) Creating a Map
    // (In this course we will use HashMaps)
    Map<String, Double> prices = new HashMap<>();

    // 2) Put
    prices.put("apple", 0.99);
    prices.put("bread", 3.75);
    prices.put("milk", 2.49);
    prices.put("cereal", 4.25);
    prices.put("eggs", 1.50);

    // 3) Get
    System.out.println("\nAn apple costs: " + prices.get("apple"));

    // 4) ContainsKey
    if(prices.containsKey("eggs")){
      System.out.println("We have eggs!");
      System.out.println("Eggs cost: " + prices.get("eggs"));
    }else{
      System.out.println("Sorry we're out of eggs.");
    }

    // 5) Remove
    prices.remove("apple");

    // 6) Size
    System.out.println(prices.size());
    
    // 7) KeySet
    for(String item : prices.keySet()){
      System.out.print("\n" + item + ": ");
      System.out.print(prices.get(item));
    }

    // 8) Values
    System.out.println("\n\nHere are just the prices:");
    for(double price : prices.values()){
      System.out.println(price);
    }


    // 9) getOrDefault
    System.out.println("\nPrice of bananas (using getOrDefault): " + prices.getOrDefault("bananas", 0.79));

    // 10) putIfAbsent
    prices.putIfAbsent("bananas", 0.79);
    System.out.println("\nUpdated prices:");
    for (String item : prices.keySet()) {
      System.out.print("\n" + item + ": ");
      System.out.print(prices.get(item));
    }
  


  }
}