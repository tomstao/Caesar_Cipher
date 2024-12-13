import edu.duke.FileResource;

public class Test extends Cipher {
    public static void testCaesar()
    {
        int key = 17;
        FileResource fr = new FileResource();
        String message = fr.asString();
        String encrypted = encrypt(message,key);
        System.out.println(encrypted);
        String decrypted = encrypt(encrypted,26 - key);
        System.out.println(decrypted);
    }
}
