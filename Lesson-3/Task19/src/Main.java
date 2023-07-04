import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int number = s.nextInt();
        System.out.println(fun(number));
    }
    public static int fun(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else if (n % 2 == 0) { //n / 2 == (int) n / 2
            return fun(n / 2);
        } else {
            return fun((n - 1)/ 2) + fun(((n - 1) / 2) + 1 );
        }
    }
}