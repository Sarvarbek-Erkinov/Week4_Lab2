// First problem 

public class LibraryBook {
   private String bookTitle = "Unknown";
   private String author = "Unknown";
   private int pages = 1;

   public void setBookTitle(String bookTitle){
       this.bookTitle = bookTitle;
   }

   public String getBookTitle(){return bookTitle;}

   public void setAuthor(String author){
       this.author = author;
   }

   public String getAuthor(){return author;}

   public void setPages(int pages){
       if(pages > 0) {
           this.pages = pages;
       }
   }

   public int getPages(){return pages;}

   public boolean isThick(){
       if(pages > 500){
           return true;
       }else {
           return false;
       }
   }

}


