import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первую строку");
        String stroka1 = scanner.nextLine();
        System.out.println("Введите вторую строку");
        String stroka2 = scanner.nextLine();
        StringBuilder result = new StringBuilder();
        int dit1 = Integer.parseInt(stroka1);
        int dit2 = Integer.parseInt(stroka2);
        if (dit1 < 0 || dit2 < 0) {
            System.out.println("Вы ввели отрицательное число");
        }else {
            int dit = dit1 + dit2;
            result.append(dit);
        }
        System.out.println(result);
    }
}