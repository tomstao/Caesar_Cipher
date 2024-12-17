public class Cipher {
    public static String encrypt(String input, int key) {
        StringBuilder encrypted = new StringBuilder(input);
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String shiftedAlphabet = alphabet.substring(key) + alphabet.substring(0,key);

        for(int i = 0; i < encrypted.length(); i++) {
            char currChar = encrypted.charAt(i);
            int idx = alphabet.indexOf(currChar);
            int idxLower = alphabet.toLowerCase().indexOf(currChar);
            if(idx != -1)
            {
                char newChar = shiftedAlphabet.charAt(idx);
                encrypted.setCharAt(i,newChar);
            } else if(idxLower != -1)
            {
                char newChar = Character.toLowerCase(shiftedAlphabet.charAt(idxLower));
                encrypted.setCharAt(i,newChar);
            }


        }

        return encrypted.toString();
    }

    public static String encryptTwoKeys(String input, int key, int key2) {
        StringBuilder encrypted = new StringBuilder(input);
        for(int i = 0; i < input.length(); i++) {
            char currChar = input.charAt(i);
            String Char = Character.toString(currChar);
            if(i % 2 == 0)
            {
                Char = encrypt(Char, key);
            } else {
                Char = encrypt(Char, key2);
            }
            encrypted.setCharAt(i, Char.charAt(0));

        }



        return encrypted.toString();
    }
}
