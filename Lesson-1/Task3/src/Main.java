
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Введите координаты точек");
        String coordinatesA = scanner1.nextLine();
        Triangle triangle = new Triangle(coordinatesA);
        System.out.println(triangle.findingTheBarycenterOfATriangle());
    }
}