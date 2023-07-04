import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Введите начальное число");
        int startDit = scanner1.nextInt();
        System.out.println("Введите шаг");
        int step = scanner1.nextInt();
        System.out.println("Введите конечное число");
        int finish = scanner1.nextInt();
        String result = "";
        for (int i = startDit; i <= finish * step ; i += step) {
            result += i + " ";
        }
        System.out.println(result);
    }
}