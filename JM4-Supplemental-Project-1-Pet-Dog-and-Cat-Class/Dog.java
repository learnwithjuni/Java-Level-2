public class Dog extends Pet {
  private boolean serviceDog;

  // Constructor
  public Dog(String n, int w, int a, boolean s) {
   super(n,w,a);
   serviceDog = s;
  }

  // Add the speak method that prints bark
  public void speak(){
    System.out.println("Bark");
  }

  // returns true if this dog is serviceDog
  public boolean isServiceDog() {
    return serviceDog;
  }

  // overrides toString method in Pet class
  public String toString(){
    return name + " is a dog. Weight: " + weight + ", Age: " + age;
  }
}