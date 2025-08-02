package org.example;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import DZ2.MyArrayList;
import DZ2.MyHashSet;
import DZ2.Students.Book;
import DZ2.Students.Student;

public class Main {

    public static void main(String[] args) {
        MyHashSet<String> myHashSet = new MyHashSet<String>();
        myHashSet.add("Igor");
        myHashSet.add("Valera");
        myHashSet.add("Valera");
        myHashSet.add("Sasha");
        myHashSet.add("Masha");
        myHashSet.add("Liza");
        myHashSet.add("Valera");

        System.out.println(myHashSet.toString());]

        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        for (Integer i = 1; i < 20; i++)
        arrayList.add(i);

        MyArrayList<Integer> myArrayList = new MyArrayList<Integer>();
        System.out.println(myArrayList.add(1));
        System.out.println(myArrayList.remove(1));
        System.out.println(myArrayList.addAll(arrayList));
        for (int i = 0; i <= myArrayList.length() - 1; i++)
        System.out.println(myArrayList.get(i));


        // Вторая часть дз
        ArrayList<Student> students = new ArrayList<>();

        List<Book> valeraBooks = new ArrayList<Book>();
        valeraBooks.add(new Book("По ту сторону добра и зла", 448, 1884));
        valeraBooks.add(new Book("По ту сторону добра и зла", 448, 1884));
        valeraBooks.add(new Book("Я и оно", 160, 1923));
        valeraBooks.add(new Book("Основной курс философии", 500, 2013));
        valeraBooks.add(new Book("Основы гуманитарных наук", 349, 2016));
        Student valera = new Student("Валера", "Филосовия", valeraBooks);

        List<Book> lizaBooks = new ArrayList<>();
        lizaBooks.add(new Book("Анотомический атлас", 236, 1999));
        lizaBooks.add(new Book("Медецинская энциклопедия", 5643, 2007));
        lizaBooks.add(new Book("Боль, практическое руководство", 416, 2023));
        lizaBooks.add(new Book("Основы педиотрии", 848, 2025));
        Student liza = new Student("Лиза", "Педиатрия", lizaBooks);

        List<Book> sashaBooks = new ArrayList<>();
        sashaBooks.add(new Book("Горкаем алгоритмы", 288, 2023));
        sashaBooks.add(new Book("Объекты", 303, 2024));
        sashaBooks.add(new Book("Чистый код", 464, 2022));
        sashaBooks.add(new Book("Психиатрия. Современные психотропные средства", 111, 2025));
        Student sasha = new Student("Саша", "Програмирование", sashaBooks);

        students.add(valera);
        students.add(liza);
        students.add(sasha);

        students.stream().peek(student -> System.out.println(student.toString()))
                .flatMap(student -> student.getBooks().stream())
                .sorted(Comparator.comparing(book -> book.getPages()))
                .distinct()
                .filter(year -> year.getYearOfPublication() >= 2000)
                .limit(3)
                .map(year -> year.getYearOfPublication())
                .findFirst()
                .ifPresentOrElse(
                        year -> System.out.println("Год издания " + year),
                        () -> System.out.println("Книга не найдена"));

    }
}