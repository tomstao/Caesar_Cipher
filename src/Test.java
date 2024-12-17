import edu.duke.FileResource;

public class Test extends Cipher{
    public static void testCaesar()
    {
        int key = 15;
        //FileResource fr = new FileResource();
        //String message = fr.asString();
        String message = "At noon be in the conference room with your hat on for a surprise party. YELL LOUD!";
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

    public static void testCaesar2()
    {
        System.out.println(encrypt("FIRST LEGION ATTACK EAST FLANK!", 23));
        System.out.println(encrypt("First Legion", 17));
        System.out.println(encryptTwoKeys("At noon be in the conference room with your hat on for a surprise party. YELL LOUD!", 8, 21));

    }

    public static void testDice()
    {
        int roll = 100000;
        RollingDices.simulate(roll);

    }

    public static void testCountShakespeare(){
        CommonWords.countShakespeare();
    }

    public static void testCountWordLength()
    {
        FileResource fr = new FileResource("CommonWordsData/smallhamlet.txt");
        int[] counts = new int[30];
        WordLength.countWordLength(fr,counts);
        for(int i = 1;i<counts.length;i++)
        {
            System.out.println("Word length " + i + " has " + counts[i] + " characters.");
        }
    }
}
