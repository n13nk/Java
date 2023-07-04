import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Введите первое число");
        String firstDit = scanner1.nextLine();
        System.out.println("Введите второе число");
        String secondDit = scanner1.nextLine();
        System.out.println("Введите третье число");
        String thirdDit = scanner1.nextLine();
        Cell cell = new Cell(firstDit, secondDit, thirdDit);
        if (Cell.checkForEmptyCell()) {
            System.out.println("Ячейка памяти выглядит следующим образом: " + cell);
        } else {
            Cell.smallestNumber();
            System.out.println("Ячейка памяти выглядит следующим образом: " + cell);
        }
    }
}
