import java.util.*;

public class Book
{
    private String title;
    private Writer author;
    private int pages;
    private boolean isOpen;
    private Publisher publisher;
    private ArrayList<Chapter> chapters = new ArrayList<Chapter>();

    
    Book(String title, Writer author, int pages, boolean isOpen){
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.isOpen = isOpen;

    }

    Book(Writer author, String title, int pages){
        this.title = title;
        this.author = author;
        this.pages = pages;

    }
    
    public String toString(){
        return "Title: " + title + "\nAuthor: " + author.toString() + "\nNo of pages: " + pages + "\nIs book open? " + isOpen
        + "Publisher: " + publisher.toString();
    }
    
    public String getTitle(){
        return title;
    }

    public int getPages(){
        return pages;
    }
    
    public String getPublisher(){
        return publisher.toString();
    }

    public String getAuthor(){
        return author.toString();
    }
    
    public static void main(String[] args){
        Writer wrt = new Writer("Adam", "Kowalski", 28, 2);
        Book bk = new Book("XYZ", wrt, 420, false);
        System.out.println(bk);
    }
    
    public void addChapter(String title, int pages, int startingPage){
        Chapter c = new Chapter(title, pages, startingPage);
        chapters.add(c);
    }
    
    public void displayChapters(){
        System.out.println("Chapters:");
        for(int i=0; i<chapters.size();i++){
            Chapter c = chapters.get(i);
            System.out.println(c);
        }
    }
}