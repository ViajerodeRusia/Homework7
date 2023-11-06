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
            if (books[i] == null) {
                books[i] = book;
                return; // return выходит из метода, а break выйдет из цикла for;
            }
        }
        System.out.println("Все места заняты");
        System.out.println();
    }

}

