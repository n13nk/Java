import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List History = new ArrayList<>();
        String line;
        try {
            File HistoryFile = new File("File");
            if (HistoryFile.exists()) {
                Scanner fileScanner = new Scanner(HistoryFile);
                while (fileScanner.hasNextLine()) {
                    History.add(fileScanner.nextLine());
                }
                fileScanner.close();
            }
        } catch (IOException e) {
            System.err.println("Ошибка чтения файла File: " + e.getMessage());
        }
        while (true) {
            System.out.print("Введите пример через пробелы: ");
            line = scanner.nextLine();
            if (line.equals("File")) {
                for (Object equation : History) {
                    System.out.println(equation);
                }
                continue;
            }
            String[] tokens = line.split(" ");

            try {
                int i = 0;
                double result = Double.parseDouble(tokens[i++]);
                while (i < tokens.length) {
                    String operator = tokens[i++];

                    double operand = Double.parseDouble(tokens[i++]);
                    if (operator.equals("+")) {
                        result += operand;
                    } else if (operator.equals("-")) {
                        result -= operand;
                    } else if (operator.equals("*")) {
                        result *= operand;
                    } else if (operator.equals("/")) {
                        result /= operand;
                    } else if (operator.equals("//")) {
                        result /= operand;
                        result = Math.floor(result);
                    } else if (operator.equals("%")) {
                        result %= operand;
                    } else if (operator.equals("^")) {
                        result = Math.pow(result, operand);
                    } else if (operator.equals("|")) {
                        result = Math.abs(operand);
                    } else {
                        System.err.println("Неверный оператор ошибка: " + operator);
                    }
                }

                System.out.println("Результат: " + result);
                History.add(line + " = " + result);
            } catch (NumberFormatException e) {
                System.err.println("Ошибка введен неверный пример: " + e.getMessage());
            }

            try {
                PrintWriter writer = new PrintWriter(new FileWriter("File"));
                for (Object equation : History) {
                    writer.println(equation);
                }
                writer.close();
            } catch (IOException e) {
                System.err.println("Ошибка записи в файл File: " + e.getMessage());
            }
        }
    }
}