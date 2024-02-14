public class Book {
    private String bookTitle;
    private String numOfPages;
    private String yearPublished;

    public Book(String title, String pageCount, String publishYear) {
        this.bookTitle = title;
        this.numOfPages = pageCount;
        this.yearPublished = publishYear;
    }

    public String toString() {
        return this.bookTitle + ", " + this.numOfPages + " pages, " + this.yearPublished;
    }

    public String getBookTitle(){
        return this.bookTitle;
    }
}
