public class Pet {
  String name;
  int weight;
  int age;

  public Pet (String n, int w, int a){
    name = n;
    weight = w;
    age = a;
  }

  public String toString(){
    return "Name: " + name + ", Weight: " + weight + ", + Age: " + age;
  }
}