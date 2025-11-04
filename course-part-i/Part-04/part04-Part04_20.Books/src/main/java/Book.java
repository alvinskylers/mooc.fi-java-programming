public class Book {
    
    private String title;
    private int pages;
    private int publicationYear;
    
    public Book (String initialTitle, int initialPages, int intialPublicationYear) {
        this.title = initialTitle;
        this.pages = initialPages;
        this.publicationYear = intialPublicationYear;
    }

    public String getTitle() {
        return this.title;
    }

    public String toString() {
        return this.title +", " + this.pages + " pages, " + this.publicationYear;
    }
}
