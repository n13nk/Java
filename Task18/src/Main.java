import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите количество элементов в массиве: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        Random randomizer = new Random();
        for (int i = 0; i < n; i++) {
            arr[i] = randomizer.nextInt(1, 10);
        }

        System.out.println("Массив чисел: ");
        for (int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        int maxIndex = 0;
        for (int i = 1; i < n; i++) {
            if (arr[i] > arr[maxIndex]) {
                maxIndex = i;
            }
        }
        int max = arr[maxIndex];
        System.out.println("Максимальный элемент: " + max);

        // Формирование двух массивов
        int[] arrLeft = new int[maxIndex];
        int[] arrRight = new int[n - maxIndex - 1];
        for (int i = 0; i < maxIndex; i++) {
            arrLeft[i] = arr[i];
        }
        for (int i = maxIndex + 1; i < n; i++) {
            arrRight[i - maxIndex - 1] = arr[i];
        }

        System.out.println("Числа слева от максимума:");
        for (int i = 0; i < maxIndex; i++) {
            System.out.print(arrLeft[i] + " ");
        }
        System.out.println();
        System.out.println("Числа справа от максимума:");
        for (int i = 0; i < n - maxIndex - 1; i++) {
            System.out.print(arrRight[i] + " ");
        }


    }
}