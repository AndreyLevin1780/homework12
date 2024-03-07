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


    public boolean equals(Author anotherAuthor) {
        if (this.getName().equals(anotherAuthor.getName()) && this.getSurename().equals(anotherAuthor.getSurename())) {

            return true;
        } else {
            return false;
        }
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
