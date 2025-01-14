public class Square extends Rectangle {

  public Square(int w){
   super(w,w);
  }

  public Square(int w, String c){
    super(w,w,c);
  }

  // what happens if we override getArea() with:
  // public int getArea() {
  //   return getWidth() * getWidth();
  // }

}