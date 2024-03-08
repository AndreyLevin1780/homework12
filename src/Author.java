import java.util.Objects;

public class Author {

    private final String name;
    private final String surename;


    public Author(String name, String surename) {
        this.name = name;
        this.surename = surename;
    }

    public String toString() {
        return "Имя: " + this.name + ", Фамилия: " + this.surename;
    }


    @Override
    public boolean equals(Object anotherAuthor) {
        if (this == anotherAuthor) return true;
        if (anotherAuthor == null || getClass() != anotherAuthor.getClass()) return false;
        Author author = (Author) anotherAuthor;
        return Objects.equals(name, author.name) && Objects.equals(surename, author.surename);
    }

    public String getName() {
        return name;
    }

    public String getSurename() {
        return surename;
    }

    public int hashCode () {
        return java.util.Objects.hash(this.getName());
    }
}
