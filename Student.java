import java.util.Scanner;

public class Student {
    String nameOfStudent;
    int idOfStudent;
    int count = 0;
    String authorOfBook;
    String nameOfBook;
    int idOfBook;

    public void acceptBook(Book book) {
        authorOfBook = book.authorOfBook;
        nameOfBook = book.nameOfBook;
        idOfBook = book.idOfBook;
    }


    public void showInfo() {
        System.out.println("Имя студента: " + nameOfStudent);
        System.out.println("Номер студента: " + idOfStudent);
        System.out.println("Количество книг: " + count);
        System.out.println("Названия книги: " + nameOfBook);
        System.out.println("Автор книги: " + authorOfBook);
        System.out.println("ID книги: " + idOfBook);

    }



}
