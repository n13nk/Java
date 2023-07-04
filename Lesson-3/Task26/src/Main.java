import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Введите текст");
        String userDits = scanner1.nextLine();
        FindAPalindrome palindrome = new FindAPalindrome();
        if (palindrome.isPalindrome(userDits)) {
            System.out.println("Данный текс является полиндромом. Наибольшая длина полиндрома составляет " + palindrome.countPolindrom());
        } else {
            System.out.println("Данный текст не является полиндромом. Наибольшая длина полиндрома составляет " + palindrome.countPolindrom());
        }

    }
}