public class Book {

    private final String bookTitle;
    private final Author author;
    private int dateOfIssue;

    public Book(String bookTitle, Author author, int dateOfIssue) {
        this.bookTitle = bookTitle;
        this.author = author;
        this.dateOfIssue = dateOfIssue;
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
}
