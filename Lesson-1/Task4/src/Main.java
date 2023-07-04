import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Введите текс, который необходимо проверить");
        Scanner scanner1 = new Scanner(System.in);
        String usersText = scanner1.nextLine();
        System.out.println("Введите букву, которую необходимо проверить в тексте");
        char checkLetter = scanner1.next().charAt(0);
        System.out.println("Данная буква повторяется " + Symbol.countLetters(usersText, checkLetter));
    }
}