import java.util.Scanner;

public class Main {
    private static final int POWEROFTWO = 2;
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Введите конечное число");
        int userFinishDit = scanner1.nextInt();
        System.out.println("Введите шаг");
        int step = scanner1.nextInt();
        String result = "";
        for (int i = 1; i <= userFinishDit; i += step) {
            result += (int) Math.pow(i, POWEROFTWO) + ",";
        }
        System.out.println(result);
    }
}