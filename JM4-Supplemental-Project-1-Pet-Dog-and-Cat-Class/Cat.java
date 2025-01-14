public class Cat extends Pet {
  private int jumpingDistance;

  // Constructor 
  public Cat(String n, int w, int a, int j){
   super(n,w,a);
   jumpingDistance = j;
  }

  // Add the speak function that prints meow
  public void speak(){
    System.out.println("Meow");
  }

  // getter for jumping distance 
  public int getJumpingDistance() {
    return jumpingDistance;
  }

  // overrides toString method in Pet
  public String toString(){
    return name + " is a cat. Weight: " + weight + ", Age: " + age;
  }
}