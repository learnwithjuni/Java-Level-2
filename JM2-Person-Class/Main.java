class Main {
  public static void main(String[] args) {
    Person abby = new Person("Abby", 8, 2);
    Person jack = new Person("Jack", 12, 6);

    System.out.println("\n"+jack);
    System.out.println("\n"+abby);
    abby.hasBirthday();
    int abbyAge = abby.getAge();
    System.out.println("Abby is now " + abbyAge + " years old!");

    Person tiffany = new Person("Tiffany", 10);
    System.out.println("\n"+tiffany);
    
    Person noName = new Person();
    System.out.println("\n"+noName);
  }
}