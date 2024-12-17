import edu.duke.*;
public class CaesarBreaker {
    public static int[] countLetters(String message) {
        int[] counts = new int[26];
        String alphabets = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        for (int i = 0; i < message.length(); i++) {
            char ch = Character.toUpperCase(message.charAt(i));
            int index = alphabets.indexOf(ch);
            if(index != -1) {
                counts[index]++;
            }
        }
        return counts;
    }


    public static int maxIndex(int[] freqs) {
        int maxIdx = 0;
        int max= 0;

        for (int i = 0; i < freqs.length; i++) {
            if(freqs[i] > max) {
                max = freqs[i];
                maxIdx = i;
            }
        }

        return maxIdx;
    }

    public static String decrypt(String encrypted) {
        int[] freqs = countLetters(encrypted);
        int maxIndex = maxIndex(freqs);
        int deKey = maxIndex - 4;
        if(maxIndex < 4)
        {
            deKey = 26 - (4 - maxIndex);
        }

        return Cipher.encrypt(encrypted, 26 - deKey);
    }


    public static String twoKeysDecrypt(String message) {
        StringBuilder odd = new StringBuilder();
        StringBuilder even = new StringBuilder();
        for (int i = 0; i < message.length(); i++) {
            if(i % 2 == 0){
                odd.append(message.charAt(i));
            } else {
                even.append(message.charAt(i));
            }
        }

        System.out.println(odd);
        System.out.println(even);

        String oodStr = decrypt(odd.toString());
        String evenStr = decrypt(even.toString());
        //System.out.println(oodStr + " " + evenStr);
        StringBuilder decryptedOdd = new StringBuilder(oodStr);
        StringBuilder decryptedEven = new StringBuilder(evenStr);

        StringBuilder decrypted = new StringBuilder();
        for (int i = 0; i < message.length(); i++) {
            if(i % 2 == 0){
                decrypted.append(decryptedOdd.charAt(i / 2));
            } else {
                decrypted.append(decryptedEven.charAt(( i - 1) / 2));
            }
        }


        return decrypted.toString();
    }
}
