public class Main {
    public static void getList (Book book[]) {
        for (int i = 0; i < book.length; i++) {
            if (book.length > 0 && book[i] != null) {
                System.out.println("Название: " + book[i].getBookName());
                System.out.println("Автор: " + book[i].getAuthor().getName() + " ");
                System.out.println("Год издат-ва: " + book[i].getPublishingYear());
                System.out.println();
            }
        }
        System.out.println("____________________________");
    }
    // создать третий класс Library и хранить все там
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Library library = new Library(7);
        library.addNew(new Book("A Tale of Two Cities", 1859, new Author("Charles Dickens")));
        library.addNew(new Book("The Little Prince", 1943, new Author("Antoine de Saint-Exupéry")));
        library.addNew(new Book("Harry Potter and the Philosopher's Stone", 1997, new Author("Joanne Rowling")));
        library.addNew(new Book("And Then There Were None", 1939, new Author("Agatha Christie")));
        library.addNew(new Book("Dream of the Red Chamber", 1791, new Author("Cao Xueqin")));
        library.addNew(new Book("The Hobbit", 1935, new Author("John Tolkien")));

        getList(library.getBooks());

        library.getCertainBook(5).setPublishingYear(1937);

        //getList(library.getBooks());

        //изменили
        library.addNew(new Book("The Da Vinci Code", 2003, new Author("Dan Brown")));
        library.addNew(new Book("Black Beauty" , 2003, new Author("Anna Sewell")));

        getList(library.getBooks());
    }
}
