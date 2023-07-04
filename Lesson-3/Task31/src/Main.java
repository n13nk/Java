import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число из ряда Фибоначчи");
        int userDit = scanner.nextInt();
        Fibonacci fibonacci = new Fibonacci(userDit);
        System.out.println(fibonacci);
    }
}