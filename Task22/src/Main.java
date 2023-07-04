import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Введите sideA:");
        int sideA = scanner1.nextInt();
        System.out.println("Введите sideB:");
        int sideB = scanner1.nextInt();
        System.out.println("Введите sideC:");
        int sideC = scanner1.nextInt();
        Square square = new Square(sideA, sideB, sideC);
        if (square.checkForSquare() && square .areaOfASquare() != 0) {
            System.out.println("Вы сможете построить треугольник, а также площадь его равна: " + square.areaOfASquare());
        } else if (square.checkForSquare()) {
            System.out.println("Вы сможете построить треугольник, но посчитать площадь не удалось" );
        } else {
            System.out.println("Вы не сможете построить треугольник");
        }
    }
}