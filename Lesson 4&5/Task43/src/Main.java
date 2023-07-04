public class Main {
    public static int getMaxSlidingSum(int[][] pyramid) {
        int n = pyramid.length;
        if (n == 0) {
            return 0;
        }
        int[][] res = new int[n][n]; // массив для хранения результата
        for (int i = n - 1; i >= 0; i--) { // итерации от нижнего уровня к верхнему
            for (int j = 0; j <= i; j++) { // обработка элементов текущего уровня
                if (i == n - 1) { // для нижнего уровня результат равен значению элемента
                    res[i][j] = pyramid[i][j];
                    continue;
                }
// иначе выбираем максимальную сумму из двух возможных вариантов спуска на уровень ниже
                res[i][j] = Math.max(res[i + 1][j], res[i + 1][j + 1]) + pyramid[i][j];
            }
        }
        return res[0][0]; // результат хранится в верхнем элементе
    }
    public static void main(String[] args) {
        int[][] pyramid = {{3}, {7, 4}, {2, 4, 6}, {8, 5, 9, 3}};
        for (int i = 0; i < pyramid.length; i++){
            for (int j = 0; j <= i; j++){
                System.out.print(pyramid[i][j] + " ");
            }
            System.out.println();

        }

        int maxSum = getMaxSlidingSum(pyramid);
        System.out.println("Максимальная сумма скольжения: " + maxSum);
    }
}