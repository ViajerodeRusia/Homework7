import java.util.Objects;

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
    @Override
    public String toString() {
        return "Название: %s, год публикации: %d, автор: %s".formatted(bookName, publishingYear, author.getName());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return publishingYear == book.publishingYear && Objects.equals(bookName, book.bookName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookName, publishingYear);
    }
}
