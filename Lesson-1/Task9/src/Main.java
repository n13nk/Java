import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Введите строку");
        String userText = scanner1.nextLine();
        System.out.println("Введите вторую строку");
        String nextUserText = scanner1.nextLine();
        if (checkForReapeat(userText, nextUserText)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }

    private static boolean checkForReapeat(String firstText, String secondText) {
        return firstText.endsWith(secondText);
    }
}