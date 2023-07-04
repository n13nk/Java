import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество палочек: ");
        long n = scanner.nextLong();
        String winner = findWinner(n, "Саша");
        System.out.println("Победителем становится " + winner + ".");
    }

    public static String findWinner(long n, String player) {
        if (n == 1) {
            return player;
        } else if (n % 2 == 0) {
            return findWinner(n / 2, player.equals("Саша") ? "Таня" : "Саша");
        } else {
            return player;
        }
    }
}