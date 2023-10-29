import java.util.Scanner;

public class Main1 {
    public static void mainTake() {
        Student student = new Student();
        Book book = new Book();
        Library library = new Library();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите свое имя, номер студента и количество приобретенных книг: ");

        student.nameOfStudent = scanner.nextLine();
        student.idOfStudent = scanner.nextInt();
        student.count = scanner.nextInt();

        System.out.println("Введите названия, автора и номер книги: ");

        book.nameOfBook = "Time Machine";
        book.authorOfBook = "Herbert George Wells";
        book.idOfBook = 42;

        library.acceptDatesOfStudent(student);
        library.acceptDatesOfBook(book);
        student.acceptBook(book);

    }
}
