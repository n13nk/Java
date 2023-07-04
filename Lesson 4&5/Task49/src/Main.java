import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число: ");
        int n  = sc.nextInt();

        System.out.println("Результат: " + fusc(n));
    }
    public static int fun(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else if (n % 2 == 0) {
            return fun(n / 2);
        } else {
            return fun(n / 2) + fun(n / 2 + 1);
        }
    }
    public static int fusc(int n) {
        int a = 0, b = 1;           // уравнение 1 и 2
        while (n > 0) {
            if (n % 2 == 0) {
                n = n / 2;
            } else {
                a = a + b;
                b = a - b;
                n = (n - 1) / 2;
            }
        }
        return a;                   // значение fusc(n)
    }
}