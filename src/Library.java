import java.util.Objects;

public class Library {
    private Book[] books;

    public Library(int bookNumbers) {
        this.books = new Book[bookNumbers];
    }

    public Book[] getBooks() {
        return books;
    }
    public Book getCertainBook(int number) {
        return books[number];
    }

    public void addNew(Book book) {
        for (int i = 0; i < books.length; i++) {
            if (books[i] == null && checkBook(book)) {
                System.out.println("checkBook(book) = " + checkBook(book));
                books[i] = book;
                return; // return выходит из метода, а break выйдет из цикла for;
            } else if (!checkBook(book)) {
                System.out.println("checkBook(book) = " + checkBook(book));
                throw new RuntimeException("Книга с таким названием уже есть");
            }
        }
        throw new RuntimeException("Все места заняты");
    }
    public boolean checkBook(Book book){
        for (int i = 0; i < books.length; i++) {
            if (books[i]!= null) {
                if (books[i].equals(book) || books[i].getAuthor().getName().equals(book.getAuthor().getName())) {
                    return false;
                }
            }
        }
        return true;
    }
}

