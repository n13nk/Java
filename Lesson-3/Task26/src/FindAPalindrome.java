public class FindAPalindrome {
    public static int count = 0;
    public boolean isPalindrome(String word) {
        String checkBolean = "";
        int length = word.length();
        for (int i = 0; i < (length / 2); i++) {
            if (word.charAt(i) != word.charAt(length - i - 1)) {
                checkBolean = "False";
                continue;
            }
            count += 2;
        }
        if (checkBolean.equals("False")) {
            countPolindrom();
            return false;
        } else {
            countPolindrom();
            return true;
        }

    }
    public int countPolindrom() {
        return count;
    }
}