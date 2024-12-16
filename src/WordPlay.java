public class WordPlay {
    public static Boolean isVowel(char ch) {

        String vowels = "AEIOUaeiou";
        return vowels.contains(Character.toString(ch));
    }


    public static String replaceVowels(String phrase,char ch) {

        StringBuilder newSb = new StringBuilder(phrase);
        for (int i = 0; i < phrase.length(); i++) {
            if(isVowel(phrase.charAt(i))) {
                newSb.setCharAt(i, ch);
            }
        }
        return newSb.toString();
    }

    public static String emphasize(String phrase, char ch) {
        StringBuilder newSb = new StringBuilder(phrase);
        for (int i = 0; i < phrase.length(); i++) {
            if(newSb.charAt(i) == ch && i % 2 == 0) {
                newSb.setCharAt(i, '*');
            } else if(newSb.charAt(i) == ch && i % 2 != 0) {
                newSb.setCharAt(i, '+');
            }
        }

        return newSb.toString();
    }
}
