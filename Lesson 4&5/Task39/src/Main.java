import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static int getNextGreaterNumber(int number){
        char[] digits = Integer.toString(number).toCharArray();
        int n = digits.length;
        // Ищем позицию, на которой цифра слева меньше правой
        int i = n - 1;
        while (i > 0 && digits[i - 1] >= digits[i]) {
            i--;
        }
        // Если такой позиции нет, то число невозможно переставить
        if (i == 0) {
            return -1;
        }

        // Ищем цифру, которую нужно поменять с digits[i-1]
        int j = n - 1;
        while (digits[j] <= digits[i - 1]) {
            j--;
        }

        // Меняем цифры местами
        char temp = digits[i - 1];
        digits[i - 1] = digits[j];
        digits[j] = temp;
        // Сортируем все цифры после i-1 в порядке возрастания
        Arrays.sort(digits, i, n);

        // Преобразовываем массив цифр обратно в число
        int next = Integer.parseInt(new String(digits));

        return next;

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите целое положительное число: ");
        int number = sc.nextInt();
        int next = getNextGreaterNumber(number);
        if (next == -1) {
            System.out.println("Невозможно переставить цифры числа " + number);
            System.out.println(number + " ==> " + next);
        } else {
            System.out.println("Следующее большее число, которое можно составить из цифр числа " + number + " - это " + next);
            System.out.println(number + " ==> " + next);
        }
    }

}