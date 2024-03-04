//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Author pushkin = new Author("Александр", "Пушкин");
        Author lermontov = new Author("Михаил", "Лермонтов");

        Book onegin = new Book( "Евгений Онегин", pushkin, 1811);
        Book mtsyri = new Book("Мцыри", lermontov, 1832);

        mtsyri.setDateOfIssue(1841);

        print(onegin);
        print(mtsyri);

    }
    private static void print(Book book) {
        System.out.println(
                "Автор: " + book.getAuthor().getName() + " " + book.getAuthor().getSurename() +
                        ", название: " + book.getBookTitle() +
                        ", год издания: " + book.getDateOfIssue() + "."
        );
    }
}