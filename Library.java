public class Library {
    String nameOfStudent;
    int idOfStudent;
    int count = 0;
    String authorOfBook;
    String nameOfBook;
    int idOfBook;

    public void acceptDatesOfStudent(Student student) {
        nameOfStudent = student.nameOfStudent;
        idOfStudent = student.idOfStudent;
        count = student.count;

        if (count >= 1) {
            System.out.println("Вы не можете брать больше одной книги");
        }
    }
    public void BackFromStudent(Student student) {
        nameOfStudent = student.nameOfStudent;
        idOfStudent = student.idOfStudent;
        count = student.count;

        if (count != 1) {
            System.out.println("У вас нет книг для возврата");
        } else {
            count = 0;
            student.count = 0;
        }
    }


    public void acceptDatesOfBook(Book book) {
        authorOfBook = book.authorOfBook;
        nameOfBook = book.nameOfBook;
        idOfBook = book.idOfBook;
    }





}
