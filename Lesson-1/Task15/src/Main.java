import java.util.*;

public class Main {
    public static void main(String[] args) {
//        LinkedHashSet <String> set = new LinkedHashSet<>();
//        Scanner scanner1 = new Scanner(System.in);
//        System.out.println("Введите строкy");
//        String userText = scanner1.nextLine();
//        char lookForAGap;
//        int checkDit = 0;
//        String addToArrayList;
//        for (int i = 0; i < userText.length(); i++) {
//            lookForAGap = userText.charAt(i);
//            if (lookForAGap == ' ') {
//                addToArrayList = userText.substring(checkDit, i);
//                set.add(addToArrayList);
//                checkDit = i + 1;
//            }
//            if (i == userText.length() - 1){
//                addToArrayList = userText.substring(checkDit, i + 1);
//                set.add(addToArrayList);
//                checkDit = i + 1;
//            }
//        }
//        System.out.println(set);
//    }
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Введите строкy");
        String userText = scanner1.nextLine();
        Reapeat set = new Reapeat();
        Reapeat.findAGap(userText);
        System.out.println(set);
    }
}