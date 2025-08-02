package DZ2.Students;

import java.util.List;

import lombok.Getter;

@Getter
public class Student {
    private String name;
    private List<Book> books;
    private String curse;

    public Student(String name, String curse, List<Book> books) {
        this.name = name;
        this.curse = curse;
        this.books = books;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Студент ");
        sb.append(name);
        sb.append(", учется на курсе ");
        sb.append(curse);
        return sb.toString();
    }
}
