
import java.util.Scanner;

public class Main {
    private static final int[] VALUES = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
    private static final String[] NUMERALS = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

    public static String convert(int n) {

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < VALUES.length; i++) {
            while (n >= VALUES[i]) {
                result.append(NUMERALS[i]);
                n -= VALUES[i];
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите год в арабских цифрах: ");
        int n = sc.nextInt();
        System.out.println("Этот год в римских цифрах: " + convert(n)); // MCMLXXXIV
    }
}