import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Введите строкy");
        String userText = scanner1.nextLine();
        System.out.println(checkCase(userText));
    }
    private static String checkCase(String userText) {
        int loverCase = 0;
        int upCase = 0;
        char checkLetter;
        for (int i = 0; i < userText.length(); i++) {
            checkLetter = userText.charAt(i);
            if (checkLetter == Character.toLowerCase(checkLetter)) {
                loverCase++;
            } else {
                upCase++;
            }
        }
        if (loverCase >= upCase) {
            return (userText.toLowerCase());
        } else {
            return (userText.toUpperCase());
        }
    }
}