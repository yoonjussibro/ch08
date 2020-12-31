package ch08;

public class Book4 {
    private String title;
    private String author;
    
    public Book4() {
	this("마당을 나온 암탉", "황선미");
    }
    
    public Book4(String author) {
	this("마당을 나온 암탉", author);
    }
    
    public Book4(String title, String author) {
	this.setTitle(title);
	this.setAuthor(author);
    }

    public String getTitle() {
	return title;
    }

    public void setTitle(String title) {
	this.title = title;
    }

    public String getAuthor() {
	return author;
    }

    public void setAuthor(String author) {
	this.author = author;
    }


}
