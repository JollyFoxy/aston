package DZ2.Students;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@AllArgsConstructor
@ToString
public class Book {
    private String name;
    private int pages;
    private int yearOfPublication;
}
