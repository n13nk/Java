import java.util.LinkedHashSet;
public class Reapeat {
    private static final LinkedHashSet <String> set = new LinkedHashSet<>();

    public static void findAGap(String userText) {
        char lookForAGap;
        int checkDit = 0;
        String addToArrayList;
        for (int i = 0; i < userText.length(); i++) {
            lookForAGap = userText.charAt(i);
            if (lookForAGap == ' ') {
                addToArrayList = userText.substring(checkDit, i);
                set.add(addToArrayList);
                checkDit = i + 1;
            }
            if (i == userText.length() - 1) {
                addToArrayList = userText.substring(checkDit, i + 1);
                set.add(addToArrayList);
                checkDit = i + 1;
            }
        }
        //return set;
    }

    @Override
    public String toString() {
        return set.toString();
    }
}
