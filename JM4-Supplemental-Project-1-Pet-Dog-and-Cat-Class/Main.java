class Main {
  public static void main(String[] args) {
    // Create at least one instance of each subclass
    Dog cookie = new Dog("Cookie",25,3,true);
    Cat cheeto = new Cat("Cheeto",10,2,5);

    // Print out pet info and speak
    System.out.println(cookie);
    cookie.speak();
    // Print if dog is service dog 
    if (cookie.isServiceDog()) {
      System.out.println("Cookie is a service dog!");
    }

     // Print out pet info
     System.out.println(cheeto);
     cheeto.speak();
    // Print cat jumping distance 
     System.out.println("Cheeto can jump " + cheeto.getJumpingDistance() + " feet into the air!");
    
  }
}