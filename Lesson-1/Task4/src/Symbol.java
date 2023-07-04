public class Symbol {
    public static int countLetters(String usersText, char letter) {
        int check = 0;
        char oneWord;
        for (int i = 0; i < usersText.length(); i++) {
            oneWord = usersText.charAt(i);
            if ((oneWord == letter) || (oneWord == Character.toUpperCase(letter))) {
                check++;
            }
        }
        return check;
    }
}
