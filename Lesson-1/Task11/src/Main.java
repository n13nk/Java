import java.util.Scanner;

public class Main {
    private static final char [] mass = {'а', 'у', 'о' ,'ы','э','я','ю','ё','и','е'};
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Введите строку");
        String stroka = scanner1.nextLine();
        String result = "";
        int check = 0;
        char checkLetter;
        for (int i = 0; i < stroka.length(); i++) {
            check = 0;
            checkLetter = stroka.charAt(i);
            for (int j = 0; j < mass.length; j++) {
                if (checkLetter == mass[j]) {
                    check++;
                    break;
                }
            }
            if (check == 0) {
                result = result + checkLetter;
            }
        }
        System.out.println(result);
    }
}