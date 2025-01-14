class Main {
  public static void main(String[] args) {
    
    // Using the constructor
    Dog fido = new Dog("Fido", 4, 15, true);

    // Using the getter and setter
    System.out.println("\n" + fido);
    System.out.println("Fido had a birthday!");
    fido.setAge(5);
    System.out.println("Now Fido is " + fido.getAge() + " years old.");
    
    // This doesn't work:
    // System.out.println(fido.age);
    
    // Using the toString() method
    System.out.println(fido);
  }
}
