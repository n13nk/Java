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
        Triangle triangle = new Triangle(sideA, sideB, sideC);
        if (triangle.checkForTriangle()) {
            System.out.println("Да, вы сможете посторить треугольник" + "\n" + "Наибольший внешний угол равен: " + triangle.largestAngle());
        } else {
            System.out.println("Нет, к сожалению вы не сможете построить треугольник");
        }
    }
}