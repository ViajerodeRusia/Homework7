public class Book {
    private String bookName;
    private int publishingYear;
    private Author author;

    public Book(String bookName, int publishingYear, Author author) {
        this.bookName = bookName;
        this.publishingYear = publishingYear;
        this.author = author;
    }

    public Author getAuthor() {
        return author;
    }

    public String getBookName() {
        return bookName;
    }

    public int getPublishingYear() {

        return publishingYear;
    }
    public void setPublishingYear(int publishingYear) {

        this.publishingYear = publishingYear;
    }

}
