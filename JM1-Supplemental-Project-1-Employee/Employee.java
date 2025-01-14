public class Employee
{
  // Instance variables
  private String name;
  private String position;
  private int yearsWorked;
  private int idNumber;
  
  // Constructor
  public Employee(String n, String p, int y, int i) {
    name = n;
    position = p;
    yearsWorked = y;
    idNumber = i;
  }
  
  // Accessor or getter methods
  public String getName() {
    return name;
  }

  public String getPosition() {
    return position;
  }
  
  public int getYearsWorked() {
    return yearsWorked;
  }

  public int getIdNumber() {
    return idNumber;
  }
  
  // Mutator or setter methods
  public void setPosition(String newPosition) {
    position = newPosition;
  }

  public void setYearsWorked(int newYears) {
    yearsWorked = newYears;
  }
  
  // toString method
  public String toString()
  {
    return "Name: " + name + ", Position: " + position + ", Years worked: " + yearsWorked + ", ID Number: " + idNumber;
  }
}