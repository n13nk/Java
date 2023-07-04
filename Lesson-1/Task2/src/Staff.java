import java.util.ArrayList;

public class Staff {
    private static final ArrayList <String> arrayList = new ArrayList<>();

    public Staff(String userText) {
        char findingAComma;
        int checkDit = 0;
        String addToArrayList;
        for (int i = 0; i < userText.length(); i++) {
            findingAComma = userText.charAt(i);
            if ( findingAComma == ',') {
                addToArrayList = userText.substring(checkDit, i);
                arrayList.add(addToArrayList);
                checkDit = i + 2;
            }
            if (i == userText.length() - 1) {
                addToArrayList = userText.substring(checkDit, i + 1);
                arrayList.add(addToArrayList);
                checkDit = i + 2;
            }
        }
    }

    public int sumStaff() {
        int sum = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i).equals("true") || (arrayList.get(i).equals("1"))) {
                sum++;
            }
        }
        return sum;
    }

    @Override
    public String toString() { return arrayList.toString(); }
}
