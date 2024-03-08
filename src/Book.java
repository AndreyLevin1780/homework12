import java.util.Objects;

public class Book {

    private final String bookTitle;
    private final Author author;
    private int dateOfIssue;

    public Book(String bookTitle, Author author, int dateOfIssue) {
        this.bookTitle = bookTitle;
        this.author = author;
        this.dateOfIssue = dateOfIssue;
    }

    public String toString() {
        return "Название: " + this.bookTitle + "Автор: " + this.author + "Год издания: " + this.dateOfIssue;
    }

        public String getBookTitle() {
        return bookTitle;
    }

    public Author getAuthor() {
        return author;
    }

    public int getDateOfIssue() {
        return dateOfIssue;
    }

    public void setDateOfIssue(int dateOfIssue) {
        this.dateOfIssue = dateOfIssue;
    }

    @Override
    public boolean equals(Object anotherBook) {
        if (this == anotherBook) return true;
        if (anotherBook == null || getClass() != anotherBook.getClass()) return false;
        Book book = (Book) anotherBook;
        return dateOfIssue == book.dateOfIssue && Objects.equals(bookTitle, book.bookTitle) && Objects.equals(author, book.author);
    }

    public int hashCode () {
        return java.util.Objects.hash(this.getBookTitle());
    }
}
