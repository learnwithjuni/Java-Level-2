public class PictureBook extends Book {
  private String illustrator;

  public PictureBook(String t, String a, int p, String i) {
    super(t, a, p);
    illustrator = i;
  }

  public String getIllustrator() {
    return illustrator;
  }

  public void setIllustrator(String i) {
    illustrator = i;
  }

  public boolean hasSameIllustrator(PictureBook p) {
    if (illustrator.equals(p.getIllustrator())){
      return true;
    }
    
    return false;
  }

  public boolean isSameBook(PictureBook b){
    if (this.getAuthor().equals(b.getAuthor()) && this.getTitle().equals(b.getTitle()) && this.hasSameIllustrator(b)){
      return true;
    }
    
    return false;
  }

  public String toString() {
    return "Title: " + title + ", Author: " + author + ", Illustrator: " + illustrator + " ,Page Number: " + pageNum;
  }
}