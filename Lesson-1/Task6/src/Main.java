import java.util.Scanner;

public class Main {
    private static final int CHECKDIT = 1;
    public static void main(String[] args) {
        int sumDit = 0;
        System.out.println("Введите число:");
        Scanner scanner1 = new Scanner(System.in);
        int dit = scanner1.nextInt();
        for (int i = 1; i < dit / 2; i++) {
            if (dit % i == 0) {
                sumDit += i;
            }
        }
        if (sumDit == CHECKDIT) {
            System.out.println("Число является простым");
        } else {
            System.out.println("Число не является простым");
        }
    }
}