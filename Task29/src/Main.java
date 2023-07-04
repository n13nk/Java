import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static final ArrayList<Integer> arrayList = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Введите начальное число");
        String firstDit = scanner1.nextLine();
        System.out.println("Введите шаг");
        int step = scanner1.nextInt();
        int stepi = step;
        int test = 0;
        String[] words = firstDit.split("");
        for (int i = 0; i < words.length; i++) {
            test += Math.pow(Integer.parseInt(words[i]), stepi);
            stepi++;
        }
        int result2 = Integer.parseInt(firstDit) * step;
        System.out.println(test + " " + result2);
    }
}