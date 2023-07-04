import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Main {
    public static Set<Integer> generateU(int n) {
        Set<Integer> u = new HashSet<>();
        u.add(1);

        for (int i = 1; i <= n; i++) {
            int y = 2 * i + 1;
            int z = 3 * i + 1;

            u.add(y);
            u.add(z);
        }

        return u;
    }

    public static void main(String[] args) {
        int n = 10;
        Set<Integer> u = generateU(n);
        System.out.println("u = " + u);
    }
}