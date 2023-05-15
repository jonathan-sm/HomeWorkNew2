package HW2;

import java.util.Objects;

public class Author {
    private String firstName;
    private String lasName;

    public String getFirstName() {
        return firstName;
    }

    public String getLasName() {
        return lasName;
    }

    public Author(String firstName, String lasName) {
        this.firstName = firstName;
        this.lasName = lasName;


    }

    @Override
    public String toString() {
        return " Автор " + firstName +" "+ lasName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return Objects.equals(firstName, author.firstName) && Objects.equals(lasName, author.lasName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lasName);
    }
}

