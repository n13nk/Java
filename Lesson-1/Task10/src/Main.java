import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Введите Ваше имя");
        String name = scanner1.nextLine();
        name = name.toLowerCase(Locale.ROOT);
        char firstLetter = name.charAt(0);
        firstLetter = Character.toUpperCase(firstLetter);
        System.out.println("Hello, " + firstLetter + name.substring(1, name.length()));
    }
}