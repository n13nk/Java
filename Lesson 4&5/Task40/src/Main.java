import java.util.ArrayList;
import java.util.List;

public class Main {
    public static String formatRanges(int[] sortedValues) {
        List<String> ranges = new ArrayList<>();
        int start = sortedValues[0];
        int previous = start;

        for (int i = 1; i < sortedValues.length; i++) {
            int current = sortedValues[i];
            if (current == previous + 1) {
                // продолжаем диапазон
                previous = current;
            } else {
                // заканчиваем диапазон и добавляем его в список
                if (start == previous) {
                    ranges.add(String.valueOf(start));
                } else {
                    ranges.add(start + "-" + previous);
                }
                // начинаем новый диапазон
                start = current;
                previous = current;
            }
        }
        // добавляем последний диапазон в список
        if (start == previous) {
            ranges.add(String.valueOf(start));
        } else {
            ranges.add(start + "-" + previous);
        }
        // объединяем диапазоны в одну строку
        return String.join(",", ranges);
    }

    public static void main(String[] args) {
        int[] values = {-10, -9, -8, -6, -3, -2, -1, 0, 1, 3, 4, 5, 7, 8, 9, 10, 11, 14, 15, 17, 18, 19, 20};
        System.out.println("Отсортированный ряд чисел: " );
        for (int i = 0; i<values.length; i++){
            System.out.print(values[i] + ",");
        }
        String result = formatRanges(values);
        System.out.println("\nСформированные диапазоны: " + result);
    }
}