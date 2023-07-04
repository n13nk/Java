import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        System.out.println("Введите ответы программы о проходе людей через турникет");
        Scanner scanner1 = new Scanner(System.in);
        String usersText = scanner1.nextLine();
        Staff staff = new Staff(usersText);
        System.out.println("На работу пришло " + staff.sumStaff() + " Человек");
    }
}