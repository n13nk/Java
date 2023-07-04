import java.util.Random;
import java.util.Scanner;

public class Main {
    public static int[][] matrix(int N){
        int[][] matrix = new int[N][N];
        Random random = new Random();
        for (int i = 0; i < N; i++){
            for (int j = 0; j < N; j++){
                matrix[i][j] = random.nextInt(1,100);
            }
        }
        return matrix;
    }
    public static void printMatrix(int[][] matrix){
        for(int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++){
                System.out.print(matrix[i][j]+ " ");
            }
            System.out.println();
        }
    }
    public static int[] snailSort(int[][] matrix) {
        int N = matrix.length;
        int[] result = new int[N * N];
        int index = 0;
        int startRow = 0, endRow = N - 1;
        int startCol = 0, endCol = N - 1;

        while (startRow <= endRow && startCol <= endCol) {

            // Traverse Right
            for (int i = startCol; i <= endCol; i++) {
                result[index++] = matrix[startRow][i];
            }
            startRow++;

            // Traverse Down
            for (int i = startRow; i <= endRow; i++) {
                result[index++] = matrix[i][endCol];
            }
            endCol--;

            // Traverse Left
            if (startRow <= endRow) {
                for (int i = endCol; i >= startCol; i--) {
                    result[index++] = matrix[endRow][i];
                }
                endRow--;
            }

            // Traverse Up
            if (startCol <= endCol) {
                for (int i = endRow; i >= startRow; i--) {
                    result[index++] = matrix[i][startCol];
                }
                startCol++;
            }
        }

        return result;
    }
    public static void printResult(int[] result) {
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число N - размер массива: ");
        int N = sc.nextInt();
        int[][] matrix = matrix(N);
        System.out.println("Сгенерированный массив:");
        printMatrix(matrix);
        int[] result = snailSort(matrix);
        System.out.println("Отсортированный массив в формате Змейки: ");
        printResult(result);
    }

}