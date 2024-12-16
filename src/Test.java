import edu.duke.FileResource;

public class Test extends Cipher{
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
    public static void testWordPlay()
    {


        System.out.println("A " + WordPlay.isVowel('A'));
        System.out.println("B " + WordPlay.isVowel('B'));
        System.out.println("C " + WordPlay.isVowel('I'));

    }

    public static void testReplaceVowels()
    {
        String message = "Hello World";

        System.out.println(message + " to: " + WordPlay.replaceVowels(message,'*'));

    }

    public static void testEmphasize()
    {
        System.out.println("“dna ctgaaactga”, ‘a’ after emphasizing: "
        + WordPlay.emphasize("dna ctgaaactga", 'a'));
        System.out.println("Mary Bella Abracadabra, 'a' after emphasizing: " +
                WordPlay.emphasize("Mary Bella Abracadabra", 'a'));
    }
}
