public class Book {
   public String bookName;
    public double bookPrice;
    public Book(String bookName, double bookPrice) {
        this.bookName = bookName;
        this.bookPrice = bookPrice;
    }

   public void display()
  {
      System.out.println("Book Name: " +bookName+"\nBook Price: " + bookPrice);
  }
}
