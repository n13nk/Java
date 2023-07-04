import java.util.Scanner;

public class Main {
    public static int romanToArabic(String roman) {
        int arabic = 0;
        for (int i = 0; i < roman.length(); i++) {
            char ch = roman.charAt(i);
            switch (ch) {
                case 'I':
                    if (i < roman.length() - 1 && (roman.charAt(i + 1) == 'V' || roman.charAt(i + 1) == 'X')) {
                        arabic--;
                    } else {
                        arabic++;
                    }
                    break;
                case 'V':
                    arabic += 5;
                    break;
                case 'X':
                    if (i < roman.length() - 1 && (roman.charAt(i + 1) == 'L' || roman.charAt(i + 1) == 'C')) {
                        arabic -= 10;
                    } else {
                        arabic += 10;
                    }
                    break;
                case 'L':
                    arabic += 50;
                    break;
                case 'C':
                    if (i < roman.length() - 1 && (roman.charAt(i + 1) == 'D' || roman.charAt(i + 1) == 'M')) {
                        arabic -= 100;
                    } else {
                        arabic += 100;
                    }
                    break;
                case 'D':
                    arabic += 500;
                    break;
                case 'M':
                    arabic += 1000;
                    break;
                default:
                    return -1;
            }
        }

        if (arabic < 1 || arabic > 9999) {
            return -1;
        }
        return arabic;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите количество лет в римских числах (например, XIX): ");
        String roman = sc.nextLine().toUpperCase();

        int arabic = romanToArabic(roman);

        if (arabic == -1) {
            System.out.println("Ошибка: введено неверное римское число");
        } else {
            System.out.println("Количество лет в арабских числах: " + arabic);
        }
    }
}
