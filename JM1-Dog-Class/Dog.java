public class Dog
{
  // Instance variables
  private String name;
  private int age;
  private double weight;
  private boolean isAlive;
  
  // Constructor
  public Dog(String n, int a, int w, boolean i) {
    name = n;
    age = a;
    weight = w;
    isAlive = i;
  }
  
  // Accessor or getter methods
  public int getAge() {
    return age;
  }
  
  // Mutator or setter method
  public void setAge(int theAge) {
    age = theAge;
  }
  
  // toString method
  public String toString()
  {
    return "Name: " + name + ", Age: " + age + ", Weight: " + weight;
  }
}