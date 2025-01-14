class Main {
  public static void main(String[] args) {
    PictureBook cat = new PictureBook("The Cat in the Hat", "Dr. Seuss", 0, "Dr. Seuss");
    PictureBook chicka = new PictureBook("Chicka Chicka Boom Boom", "Bill Martin", 5, "Lois Ehlert");
    PictureBook eggs = new PictureBook("Green Eggs and Ham", "Dr. Seuss", 0, "Dr. Seuss");

    System.out.println("\nPicture Books:");
    System.out.println(cat);
    System.out.println(chicka);
    System.out.println(eggs);

    System.out.println("\nThe Cat in the Hat and Chicka Chicka Boom Boom\nHave the same illustrator:\n" + cat.hasSameIllustrator(chicka));
    System.out.println("\nThe Cat in the Hat and Green Eggs and Ham \nHave the same illustrator:\n" + cat.hasSameIllustrator(eggs));
    System.out.println("\nThe Cat in the Hat and Green Eggs and Ham \nAre the same book:\n" + cat.isSameBook(eggs));
    System.out.println("\nThe Cat in the Hat and The Cat in the Hat \nAre the same book:\n" + cat.isSameBook(cat));
  }
}