import java.util.Scanner;

public class Start {
    public static void main(String[] args) {
        System.out.println("Взять или возврат?");

        Main1 main1 = new Main1();
        Main2 main2 = new Main2();

        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine();

        if (answer.equals("Взять")) {
            main1.mainTake();
        } else if (answer.equals("Возврат")) {
            main2.mainAccept();
        } else {
            System.out.println("Вы можете вводить только \"Взять\" или \"Возврат\". ");
        }

    }
}
