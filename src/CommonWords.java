import edu.duke.*;

public class CommonWords {
    public static String[] getCommon()
    {
        FileResource fr = new FileResource("CommonWordsData/common.txt");
        String[] common = new String[20];
        int index = 0;
        for(String s : fr.words())
        {
            common[index] = s;
            index++;
        }

        return common;
    }


    public static int indexOf(String[] list, String word)
    {
        for(int i = 0; i < list.length; i++)
        {
            if(list[i].equals(word)){
                return i;
            }
        }
        return -1;
    }

    public static void countWords(FileResource fr, String[] wordList, int[] counts)
    {
        for(String s : fr.words()) {
            s = s.toLowerCase();
            int index1 = indexOf(wordList, s);
            if(index1 != -1) {
                counts[index1]++;
            }
        }
    }


    public static void countShakespeare()
    {
        String[] plays = {"caesar.txt", "errors.txt", "hamlet.txt", "likeit.txt", "macbeth.txt", "romeo.txt"};
       // String[] plays = {"small.txt"};

        String[] common = getCommon();

        int[] counts = new int[common.length];
        for (String play : plays) {
            FileResource fr = new FileResource("CommonWordsData/" + play);
            countWords(fr, common, counts);
            System.out.println("Done with " + play);
        }
        for (int i = 0; i < common.length; i++)
        {
            System.out.println(common[i] + "\t" + counts[i]);
        }

    }

}
