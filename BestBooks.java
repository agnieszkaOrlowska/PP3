import java.util.ArrayList; // import the ArrayList class
public class BestBooks
{
   private String[] type={"crime","drama",
   "fantasy","science fiction"};
   private String author;
   private int pages;
   private int year;
   
   BestBooks(String[] type, String author, int pages, int year){
       this.type=type;
       this.author=author;
       this.pages=pages;
       this.year=year;
   }
   
   public void setType(String[] type){
       this.type=type;
   }
   
      public void setAuthor(String author){
       this.author=author;
   }
   
      public void setPages(int pages){
       this.pages=pages;
   }
   
      public void setYear(int year){
       this.year=year;
   }
   
   //   public String getType(String[] type){
   //    return type;
   //}
      public String getAuthor(String author){
       return author;
   }
      public int getPages(int pages){
       return pages;
   }
      public int getYear(int year){
       return year;
   }
   
   
}
