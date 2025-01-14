class Main {
  public static void main(String[] args) {
    Book matilda = new Book("Matilda", "Roald Dahl", 100);
    Book redwall = new Book("Redwall", "Brian Jacques");
    Book witches = new Book("The Witches", "Roald Dahl");
    Book witches2 = new Book("The Witches", "Roald Dahl", 50);

    System.out.println("\n"+redwall);
    System.out.println("Read 20 pages...");
    redwall.changePage(20);
    System.out.println(redwall);

    System.out.println("\nMatilda has the same author as Witches: " + matilda.hasSameAuthor(witches));
    System.out.println("Redwall is the same book as Witches: " + redwall.isSameBook(witches));
    System.out.println("Witches is the same book as Witches: " +witches.isSameBook(witches));
    System.out.println("Matilda is the same book as Witches: " +matilda.isSameBook(witches));
  }
}