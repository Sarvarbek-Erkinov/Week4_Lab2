public class LibraryBookTester {
   static void main(String[] args) {
       LibraryBook firstBook = new LibraryBook();
       firstBook.setBookTitle("Harmer");
       firstBook.setAuthor("Sarvar E");
       firstBook.setPages(500);

       System.out.println("The book called " + firstBook.getBookTitle() + " written by " + firstBook.getAuthor() + " has " + firstBook.getPages()  + " pages, which is " + (firstBook.isThick() ? "Thick" : "Not thick") );

       LibraryBook secondBook = new LibraryBook();
       secondBook.setBookTitle("Farmer");
       secondBook.setAuthor("Sarel E");
       secondBook.setPages(-1);

       System.out.println("The book called " + secondBook.getBookTitle() + " written by " + secondBook.getAuthor() + " has " + secondBook.getPages()  + " pages, which is " + (secondBook.isThick() ? "Thick" : "Not thick") );
   }
}
