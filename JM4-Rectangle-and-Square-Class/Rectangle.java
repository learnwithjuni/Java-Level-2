public class Rectangle {
  private int width;
  private int length;
  private String color;

  public Rectangle(int w, int l, String c){
    width = w;
    length = l;
    color = c;
  }

  public Rectangle(int w, int l){
    width = w;
    length = l;
  }

  public int getArea(){
    return width * length;
  }

  public int getPerimeter(){
    return 2 * (width + length);
  }

  public int getWidth(){
    return width;
  }

  public String toString(){
    return "Area: " + getArea() + ", Perimeter: " + getPerimeter();
  }
}