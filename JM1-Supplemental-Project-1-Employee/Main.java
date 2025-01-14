class Main {
  public static void main(String[] args) {
    
    // Create two instances of Employee class 
    Employee jacky = new Employee("Jacky", "Intern", 1, 556614);
    Employee tina = new Employee("Tina", "Manager", 3, 076544);

    // Using the toString() method to print both employees information
    System.out.println(jacky);
    System.out.println(tina);

    // Use the setters 
    // Update jacky
    System.out.println("Jacky worked another year!");
    jacky.setYearsWorked(2);
    System.out.println("Jacky got a promotion");
    jacky.setPosition("Engineer");
    // Update tina 
    System.out.println("Tina worked another year!");
    jacky.setYearsWorked(4);
    System.out.println("Tina got a promotion");
    tina.setPosition("Vice President");

    // Use the getters to print out new titles 
    System.out.println(jacky.getName() + " is now a " + jacky.getPosition());
    System.out.println(tina.getName() + " is now a " + tina.getPosition());

  }
}
