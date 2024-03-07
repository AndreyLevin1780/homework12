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

        System.out.println(pushkin.toString() + ".");
        System.out.println(lermontov.toString() + ".");
        System.out.println(onegin.toString() + ".");
        System.out.println(mtsyri.toString() + ".");

        System.out.println(pushkin.equals(lermontov));
        System.out.println(onegin.equals(mtsyri));
        System.out.println(pushkin.hashCode());
        System.out.println(lermontov.hashCode());
        System.out.println(onegin.hashCode());
        System.out.println(mtsyri.hashCode());
    }
    private static void print(Book book) {
        System.out.println(
                "Автор: " + book.getAuthor().getName() + " " + book.getAuthor().getSurename() +
                        ", название: " + book.getBookTitle() +
                        ", год издания: " + book.getDateOfIssue() + "."
        );
        }
}